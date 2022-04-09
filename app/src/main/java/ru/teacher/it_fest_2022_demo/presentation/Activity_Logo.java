package ru.teacher.it_fest_2022_demo.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import ru.teacher.it_fest_2022_demo.R;

public class Activity_Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
    }


    @Override
    protected void onStart() {
        super.onStart();
        delayedStart();
    }

    private void delayedStart() {
        Handler handler = new Handler();
        handler.postDelayed(
                () -> {
                    Intent intent = Activity_MainView.startMainView(getApplicationContext());
                    startActivity(intent);
                },
                (int) (Math.random() * 3001 + 1000)
        );
    }
}