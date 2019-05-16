package com.app.dagger.Models;

import android.util.Log;

import com.app.dagger.Interface.House;

import javax.inject.Inject;

public class Boltons implements House {


    @Inject
    public Boltons() {

    }

    @Override
    public void prepareForWar() {
        Log.e("prepareForWarBolton", this.getClass().getSimpleName() + "is preparing for war!");
    }

    @Override
    public void reportForWar() {
        Log.e("reportForWarBolton", this.getClass().getSimpleName() + "is reporting for war!");
    }
}
