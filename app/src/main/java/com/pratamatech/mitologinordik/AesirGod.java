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

public class AesirGod extends AppCompatActivity {

    private ImageView aesir1,aesir2,aesir3,aesir4,aesir5,aesir6,aesir7,aesir8,aesir9,aesir10,aesir11,aesir12,aesir13,aesir14,aesir15,aesir16,aesir17,aesir18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_aesir_god);

        initView();
    }

    private void initView() {
        aesir1 = findViewById(R.id.aesir1);
        aesir2 = findViewById(R.id.aesir2);
        aesir3 = findViewById(R.id.aesir3);
        aesir4 = findViewById(R.id.aesir4);
        aesir5 = findViewById(R.id.aesir5);
        aesir6 = findViewById(R.id.aesir6);
        aesir7 = findViewById(R.id.aesir7);
        aesir8 = findViewById(R.id.aesir8);
        aesir9 = findViewById(R.id.aesir9);
        aesir10 = findViewById(R.id.aesir10);
        aesir11 = findViewById(R.id.aesir11);
        aesir12 = findViewById(R.id.aesir12);
        aesir13 = findViewById(R.id.aesir13);
        aesir14 = findViewById(R.id.aesir14);
        aesir15 = findViewById(R.id.aesir15);
        aesir16 = findViewById(R.id.aesir16);
        aesir17 = findViewById(R.id.aesir17);
        aesir18 = findViewById(R.id.aesir18);

        aesir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, OdinAesir.class));
            }
        });
        aesir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, VeAesir.class));
            }
        });
        aesir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, ViliAesir.class));
            }
        });
        aesir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, HeimdalAesir.class));
            }
        });
        aesir5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, ThorAesir.class));
            }
        });
        aesir6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, ValkrieAesir.class));
            }
        });
        aesir7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, TyrAesir.class));
            }
        });
        aesir8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, LokiAesir.class));
            }
        });
        aesir9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, IdunAesir.class));
            }
        });
        aesir10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, BaldurAesir.class));
            }
        });
        aesir11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, BorrAesir.class));
            }
        });
        aesir12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, BragiAesir.class));
            }
        });
        aesir13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, BuriAesir.class));
            }
        });
        aesir14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, ForsetiAesir.class));
            }
        });
        aesir15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, GefjunAesir.class));
            }
        });
        aesir16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, Modi_magniAesir.class));
            }
        });
        aesir17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, SiffAesir.class));
            }
        });
        aesir18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AesirGod.this, FriggAesir.class));
            }
        });
    }
}