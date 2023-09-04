package com.example.azkary.repository;


import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.azkary.network.Api;
import com.example.azkary.network.JsonPlaceHolderApi;
import com.example.azkary.response.SurahDetailResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SurahDetailRepo {

    JsonPlaceHolderApi jsonPlaceHolderApi;

    public SurahDetailRepo() {
        jsonPlaceHolderApi= Api.getInstance().create(JsonPlaceHolderApi.class);
    }
    public LiveData<SurahDetailResponse> getSurahDetail(String lan,int id){
        MutableLiveData<SurahDetailResponse> data=new MutableLiveData<>();

        jsonPlaceHolderApi.getSurahDetail(lan,id).enqueue(new Callback<SurahDetailResponse>() {
            @Override
            public void onResponse(@NonNull Call<SurahDetailResponse> call, @NonNull Response<SurahDetailResponse> response) {
                data.setValue(response.body());
            }
            @Override
            public void onFailure(@NonNull Call<SurahDetailResponse> call, @NonNull Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }
}
