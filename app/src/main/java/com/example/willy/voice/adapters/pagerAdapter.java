package com.example.willy.voice.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.willy.voice.fragments.Bitacora;
import com.example.willy.voice.fragments.Perfil;
import com.example.willy.voice.fragments.Recomendacion;

public class pagerAdapter extends FragmentStatePagerAdapter {
    private int numberofTabs;
    public pagerAdapter(FragmentManager fm, int numberofTabs) {
        super(fm);
        this.numberofTabs=numberofTabs;
    }
    public pagerAdapter(FragmentManager fm) {
        super(fm);
        this.numberofTabs=0;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return  new Bitacora();
            case 1:
                return  new Recomendacion();
            case 2:
                return  new Perfil();
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return numberofTabs;
    }
}
