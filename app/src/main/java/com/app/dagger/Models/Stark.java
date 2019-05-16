package com.app.dagger.Models;

import android.util.Log;

import com.app.dagger.Interface.House;

import javax.inject.Inject;

public class Stark implements House {

    @Inject
    public Stark(){

    }

    @Override
    public void prepareForWar() {
        Log.e("prepareForWarStark", this.getClass().getSimpleName() + "is preparing for war!");
    }


    @Override
    public void reportForWar() {
        Log.e("reportForWarStark", this.getClass().getSimpleName() + "is preparing for war!");
    }
}
