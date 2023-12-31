package com.example.azkary.viewmodel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.azkary.repository.SurahRepo;
import com.example.azkary.response.SurahResponse;

public class SurahViewModel extends ViewModel {
    private SurahRepo surahRepo;

    public SurahViewModel() {
        surahRepo=new SurahRepo();
    }

    public LiveData<SurahResponse> getSurah(){
        return surahRepo.getSurah();
    }
}