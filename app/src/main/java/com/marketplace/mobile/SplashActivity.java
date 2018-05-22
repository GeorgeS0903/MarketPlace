package com.marketplace.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private ImageView iv_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iv_splash = (ImageView)findViewById(R.id.iv_splash);

        startAnimation();
    }

    private void startAnimation() {
        AlphaAnimation anim = new AlphaAnimation(0.2f, 1);
        anim.setDuration(1500);
        anim.setAnimationListener(new Animation.AnimationListener() {

            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
            public void onAnimationRepeat(Animation animation) {}
            public void onAnimationStart(Animation animation) {}
        });
        iv_splash.startAnimation(anim);
    }
}
