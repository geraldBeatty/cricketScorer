package com.example.rebeccaandgerald.cricketscorer;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.example.rebeccaandgerald.cricketscorer.R.id.four_runs_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.four_runs_one_x;
import static com.example.rebeccaandgerald.cricketscorer.R.id.four_runs_two;
import static com.example.rebeccaandgerald.cricketscorer.R.id.four_runs_two_x;
import static com.example.rebeccaandgerald.cricketscorer.R.id.one_run_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.one_run_one_x;
import static com.example.rebeccaandgerald.cricketscorer.R.id.one_run_two;
import static com.example.rebeccaandgerald.cricketscorer.R.id.one_run_two_x;
import static com.example.rebeccaandgerald.cricketscorer.R.id.six_runs_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.six_runs_one_x;
import static com.example.rebeccaandgerald.cricketscorer.R.id.six_runs_two;
import static com.example.rebeccaandgerald.cricketscorer.R.id.six_runs_two_x;

public class SecondTeamFragment extends Fragment {


    public SecondTeamFragment() {
        // Required empty public constructor
    }

    private View editThief;
    private View rootView;
    private ScrollView scrollView;

    private EditText playerOne;
    private EditText playerTwo;
    private EditText teamTwo;
    private TextView secondTeamRuns;

    private TextView bOneName;
    private TextView bTwoName;
    private TextView bThreeName;
    private TextView bFourName;
    private TextView bFiveName;
    private TextView bSixName;
    private TextView bSevenName;
    private TextView bEightName;
    private TextView bNineName;
    private TextView bTenName;
    private TextView bElevenName;

    private TextView bOneRuns;
    private TextView bTwoRuns;
    private TextView bThreeRuns;
    private TextView bFourRuns;
    private TextView bFiveRuns;
    private TextView bSixRuns;
    private TextView bSevenRuns;
    private TextView bEightRuns;
    private TextView bNineRuns;
    private TextView bTenRuns;
    private TextView bElevenRuns;

    private TextView extras;

    private TextView bOneOut;
    private TextView bTwoOut;
    private TextView bThreeOut;
    private TextView bFourOut;
    private TextView bFiveOut;
    private TextView bSixOut;
    private TextView bSevenOut;
    private TextView bEightOut;
    private TextView bNineOut;
    private TextView bTenOut;
    private TextView bElevenOut;

    private static final int OUT = 0;
    private static final int BOWLED = 1;
    private static final int LBW = 2;
    private static final int CAUGHT = 3;
    private static final int RUNOUT = 4;
    private static final int RETIRE = 5;
    private static final int NOTOUT = 6;

    private static final int OUT2 = 0;
    private static final int BOWLED2 = 1;
    private static final int LBW2 = 2;
    private static final int CAUGHT2 = 3;
    private static final int RUNOUT2 = 4;
    private static final int RETIRE2 = 5;

    private String team2Name;
    private String out;
    private String bowled;
    private String lbw;
    private String caught;
    private String runOut;
    private String retire;
    private String retired;
    private String notOut;
    private String editPlayer;
    private String wicket;
    private String runsString;
    private String editExtras;
    private String name;
    private String batsman;
    private String reset;
    private String sureReset;
    private String cancel;
    private String yes;
    private String saveString;

    private Button oneRun1;
    private Button fourRuns1;
    private Button sixRuns1;
    private Button oneRun2;
    private Button fourRuns2;
    private Button sixRuns2;
    private Button extrasButton;
    private Spinner spinner;
    private Spinner spinner2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        rootView = inflater.inflate(R.layout.fragment_batting_two, container, false);

        /*Toolbar toolbar= (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(this); */



        teamTwo = (EditText) rootView.findViewById(R.id.team_two);
        playerOne = (EditText) rootView.findViewById(R.id.player_one_x);
        playerTwo = (EditText) rootView.findViewById(R.id.player_two_x);
        secondTeamRuns = (TextView) rootView.findViewById(R.id.second_team_runs);

        editThief = rootView.findViewById(R.id.edt_thief_x);

        scrollView = (ScrollView) rootView.findViewById(R.id.scrollView_x);

        bOneName = (TextView) rootView.findViewById(R.id.b_one_name_x);
        bTwoName = (TextView) rootView.findViewById(R.id.b_two_name_x);
        bThreeName = (TextView) rootView.findViewById(R.id.b_three_name_x);
        bFourName = (TextView) rootView.findViewById(R.id.b_four_name_x);
        bFiveName = (TextView) rootView.findViewById(R.id.b_five_name_x);
        bSixName = (TextView) rootView.findViewById(R.id.b_six_name_x);
        bSevenName = (TextView) rootView.findViewById(R.id.b_seven_name_x);
        bEightName = (TextView) rootView.findViewById(R.id.b_eight_name_x);
        bNineName = (TextView) rootView.findViewById(R.id.b_nine_name_x);
        bTenName = (TextView) rootView.findViewById(R.id.b_ten_name_x);
        bElevenName = (TextView) rootView.findViewById(R.id.b_eleven_name_x);

        bOneRuns = (TextView) rootView.findViewById(R.id.b_one_runs_x);
        bTwoRuns = (TextView) rootView.findViewById(R.id.b_two_runs_x);
        bThreeRuns = (TextView) rootView.findViewById(R.id.b_three_runs_x);
        bFourRuns = (TextView) rootView.findViewById(R.id.b_four_runs_x);
        bFiveRuns = (TextView) rootView.findViewById(R.id.b_five_runs_x);
        bSixRuns = (TextView) rootView.findViewById(R.id.b_six_runs_x);
        bSevenRuns = (TextView) rootView.findViewById(R.id.b_seven_runs_x);
        bEightRuns = (TextView) rootView.findViewById(R.id.b_eight_runs_x);
        bNineRuns = (TextView) rootView.findViewById(R.id.b_nine_runs_x);
        bTenRuns = (TextView) rootView.findViewById(R.id.b_ten_runs_x);
        bElevenRuns = (TextView) rootView.findViewById(R.id.b_eleven_runs_x);

