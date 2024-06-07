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

public class Giant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_giant);

        AdRequest adreq = new AdRequest.Builder().build();
        AdView ad = findViewById(R.id.adViewgiant);
        ad.loadAd(adreq);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
    }

    public void ymirgian(View view) {
        Intent ymirg = new Intent(Giant.this,YmirGiant.class);
        startActivity(ymirg);
    }

    public void skadigian(View view) {
        Intent skadig = new Intent(Giant.this,SkadiGiant.class);
        startActivity(skadig);
    }

    public void dagrgian(View view) {
        Intent dagrg = new Intent(Giant.this, com.pratamatech.mitologinordik.DagrGiant.class);
        startActivity(dagrg);
    }

    public void nottgian(View view) {
        Intent nottg = new Intent(Giant.this,NottGiant.class);
        startActivity(nottg);
    }

    public void gamrgian(View view) {
        Intent gamrg = new Intent(Giant.this, com.pratamatech.mitologinordik.GamrGiant.class);
        startActivity(gamrg);
    }

    public void bestla(View view) {
        Intent bestlag = new Intent(Giant.this, com.pratamatech.mitologinordik.BestlaGiant.class);
        startActivity(bestlag);
    }
}