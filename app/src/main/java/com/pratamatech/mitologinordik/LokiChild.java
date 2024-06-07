package com.pratamatech.mitologinordik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.applovin.mediation.ads.MaxAdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class LokiChild extends AppCompatActivity {

    //private InterstitialAd mInter;

    private MaxAdView adBannerLovinn;
    private ImageView lc1,lc2,lc3,lc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_loki_child);

        iklanBannerApplovin();
        initView();
//
    }

    private void initView() {
        lc1 = findViewById(R.id.lc1);
        lc2 = findViewById(R.id.lc2);
        lc3 = findViewById(R.id.lc3);
        lc4 = findViewById(R.id.lc4);

        lc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LokiChild.this, LokiAesir.class));
            }
        });
        lc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LokiChild.this, FenrirLOKI.class));
            }
        });
        lc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LokiChild.this, JormungandLOKI.class));
            }
        });
        lc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LokiChild.this, HelLOKI.class));
            }
        });
    }

    private void iklanBannerApplovin() {
        // Load the ad
        adBannerLovinn = findViewById(R.id.adBannerLovin);
        adBannerLovinn.loadAd();

        //jika ingin disable banner
        //adBannerLovin.destroy();
    }
}