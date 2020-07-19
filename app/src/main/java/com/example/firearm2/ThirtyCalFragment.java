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

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class ThirtyCalFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mRootView = inflater.inflate(R.layout.fragment_thirty_cal, container, false);
        //Initialize Edit Text Views
        final EditText fiveRingHits = mRootView.findViewById(R.id.five_ring_hits);
        final EditText fourRingHits = mRootView.findViewById(R.id.four_ring_hits);
        final EditText threeRingHits = mRootView.findViewById(R.id.three_ring_hits);

        // Initialize Text Views
        final TextView fiveRingTotal = mRootView.findViewById(R.id.five_ring_total);
        final TextView fourRingTotal = mRootView.findViewById(R.id.four_ring_total);
        final TextView threeRingTotal = mRootView.findViewById(R.id.three_ring_total);


        fiveRingHits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String fiveStr = fiveRingHits.getText().toString();
                try {
                    int fiveHits = Integer.parseInt(fiveStr);
                    int fiveScore = 0;
                    fiveScore = fiveHits * 5;
                    fiveRingTotal.setText(String.valueOf(fiveScore));
                } catch (NumberFormatException e) {
                    fiveRingTotal.setText("");
                }



            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        fourRingHits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String fourStr = fourRingHits.getText().toString();

                try {
                    int fourHits = Integer.parseInt(fourStr);
                    int fourScore = 0;
                    fourScore = fourHits * 4;
                    fourRingTotal.setText(String.valueOf(fourScore));
                } catch (NumberFormatException e) {
                    fourRingTotal.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        threeRingHits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String threeStr = threeRingHits.getText().toString();

                try {
                    int threeHits = Integer.parseInt(threeStr);
                    int threeScore = 0;
                    threeScore = threeHits * 3;
                    threeRingTotal.setText(String.valueOf(threeScore));
                } catch (NumberFormatException e) {
                    threeRingTotal.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Initialize buttons
        Button calculate = mRootView.findViewById(R.id.calculate_button);


        //Set Calculate click listener
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore();
            }
        });

        return mRootView;
    }

    public void finalScore() {
        //Declare TextViews
        TextView sum5Ring = getView().findViewById(R.id.five_ring_total);
        TextView sum4Ring = getView().findViewById(R.id.four_ring_total);
        TextView sum3Ring = getView().findViewById(R.id.three_ring_total);
        TextView score = getView().findViewById(R.id.score_text_view);

        //Convert to Strings
        String fiveStr = sum5Ring.getText().toString();
        String fourStr = sum4Ring.getText().toString();
        String threeStr = sum3Ring.getText().toString();

        //Parse to Integer
        int fiveScore = Integer.parseInt(fiveStr);
        int fourScore = Integer.parseInt((fourStr));
        int threeScore = Integer.parseInt((threeStr));

        //Calculate Score
        double scoreFinal = (fiveScore + fourScore + threeScore) * 2 / 3.0;
        DecimalFormat scoreFormat = new DecimalFormat("00.0");
        scoreFormat.setRoundingMode(RoundingMode.FLOOR);
        String finalScore = scoreFormat.format(scoreFinal);
        score.setText(finalScore);
    }
}