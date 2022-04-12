package ru.teacher.it_fest_2022_demo.app;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

import ru.teacher.it_fest_2022_demo.api.API_Yandex_Key;

public class AppStart extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initMapKit();
    }

    private void initMapKit() {
        MapKitFactory.setApiKey(API_Yandex_Key.API_MAPS_KIT_KEY);
        MapKitFactory.initialize(this);
    }
}
