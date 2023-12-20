package com.example.pr28;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получим ссылку на солнце
        ImageView sunImageView = findViewById(R.id.sun);
        // Анимация для восхода солнца
        @SuppressLint("ResourceType") Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.drawable.sun_rise);
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation);

        // Получим ссылку на часы
        ImageView clockImageView = findViewById(R.id.clock);
        // анимация для вращения часов
        @SuppressLint("ResourceType") Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.drawable.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);

        // получим ссылку на часовую стрелку
        ImageView hourImageView = findViewById(R.id.hour_hand);
        // анимация для стрелки
        @SuppressLint("ResourceType") Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.drawable.hour_turn);
        // присоединяем анимацию
        hourImageView.startAnimation(hourTurnAnimation);
    }
}