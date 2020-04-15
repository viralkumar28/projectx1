package com.example.projectx.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;


import com.example.projectx.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FAQ extends AppCompatActivity  {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq_fragment);
        BottomNavigationView navigation = findViewById(R.id.bottom_nav);
        navigation.setSelectedItemId(R.id.navigation_faq);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        startActivity(new Intent(getApplicationContext(),HomePageActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.navigation_contact:
                        startActivity(new Intent(getApplicationContext(),ContactUs.class));
                        overridePendingTransition(0,0);

                        return true;

                    case R.id.navigation_faq:
                        return true;

                    case R.id.navigation_profile:
                        startActivity(new Intent(getApplicationContext(),UserProfileActivity.class));
                        overridePendingTransition(0,0);

                        return true;

                }
                return false;
            }
        });

    }


}