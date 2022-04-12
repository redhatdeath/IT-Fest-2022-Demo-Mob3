package ru.teacher.it_fest_2022_demo.api.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIRetrofitServiceConstructor {
    public static <T> T CreateService(Class<T> serviceClass, String URL) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(serviceClass);
    }
}
