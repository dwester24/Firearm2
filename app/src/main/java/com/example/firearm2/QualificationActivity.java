package com.example.firearm2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class QualificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);

        //Initialize Text Views
        TextView handgunTextView = findViewById(R.id.handgun_text_view);
        TextView shotgunTextView = findViewById(R.id.shotgun_text_view);
        TextView rifleTextView = findViewById(R.id.rifle_text_view);

        //Set on click listeners
        handgunTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set content view
                setContentView(R.layout.activity_handgun);

                //FInd the viewpager
                ViewPager viewPager = findViewById(R.id.viewpager);

                //Create an adapter that knows which fragment to show
                HandgunCourseFragmentPagerAdapter adapter = new HandgunCourseFragmentPagerAdapter
                        (QualificationActivity.this, getSupportFragmentManager());

                //Set adapter onto viewpager
                viewPager.setAdapter(adapter);

                //Find tablayout that shows the tabs
                TabLayout tabs = findViewById(R.id.tabs);

                //Connect the tablayout with the viewpager
                tabs.setupWithViewPager(viewPager);

            }
        });

    }
}