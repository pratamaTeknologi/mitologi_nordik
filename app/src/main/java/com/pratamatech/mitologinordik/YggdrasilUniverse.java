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

public class YggdrasilUniverse extends AppCompatActivity {

    private ImageView ygg1,ygg2,ygg3,ygg4,ygg5,ygg6,ygg7,ygg8,ygg9,ygg10,ygg11,ygg12,ygg13,ygg14,ygg15,ygg16,ygg17,ygg18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_yggdrasil_universe);

        initView();

    }

    private void initView() {
        ygg1 = findViewById(R.id.ygg1);
        ygg2 = findViewById(R.id.ygg2);
        ygg3 = findViewById(R.id.ygg3);
        ygg4 = findViewById(R.id.ygg4);
        ygg5 = findViewById(R.id.ygg5);
        ygg6 = findViewById(R.id.ygg6);
        ygg7 = findViewById(R.id.ygg7);
        ygg8 = findViewById(R.id.ygg8);
        ygg9 = findViewById(R.id.ygg9);
        ygg10 = findViewById(R.id.ygg10);
        ygg11 = findViewById(R.id.ygg11);
        ygg12 = findViewById(R.id.ygg12);
        ygg13 = findViewById(R.id.ygg13);
        ygg14 = findViewById(R.id.ygg14);
        ygg15 = findViewById(R.id.ygg15);
        ygg16 = findViewById(R.id.ygg16);
        ygg17 = findViewById(R.id.ygg17);
        ygg18 = findViewById(R.id.ygg18);

        ygg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, YggdrasilYGG.class));
            }
        });
        ygg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, VerdfornirYGG.class));
            }
        });
        ygg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, VanaheimYGG.class));
            }
        });
        ygg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, VallhalaYGG.class));
            }
        });
        ygg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, UrdYGG.class));
            }
        });
        ygg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, SvartalheimYGG.class));
            }
        });
        ygg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, RatatoskrYGG.class));
            }
        });
        ygg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, NiflheimYGG.class));
            }
        });
        ygg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, MuspelheimYGG.class));
            }
        });
        ygg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, NidhoggYGG.class));
            }
        });
        ygg11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, JotunheimYGG.class));
            }
        });
        ygg12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, HvelgermirYGG.class));
            }
        });
        ygg13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, HelheimYGG.class));
            }
        });
        ygg14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, BifrostYGG.class));
            }
        });
        ygg15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, AsgardYGG.class));
            }
        });
        ygg16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, AlfheimYGG.class));
            }
        });
        ygg17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, MidgardYGG.class));
            }
        });
        ygg18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YggdrasilUniverse.this, MimirYGG.class));
            }
        });
    }
}