package com.example.courseui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 mViewPager;
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.view_pager);
        mBottomNavigationView = findViewById(R.id.bottom_navigation);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        mViewPager.setAdapter(adapter);

        mViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position) {
                    case 0:
                        mBottomNavigationView.setSelectedItemId(R.id.home_tab);
                        break;
                    case 1:
                        mBottomNavigationView.setSelectedItemId(R.id.cart_tab);
                        break;
                    case 2:
                        mBottomNavigationView.setSelectedItemId(R.id.course_tab);
                        break;
                    case 3:
                        mBottomNavigationView.setSelectedItemId(R.id.account_tab);
                        break;
                }
            }
        });

        mBottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.home_tab) {
                mViewPager.setCurrentItem(0);
            } else if (id == R.id.cart_tab) {
                mViewPager.setCurrentItem(1);
            } else if (id == R.id.course_tab) {
                mViewPager.setCurrentItem(2);
            } else if (id == R.id.account_tab) {
                mViewPager.setCurrentItem(3);
            }
            return true;
        });
    }
}
