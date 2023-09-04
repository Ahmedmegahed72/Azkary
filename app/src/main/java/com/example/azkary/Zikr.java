package com.example.azkary;

import androidx.annotation.NonNull;

public class Zikr {
    private String mZikrText;
    private String mAddInfo;

    public Zikr(String zikrText, String addInfo ) {
        mZikrText = zikrText;
        mAddInfo = addInfo;

    }


    public String getZikrText() {
        return mZikrText;
    }

    public void setZikrText(String zikrText) {
        mZikrText = zikrText;
    }

    public String getAddInfo() {
        return mAddInfo;
    }

    public void setAddInfo(String addInfo) {
        mAddInfo = addInfo;
    }



    @NonNull
    @Override

    public String toString() {
        return "\n" + mZikrText + "\n\n" + mAddInfo + "\n\n" ;
    }
}
