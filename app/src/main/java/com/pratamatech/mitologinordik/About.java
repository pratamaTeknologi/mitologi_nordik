package com.pratamatech.mitologinordik;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class About extends AppCompatActivity {

    private ImageView googlePlay,googlePlay1,googlePlay2;
    private Dialog dialog;
    private TextView kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_about);

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.popup_about);
        dialog.show();

        googlePlay = dialog.findViewById(R.id.img_googleplay);
        googlePlay1 = dialog.findViewById(R.id.img_googleplay1);
        googlePlay2 = dialog.findViewById(R.id.img_googleplay2);
        kontak = dialog.findViewById(R.id.kontak);

//        String noWa = "https://wa.me/message/4ODUI6GVLTGEA1";
//        Uri wa = Uri.parse(noWa);
//        kontak.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(Intent.ACTION_VIEW, wa));
//            }
//        });

        String url1 = "https://play.google.com/store/apps/details?id=com.pratamatech.greekmytology&hl=en";
        Uri uri1 = Uri.parse(url1);

        String url2 = "https://play.google.com/store/apps/details?id=com.papps.mitologmesir";
        Uri uri2 = Uri.parse(url2);

        String url3 = "https://play.google.com/store/apps/details?id=com.papps.mitologijepang";
        Uri uri3 = Uri.parse(url3);
        googlePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, uri1));
            }
        });

        googlePlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, uri2));
            }
        });

        googlePlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, uri3));
            }
        });
    }// akhir oncreate

}