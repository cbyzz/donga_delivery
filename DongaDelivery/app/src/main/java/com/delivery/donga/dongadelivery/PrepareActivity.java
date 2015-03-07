package com.delivery.donga.dongadelivery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/**
 * Created by choi-byoung-youl on 15. 3. 6..
 */
public class PrepareActivity extends Activity{
    protected static long splashTime = 1500;
    private Handler handler = new Handler();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        long delayTime = splashTime;
        setContentView(R.layout.activity_prepare);
        super.onCreate(savedInstanceState);

        showSplashView(delayTime);
    }

    public void showSplashView(long delayTime) {

        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                preparingDone();
            }
        }, delayTime);
    }

    public void preparingDone() {
        Intent intent;
        intent = new Intent(PrepareActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
