package com.app.dagger.Interface;

import com.app.dagger.Models.Boltons;
import com.app.dagger.Models.Module.BravoModule;
import com.app.dagger.Models.Module.Cash;
import com.app.dagger.Models.Module.Soldiers;
import com.app.dagger.Models.Stark;
import com.app.dagger.Models.War;

import dagger.Component;

@Component(modules = BravoModule.class)
public interface BattleComponent {
    War getWar();
    Stark getStark();
    Cash getCash();
    Soldiers getSoldiers();
    Boltons getBoltons();
}