        extras = (TextView) rootView.findViewById(R.id.extras_x);

        bOneOut = (TextView) rootView.findViewById(R.id.b_one_out_x);
        bTwoOut = (TextView) rootView.findViewById(R.id.b_two_out_x);
        bThreeOut = (TextView) rootView.findViewById(R.id.b_three_out_x);
        bFourOut = (TextView) rootView.findViewById(R.id.b_four_out_x);
        bFiveOut = (TextView) rootView.findViewById(R.id.b_five_out_x);
        bSixOut = (TextView) rootView.findViewById(R.id.b_six_out_x);
        bSevenOut = (TextView) rootView.findViewById(R.id.b_seven_out_x);
        bEightOut = (TextView) rootView.findViewById(R.id.b_eight_out_x);
        bNineOut = (TextView) rootView.findViewById(R.id.b_nine_out_x);
        bTenOut = (TextView) rootView.findViewById(R.id.b_ten_out_x);
        bElevenOut = (TextView) rootView.findViewById(R.id.b_eleven_out_x);

        out = getResources().getString(R.string.out);
        bowled = getResources().getString(R.string.bowled);
        lbw = getResources().getString(R.string.lbw);
        caught = getResources().getString(R.string.caught);
        runOut = getResources().getString(R.string.run_out);
        retire = getResources().getString(R.string.retire);
        retired = getResources().getString(R.string.retired);
        notOut = getResources().getString(R.string.not_out);
        editPlayer = getResources().getString(R.string.edit_player);
        wicket = getResources().getString(R.string.wicket);
        runsString = getResources().getString(R.string.runs);
        editExtras = getResources().getString(R.string.edit_extras);
        name = getResources().getString(R.string.name);
        batsman = getResources().getString(R.string.batsman);
        reset = getResources().getString(R.string.reset);
        sureReset = getResources().getString(R.string.sure_reset);
        cancel = getResources().getString(R.string.cancel);
        yes = getResources().getString(R.string.yes);
        saveString = getResources().getString(R.string.save);

