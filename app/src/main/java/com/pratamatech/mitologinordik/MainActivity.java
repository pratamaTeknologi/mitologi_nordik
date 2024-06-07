package com.pratamatech.mitologinordik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.onesignal.OneSignal;
import com.onesignal.debug.LogLevel;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements MaxAdViewAdListener {

    //one signal
    private static final String ONESIGNAL_APP_ID = "90d5384c-7a09-41ec-a433-69be5bd778f3";

    private MaxAdView adBannerLovinn;
    private MaxInterstitialAd interstitialAd;
    private int retryAttempt;
    private int clickCount = 0;
    private int maxClicks = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        iklanBannerApplovin();
        //iklan applovin
        // Make sure to set the mediation provider value to "max" to ensure proper functionality
        AppLovinSdk.getInstance( MainActivity.this ).setMediationProvider( "max" );
        AppLovinSdk.initializeSdk( MainActivity.this, new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
            {
                // AppLovin SDK is initialized, start loading ads
            }
        } );

        interstitialAd = new MaxInterstitialAd( "49f2d36434bcd217", this );
        interstitialAd.setListener( this );

        // Load the first ad
        interstitialAd.loadAd();

        //one signal

        // Verbose Logging set to help debug issues, remove before releasing your app.
        OneSignal.getDebug().setLogLevel(LogLevel.VERBOSE);

        // OneSignal Initialization
        OneSignal.initWithContext(this, ONESIGNAL_APP_ID);

        // optIn will show the native Android notification permission prompt.
        // We recommend removing the following code and instead using an In-App Message to prompt for notification permission (See step 7)
        OneSignal.getUser().getPushSubscription().optIn();
    }

    private void iklanBannerApplovin() {
        // Load the ad
        adBannerLovinn = findViewById(R.id.adBannerLovin);
        adBannerLovinn.loadAd();

        //jika ingin disable banner
        //adBannerLovin.destroy();
    }

    public void about(View view) {
        Intent aboutLay = new Intent(MainActivity.this,About.class);
        startActivity(aboutLay);
    }

    public void worldcreated(View view) {
        clickCount++;
        if (clickCount >= maxClicks) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                // Reset click count setelah iklan muncul
                clickCount = 0;
            } else {
                //Toast.makeText(MainActivity.this, "gagal bre", Toast.LENGTH_SHORT).show();

            }
        }
        startActivity(new Intent(MainActivity.this, WorldCreated.class));
    }

    public void aesir(View view) {
        clickCount++;
        if (clickCount >= maxClicks) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                // Reset click count setelah iklan muncul
                clickCount = 0;
            } else {
                //Toast.makeText(MainActivity.this, "gagal bre", Toast.LENGTH_SHORT).show();

            }
        }
        startActivity(new Intent(MainActivity.this, AesirGod.class));
    }

    public void yggdrasil(View view) {
        clickCount++;
        if (clickCount >= maxClicks) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                // Reset click count setelah iklan muncul
                clickCount = 0;
            } else {
                //Toast.makeText(MainActivity.this, "gagal bre", Toast.LENGTH_SHORT).show();

            }
        }
        startActivity(new Intent(MainActivity.this, YggdrasilUniverse.class));
    }

    public void vanirGod(View view) {
        clickCount++;
        if (clickCount >= maxClicks) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                // Reset click count setelah iklan muncul
                clickCount = 0;
            } else {
                //Toast.makeText(MainActivity.this, "gagal bre", Toast.LENGTH_SHORT).show();

            }
        }
        startActivity(new Intent(MainActivity.this, VanirGod.class));
    }

    public void giantJotnar(View view) {
        clickCount++;
        if (clickCount >= maxClicks) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                // Reset click count setelah iklan muncul
                clickCount = 0;
            } else {
                //Toast.makeText(MainActivity.this, "gagal bre", Toast.LENGTH_SHORT).show();

            }
        }
        startActivity(new Intent(MainActivity.this, Giant.class));
    }

    public void lokiChild(View view) {
        clickCount++;
        if (clickCount >= maxClicks) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                // Reset click count setelah iklan muncul
                clickCount = 0;
            } else {
                //Toast.makeText(MainActivity.this, "gagal bre", Toast.LENGTH_SHORT).show();

            }
        }
        startActivity(new Intent(MainActivity.this, LokiChild.class));
    }

    // MAX Ad Listener
    @Override
    public void onAdLoaded(final MaxAd maxAd)
    {
        // Interstitial ad is ready to be shown. interstitialAd.isReady() will now return 'true'

        // Reset retry attempt
        retryAttempt = 0;
    }

    @Override
    public void onAdLoadFailed(final String adUnitId, final MaxError error)
    {
        // Interstitial ad failed to load
        // AppLovin recommends that you retry with exponentially higher delays up to a maximum delay (in this case 64 seconds)

        retryAttempt++;
        long delayMillis = TimeUnit.SECONDS.toMillis( (long) Math.pow( 2, Math.min( 6, retryAttempt ) ) );

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                interstitialAd.loadAd();
            }
        }, delayMillis );
    }

    @Override
    public void onAdDisplayFailed(final MaxAd maxAd, final MaxError error)
    {
        // Interstitial ad failed to display. AppLovin recommends that you load the next ad.
        interstitialAd.loadAd();
    }

    @Override
    public void onAdDisplayed(final MaxAd maxAd) {}

    @Override
    public void onAdClicked(final MaxAd maxAd) {}

    @Override
    public void onAdHidden(final MaxAd maxAd)
    {
        // Interstitial ad is hidden. Pre-load the next ad
        interstitialAd.loadAd();
    }

    @Override
    public void onAdExpanded(MaxAd maxAd) {

    }

    @Override
    public void onAdCollapsed(MaxAd maxAd) {

    }
}