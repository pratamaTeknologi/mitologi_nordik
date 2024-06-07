package com.pratamatech.mitologinordik;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class WorldCreated extends AppCompatActivity {

    private ImageView wc1,wc2,wc3,wc4,wc5,wc6,wc7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_world_created);

        initView();

    }

    private void initView() {
        wc1 = findViewById(R.id.wc1);
        wc2 = findViewById(R.id.wc2);
        wc3 = findViewById(R.id.wc3);
        wc4 = findViewById(R.id.wc4);
        wc5 = findViewById(R.id.wc5);
        wc6 = findViewById(R.id.wc6);
        wc7 = findViewById(R.id.wc7);

        wc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorldCreated.this, GinungagapWC.class));
            }
        });
        wc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorldCreated.this, AudhumlaWC.class));
            }
        });
        wc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorldCreated.this, YmirFightWC.class));
            }
        });
        wc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorldCreated.this, SurtrWC.class));
            }
        });
        wc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorldCreated.this, SkollHatiWC.class));
            }
        });
        wc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorldCreated.this, Ash_ElmWC.class));
            }
        });
        wc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorldCreated.this, DwaftWC.class));
            }
        });
    }
}