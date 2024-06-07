package com.pratamatech.mitologinordik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {

    InterstitialAd mInter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        AdRequest adreq = new AdRequest.Builder().build();
        AdView ad = findViewById(R.id.adViewmain);
        ad.loadAd(adreq);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, "ca-app-pub-6014536128179477/7518697054", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                mInter = null;
            }

            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                mInter = interstitialAd;
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if (mInter!=null){
            mInter.show(MainActivity.this);
            mInter.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    finish();
                }
            });
        }else{
            finish();
        }
    }

    public void about(View view) {
        Intent aboutLay = new Intent(MainActivity.this,About.class);
        startActivity(aboutLay);
    }

    public void worldcreated(View view) {
        Intent worldCreated = new Intent(MainActivity.this,WorldCreated.class);
        startActivity(worldCreated);
    }

    public void aesir(View view) {
        Intent aesirgod = new Intent(MainActivity.this,AesirGod.class);
        startActivity(aesirgod);
    }

    public void yggdrasil(View view) {
        Intent yggdrasill = new Intent(MainActivity.this,YggdrasilUniverse.class);
        startActivity(yggdrasill);
    }

    public void vanirGod(View view) {
        Intent vanir = new Intent(MainActivity.this,VanirGod.class);
        startActivity(vanir);
    }

    public void giantJotnar(View view) {
        Intent giant = new Intent(MainActivity.this,Giant.class);
        startActivity(giant);
    }

    public void lokiChild(View view) {
        Intent lokiC = new Intent(MainActivity.this,LokiChild.class);
        startActivity(lokiC);
    }
}