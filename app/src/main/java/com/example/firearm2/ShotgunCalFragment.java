package com.example.firearm2;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class ShotgunCalFragment extends Fragment {
    //Initialize integers for scoring
    int mBuckShotScore;
    int mSlugsIn7;
    int mSlugsOutside7;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View mRootView = inflater.inflate(R.layout.fragment_shotgun_cal, container, false);
         final TextView scoreTextView  = mRootView.findViewById(R.id.score_text_view);


        //Initialize EditText Views
        final EditText buckshot = mRootView.findViewById(R.id.buckshot_hits);
        final EditText slugsIn7 = mRootView.findViewById(R.id.seven_ring_slug);
        final EditText slugsOutside7 = mRootView.findViewById(R.id.outside_slugs);




        buckshot.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String buckStr = buckshot.getText().toString();

                try {
                    mBuckShotScore = Integer.parseInt(buckStr);
                } catch (NumberFormatException e) {
                    buckshot.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        slugsIn7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String Slug7Str = slugsIn7.getText().toString();

                try {
                    mSlugsIn7 = Integer.parseInt(Slug7Str);
                } catch (NumberFormatException e) {
                    slugsIn7.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        slugsOutside7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String SlugOutsideStr = slugsOutside7.getText().toString();

                try {
                    mSlugsOutside7 = Integer.parseInt(SlugOutsideStr);
                } catch (NumberFormatException e) {
                    slugsOutside7.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //Initialize buttons
        Button calculate_button = mRootView.findViewById(R.id.calculate_button);

        //Set Calculate click listener
        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calculate Score
                int score = (mSlugsIn7 * 11) + (mSlugsOutside7 * 6) + mBuckShotScore;
                scoreTextView.setText(String.valueOf(score));
            }
        });

        return mRootView;
    }

    public void finalScore() {



    }
}