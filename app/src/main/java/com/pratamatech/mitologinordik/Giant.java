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

public class Giant extends AppCompatActivity {

    private ImageView giant1,giant2,giant3,giant4,giant5,giant6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_giant);

        initView();
    }

    private void initView() {
        giant1 = findViewById(R.id.giant1);
        giant2 = findViewById(R.id.giant2);
        giant3 = findViewById(R.id.giant3);
        giant4 = findViewById(R.id.giant4);
        giant5 = findViewById(R.id.giant5);
        giant6 = findViewById(R.id.giant6);

        giant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Giant.this, YmirGiant.class));
            }
        });
        giant2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Giant.this, SkadiGiant.class));
            }
        });
        giant3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Giant.this, NottGiant.class));
            }
        });
        giant4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Giant.this, DagrGiant.class));
            }
        });
        giant5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Giant.this, GamrGiant.class));
            }
        });
        giant6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Giant.this, BestlaGiant.class));
            }
        });

    }
}