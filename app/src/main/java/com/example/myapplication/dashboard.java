package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class dashboard extends AppCompatActivity {


    CarouselView carouselView;
    int[] sampleImages = {R.drawable.ice,R.drawable.momos,R.drawable.im};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView image = (ImageView) findViewById(R.id.ime);

        ImageView imagf = (ImageView) findViewById(R.id.imf);
        ImageView imagg = (ImageView) findViewById(R.id.img);


        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);


        Picasso.get()
                .load("https://images.pexels.com/photos/1362534/pexels-photo-1362534.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260")
                .into(imageView);



        Picasso.get()
                .load("https://media.gettyimages.com/photos/dim-sum-dumplings-freshly-steamed-in-a-bamboo-steamer-picture-id480052548?s=2048x2048")
                .into(image);

        Picasso.get()
                .load("https://media.gettyimages.com/photos/blended-fruit-smoothies-picture-id635911456?s=2048x2048")
                .into(imagf);


        Picasso.get()
                .load("https://media.gettyimages.com/photos/high-angle-view-of-chocolates-on-table-picture-id913042966?s=2048x2048")
                .into(imagg);
    }




    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    public void sharenow(View view) {

        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));

    }

    public void setting(View view) {
        Intent i = new Intent(dashboard.this, shareanimation.class);
        startActivity(i);
    }

    public void home(View view) {
        Intent i = new Intent(dashboard.this,dashboard.class);
        startActivity(i);
    }

    public void recipeeapp(View view) {
        Intent i = new Intent(dashboard.this,recipebama.class);
        startActivity(i);

    }

    public void momos(View view) {


        Intent i = new Intent(dashboard.this,recipebama.class);
        startActivity(i);
    }

    public void buttershakwd(View view) {
        Intent i = new Intent(dashboard.this,recipebama.class);
        startActivity(i);

    }

    public void choclate(View view) {


        Intent i = new Intent(dashboard.this,recipebama.class);
        startActivity(i);
    }
}