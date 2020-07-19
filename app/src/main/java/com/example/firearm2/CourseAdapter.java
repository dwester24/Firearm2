package com.example.firearm2;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CourseAdapter extends ArrayAdapter<Course> {
    private int mTimeLimit;

    public CourseAdapter(Context context, ArrayList<Course> courses) {
        super(context, 0, courses);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get current course at this position of the list
        final Course currentCourse = getItem(position);

        //Find the text view for Yard Line and Round count
        TextView yardLine = listItemView.findViewById(R.id.yard_line);
        //Set the yard line and round count info to text view
        yardLine.setText(currentCourse.getYardLine());

        //Find text view for night instructions
        TextView nightIns = listItemView.findViewById(R.id.night_details);
        //Check if course has night instructions, if so set the text to text view, if not set
        //text view to empty string
        if (currentCourse.hasNightIns()) {
            nightIns.setText("");
        } else {
            nightIns.setText(currentCourse.getNightIns());
        }

        //Find the text view for 1st course command
        TextView firstCourse = listItemView.findViewById(R.id.course_of_fire_1);
        //Set the course on the text view
        firstCourse.setText(currentCourse.getFirstCourse());

        //Get time limit for current course
        mTimeLimit = Course.getTime();


        //Set Fire Button
        Button fireButton = listItemView.findViewById(R.id.fire_button);

        fireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(Course.getTime(), 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        
                    }

                    @Override
                    public void onFinish() {

                    }
                }


            }

    });

        return listItemView;
}





}
