package ru.teacher.it_fest_2022_demo.api.retrofit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.teacher.it_fest_2022_demo.data.ResponseData;

public interface APIServiceGeocode {
    @GET("1.x/")
    Call<ArrayList<ResponseData>> getData();

}
