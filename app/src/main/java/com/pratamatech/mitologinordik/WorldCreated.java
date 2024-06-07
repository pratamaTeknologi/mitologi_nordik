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

public class WorldCreated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_world_created);

        AdRequest adreq = new AdRequest.Builder().build();
        AdView ad = findViewById(R.id.adViewwc);
        ad.loadAd(adreq);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
    }

    public void ginungagapwc(View view) {
        Intent ginunglay = new Intent(WorldCreated.this,GinungagapWC.class);
        startActivity(ginunglay);
    }

    public void audhumlawc(View view) {
        Intent audhumlalay = new Intent(WorldCreated.this,AudhumlaWC.class);
        startActivity(audhumlalay);
    }

    public void ymirff(View view) {
        Intent ymirflay = new Intent(WorldCreated.this, com.pratamatech.mitologinordik.YmirFightWC.class);
        startActivity(ymirflay);
    }

    public void surtr(View view) {
        Intent surtrlay = new Intent(WorldCreated.this, com.pratamatech.mitologinordik.SurtrWC.class);
        startActivity(surtrlay);
    }

    public void skollhati(View view) {
        Intent skollhatilay = new Intent(WorldCreated.this,SkollHatiWC.class);
        startActivity(skollhatilay);
    }

    public void ashelm(View view) {
        Intent ashelmlay = new Intent(WorldCreated.this, Ash_ElmWC.class);
        startActivity(ashelmlay);
    }

    public void dwaft(View view) {
        Intent dwaftlay = new Intent(WorldCreated.this, DwaftWC.class);
        startActivity(dwaftlay);
    }
}