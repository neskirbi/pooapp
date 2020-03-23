package com.app.pooapp;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    Context context;
    Funciones funciones;
    MediaPlayer spedo,seructo,sbomba,spistola,stos,sestornudo;
    Button pedo,eructo,bomba,pistola,tos,estornudo;
    Animation myAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        funciones=new Funciones(this);
        context=this;

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = null;
        if(BuildConfig.DEBUG){
            adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        }else{
            adRequest=new AdRequest.Builder().build();
        }
        mAdView.loadAd(adRequest);

        spedo=MediaPlayer.create(context,R.raw.pedo);
        seructo=MediaPlayer.create(context,R.raw.eructo);
        sbomba=MediaPlayer.create(context,R.raw.bomba);
        sestornudo=MediaPlayer.create(context,R.raw.estornudo);
        stos=MediaPlayer.create(context,R.raw.tos);
        spistola=MediaPlayer.create(context,R.raw.pistola);

        pedo=findViewById(R.id.pedo);
        eructo=findViewById(R.id.eructo);
        bomba=findViewById(R.id.bomba);
        tos=findViewById(R.id.tos);
        estornudo=findViewById(R.id.estornudo);
        pistola=findViewById(R.id.pistola);




        pedo.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    funciones.Vibrar(funciones.VibrarPush());
                    myAnim = AnimationUtils.loadAnimation(context, R.anim.milkshake);
                    v.startAnimation(myAnim);
                    spedo.start();
                }
                else if(event.getAction() == MotionEvent.ACTION_UP){

                }
                return false;
            }
        });

        eructo.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    funciones.Vibrar(funciones.VibrarPush());
                    myAnim = AnimationUtils.loadAnimation(context, R.anim.milkshake);
                    v.startAnimation(myAnim);
                    seructo.start();
                }
                else if(event.getAction() == MotionEvent.ACTION_UP){

                }
                return false;
            }
        });

        bomba.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    funciones.Vibrar(funciones.VibrarPush());
                    myAnim = AnimationUtils.loadAnimation(context, R.anim.milkshake);
                    v.startAnimation(myAnim);
                    sbomba.start();
                }
                else if(event.getAction() == MotionEvent.ACTION_UP){

                }
                return false;
            }
        });

        estornudo.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    funciones.Vibrar(funciones.VibrarPush());
                    myAnim = AnimationUtils.loadAnimation(context, R.anim.milkshake);
                    v.startAnimation(myAnim);
                    sestornudo.start();
                }
                else if(event.getAction() == MotionEvent.ACTION_UP){

                }
                return false;
            }
        });

        tos.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    funciones.Vibrar(funciones.VibrarPush());
                    myAnim = AnimationUtils.loadAnimation(context, R.anim.milkshake);
                    v.startAnimation(myAnim);
                    stos.start();
                }
                else if(event.getAction() == MotionEvent.ACTION_UP){

                }
                return false;
            }
        });

        pistola.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    funciones.Vibrar(funciones.VibrarPush());
                    myAnim = AnimationUtils.loadAnimation(context, R.anim.milkshake);
                    v.startAnimation(myAnim);
                    spistola.start();
                }
                else if(event.getAction() == MotionEvent.ACTION_UP){

                }
                return false;
            }
        });



    }



}
