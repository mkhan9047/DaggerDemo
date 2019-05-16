package com.app.dagger.Models;

import javax.inject.Inject;

public class War {

    private Stark stark;
    private Boltons boltons;

    @Inject
    public War(Stark stark, Boltons boltons) {
        this.stark = stark;
        this.boltons = boltons;
    }

    public void prepare() {
        stark.prepareForWar();
        boltons.prepareForWar();
    }

    public void report() {
        stark.reportForWar();
        boltons.reportForWar();
    }
}
