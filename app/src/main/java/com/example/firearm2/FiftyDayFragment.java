package com.example.firearm2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class FiftyDayFragment extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.course_list, container, false);

        //Create an Array for the courses
        final ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("3 Yard Line - 6 Rounds", "", "Draw and fire 2 rounds in 2 seconds strong hand only",
                2000));
        courses.add(new Course("3 Yard Line - 6 Rounds", "", "Draw and fire 2 rounds in 2 seconds strong hand only",
                2000));
        courses.add(new Course("3 Yard Line - 6 Rounds", "", "Draw and fire 2 rounds in 2 seconds strong hand only",
                2000));
        courses.add(new Course("7 Yard line - 20 rounds", "", "Draw and fire 3 rounds in 5 seconds," +
                "keep the target covered", 5000));
        courses.add(new Course("7 Yard Line - 20 Rounds", "", "Fire 2 rounds in 3 seconds, keep the target" +
                "covered", 3000));
        courses.add(new Course("7 Yard Line- 20 Rounds","","Fire 1 round, perform a magazine change and fire " +
                "2 rounds with your support hand in 15 seconds", 15000));
        courses.add(new Course("7 Yard line - 20 rounds", "", "Draw and fire 12 rounds in 20 seconds with a" +
                "mandatory magazine change", 20000));
        courses.add(new Course("15 Yard Line - 12 Rounds", "", "Draw and fire 6 rounds standing and 6 rounds" +
                "kneeling with a magazine change in the kneeling position in 30 seconds", 30000));
        courses.add(new Course("25 Yard Line - 12 Rounds", "", "Draw and fire 6 rounds prone and" +
                "6 rounds standing in 60 seconds", 60000));

        //Create an adapter
        CourseAdapter adapter = new CourseAdapter(getActivity(),courses);

        //Find the listview
        ListView listView = rootView.findViewById(R.id.list);

        //Set adapter on listview
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                new StartTimer();
            }
        });

       return rootView;
    }

}