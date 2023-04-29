package com.example.buttomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView;
        bottomNavigationView = findViewById(R.id.Buttom_nav_bar);
        first_fragment firstFragment = new first_fragment();
        second_fragment secondFragment = new second_fragment();
        third_fragment thirdFragment = new  third_fragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.show_fragment, firstFragment)
                .commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.show_fragment, firstFragment)
                            .commit();
                }
                if (item.getItemId() == R.id.search) {
                   getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.show_fragment, secondFragment)
                            .commit();
                }      if (item.getItemId() == R.id.user) {
                   getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.show_fragment, thirdFragment)
                            .commit();
                }

                return true;
            }
        });
    }
}