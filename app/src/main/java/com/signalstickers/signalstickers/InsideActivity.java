package com.signalstickers.signalstickers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class InsideActivity extends AppCompatActivity {

    ImageView insideImg;
    TextView insideTitle,insidesize;
    Button btn;

    ProgressDialog progressDialog;
    private RecyclerView mRecyclerView;
    private ImageAdapter mAdapter;

    private DatabaseReference mDatabaseRef;
    private List<Upload> mUploads;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside);

        ActionBar actionBar=getSupportActionBar();
//        actionBar.setTitle("Match Details");
        //enable back button
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        progressDialog=new ProgressDialog(this);
        progressDialog.setTitle("Loading...");
        progressDialog.show();
        insideImg=findViewById(R.id.inside_image);
        insideTitle=findViewById(R.id.inside_title);
        insidesize=findViewById(R.id.inside_size);
        btn=findViewById(R.id.inside_btn);

        Intent intent=getIntent();
        final String cat=intent.getStringExtra("cat");
        final String add=intent.getStringExtra("intent");

        insideTitle.setText(cat);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(add));
                startActivity(firstIntent);
            }
        });



        flag=0;
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,4));

        mUploads = new ArrayList<>();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("uploads");
        mDatabaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {

                    progressDialog.hide();


                    Upload upload = postSnapshot.getValue(Upload.class);
                    String name=upload.getName();
                    if(name.equals(""+cat)) {
                        flag++;
                        mUploads.add(upload);
                        if (flag == 1) {
                            Picasso.get().load(upload.getImageUrl()).into(insideImg);
                        }
                    }
                }

                mAdapter = new ImageAdapter(InsideActivity.this, mUploads);
                mRecyclerView.setAdapter(mAdapter);
                insidesize.setText(""+mUploads.size());
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
//                Toast.makeText(ImagesActivity.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
//                mProgressCircle.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}