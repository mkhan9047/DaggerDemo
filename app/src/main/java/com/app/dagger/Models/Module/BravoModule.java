package com.app.dagger.Models.Module;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class BravoModule {

    Cash cash;
    Soldiers soldiers;


    public BravoModule(Cash cash, Soldiers soldiers) {
        this.cash = cash;
        this.soldiers = soldiers;
    }


    @Provides
    public Cash getCash() {
        return cash;
    }

    @Provides
    public Soldiers getSoldiers() {
        return soldiers;
    }

}
