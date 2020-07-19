package com.example.firearm2;

import android.os.Build;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;

import androidx.appcompat.app.AppCompatActivity;

public class StartTimer extends AppCompatActivity {
    //Variables for timer
    private static final long START_TIME_IN_MILLIS = 0000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    private void shakeItBaby() {
        if (Build.VERSION.SDK_INT >= 26) {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(3000, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(3000);
        }
    }

}
