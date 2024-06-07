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

public class LokiChild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_loki_child);

        AdRequest adreq = new AdRequest.Builder().build();
        AdView ad = findViewById(R.id.adViewloki);
        ad.loadAd(adreq);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
    }

    public void lokiGod(View view) {
        Intent lokilay = new Intent(LokiChild.this,LokiAesir.class);
        startActivity(lokilay);
    }

    public void fenrirlo(View view) {
        Intent fenrirloki = new Intent(LokiChild.this,FenrirLOKI.class);
        startActivity(fenrirloki);
    }

    public void jormung(View view) {
        Intent jorloki = new Intent(LokiChild.this, com.pratamatech.mitologinordik.JormungandLOKI.class);
        startActivity(jorloki);
    }

    public void hell(View view) {
        Intent hello = new Intent(LokiChild.this,HelLOKI.class);
        startActivity(hello);
    }
}