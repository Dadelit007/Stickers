package com.signalstickers.signalstickers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
Button firstFrame;
Button secondFrame;
Button thirdFrame,forthFrame,fifthFrame;
Button sixthFrame,seventhFrame,eightthFrame,ninethFrame,tenthFrame;
LinearLayout firstFrameImage,secondFrameImage,thirdFrameImage,fourthFrameImage,fifthFrameImage;
LinearLayout sixthFrameImage,seventhFrameImage,eightthFrameImage,ninethFrameImage,tenthFrameImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first();
        second();
        third();
        forth();
        fifth();
        sixth();
        seventh();
        eight();
        nineth();
        tenth();

    }

    private void first() {
        firstFrame=findViewById(R.id.firstFrameAddBtn);
        firstFrameImage=findViewById(R.id.firstFrameImages);
        firstFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Popular");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=51dbc34f24a3590152189ccef225e2d9&pack_key=0e60b9bc51b5e4f096dc596aa8daf37893be299e75d74b3507be2317469c2b93");
                startActivity(intent);
            }
        });
        firstFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=51dbc34f24a3590152189ccef225e2d9&pack_key=0e60b9bc51b5e4f096dc596aa8daf37893be299e75d74b3507be2317469c2b93"));
                startActivity(firstIntent);
            }
        });
    }

    private void second() {
        secondFrame=findViewById(R.id.secondFrameAddBtn);
            secondFrameImage=findViewById(R.id.secondFrameImages);
        secondFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Big Emojis");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=4bf10f9fbe6919cd44b52e08ecff5348&pack_key=d3144c25a92b686e7fb07e630324be12b7d8387a718e3eca374fc45f3bb9733c");
                startActivity(intent);
            }
        });
        secondFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=4bf10f9fbe6919cd44b52e08ecff5348&pack_key=d3144c25a92b686e7fb07e630324be12b7d8387a718e3eca374fc45f3bb9733c"));
                startActivity(secondIntent);
            }
        });
    }

    private void third() {
        thirdFrame=findViewById(R.id.thirdFrameAddBtn);
        thirdFrameImage=findViewById(R.id.thirdFrameImages);
        thirdFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Funny Cricketers");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=1fb85ec7387a5750b0e74969986a78e9&pack_key=4c8d46f77a94dc2090d9cf4bbcba1d2bc7279dc637feed44a534ebfd20e202c0");

                startActivity(intent);
            }
        });
        thirdFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://signal.art/addstickers/#pack_id=1fb85ec7387a5750b0e74969986a78e9&pack_key=4c8d46f77a94dc2090d9cf4bbcba1d2bc7279dc637feed44a534ebfd20e202c0"));
                startActivity(thirdIntent);
            }
        });
    }

    private void forth() {
        forthFrame=findViewById(R.id.forthFrameAddBtn);
        fourthFrameImage=findViewById(R.id.forthFrameImages);
        fourthFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Romantic Stickers");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=0af0f945e92e2a8953f80cf1d226db14&pack_key=7bcfb2e71e21d8e149cd92e43c680806509e0e13e64a4b3be3673599ddfc2b03");
                startActivity(intent);
            }
        });
        forthFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=0af0f945e92e2a8953f80cf1d226db14&pack_key=7bcfb2e71e21d8e149cd92e43c680806509e0e13e64a4b3be3673599ddfc2b03"));
                startActivity(thirdIntent);
            }
        });
    }

    private void fifth() {
        fifthFrame=findViewById(R.id.fifthFrameAddBtn);
        fifthFrameImage=findViewById(R.id.fifthFrameImages);
        fifthFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Latest");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=48dcf521f27b5b100f44bbcd58a70efc&pack_key=3aee40f62a651eaf6a8529e2275ea41e26d9b67fdd69cefbc2d56f8ced2bb959");
                startActivity(intent);
            }
        });
        fifthFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=48dcf521f27b5b100f44bbcd58a70efc&pack_key=3aee40f62a651eaf6a8529e2275ea41e26d9b67fdd69cefbc2d56f8ced2bb959"));
                startActivity(thirdIntent);
            }
        });
    }

    private void sixth() {
        sixthFrame=findViewById(R.id.sixthFrameAddBtn);
        sixthFrameImage=findViewById(R.id.sixthFrameImages);
        sixthFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Bollywood");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=08c2d07f8adbbd9780e2a191efbe7b22&pack_key=6f5981e732597a77f430c825a4ff38ddfd05819c57b9b03320705d6c623caa40");
                startActivity(intent);
            }
        });
        sixthFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=08c2d07f8adbbd9780e2a191efbe7b22&pack_key=6f5981e732597a77f430c825a4ff38ddfd05819c57b9b03320705d6c623caa40"));
                startActivity(thirdIntent);
            }
        });
    }

    private void seventh() {
        seventhFrame=findViewById(R.id.seventhFrameAddBtn);
        seventhFrameImage=findViewById(R.id.seventhFrameImages);
        seventhFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Gangs of Wasseypur");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=c233af8abd6898a523a4c36761132ac2&pack_key=0db98ea962ed6c18b5b767a1713b2ad1cae4b27352c65960beca539cbc0a0413");
                startActivity(intent);
            }
        });
        seventhFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=c233af8abd6898a523a4c36761132ac2&pack_key=0db98ea962ed6c18b5b767a1713b2ad1cae4b27352c65960beca539cbc0a0413"));
                startActivity(thirdIntent);
            }
        });
    }

    private void eight() {
        eightthFrame=findViewById(R.id.eightFrameAddBtn);
        eightthFrameImage=findViewById(R.id.eightFrameImages);
        eightthFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Mirzapur");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=2f290fb2702af7e9e6be79952ae2e2bc&pack_key=4f830b8e452ac19f81aceeb8030ffc2cd5dd2386c0dcd20fa12eca5f344a8f96");
                startActivity(intent);
            }
        });
        eightthFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=2f290fb2702af7e9e6be79952ae2e2bc&pack_key=4f830b8e452ac19f81aceeb8030ffc2cd5dd2386c0dcd20fa12eca5f344a8f96"));
                startActivity(thirdIntent);
            }
        });
    }

    private void nineth() {
        ninethFrame=findViewById(R.id.nineFrameAddBtn);
        ninethFrameImage=findViewById(R.id.nineFrameImages);
        ninethFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Standup Comedy");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=ffdcf236eb3ec203154240cf662cf60c&pack_key=51a05d867158c598e85ac54b6ee322fc56e64f333f3fc5edd09c6b67089cc44a");
                startActivity(intent);
            }
        });
        ninethFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=ffdcf236eb3ec203154240cf662cf60c&pack_key=51a05d867158c598e85ac54b6ee322fc56e64f333f3fc5edd09c6b67089cc44a"));
                startActivity(thirdIntent);
            }
        });
    }

    private void tenth() {
        tenthFrame=findViewById(R.id.tenFrameAddBtn);
        tenthFrameImage=findViewById(R.id.tenFrameImages);
        tenthFrameImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InsideActivity.class);
                intent.putExtra("cat","Famous");
                intent.putExtra("intent","https://signal.art/addstickers/#pack_id=d2ee3ec90c6c572b11576b97535f52e7&pack_key=052156968a3d2a58025cb84aa0945f392cae3ed85027deb75370653ce030d4c7");
                startActivity(intent);
            }
        });
        tenthFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://signal.art/addstickers/#pack_id=d2ee3ec90c6c572b11576b97535f52e7&pack_key=052156968a3d2a58025cb84aa0945f392cae3ed85027deb75370653ce030d4c7"));
                startActivity(thirdIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share: {
//                startActivity(new Intent(MainActivity.this, DetailActivity.class));
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}