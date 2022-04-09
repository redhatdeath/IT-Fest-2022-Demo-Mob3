package ru.teacher.it_fest_2022_demo.app;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

import ru.teacher.it_fest_2022_demo.api.API_YandexMapKit_Config;

public class AppStart extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initMapKit();
    }

    private void initMapKit() {
        MapKitFactory.setApiKey(API_YandexMapKit_Config.API_MAP_KIT_KEY);
        MapKitFactory.initialize(this);
    }
}
