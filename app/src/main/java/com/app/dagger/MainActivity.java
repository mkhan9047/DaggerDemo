package com.app.dagger;

import android.os.StatFs;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.dagger.Interface.BattleComponent;
import com.app.dagger.Interface.DaggerBattleComponent;
import com.app.dagger.Models.Boltons;
import com.app.dagger.Models.Module.BravoModule;
import com.app.dagger.Models.Module.Cash;
import com.app.dagger.Models.Module.Soldiers;
import com.app.dagger.Models.Stark;
import com.app.dagger.Models.War;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using dagger 2
        BattleComponent battleComponent = DaggerBattleComponent.builder().bravoModule(new BravoModule(new Cash(), new Soldiers())).build();

        /*those are from the simple injection*/
        War war = battleComponent.getWar();
        war.prepare();
        war.report();

        /*those are from the BravoModule*/
        battleComponent.getSoldiers();
        battleComponent.getCash();

        //using hard dependency
        Stark stark = new Stark();
        Boltons boltons = new Boltons();
        War war1 = new War(stark, boltons);
        war1.report();
        war1.prepare();
    }


}
