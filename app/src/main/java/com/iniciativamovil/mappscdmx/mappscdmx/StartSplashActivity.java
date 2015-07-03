package com.iniciativamovil.mappscdmx.mappscdmx;

import com.iniciativamovil.mappscdmx.mappscdmx.util.SystemUiHider;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public class StartSplashActivity extends Activity {

    private ImageView ivAnimacion;
    private AnimationDrawable savingAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start_splash);

        ivAnimacion = (ImageView)findViewById(R.id.ImageAnimacion);
        ivAnimacion.setBackgroundResource(R.drawable.animaciontren);
        savingAnimation = (AnimationDrawable)ivAnimacion.getBackground();
        savingAnimation.start();
    }
}
