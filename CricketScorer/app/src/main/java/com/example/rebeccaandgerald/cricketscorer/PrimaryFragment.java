package com.example.rebeccaandgerald.cricketscorer;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.example.rebeccaandgerald.cricketscorer.R.id.runs_one;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrimaryFragment extends Fragment {


    public PrimaryFragment() {
        // Required empty public constructor
    }


    private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.primary, container, false);




        final Button oneRun = (Button) rootView.findViewById(R.id.plus_one);
        oneRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog runsEditor = new Dialog(getContext());
                runsEditor.setContentView(R.layout.single_runs);
                runsEditor.setTitle("Runs");

                final TextView runsView = (TextView) runsEditor.findViewById(R.id.single_runs);
                Button minus = (Button) runsEditor.findViewById(R.id.runs_negative);
                Button plus = (Button) runsEditor.findViewById(R.id.runs_positive);
                Button confirm = (Button) runsEditor.findViewById(R.id.confirm_runs);
                Button cancel = (Button) runsEditor.findViewById(R.id.cancel_runs);

                singleRuns = 1;
                runsView.setText("" + singleRuns);

                minus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        singleRuns--;
                        runsView.setText(""+ singleRuns);
                    }
                });
                plus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        singleRuns++;
                        runsView.setText("" + singleRuns);
                    }
                });
                confirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        runs = runs + singleRuns;
                        displayRuns(runs);
                        runsEditor.dismiss();
                    }
                });
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        runsEditor.dismiss();
                    }
                });

                runsEditor.show();
            }
        });



        final Spinner extrasSpinner = (Spinner) rootView.findViewById(R.id.extras_spinner);
        extrasSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> adapter;
        List<String>list;
        list = new ArrayList<String>();
        list.add("Extras");
        list.add("Wide");
        list.add("No Ball");
        list.add("Byes");
        list.add("Leg Byes");

        adapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, list);
        extrasSpinner.setAdapter(adapter);

        final Spinner wicketSpinner = (Spinner) rootView.findViewById(R.id.wicket_spinner);
        wicketSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> wicketAdapter;
        List<String>wicketList;
        wicketList = new ArrayList<String>();
        wicketList.add("Wicket");
        wicketList.add("Bowled");
        wicketList.add("LBW");
        wicketList.add("Caught");
        wicketList.add("Run Out");
        wicketList.add("Retire");

        wicketAdapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, wicketList);
        wicketSpinner.setAdapter(wicketAdapter);

        final Spinner bowlerSpinner = (Spinner) rootView.findViewById(R.id.bowler_spinner);
        bowlerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> bowlerAdapter;
        List<String> bowlerList;
        bowlerList = new ArrayList<String>();
        bowlerList.add("New Bowler");

        bowlerAdapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, bowlerList);
        bowlerSpinner.setAdapter(bowlerAdapter);

        return rootView;
    }

    int runs = 0;
    int singleRuns = 1;


    private void displayRuns(int number) {
        TextView runs = (TextView) rootView.findViewById(runs_one);
        runs.setText("" + number);
    }

}
