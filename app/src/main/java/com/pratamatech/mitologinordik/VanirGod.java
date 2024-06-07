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
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class VanirGod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_vanir_god);

        AdRequest adreq = new AdRequest.Builder().build();
        AdView ad = findViewById(R.id.adViewvanir);
        ad.loadAd(adreq);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
    }

    public void freyGood(View view) {
        Intent freylay = new Intent(VanirGod.this,FreyVanir.class);
        startActivity(freylay);
    }

    public void freyaGod(View view) {
        Intent freyalay = new Intent(VanirGod.this,FreyaVanir.class);
        startActivity(freyalay);
    }

    public void gullGood(View view) {
        Intent gulllay = new Intent(VanirGod.this,GullveigVanir.class);
        startActivity(gulllay);
    }

    public void nerthusGood(View view) {
        Intent nerthuslay = new Intent(VanirGod.this, com.pratamatech.mitologinordik.NerthusVanir.class);
        startActivity(nerthuslay);
    }

    public void njordGood(View view) {
        Intent njordlay = new Intent(VanirGod.this, com.pratamatech.mitologinordik.NjordVanir.class);
        startActivity(njordlay);
    }

    public void odrGod(View view) {
        Intent odrlay = new Intent(VanirGod.this, com.pratamatech.mitologinordik.OdrVanir.class);
        startActivity(odrlay);
    }
}