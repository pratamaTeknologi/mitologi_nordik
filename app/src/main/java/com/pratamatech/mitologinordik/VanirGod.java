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

public class VanirGod extends AppCompatActivity {

    private MaxAdView adBannerLovinn;
    private ImageView vanir1,vanir2,vanir3,vanir4,vanir5,vanir6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_vanir_god);

        iklanBannerApplovin();
        initView();
    }

    private void initView() {
        vanir1 = findViewById(R.id.vanir1);
        vanir2 = findViewById(R.id.vanir2);
        vanir3 = findViewById(R.id.vanir3);
        vanir4 = findViewById(R.id.vanir4);
        vanir5 = findViewById(R.id.vanir5);
        vanir6 = findViewById(R.id.vanir6);

        vanir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VanirGod.this, FreyVanir.class));
            }
        });
        vanir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VanirGod.this, FreyaVanir.class));
            }
        });
        vanir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VanirGod.this, GullveigVanir.class));
            }
        });
        vanir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VanirGod.this, NerthusVanir.class));
            }
        });
        vanir5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VanirGod.this, NjordVanir.class));
            }
        });
        vanir6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VanirGod.this, OdrVanir.class));
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