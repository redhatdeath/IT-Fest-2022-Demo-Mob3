package ru.teacher.it_fest_2022_demo.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

import ru.teacher.it_fest_2022_demo.R;
import ru.teacher.it_fest_2022_demo.api.Geo_Config;

public class Activity_MainView extends AppCompatActivity {

    private static final String EXTRA_MODE = " Mode ";
    private static final String MODE_MAIN_VIEW = " Main View ";

    private MapView mapview;

    public static Intent startMainView(Context context) {
        Intent intent = new Intent(context, Activity_MainView.class);
        intent.putExtra(EXTRA_MODE, MODE_MAIN_VIEW);
        return intent;
    }

    private void parseIntent() {
        if (!getIntent().hasExtra(EXTRA_MODE))
            throw new RuntimeException("Extra mode is absent");
        String mode = getIntent().getStringExtra(EXTRA_MODE);
        if (!mode.equals(MODE_MAIN_VIEW))
            throw new RuntimeException("UnKnown mode: " + mode);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
        parseIntent();
        mapview = findViewById(R.id.mapview);
        Point ekb = new Point(Geo_Config.EKB_LAT, Geo_Config.EKB_LON);
        mapview.getMap().move(
                new CameraPosition(ekb, 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapview.onStart();
        MapKitFactory.getInstance().onStart();
    }


}