package com.example.pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
TabLayout tabLayout;
TabItem message, status,call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout= findViewById(R.id.tabLayout);
        call = findViewById(R.id.call);
        status = findViewById(R.id.status);
        message = findViewById(R.id.messagess);
        viewPager.setAdapter(new MypageAdapter(getSupportFragmentManager(),tabLayout.getTabCount()));
        tabLayout.setupWithViewPager(viewPager);

    }
}