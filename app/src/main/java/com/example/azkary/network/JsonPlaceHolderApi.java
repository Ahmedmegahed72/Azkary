package com.example.azkary.network;

import com.example.azkary.response.SurahDetailResponse;
import com.example.azkary.response.SurahResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @GET("surah")
    Call<SurahResponse> getSurah();


    @GET("sura/{translation_key}/{sura_number}")
    Call<SurahDetailResponse> getSurahDetail(@Path("translation_key")String lan,
                                             @Path("sura_number") int surahId);





}
