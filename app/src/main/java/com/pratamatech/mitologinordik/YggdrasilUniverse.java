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

public class YggdrasilUniverse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_yggdrasil_universe);

        AdRequest adreq = new AdRequest.Builder().build();
        AdView ad = findViewById(R.id.adViewygg);
        ad.loadAd(adreq);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
    }

    public void yggdrasilygg(View view) {
        Intent ygglay = new Intent(YggdrasilUniverse.this,YggdrasilYGG.class);
        startActivity(ygglay);
    }

    public void verdfornirygg(View view) {
        Intent verdlay = new Intent(YggdrasilUniverse.this, com.pratamatech.mitologinordik.VerdfornirYGG.class);
        startActivity(verdlay);
    }

    public void vanaheimygg(View view) {
        Intent vanalay = new Intent(YggdrasilUniverse.this,VanaheimYGG.class);
        startActivity(vanalay);
    }

    public void vallhalaygg(View view) {
        Intent vallhalaygg = new Intent(YggdrasilUniverse.this,VallhalaYGG.class);
        startActivity(vallhalaygg);
    }

    public void urdygg(View view) {
        Intent urdygg = new Intent(YggdrasilUniverse.this,UrdYGG.class);
        startActivity(urdygg);
    }

    public void svartalheimyggg(View view) {
        Intent svarygg = new Intent(YggdrasilUniverse.this,SvartalheimYGG.class);
        startActivity(svarygg);
    }

    public void ratatoskrygg(View view) {
        Intent rataygg = new Intent(YggdrasilUniverse.this,RatatoskrYGG.class);
        startActivity(rataygg);
    }

    public void niflheimygg(View view) {
        Intent nifygg = new Intent(YggdrasilUniverse.this,NiflheimYGG.class);
        startActivity(nifygg);
    }

    public void muspelheimygg(View view) {
        Intent musygg = new Intent(YggdrasilUniverse.this, com.pratamatech.mitologinordik.MuspelheimYGG.class);
        startActivity(musygg);
    }

    public void nidhogggyy(View view) {
        Intent nidygg = new Intent(YggdrasilUniverse.this,NidhoggYGG.class);
        startActivity(nidygg);
    }

    public void jotunheimygg(View view) {
        Intent joygg = new Intent(YggdrasilUniverse.this,JotunheimYGG.class);
        startActivity(joygg);
    }

    public void hvelgermirygg(View view) {
        Intent hvygg = new Intent(YggdrasilUniverse.this,HvelgermirYGG.class);
        startActivity(hvygg);
    }

    public void helheimygg(View view) {
        Intent helygg = new Intent(YggdrasilUniverse.this,HelheimYGG.class);
        startActivity(helygg);
    }

    public void bifrostygg(View view) {
        Intent bifrostygg = new Intent(YggdrasilUniverse.this,BifrostYGG.class);
        startActivity(bifrostygg);
    }

    public void asgardygg(View view) {
        Intent asgardygg = new Intent(YggdrasilUniverse.this,AsgardYGG.class);
        startActivity(asgardygg);
    }

    public void alfheimygg(View view) {
        Intent alfygg = new Intent(YggdrasilUniverse.this,AlfheimYGG.class);
        startActivity(alfygg);
    }

    public void midgardygg(View view) {
        Intent midygg = new Intent(YggdrasilUniverse.this,MidgardYGG.class);
        startActivity(midygg);
    }

    public void mimirygg(View view) {
        Intent mimiryg = new Intent(YggdrasilUniverse.this,MimirYGG.class);
        startActivity(mimiryg);
    }
}