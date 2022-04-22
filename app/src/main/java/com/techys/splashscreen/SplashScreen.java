package com.techys.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.techys.R;
import com.techys.authentication.Register;
import com.techys.onboarding.Onboarding;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_SCREEN =3000;

   Animation topAnim, bottomAnim;
   TextView logo, slogan;
   ImageView image1, image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo = findViewById(R.id.textView4);
        slogan = findViewById(R.id.textView5);
        image1 = findViewById(R.id.imageView3);
        image2 = findViewById(R.id.imageView4);


        logo.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);
        image1.setAnimation(topAnim);
        image2.setAnimation(bottomAnim);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
                Intent intent = new Intent(SplashScreen.this, Onboarding.class);
                startActivity(intent);
           }
       },SPLASH_SCREEN);

    }
}