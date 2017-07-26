package com.example.rebeccaandgerald.cricketscorer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondTeamBowlingFragment extends Fragment {


    public SecondTeamBowlingFragment() {
        // Required empty public constructor
    }

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_bowling_two, container, false);

        final Spinner extraSpinner = (Spinner) rootView.findViewById(R.id.bowling_extras);
        extraSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String>adapter;
        List<String>list;
        list = new ArrayList<String>();
        list.add("Extras");
        list.add("Wide");
        list.add("No Ball");
        list.add("Byes");
        list.add("Leg Byes");

        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        extraSpinner.setAdapter(adapter);

        final Spinner newBowlerSpinner = (Spinner) rootView.findViewById(R.id.new_bowler);
        newBowlerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String>bowlingAdapter;
        List<String>bowlingList;
        bowlingList = new ArrayList<String>();
        bowlingList.add("New Bowler");

        bowlingAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, bowlingList);
        bowlingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        newBowlerSpinner.setAdapter(bowlingAdapter);

        return rootView;
    }

}
