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

public class AesirGod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_aesir_god);

        AdRequest adreq = new AdRequest.Builder().build();
        AdView ad = findViewById(R.id.adViewaesir);
        ad.loadAd(adreq);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
    }

    public void odinGod(View view) {
        Intent odinlay = new Intent(AesirGod.this,OdinAesir.class);
        startActivity(odinlay);
    }

    public void veGod(View view) {
        Intent velay = new Intent(AesirGod.this,VeAesir.class);
        startActivity(velay);
    }

    public void viliGod(View view) {
        Intent vililay = new Intent(AesirGod.this,ViliAesir.class);
        startActivity(vililay);
    }

    public void heimdalGod(View view) {
        Intent heimdallay = new Intent(AesirGod.this, com.pratamatech.mitologinordik.HeimdalAesir.class);
        startActivity(heimdallay);
    }

    public void thorGod(View view) {
        Intent thorlay = new Intent(AesirGod.this,ThorAesir.class);
        startActivity(thorlay);
    }

    public void valkrieGodd(View view) {
        Intent valkrielay = new Intent(AesirGod.this,ValkrieAesir.class);
        startActivity(valkrielay);
    }

    public void tyrGood(View view) {
        Intent tyrlay = new Intent(AesirGod.this,TyrAesir.class);
        startActivity(tyrlay);
    }

    public void lokiGod(View view) {
        Intent lokilay = new Intent(AesirGod.this,LokiAesir.class);
        startActivity(lokilay);
    }

    public void idunGood(View view) {
        Intent idunlay = new Intent(AesirGod.this,IdunAesir.class);
        startActivity(idunlay);
    }

    public void baldurGod(View view) {
        Intent baldurlay = new Intent(AesirGod.this, com.pratamatech.mitologinordik.BaldurAesir.class);
        startActivity(baldurlay);
    }

    public void borrGood(View view) {
        Intent borrlay = new Intent(AesirGod.this,BorrAesir.class);
        startActivity(borrlay);
    }

    public void bragiGod(View view) {
        Intent bragilay = new Intent(AesirGod.this,BragiAesir.class);
        startActivity(bragilay);
    }

    public void buriGod(View view) {
        Intent burilay = new Intent(AesirGod.this,BuriAesir.class);
        startActivity(burilay);
    }

    public void forsetiGood(View view) {
        Intent forsetilay = new Intent(AesirGod.this,ForsetiAesir.class);
        startActivity(forsetilay);
    }

    public void gefjunGod(View view) {
        Intent gefjunlay = new Intent(AesirGod.this, com.pratamatech.mitologinordik.GefjunAesir.class);
        startActivity(gefjunlay);
    }

    public void modimagniGod(View view) {
        Intent mmlay = new Intent(AesirGod.this,Modi_magniAesir.class);
        startActivity(mmlay);
    }

    public void siffGood(View view) {
        Intent sifflay = new Intent(AesirGod.this,SiffAesir.class);
        startActivity(sifflay);
    }

    public void friggGod(View view) {
        Intent frigglay = new Intent(AesirGod.this,FriggAesir.class);
        startActivity(frigglay);
    }
}