        oneRun1 = (Button) rootView.findViewById(one_run_one_x);
        fourRuns1 = (Button) rootView.findViewById(four_runs_one_x);
        sixRuns1 = (Button) rootView.findViewById(six_runs_one_x);
        oneRun2 = (Button) rootView.findViewById(one_run_two_x);
        fourRuns2 = (Button) rootView.findViewById(four_runs_two_x);
        sixRuns2 = (Button) rootView.findViewById(six_runs_two_x);
        spinner = (Spinner) rootView.findViewById(R.id.spin_one_x);
        spinner2 = (Spinner) rootView.findViewById(R.id.spin_two_x);
        extrasButton = (Button) rootView.findViewById(R.id.extras_button_x);
        // Edit listeners for batter names
        bOneName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(1);
                return true;
            }
        });
        bTwoName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(2);
                return true;
            }
        });
        bThreeName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(3);
                return true;
            }
        });
        bFourName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(4);
                return true;
            }
        });
        bFiveName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(5);
                return true;
            }
        });
        bSixName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(6);
                return true;
            }
        });
        bSevenName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(7);
                return true;
            }
        });
        bEightName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(8);
                return true;
            }
        });
        bNineName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(9);
                return true;
            }
        });
        bTenName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(10);
                return true;
            }
        });
        bElevenName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nameEditor(11);
                return true;
            }
        });

        // Edit listeners for batter runs
        bOneRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(1);
                return true;
            }
        });
        bTwoRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(2);
                return true;
            }
        });
        bThreeRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(3);
                return true;
            }
        });
        bFourRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(4);
                return true;
            }
        });
        bFiveRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(5);
                return true;
            }
        });
        bSixRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(6);
                return true;
            }
        });
        bSevenRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(7);
                return true;
            }
        });
        bEightRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(8);
                return true;
            }
        });
        bNineRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(9);
                return true;
            }
        });
        bTenRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(10);
                return true;
            }
        });
        bElevenRuns.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(11);
                return true;
            }
        });
        extras.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                runsEditor(0);
                return true;
            }
        });

        //Edit listeners for batter out
        bOneOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(1);
                return true;
            }
        });
        bTwoOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(2);
                return true;
            }
        });
        bThreeOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(3);
                return true;
            }
        });
        bFourOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(4);
                return true;
            }
        });
        bFiveOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(5);
                return true;
            }
        });
        bSixOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(6);
                return true;
            }
        });
        bSevenOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(7);
                return true;
            }
        });
        bEightOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(8);
                return true;
            }
        });
        bNineOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(9);
                return true;
            }
        });
        bTenOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(10);
                return true;
            }
        });
        bElevenOut.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                wicketEditor(11);
                return true;
            }
        });

        //teamOne EditText listener
        teamTwo.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE
                        || event.getAction() == KeyEvent.ACTION_DOWN
                        && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    //sets cursor to start
                    teamTwo.setText(teamTwo.getText());
                    editThief.requestFocus();
                    hideSoftKeyboard(this, v);

                    // mTabHost.getTabWidget().getChildAt(0).findViewById(android.R.id.title);
                    // ((TextView)mTabHost.getTabWidget().getChildAt(0).findViewById(android.R.id.title)).setText("New");
                }
                return false;
            }
        });

        //playerOne EditText Listener
        playerOne.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String batterOneName = playerOne.getText().toString();

                if (actionId == EditorInfo.IME_ACTION_DONE
                        || event.getAction() == KeyEvent.ACTION_DOWN
                        && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    //sets cursor to start
                    playerOne.setText(playerOne.getText());
                    editThief.requestFocus();
                    hideSoftKeyboard(this, v);

                    switch (counterA) {
                        case 1:
                            displayBOneName(batterOneName);
                            break;
                        case 3:
                            displayBThreeName(batterOneName);
                            break;
                        case 4:
                            displayBFourName(batterOneName);
                            break;
                        case 5:
                            displayBFiveName(batterOneName);
                            break;
                        case 6:
                            displayBSixName(batterOneName);
                            break;
                        case 7:
                            displayBSevenName(batterOneName);
                            break;
                        case 8:
                            displayBEightName(batterOneName);
                            break;
                        case 9:
                            displayBNineName(batterOneName);
                            break;
                        case 10:
                            displayBTenName(batterOneName);
                            break;
                        case 11:
                            displayBElevenName(batterOneName);
                            break;
                    }
                }
                return false;
            }
        });

        //playerTwo EditText listener
        playerTwo.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String batterTwoName = playerTwo.getText().toString();

                if (actionId == EditorInfo.IME_ACTION_DONE
                        || event.getAction() == KeyEvent.ACTION_DOWN
                        && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    playerTwo.setText(playerTwo.getText());
                    editThief.requestFocus();
                    hideSoftKeyboard(this, v);

                    switch (counterB) {
                        case 2:
                            displayBTwoName(batterTwoName);
                            break;
                        case 3:
                            displayBThreeName(batterTwoName);
                            break;
                        case 4:
                            displayBFourName(batterTwoName);
                            break;
                        case 5:
                            displayBFiveName(batterTwoName);
                            break;
                        case 6:
                            displayBSixName(batterTwoName);
                            break;
                        case 7:
                            displayBSevenName(batterTwoName);
                            break;
                        case 8:
                            displayBEightName(batterTwoName);
                            break;
                        case 9:
                            displayBNineName(batterTwoName);
                            break;
                        case 10:
                            displayBTenName(batterTwoName);
                            break;
                        case 11:
                            displayBElevenName(batterTwoName);
                            break;
                    }
                }
                return false;
            }
        });

        // Spinner for playerOne
        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spin_one_x);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case BOWLED:
                        playerWicketA(bowled);
                        scroller(getBatterView());
                        wicketFall();
                        counterOne();
                        playerOne.setText("");
                        playerOne.setHint(nextBatsmanA());
                        spinner.setSelection(OUT);
                        break;
                    case LBW:
                        playerWicketA(lbw);
                        scroller(getBatterView());
                        wicketFall();
                        counterOne();
                        playerOne.setText("");
                        playerOne.setHint(nextBatsmanA());
                        spinner.setSelection(OUT);
                        break;
                    case CAUGHT:
                        playerWicketA(caught);
                        scroller(getBatterView());
                        wicketFall();
                        counterOne();
                        playerOne.setText("");
                        playerOne.setHint(nextBatsmanA());
                        spinner.setSelection(OUT);
                        break;
                    case RUNOUT:
                        playerWicketA(runOut);
                        scroller(getBatterView());
                        wicketFall();
                        counterOne();
                        playerOne.setText("");
                        playerOne.setHint(nextBatsmanA());
                        spinner.setSelection(OUT);
                        break;
                    case RETIRE:
                        playerWicketA(retired);
                        scroller(getBatterView());
                        counterOne();
                        playerOne.setText("");
                        playerOne.setHint(nextBatsmanA());
                        spinner.setSelection(OUT);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ArrayAdapter<String> adapter;
        List<String> list;
        list = new ArrayList<String>();
        list.add(out);
        list.add(bowled);
        list.add(lbw);
        list.add(caught);
        list.add(runOut);
        list.add(retire);

        adapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, list);
        spinner.setAdapter(adapter);

        // Spinner for playerTwo
        final Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spin_two_x);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case BOWLED2:
                        playerWicketB(bowled);
                        scroller(getBatterView());
                        wicketFall();
                        counterTwo();
                        playerTwo.setText("");
                        playerTwo.setHint(nextBatsmanB());
                        spinner2.setSelection(OUT2);
                        break;
                    case LBW2:
                        playerWicketB(lbw);
                        scroller(getBatterView());
                        wicketFall();
                        counterTwo();
                        playerTwo.setText("");
                        playerTwo.setHint(nextBatsmanB());
                        spinner2.setSelection(OUT2);
                        break;
                    case CAUGHT2:
                        playerWicketB(caught);
                        scroller(getBatterView());
                        wicketFall();
                        counterTwo();
                        playerTwo.setText("");
                        playerTwo.setHint(nextBatsmanB());
                        spinner2.setSelection(OUT2);
                        break;
                    case RUNOUT2:
                        playerWicketB(runOut);
                        scroller(getBatterView());
                        wicketFall();
                        counterTwo();
                        playerTwo.setText("");
                        playerTwo.setHint(nextBatsmanB());
                        spinner2.setSelection(OUT2);
                        break;
                    case RETIRE2:
                        playerWicketB(retired);
                        scroller(getBatterView());
                        counterTwo();
                        playerTwo.setText("");
                        playerTwo.setHint(nextBatsmanB());
                        spinner2.setSelection(OUT2);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ArrayAdapter<String> adapter2;
        List<String> list2;
        list2 = new ArrayList<String>();
        list2.add(out);
        list2.add(bowled);
        list2.add(lbw);
        list2.add(caught);
        list2.add(runOut);
        list2.add(retired);

        adapter2 = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, list);
        spinner2.setAdapter(adapter2);

        // Run buttons
        Button oneRun1 = (Button) rootView.findViewById(one_run_one_x);
        oneRun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runs++;
                displayRuns(runs);
                displayTeamRuns(runs,extraRuns);
                switch(counterA)
                {
                    case 3:
                        b3RunsCounter ++;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter ++;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter ++;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter ++;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter ++;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter ++;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter ++;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter ++;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter ++;
                        displayBElevenRuns();
                        break;
                    default:
                        b1RunsCounter ++;
                        displayBOneRuns();
                        break;
                }
            }
        });

        Button fourRuns1 = (Button) rootView.findViewById(four_runs_one_x);
        fourRuns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs + 4;
                displayRuns(runs);
                displayTeamRuns(runs,extraRuns);
                switch(counterA)
                {
                    case 3:
                        b3RunsCounter = b3RunsCounter +4;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter +4;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter +4;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter +4;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter +4;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter +4;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter +4;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter +4;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter +4;
                        displayBElevenRuns();
                        break;
                    default:
                        b1RunsCounter = b1RunsCounter +4;
                        displayBOneRuns();
                        break;
                }
            }
        });

        Button sixRuns1 = (Button) rootView.findViewById(six_runs_one_x);
        sixRuns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runs = runs + 6;
                displayRuns(runs);
                displayTeamRuns(runs,extraRuns);
                switch(counterA)
                {
                    case 3:
                        b3RunsCounter = b3RunsCounter +6;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter +6;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter +6;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter +6;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter +6;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter +6;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter +6;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter +6;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter +6;
                        displayBElevenRuns();
                        break;
                    default:
                        b1RunsCounter = b1RunsCounter +6;
                        displayBOneRuns();
                        break;
                }
            }
        });

        Button oneRun2 = (Button) rootView.findViewById(one_run_two_x);
        oneRun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs++;
                displayRuns(runs);
                displayTeamRuns(runs,extraRuns);
                switch(counterB)
                {
                    case 3:
                        b3RunsCounter ++;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter ++;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter ++;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter ++;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter ++;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter ++;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter ++;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter ++;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter ++;
                        displayBElevenRuns();
                        break;
                    default:
                        b2RunsCounter ++;
                        displayBTwoRuns();
                        break;
                }
            }
        });

        Button fourRuns2 = (Button) rootView.findViewById(four_runs_two_x);
        fourRuns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs + 4;
                displayRuns(runs);
                displayTeamRuns(runs,extraRuns);
                switch(counterB)
                {
                    case 3:
                        b3RunsCounter = b3RunsCounter +4;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter +4;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter +4;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter +4;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter +4;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter +4;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter +4;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter +4;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter +4;
                        displayBElevenRuns();
                        break;
                    default:
                        b2RunsCounter = b2RunsCounter +4;
                        displayBTwoRuns();
                        break;
                }
            }
        });

        Button sixRuns2 = (Button) rootView.findViewById(six_runs_two_x);
        sixRuns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs + 6;
                displayRuns(runs);
                displayTeamRuns(runs,extraRuns);
                switch(counterB)
                {
                    case 3:
                        b3RunsCounter = b3RunsCounter +6;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter +6;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter +6;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter +6;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter +6;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter +6;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter +6;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter +6;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter +6;
                        displayBElevenRuns();
                        break;
                    default:
                        b2RunsCounter = b2RunsCounter +6;
                        displayBTwoRuns();
                        break;
                }
            }
        });

        Button extras = (Button) rootView.findViewById(R.id.extras_button_x);
        extras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs++;
                extraRuns++;
                displayRuns(runs);
                displayTeamRuns(runs,extraRuns);
                displayExtras();
            }
        });

        return rootView;
    }

    int runs = 0;
    int wickets = 0;
    int extraRuns = 0;

    int counterA = 1;
    int counterB = 2;
    int counterC = 0;
    int counterD = 0;


    // Method increases wicket counter for relevant batsman and displays it
    public void wicketFall() {
        wickets++;

        if (wickets >= 10) {
            wickets = 10;
        }
        if (wickets <= 0){
            wickets = 0;
        }
        displayWickets(wickets);
    }

    // counter which calculates the batter number in the playerOne slot
    public void counterOne() {
        if (counterA < counterB) {
            counterC = counterA;
            counterA = counterB + 1;
        } else {
            counterC = counterA;
            counterA = counterA + 1;
        }
    }

    // counter which calculates the batter number in the playerTwo slot
    public void counterTwo() {
        if (counterA < counterB) {
            counterD = counterB;
            counterB = counterB + 1;
        } else {
            counterD = counterB;
            counterB = counterA + 1;
        }
    }

    int b1RunsCounter = 0;
    int b2RunsCounter = 0;
    int b3RunsCounter = 0;
    int b4RunsCounter = 0;
    int b5RunsCounter = 0;
    int b6RunsCounter = 0;
    int b7RunsCounter = 0;
    int b8RunsCounter = 0;
    int b9RunsCounter = 0;
    int b10RunsCounter = 0;
    int b11RunsCounter = 0;

    // Method initilised at fall of wicket. Displays the next batsman in accordance with counterA
    public String nextBatsmanA() {
        String batter = null;
        switch (counterA) {
            case 1:
                displayBOneRuns();
                batter = batsman + " " + counterA;
            case 3:
                displayBThreeRuns();
                batter = batsman + " " + counterA;
                break;
            case 4:
                displayBFourRuns();
                batter = batsman + " " + counterA;
                break;
            case 5:
                displayBFiveRuns();
                batter = batsman + " " + counterA;
                break;
            case 6:
                displayBSixRuns();
                batter = batsman + " " + counterA;
                break;
            case 7:
                displayBSevenRuns();
                batter = batsman + " " + counterA;
                break;
            case 8:
                displayBEightRuns();
                batter = batsman + " " + counterA;
                break;
            case 9:
                displayBNineRuns();
                batter = batsman + " " + counterA;
                break;
            case 10:
                displayBTenRuns();
                batter = batsman + " " + counterA;
                break;
            case 11:
                displayBElevenRuns();
                batter = batsman + " " + counterA;
                break;
            case 12:
                oneRun1.setEnabled(false);
                fourRuns1.setEnabled(false);
                sixRuns1.setEnabled(false);
                oneRun2.setEnabled(false);
                fourRuns2.setEnabled(false);
                sixRuns2.setEnabled(false);
                extrasButton.setEnabled(false);
                spinner.setEnabled(false);
                spinner2.setEnabled(false);
                playerOne.setText("-");
                playerTwo.setText("-");
                switch (counterB){
                    case 2:
                        bTwoOut.setText(notOut);
                        break;
                    case 3:
                        bThreeOut.setText(notOut);
                        break;
                    case 4:
                        bFourOut.setText(notOut);
                        break;
                    case 5:
                        bFiveOut.setText(notOut);
                        break;
                    case 6:
                        bSixOut.setText(notOut);
                        break;
                    case 7:
                        bSevenOut.setText(notOut);
                        break;
                    case 8:
                        bEightOut.setText(notOut);
                        break;
                    case 9:
                        bNineOut.setText(notOut);
                        break;
                    case 10:
                        bTenOut.setText(notOut);
                        break;
                    case 11:
                        bElevenOut.setText(notOut);
                        break;
                }
                break;
        }
        return batter;
    }

    // Method initilised at fall of wicket. Displays the next batsman in accordance with counterB
    public String nextBatsmanB() {
        String batter = null;
        switch (counterB) {
            case 2:
                displayBTwoRuns();
                batter = batsman + " " + counterB;
            case 3:
                displayBThreeRuns();
                batter = batsman + " " + counterB;
                break;
            case 4:
                displayBFourRuns();
                batter = batsman + " " + counterB;
                break;
            case 5:
                batter = batsman + " " + counterB;
                displayBFiveRuns();
                break;
            case 6:
                displayBSixRuns();
                batter = batsman + " " + counterB;
                break;
            case 7:
                displayBSevenRuns();
                batter = batsman + " " + counterB;
                break;
            case 8:
                displayBEightRuns();
                batter = batsman + " " + counterB;
                break;
            case 9:
                displayBNineRuns();
                batter = batsman + " " + counterB;
                break;
            case 10:
                displayBTenRuns();
                batter = batsman + " " + counterB;
                break;
            case 11:
                displayBElevenRuns();
                batter = batsman + " " + counterB;
                break;
            case 12:
                oneRun1.setEnabled(false);
                fourRuns1.setEnabled(false);
                sixRuns1.setEnabled(false);
                oneRun2.setEnabled(false);
                fourRuns2.setEnabled(false);
                sixRuns2.setEnabled(false);
                extrasButton.setEnabled(false);
                spinner.setEnabled(false);
                spinner2.setEnabled(false);
                playerOne.setText("-");
                playerTwo.setText("-");
                switch (counterA){
                    case 1:
                        bTwoOut.setText(notOut);
                        break;
                    case 3:
                        bThreeOut.setText(notOut);
                        break;
                    case 4:
                        bFourOut.setText(notOut);
                        break;
                    case 5:
                        bFiveOut.setText(notOut);
                        break;
                    case 6:
                        bSixOut.setText(notOut);
                        break;
                    case 7:
                        bSevenOut.setText(notOut);
                        break;
                    case 8:
                        bEightOut.setText(notOut);
                        break;
                    case 9:
                        bNineOut.setText(notOut);
                        break;
                    case 10:
                        bTenOut.setText(notOut);
                        break;
                    case 11:
                        bElevenOut.setText(notOut);
                        break;
                }
                break;
        }
        return batter;
    }

    // Method displays how the batsman in the playerOne slot was out (parsed from spinner)
    public String playerWicketA(String out) {
        String wicket = null;
        switch (counterA) {
            case 1:
                wicket = out;
                displayBOneWicket(out);
                break;
            case 3:
                wicket = out;
                displayBThreeWicket(out);
                break;
            case 4:
                wicket = out;
                displayBFourWicket(out);
                break;
            case 5:
                wicket = out;
                displayBFiveWicket(out);
                break;
            case 6:
                wicket = out;
                displayBSixWicket(out);
                break;
            case 7:
                wicket = out;
                displayBSevenWicket(out);
                break;
            case 8:
                wicket = out;
                displayBEightWicket(out);
                break;
            case 9:
                wicket = out;
                displayBNineWicket(out);
                break;
            case 10:
                wicket = out;
                displayBTenWicket(out);
                break;
            case 11:
                wicket = out;
                displayBElevenWicket(out);
                break;
        }
        return wicket;
    }

    // Method displays how the batsman in the playerTwo slot was out (parsed from spinner2)
    public String playerWicketB(String out) {
        String wicket = null;
        switch (counterB) {
            case 2:
                wicket = out;
                displayBTwoWicket(out);
                break;
            case 3:
                wicket = out;
                displayBThreeWicket(out);
                break;
            case 4:
                wicket = out;
                displayBFourWicket(out);
                break;
            case 5:
                wicket = out;
                displayBFiveWicket(out);
                break;
            case 6:
                wicket = out;
                displayBSixWicket(out);
                break;
            case 7:
                wicket = out;
                displayBSevenWicket(out);
                break;
            case 8:
                wicket = out;
                displayBEightWicket(out);
                break;
            case 9:
                wicket = out;
                displayBNineWicket(out);
                break;
            case 10:
                wicket = out;
                displayBTenWicket(out);
                break;
            case 11:
                wicket = out;
                displayBElevenWicket(out);
                break;
        }
        return wicket;
    }

    //methods which display batter name
    private void displayBOneName(String name) {
        bOneName.setText("" + name);
    }
    private void displayBTwoName(String name) {
        bTwoName.setText("" + name);
    }
    private void displayBThreeName(String name) {
        bThreeName.setText("" + name);
    }
    private void displayBFourName(String name) {
        bFourName.setText("" + name);
    }
    private void displayBFiveName(String name) {
        bFiveName.setText("" + name);
    }
    private void displayBSixName(String name) {
        bSixName.setText("" + name);
    }
    private void displayBSevenName(String name) {
        bSevenName.setText("" + name);
    }
    private void displayBEightName(String name) {
        bEightName.setText("" + name);
    }
    private void displayBNineName(String name) {
        bNineName.setText("" + name);
    }
    private void displayBTenName(String name) {
        bTenName.setText("" + name);
    }
    private void displayBElevenName(String name) {
        bElevenName.setText("" + name);
    }


    // Calculates the lowest current batsman number
    public int masterCounter()
    {
        int masterCounter = counterB;

        if(counterA<counterB)
        {
            masterCounter = counterA;
        }

        return masterCounter;
    }

    //focuses scrollView on last pressed button
    public void scroller (TextView batterView)
    {
        float batterPosition = batterView.getY();
        float scrollPosition = scrollView.getScrollY();


        if (scrollPosition > batterPosition){
            scrollView.scrollTo(0, batterView.getTop());
        }
    }

    //gets batter TextView to be passed into scroller()
    public TextView getBatterView()
    {
        TextView batter = null;

        switch (masterCounter()) {
            case 1:
                batter = bOneRuns;
                break;
            case 2:
                batter = bTwoRuns;
                break;
            case 3:
                batter = bThreeRuns;
                break;
            case 4:
                batter = bFourRuns;
                break;
            case 5:
                batter = bFiveRuns;
                break;
            case 6:
                batter = bSixRuns;
                break;
            case 7:
                batter = bSevenRuns;
                break;
            case 8:
                batter = bEightRuns;
                break;
            case 9:
                batter = bNineRuns;
                break;
            case 10:
                batter = bTenRuns;
                break;
            case 11:
                batter = bElevenRuns;
        }


        return batter;
    }

    //Methods which display the runs of the individual batsmen
    private void displayBOneRuns() {
        bOneRuns.setText("" + b1RunsCounter);
        scroller(getBatterView());
    }
    private void displayBTwoRuns() {
        bTwoRuns.setText("" + b2RunsCounter);
        scroller(getBatterView());
    }
    private void displayBThreeRuns() {
        bThreeRuns.setText("" + b3RunsCounter);
        scroller(getBatterView());
    }
    private void displayBFourRuns() {
        bFourRuns.setText("" + b4RunsCounter);
        scroller(getBatterView());
    }
    private void displayBFiveRuns() {
        bFiveRuns.setText("" + b5RunsCounter);
        scroller(getBatterView());
    }
    private void displayBSixRuns() {
        bSixRuns.setText("" + b6RunsCounter);
        scroller(getBatterView());
    }
    private void displayBSevenRuns() {
        bSevenRuns.setText("" + b7RunsCounter);
        scroller(getBatterView());
    }
    private void displayBEightRuns() {
        bEightRuns.setText("" + b8RunsCounter);
        scroller(getBatterView());
    }
    private void displayBNineRuns() {
        bNineRuns.setText("" + b9RunsCounter);
        scroller(getBatterView());
    }
    private void displayBTenRuns() {
        bTenRuns.setText("" + b10RunsCounter);
        scroller(getBatterView());
    }
    private void displayBElevenRuns() {
        bElevenRuns.setText("" + b11RunsCounter);
        scroller(getBatterView());
    }
    private void displayExtras() {
        extras.setText("" + extraRuns);
        scrollView.scrollTo(0,extras.getBottom());
    }

    // Methods which display the main displays for runs and wickets
    private void displayRuns(int number) {
        TextView runs = (TextView) rootView.findViewById(R.id.runs_two);
        runs.setText("" + number);
    }
    private void displayBOneWicket(String out) {
        bOneOut.setText("" + out);
    }

    // Methods which display how each individual batsman was out
    private void displayBTwoWicket(String out) {
        bTwoOut.setText("" + out);
    }
    private void displayBThreeWicket(String out) {
        bThreeOut.setText("" + out);
    }
    private void displayBFourWicket(String out) {
        bFourOut.setText("" + out);
    }
    private void displayBFiveWicket(String out) {bFiveOut.setText("" + out);}
    private void displayBSixWicket(String out) {
        bSixOut.setText("" + out);
    }
    private void displayBSevenWicket(String out) {
        bSevenOut.setText("" + out);
    }
    private void displayBEightWicket(String out) {
        bEightOut.setText("" + out);
    }
    private void displayBNineWicket(String out) {
        bNineOut.setText("" + out);
    }
    private void displayBTenWicket(String out) {
        bTenOut.setText("" + out);
    }
    private void displayBElevenWicket(String out) {
        bElevenOut.setText("" + out);
    }

    private void displayWickets(int number) {
        TextView wickets = (TextView) rootView.findViewById(R.id.wickets_two);
        wickets.setText("" + number);
    }

    private void displayTeamRuns(int total, int extraTotal){
        int number = total-extraTotal;
        secondTeamRuns.setText("" + number);
    }

    // Method removes keyboard after confirmatory enter click
    public void hideSoftKeyboard(TextView.OnEditorActionListener activity, View view) {
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    // Method brings up Dialog editor on longClick
    // User able to edit name of clicked batsman
    public void nameEditor(final int batterNumber){

        final Dialog editor = new Dialog(getContext());
        editor.setContentView(R.layout.edit_batter_name);
        editor.setTitle("Edit Player " + batterNumber + " name");
        final EditText editText = (EditText) editor.findViewById(R.id.edit_name_edittext);
        final String currentBatterName;

        if(batterNumber == 1) {
            currentBatterName = bOneName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 2) {
            currentBatterName = bTwoName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 3) {
            currentBatterName = bThreeName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 4) {
            currentBatterName = bFourName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 5) {
            currentBatterName = bFiveName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 6) {
            currentBatterName = bSixName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 7) {
            currentBatterName = bSevenName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 8) {
            currentBatterName = bEightName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 9) {
            currentBatterName = bNineName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 10) {
            currentBatterName = bTenName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }
        else if(batterNumber == 11) {
            currentBatterName = bElevenName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        }

        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {


                if (actionId == EditorInfo.IME_ACTION_DONE
                        || event.getAction() == KeyEvent.ACTION_DOWN
                        && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {

                    if (batterNumber == 1){
                        bOneName.setText(editText.getText());
                    }
                    else if(batterNumber == 2){
                        bTwoName.setText(editText.getText());
                    }
                    else if(batterNumber == 3){
                        bThreeName.setText(editText.getText());
                    }
                    else if(batterNumber == 4){
                        bFourName.setText(editText.getText());
                    }
                    else if(batterNumber == 5){
                        bFiveName.setText(editText.getText());
                    }
                    else if(batterNumber == 6){
                        bSixName.setText(editText.getText());
                    }
                    else if(batterNumber == 7){
                        bSevenName.setText(editText.getText());
                    }
                    else if(batterNumber == 8){
                        bEightName.setText(editText.getText());
                    }
                    else if(batterNumber == 9){
                        bNineName.setText(editText.getText());
                    }
                    else if(batterNumber == 10){
                        bTenName.setText(editText.getText());
                    }
                    else if(batterNumber == 11){
                        bElevenName.setText(editText.getText());
                    }

                    editThief.requestFocus();
                    hideSoftKeyboard(this, v);
                    editor.dismiss();
                }
                return false;

            } });

        editor.show();
    }

    // Method accessed upon longClick
    // user may change the number of runs of the clicked batsman; does not apply to batsmen who have yet to bat
    public void runsEditor(final int batterNumber) {
        if (batterNumber <= counterA || batterNumber <= counterB) {

            final Dialog editor = new Dialog(getContext());
            editor.setContentView(R.layout.edit_batter_runs);

            if(batterNumber==0)
            {
                editor.setTitle(editExtras);
            }
            else
            {
                editor.setTitle(editPlayer + " " + batterNumber + " " + runsString);
            }


            Button minus = (Button) editor.findViewById(R.id.edit_negative);
            Button plus = (Button) editor.findViewById(R.id.edit_positive);
            final TextView editRuns = (TextView) editor.findViewById(R.id.edit_runs);

            if (batterNumber == 0) {
                editRuns.setText("" + extraRuns);
            }
            if (batterNumber == 1) {
                editRuns.setText("" + b1RunsCounter);
            }
            if (batterNumber == 2) {
                editRuns.setText("" + b2RunsCounter);
            }
            if (batterNumber == 3) {
                editRuns.setText("" + b3RunsCounter);
            }
            if (batterNumber == 4) {
                editRuns.setText("" + b4RunsCounter);
            }
            if (batterNumber == 5) {
                editRuns.setText("" + b5RunsCounter);
            }
            if (batterNumber == 6) {
                editRuns.setText("" + b6RunsCounter);
            }
            if (batterNumber == 7) {
                editRuns.setText("" + b7RunsCounter);
            }
            if (batterNumber == 8) {
                editRuns.setText("" + b8RunsCounter);
            }
            if (batterNumber == 9) {
                editRuns.setText("" + b9RunsCounter);
            }
            if (batterNumber == 10) {
                editRuns.setText("" + b10RunsCounter);
            }
            if (batterNumber == 11) {
                editRuns.setText("" + b11RunsCounter);
            }

            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    runs--;
                    displayRuns(runs);
                    if (batterNumber == 0) {
                        extraRuns--;
                        displayExtras();
                        editRuns.setText("" + extraRuns);
                    }
                    if (batterNumber == 1) {
                        b1RunsCounter--;
                        displayBOneRuns();
                        editRuns.setText("" + b1RunsCounter);
                    }
                    if (batterNumber == 2) {
                        b2RunsCounter--;
                        displayBTwoRuns();
                        editRuns.setText("" + b2RunsCounter);
                    }
                    if (batterNumber == 3) {
                        b3RunsCounter--;
                        displayBThreeRuns();
                        editRuns.setText("" + b3RunsCounter);
                    }
                    if (batterNumber == 4) {
                        b4RunsCounter--;
                        displayBFourRuns();
                        editRuns.setText("" + b4RunsCounter);
                    }
                    if (batterNumber == 5) {
                        b5RunsCounter--;
                        displayBFiveRuns();
                        editRuns.setText("" + b5RunsCounter);
                    }
                    if (batterNumber == 6) {
                        b6RunsCounter--;
                        displayBSixRuns();
                        editRuns.setText("" + b6RunsCounter);
                    }
                    if (batterNumber == 7) {
                        b7RunsCounter--;
                        displayBSevenRuns();
                        editRuns.setText("" + b7RunsCounter);
                    }
                    if (batterNumber == 8) {
                        b8RunsCounter--;
                        displayBEightRuns();
                        editRuns.setText("" + b8RunsCounter);
                    }
                    if (batterNumber == 9) {
                        b9RunsCounter--;
                        displayBNineRuns();
                        editRuns.setText("" + b9RunsCounter);
                    }
                    if (batterNumber == 10) {
                        b10RunsCounter--;
                        displayBTenRuns();
                        editRuns.setText("" + b10RunsCounter);
                    }
                    if (batterNumber == 11) {
                        b11RunsCounter--;
                        displayBElevenRuns();
                        editRuns.setText("" + b11RunsCounter);
                    }
                }
            });

            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    runs++;
                    displayRuns(runs);
                    if (batterNumber == 0) {
                        extraRuns++;
                        displayExtras();
                        editRuns.setText("" + extraRuns);
                    }
                    if (batterNumber == 1) {
                        b1RunsCounter++;
                        displayBOneRuns();
                        editRuns.setText("" + b1RunsCounter);
                    }
                    if (batterNumber == 2) {
                        b2RunsCounter++;
                        displayBTwoRuns();
                        editRuns.setText("" + b2RunsCounter);
                    }
                    if (batterNumber == 3) {
                        b3RunsCounter++;
                        displayBThreeRuns();
                        editRuns.setText("" + b3RunsCounter);
                    }
                    if (batterNumber == 4) {
                        b4RunsCounter++;
                        displayBFourRuns();
                        editRuns.setText("" + b4RunsCounter);
                    }
                    if (batterNumber == 5) {
                        b5RunsCounter++;
                        displayBFiveRuns();
                        editRuns.setText("" + b5RunsCounter);
                    }
                    if (batterNumber == 6) {
                        b6RunsCounter++;
                        displayBSixRuns();
                        editRuns.setText("" + b6RunsCounter);
                    }
                    if (batterNumber == 7) {
                        b7RunsCounter++;
                        displayBSevenRuns();
                        editRuns.setText("" + b7RunsCounter);
                    }
                    if (batterNumber == 8) {
                        b8RunsCounter++;
                        displayBEightRuns();
                        editRuns.setText("" + b8RunsCounter);
                    }
                    if (batterNumber == 9) {
                        b9RunsCounter++;
                        displayBNineRuns();
                        editRuns.setText("" + b9RunsCounter);
                    }
                    if (batterNumber == 10) {
                        b10RunsCounter++;
                        displayBTenRuns();
                        editRuns.setText("" + b10RunsCounter);
                    }
                    if (batterNumber == 11) {
                        b11RunsCounter++;
                        displayBElevenRuns();
                        editRuns.setText("" + b11RunsCounter);
                    }
                }
            });

            editor.show();
        }
    }

    // Method brings up Dialog box upon longClick
    // user may change the type of wicket for the clicked batsman; does not apply to batsmen who have yet to bat
    // the not out function uses counters C and D to access the previous batsman and reinstate him
    public void wicketEditor(final int batterNumber) {

        if (batterNumber <= counterA || batterNumber <= counterB) {

            final Dialog editor = new Dialog(getContext());
            editor.setContentView(R.layout.edit_batter_wicket);
            editor.setTitle(editPlayer + " " + batterNumber + " " + wicket);

            final Spinner spinner = (Spinner) editor.findViewById(R.id.edit_wicket_spinner);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    TextView batterView = null;
                    TextView batterName = null;
                    if (batterNumber == 1) {
                        batterView = bOneOut;
                        batterName = bOneName;
                    }
                    if (batterNumber == 2) {
                        batterView = bTwoOut;
                        batterName = bTwoName;
                    }
                    if (batterNumber == 3) {
                        batterView = bThreeOut;
                        batterName = bThreeName;
                    }
                    if (batterNumber == 4) {
                        batterView = bFourOut;
                        batterName = bFourName;
                    }
                    if (batterNumber == 5) {
                        batterView = bFiveOut;
                        batterName = bFiveName;
                    }
                    if (batterNumber == 6) {
                        batterView = bSixOut;
                        batterName = bSixName;
                    }
                    if (batterNumber == 7) {
                        batterView = bSevenOut;
                        batterName = bSevenName;
                    }
                    if (batterNumber == 8) {
                        batterView = bEightOut;
                        batterName = bEightName;
                    }
                    if (batterNumber == 9) {
                        batterView = bNineOut;
                        batterName = bNineName;
                    }
                    if (batterNumber == 10) {
                        batterView = bTenOut;
                        batterName = bTenName;
                    }
                    if (batterNumber == 11) {
                        batterView = bElevenOut;
                        batterName = bElevenName;
                    }

                    switch (position) {
                        case BOWLED:
                            batterView.setText(bowled);
                            break;
                        case LBW:
                            batterView.setText(lbw);
                            break;
                        case CAUGHT:
                            batterView.setText(caught);
                            break;
                        case RUNOUT:
                            batterView.setText(runOut);
                            break;
                        case RETIRE:
                            batterView.setText(retired);
                            wickets--;
                            if (wickets <= 0) {
                                wickets = 0;
                            }
                            displayWickets(wickets);
                            break;
                        case NOTOUT:
                            batterView.setText("-");
                            wickets--;
                            if (wickets <= 0) {
                                wickets = 0;
                            }
                            displayWickets(wickets);

                            if (counterC == batterNumber) {
                                counterA = counterC;
                                playerOne.setText(batterName.getText());
                            } else if (counterD == batterNumber) {
                                counterB = counterD;
                                playerTwo.setText(batterName.getText());
                            }
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

            ArrayAdapter<String> adapter;
            List<String> list;
            list = new ArrayList<String>();
            list.add(out);
            list.add(bowled);
            list.add(lbw);
            list.add(caught);
            list.add(runOut);
            list.add(retire);
            list.add(notOut);

            adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, list);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);

            editor.show();
        }
    }
}
