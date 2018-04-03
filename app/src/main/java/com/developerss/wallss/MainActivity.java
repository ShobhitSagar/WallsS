package com.developerss.wallss;

import android.app.WallpaperManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

//    ImageView imageOne;
//    ImageView imageTwo;
//    ImageView imageThree;

    WallpaperManager mywallpaperManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        imageOne = findViewById(R.id.img1);
//        imageTwo = findViewById(R.id.img2);
//        imageThree = findViewById(R.id.img3);

        mywallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            mywallpaperManager.setResource(R.raw.wallonee);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
