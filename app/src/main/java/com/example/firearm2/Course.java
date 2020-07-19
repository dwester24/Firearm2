package com.example.firearm2;

import androidx.appcompat.app.AppCompatActivity;

/**
 * {@link Course} represents a course of fire the instructor wants to call
 */
public class Course extends AppCompatActivity {

    //Night Instructions
    private String mNightIns;

    //Yard Line and Round Count
    private String mYardLine;

    //First Course of Fire
    private String mFirstCourse;

    //Time Limit
    private static int mTimeLimit;


    /**
     * Creates a new Word object
     *
     * @param firstCourse is the first sequence of fire
     * @param nightIns    is the night instructions
     * @param yardLine    is distance and round count text
     */


    public Course(String yardLine, String nightIns, String firstCourse, int timeLimit) {
        mFirstCourse = firstCourse;
        mNightIns = nightIns;
        mYardLine = yardLine;
        mTimeLimit = timeLimit;

    }

    //Get Night Instructions
    public String getNightIns() {
        return mNightIns;
    }

    //Get Yard Line and Round Count
    public String getYardLine() {
        return mYardLine;
    }


    //Get the first course of fire

    public String getFirstCourse() {
        return mFirstCourse;
    }


    public boolean hasNightIns() {
        return mNightIns.equals("");
    }

    public static int getTime(){
        return mTimeLimit;
    }





}
