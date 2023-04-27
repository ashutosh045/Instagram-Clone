package com.traceme.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView instalogo;
    private Button loginBtn, registerBtn;
    private LinearLayout linear_lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instalogo = findViewById(R.id.instalogo);
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);
        linear_lay = findViewById(R.id.linear_lay);

        linear_lay.animate().alpha(0).setDuration(1);

        TranslateAnimation animation = new TranslateAnimation(0,0,0,-1000);
        animation.setDuration(1000);
        animation.setFillAfter(false);
        animation.setAnimationListener(new MyAnimation());
        instalogo.setAnimation(animation);


    }

    public class MyAnimation implements Animation.AnimationListener{

        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {

            instalogo.clearAnimation();
            instalogo.setVisibility(View.INVISIBLE);
            linear_lay.animate().alpha(1).setDuration(1000);

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }

}