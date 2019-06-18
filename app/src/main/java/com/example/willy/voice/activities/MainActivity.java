package com.example.willy.voice.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.willy.voice.R;
import com.example.willy.voice.adapters.TabAdapter;
import com.example.willy.voice.fragments.Bitacora;
import com.example.willy.voice.fragments.Perfil;
import com.example.willy.voice.fragments.Recomendacion;

public class MainActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.icon_bitacora,
            R.drawable.icon_mejora_color,
            R.drawable.logoprincipal
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setFragmetbyDefault();

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager(), this);
        adapter.addFragment(new Bitacora() ,tabIcons[0]);
        adapter.addFragment(new Recomendacion(), tabIcons[1]);
        adapter.addFragment(new Perfil(), tabIcons[2]);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        highLightCurrentTab(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                highLightCurrentTab(position);
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
    private void highLightCurrentTab(int position) {
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            assert tab != null;
            tab.setCustomView(null);
            tab.setCustomView(adapter.getTabView(i));
        }
        TabLayout.Tab tab = tabLayout.getTabAt(position);
        assert tab != null;
        tab.setCustomView(null);
        tab.setCustomView(adapter.getSelectedTabView(position));
    }

    private void setFragmetbyDefault(){
        /*getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame,new firstFragment())
                .commit();
        MenuItem item= navegationheader.getMenu().getItem(0);
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());*/
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //ft.replace(R.id.content_frame,new firstFragment());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();

    }
}
