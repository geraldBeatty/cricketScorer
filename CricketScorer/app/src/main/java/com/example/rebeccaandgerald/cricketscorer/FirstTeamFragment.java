package com.example.rebeccaandgerald.cricketscorer;


import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
import android.widget.Gallery;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

import org.w3c.dom.Text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import static android.R.attr.x;
import static android.R.attr.y;
import static android.R.id.edit;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_eight_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_eight_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_eleven_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_eleven_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_five_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_five_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_four_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_four_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_nine_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_nine_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_one_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_one_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_seven_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_seven_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_six_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_six_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_ten_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_ten_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_three_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_three_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_two_name;
import static com.example.rebeccaandgerald.cricketscorer.R.id.b_two_runs;
import static com.example.rebeccaandgerald.cricketscorer.R.id.extras;
import static com.example.rebeccaandgerald.cricketscorer.R.id.extras_button;
import static com.example.rebeccaandgerald.cricketscorer.R.id.four_runs_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.four_runs_two;
import static com.example.rebeccaandgerald.cricketscorer.R.id.one_run_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.one_run_two;
import static com.example.rebeccaandgerald.cricketscorer.R.id.runs_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.save;
import static com.example.rebeccaandgerald.cricketscorer.R.id.six_runs_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.six_runs_two;
import static com.example.rebeccaandgerald.cricketscorer.R.id.team_one;
import static com.example.rebeccaandgerald.cricketscorer.R.id.toolbar;
import static com.example.rebeccaandgerald.cricketscorer.R.id.viewpager;
import static com.example.rebeccaandgerald.cricketscorer.R.id.wickets_one;
import static com.example.rebeccaandgerald.cricketscorer.R.layout.activity_main;
import static com.example.rebeccaandgerald.cricketscorer.R.string.retire;
import static com.example.rebeccaandgerald.cricketscorer.R.string.retired;
import static com.itextpdf.text.pdf.XfaXpathConstructor.XdpPackage.Pdf;


public class FirstTeamFragment extends Fragment implements Toolbar.OnMenuItemClickListener {


    public FirstTeamFragment() {
        // Required empty public constructor
    }

    private View editThief;
    private View rootView;
    private ScrollView scrollView;

    private EditText playerOne;
    private EditText playerTwo;
    private EditText teamOne;

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
    private String tutorialString;

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


        rootView = inflater.inflate(R.layout.fragment_batting, container, false);

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(this);

        String welcome = getResources().getString(R.string.welcome);
        String tutorialOffer = getResources().getString(R.string.tutorial_offer);

        new AlertDialog.Builder(getContext())
                .setTitle(welcome)
                .setMessage(tutorialOffer)
                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        runTutorial();
                    }
                })
                .show();

        teamOne = (EditText) rootView.findViewById(team_one);
        playerOne = (EditText) rootView.findViewById(R.id.player_one);
        playerTwo = (EditText) rootView.findViewById(R.id.player_two);

        editThief = rootView.findViewById(R.id.edt_thief);
        editThief.requestFocus();

        scrollView = (ScrollView) rootView.findViewById(R.id.scrollView);

        bOneName = (TextView) rootView.findViewById(b_one_name);
        bTwoName = (TextView) rootView.findViewById(b_two_name);
        bThreeName = (TextView) rootView.findViewById(b_three_name);
        bFourName = (TextView) rootView.findViewById(b_four_name);
        bFiveName = (TextView) rootView.findViewById(b_five_name);
        bSixName = (TextView) rootView.findViewById(b_six_name);
        bSevenName = (TextView) rootView.findViewById(b_seven_name);
        bEightName = (TextView) rootView.findViewById(b_eight_name);
        bNineName = (TextView) rootView.findViewById(b_nine_name);
        bTenName = (TextView) rootView.findViewById(b_ten_name);
        bElevenName = (TextView) rootView.findViewById(b_eleven_name);

        bOneRuns = (TextView) rootView.findViewById(R.id.b_one_runs);
        bTwoRuns = (TextView) rootView.findViewById(R.id.b_two_runs);
        bThreeRuns = (TextView) rootView.findViewById(R.id.b_three_runs);
        bFourRuns = (TextView) rootView.findViewById(R.id.b_four_runs);
        bFiveRuns = (TextView) rootView.findViewById(R.id.b_five_runs);
        bSixRuns = (TextView) rootView.findViewById(R.id.b_six_runs);
        bSevenRuns = (TextView) rootView.findViewById(R.id.b_seven_runs);
        bEightRuns = (TextView) rootView.findViewById(R.id.b_eight_runs);
        bNineRuns = (TextView) rootView.findViewById(R.id.b_nine_runs);
        bTenRuns = (TextView) rootView.findViewById(R.id.b_ten_runs);
        bElevenRuns = (TextView) rootView.findViewById(R.id.b_eleven_runs);

        extras = (TextView) rootView.findViewById(R.id.extras);

        bOneOut = (TextView) rootView.findViewById(R.id.b_one_out);
        bTwoOut = (TextView) rootView.findViewById(R.id.b_two_out);
        bThreeOut = (TextView) rootView.findViewById(R.id.b_three_out);
        bFourOut = (TextView) rootView.findViewById(R.id.b_four_out);
        bFiveOut = (TextView) rootView.findViewById(R.id.b_five_out);
        bSixOut = (TextView) rootView.findViewById(R.id.b_six_out);
        bSevenOut = (TextView) rootView.findViewById(R.id.b_seven_out);
        bEightOut = (TextView) rootView.findViewById(R.id.b_eight_out);
        bNineOut = (TextView) rootView.findViewById(R.id.b_nine_out);
        bTenOut = (TextView) rootView.findViewById(R.id.b_ten_out);
        bElevenOut = (TextView) rootView.findViewById(R.id.b_eleven_out);

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
        tutorialString = getResources().getString(R.string.tutorial);

        oneRun1 = (Button) rootView.findViewById(one_run_one);
        fourRuns1 = (Button) rootView.findViewById(four_runs_one);
        sixRuns1 = (Button) rootView.findViewById(six_runs_one);
        oneRun2 = (Button) rootView.findViewById(one_run_two);
        fourRuns2 = (Button) rootView.findViewById(four_runs_two);
        sixRuns2 = (Button) rootView.findViewById(six_runs_two);
        spinner = (Spinner) rootView.findViewById(R.id.spin_one);
        spinner2 = (Spinner) rootView.findViewById(R.id.spin_two);
        extrasButton = (Button) rootView.findViewById(R.id.extras_button);

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
        teamOne.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE
                        || event.getAction() == KeyEvent.ACTION_DOWN
                        && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    //sets cursor to start
                    teamOne.setText(teamOne.getText());
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
        list2.add(retire);

        adapter2 = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, list);
        spinner2.setAdapter(adapter2);

        // Run buttons

        oneRun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runs++;
                displayRuns(runs);
                switch (counterA) {
                    case 3:
                        b3RunsCounter++;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter++;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter++;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter++;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter++;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter++;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter++;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter++;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter++;
                        displayBElevenRuns();
                        break;
                    default:
                        b1RunsCounter++;
                        displayBOneRuns();
                        break;
                }
            }
        });


        fourRuns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs + 4;
                displayRuns(runs);
                switch (counterA) {
                    case 3:
                        b3RunsCounter = b3RunsCounter + 4;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter + 4;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter + 4;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter + 4;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter + 4;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter + 4;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter + 4;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter + 4;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter + 4;
                        displayBElevenRuns();
                        break;
                    default:
                        b1RunsCounter = b1RunsCounter + 4;
                        displayBOneRuns();
                        break;
                }
            }
        });


        sixRuns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runs = runs + 6;
                displayRuns(runs);
                switch (counterA) {
                    case 3:
                        b3RunsCounter = b3RunsCounter + 6;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter + 6;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter + 6;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter + 6;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter + 6;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter + 6;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter + 6;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter + 6;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter + 6;
                        displayBElevenRuns();
                        break;
                    default:
                        b1RunsCounter = b1RunsCounter + 6;
                        displayBOneRuns();
                        break;
                }
            }
        });


        oneRun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs++;
                displayRuns(runs);
                switch (counterB) {
                    case 3:
                        b3RunsCounter++;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter++;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter++;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter++;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter++;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter++;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter++;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter++;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter++;
                        displayBElevenRuns();
                        break;
                    default:
                        b2RunsCounter++;
                        displayBTwoRuns();
                        break;
                }
            }
        });

        fourRuns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs + 4;
                displayRuns(runs);
                switch (counterB) {
                    case 3:
                        b3RunsCounter = b3RunsCounter + 4;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter + 4;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter + 4;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter + 4;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter + 4;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter + 4;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter + 4;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter + 4;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter + 4;
                        displayBElevenRuns();
                        break;
                    default:
                        b2RunsCounter = b2RunsCounter + 4;
                        displayBTwoRuns();
                        break;
                }

            }
        });


        sixRuns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs + 6;
                displayRuns(runs);
                switch (counterB) {
                    case 3:
                        b3RunsCounter = b3RunsCounter + 6;
                        displayBThreeRuns();
                        break;
                    case 4:
                        b4RunsCounter = b4RunsCounter + 6;
                        displayBFourRuns();
                        break;
                    case 5:
                        b5RunsCounter = b5RunsCounter + 6;
                        displayBFiveRuns();
                        break;
                    case 6:
                        b6RunsCounter = b6RunsCounter + 6;
                        displayBSixRuns();
                        break;
                    case 7:
                        b7RunsCounter = b7RunsCounter + 6;
                        displayBSevenRuns();
                        break;
                    case 8:
                        b8RunsCounter = b8RunsCounter + 6;
                        displayBEightRuns();
                        break;
                    case 9:
                        b9RunsCounter = b9RunsCounter + 6;
                        displayBNineRuns();
                        break;
                    case 10:
                        b10RunsCounter = b10RunsCounter + 6;
                        displayBTenRuns();
                        break;
                    case 11:
                        b11RunsCounter = b11RunsCounter + 6;
                        displayBElevenRuns();
                        break;
                    default:
                        b2RunsCounter = b2RunsCounter + 6;
                        displayBTwoRuns();
                        break;
                }

            }
        });


        extrasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs++;
                extraRuns++;
                displayRuns(runs);
                displayExtras();

            }
        });

        return rootView;


    }
    // End of OnCreateView method


    int runs = 0;
    int wickets = 0;
    int extraRuns = 0;

    int counterA = 1;
    int counterB = 2;
    int counterC = 0;
    int counterD = 0;


    public void runTutorial(){
        Dialog tutorial = new Dialog(getContext());
        tutorial.setContentView(R.layout.tutorial);
        tutorial.setTitle(tutorialString);

        tutorial.show();
    }


    // Method increases wicket counter for relevant batsman and displays it
    public void wicketFall() {
        wickets++;

        if (wickets >= 10) {
            wickets = 10;
        }
        if (wickets <= 0) {
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
            /*case 1:
                displayBOneRuns();
                batter = batsman + " " + counterA; */
            case 3:
                displayBThreeRuns();
                //batter = batsman + " "  + counterA;
                if(bThreeName.getText()==getResources().getString(R.string.three)) {
                    batter = batsman + " " + counterA;
                }
                else{
                batter = bThreeName.getText().toString();}
                break;
            case 4:
                displayBFourRuns();
                //batter = batsman + " "  + counterA;
                if(bFourName.getText()==getResources().getString(R.string.four)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bFourName.getText().toString();}
                break;
            case 5:
                displayBFiveRuns();
                //batter = batsman + " "  + counterA;
                if(bFiveName.getText()==getResources().getString(R.string.five)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bFiveName.getText().toString();}
                break;
            case 6:
                displayBSixRuns();
                //batter = batsman + " "  + counterA;
                if(bSixName.getText()==getResources().getString(R.string.six)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bSixName.getText().toString();}
                break;
            case 7:
                displayBSevenRuns();
                //batter = batsman + " "  + counterA;
                if(bSevenName.getText()==getResources().getString(R.string.seven)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bSevenName.getText().toString();}
                break;
            case 8:
                displayBEightRuns();
                //batter = batsman + " "  + counterA;
                if(bEightName.getText()==getResources().getString(R.string.eight)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bEightName.getText().toString();}
                break;
            case 9:
                displayBNineRuns();
                //batter = batsman + " "  + counterA;
                if(bNineName.getText()==getResources().getString(R.string.nine)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bNineName.getText().toString();}
                break;
            case 10:
                displayBTenRuns();
                //batter = batsman + " "  + counterA;
                if(bTenName.getText()==getResources().getString(R.string.ten)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bTenName.getText().toString();}
                break;
            case 11:
                displayBElevenRuns();
                //batter = batsman + " "  + counterA;
                if(bElevenName.getText()==getResources().getString(R.string.eleven)) {
                    batter = batsman + " " + counterA;
                }
                else{
                    batter = bElevenName.getText().toString();}
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
                playerOne.setText("");
                playerTwo.setText("");
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
                batter = batsman + " "  + counterB;
            case 3:
                displayBThreeRuns();
                //batter = batsman + " "  + counterA;
                if(bThreeName.getText()==getResources().getString(R.string.three)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bThreeName.getText().toString();}
                break;
            case 4:
                displayBFourRuns();
                //batter = batsman + " "  + counterA;
                if(bFourName.getText()==getResources().getString(R.string.four)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bFourName.getText().toString();}
                break;
            case 5:
                displayBFiveRuns();
                //batter = batsman + " "  + counterA;
                if(bFiveName.getText()==getResources().getString(R.string.five)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bFiveName.getText().toString();}
                break;
            case 6:
                displayBSixRuns();
                //batter = batsman + " "  + counterA;
                if(bSixName.getText()==getResources().getString(R.string.six)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bSixName.getText().toString();}
                break;
            case 7:
                displayBSevenRuns();
                //batter = batsman + " "  + counterA;
                if(bSevenName.getText()==getResources().getString(R.string.seven)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bSevenName.getText().toString();}
                break;
            case 8:
                displayBEightRuns();
                //batter = batsman + " "  + counterA;
                if(bEightName.getText()==getResources().getString(R.string.eight)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bEightName.getText().toString();}
                break;
            case 9:
                displayBNineRuns();
                //batter = batsman + " "  + counterA;
                if(bNineName.getText()==getResources().getString(R.string.nine)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bNineName.getText().toString();}
                break;
            case 10:
                displayBTenRuns();
                //batter = batsman + " "  + counterA;
                if(bTenName.getText()==getResources().getString(R.string.ten)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bTenName.getText().toString();}
                break;
            case 11:
                displayBElevenRuns();
                //batter = batsman + " "  + counterA;
                if(bElevenName.getText()==getResources().getString(R.string.eleven)) {
                    batter = batsman + " " + counterB;
                }
                else{
                    batter = bElevenName.getText().toString();}
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
                playerOne.setText("");
                playerTwo.setText("");
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
    public int masterCounter() {
        int masterCounter = counterB;

        if (counterA < counterB) {
            masterCounter = counterA;
        }

        return masterCounter;
    }

    //focuses scrollView on last pressed button
    public void scroller(TextView batterView) {
        float batterPosition = batterView.getY();
        float scrollPosition = scrollView.getScrollY();


        if (scrollPosition > batterPosition) {
            scrollView.scrollTo(0, batterView.getTop());
        }
    }

    //gets batter TextView to be passed into scroller()
    public TextView getBatterView() {
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
        scrollView.scrollTo(0, extras.getBottom());
    }

    // Methods which display the main displays for runs and wickets
    private void displayRuns(int number) {
        TextView runs = (TextView) rootView.findViewById(runs_one);
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

    private void displayBFiveWicket(String out) {
        bFiveOut.setText("" + out);
    }

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
        TextView wickets = (TextView) rootView.findViewById(wickets_one);
        wickets.setText("" + number);
    }

    // Method removes keyboard after confirmatory enter click
    public void hideSoftKeyboard(TextView.OnEditorActionListener activity, View view) {
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    // Method brings up Dialog editor on longClick
    // User able to edit name of clicked batsman
    public void nameEditor(final int batterNumber) {

        final Dialog editor = new Dialog(getContext());
        editor.setContentView(R.layout.edit_batter_name);
        editor.setTitle(editPlayer +  " " + batterNumber + " " + name);

        final EditText editText = (EditText) editor.findViewById(R.id.edit_name_edittext);
        final String currentBatterName;


        if (batterNumber == 1) {
            currentBatterName = bOneName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);

        } else if (batterNumber == 2) {
            currentBatterName = bTwoName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 3) {
            currentBatterName = bThreeName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 4) {
            currentBatterName = bFourName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 5) {
            currentBatterName = bFiveName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 6) {
            currentBatterName = bSixName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 7) {
            currentBatterName = bSevenName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 8) {
            currentBatterName = bEightName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 9) {
            currentBatterName = bNineName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 10) {
            currentBatterName = bTenName.getText().toString();
            editText.setText(currentBatterName);
            int textLength = editText.getText().length();
            editText.setSelection(textLength);
        } else if (batterNumber == 11) {
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

                    if (batterNumber == 1) {
                        bOneName.setText(editText.getText());
                    } else if (batterNumber == 2) {
                        bTwoName.setText(editText.getText());
                    } else if (batterNumber == 3) {
                        bThreeName.setText(editText.getText());
                    } else if (batterNumber == 4) {
                        bFourName.setText(editText.getText());
                    } else if (batterNumber == 5) {
                        bFiveName.setText(editText.getText());
                    } else if (batterNumber == 6) {
                        bSixName.setText(editText.getText());
                    } else if (batterNumber == 7) {
                        bSevenName.setText(editText.getText());
                    } else if (batterNumber == 8) {
                        bEightName.setText(editText.getText());
                    } else if (batterNumber == 9) {
                        bNineName.setText(editText.getText());
                    } else if (batterNumber == 10) {
                        bTenName.setText(editText.getText());
                    } else if (batterNumber == 11) {
                        bElevenName.setText(editText.getText());
                    }

                    editThief.requestFocus();
                    hideSoftKeyboard(this, v);
                    editor.dismiss();
                }
                return false;

            }
        });

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



    // taskbar items
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.reset_team:
                new AlertDialog.Builder(getContext())
                        .setTitle(reset)
                        .setMessage(sureReset)
                        .setNeutralButton(cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .setPositiveButton(yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                playerOne.setText("");
                                playerTwo.setText("");
                                teamOne.setText("");
                                getActivity().recreate();
                            }
                        })
                        .show();
                return true;

            case R.id.save:
               final Dialog editor = new Dialog(getContext());
                editor.setContentView(R.layout.save_pdf);
                editor.setTitle(saveString + "?");

                Button button = (Button) editor.findViewById(R.id.save_to_pdf);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       createPDF();
                    }
                });

                editor.show();
        }
        return false;
    }

    public void createPDF()
    {
        AssetManager assetManager = getActivity().getAssets();
        try {
            String[] files = assetManager.list("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream is = null;
        try {
            is = assetManager.open("simple_scorer.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PdfReader pdfReader = null;
        try {
            pdfReader = new PdfReader(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PdfReader.unethicalreading = true;

        Date date = new Date();
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(date);

        String outpath = Environment.getExternalStorageDirectory() + "/CricketScorer" + timeStamp + ".pdf";
        PdfStamper pdfStamper = null;
        try {
            pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(outpath));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BaseFont myFont = null;
        try {
            myFont = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1250, BaseFont.EMBEDDED);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Date matchDate = new Date();
        String dateStamp = new SimpleDateFormat("dd.MM.yyyy").format(matchDate);


      /*
        PdfContentByte contentByte = pdfStamper.getUnderContent(1);
        contentByte.beginText();
        contentByte.setFontAndSize(myFont,12);

        for(int x=0; x<1000; x=x+50)
        {
            contentByte.showTextAligned(PdfContentByte.ALIGN_CENTER, ""+x, 10,x,0);
            contentByte.showTextAligned(PdfContentByte.ALIGN_CENTER, ""+x, 550,x,0);
        }
        for(int y = 0; y < 800; y = y+50)
        {
            contentByte.showTextAligned(PdfContentByte.ALIGN_CENTER, ""+y, y,775,0);
            contentByte.showTextAligned(PdfContentByte.ALIGN_CENTER, ""+y, y,100,0);
        }
        contentByte.endText(); */

        PdfContentByte datePosition = pdfStamper.getUnderContent(1);
        datePosition.beginText();
        datePosition.setFontAndSize(myFont, 12);
        datePosition.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + dateStamp, 477, 759,0);
        datePosition.endText();

        TextView team2 = (TextView)getActivity().findViewById(R.id.team_two);
        String team2Text = team2.getText().toString();

        PdfContentByte teams = pdfStamper.getUnderContent(1);
        teams.beginText();
        teams.setFontAndSize(myFont, 16);
        teams.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + teamOne.getText(), 285,726,0);
        teams.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + team2Text, 285,397,0);
        teams.endText();

        PdfContentByte firstBatmen = pdfStamper.getUnderContent(1);
        firstBatmen.beginText();
        firstBatmen.setFontAndSize(myFont,12);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bOneName.getText(), 70,675,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTwoName.getText(), 70,660,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bThreeName.getText(), 70,645,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFourName.getText(), 70,631,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFiveName.getText(), 70,617,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSixName.getText(), 70,603,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSevenName.getText(), 70,590,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bEightName.getText(), 70,575,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bNineName.getText(), 70,560,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTenName.getText(), 70,545,0);
        firstBatmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bElevenName.getText(), 70,531,0);
        firstBatmen.endText();

        PdfContentByte firstRuns = pdfStamper.getUnderContent(1);
        firstRuns.beginText();
        firstRuns.setFontAndSize(myFont,12);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bOneRuns.getText(), 220,675,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTwoRuns.getText(), 220,660,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bThreeRuns.getText(), 220,645,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFourRuns.getText(), 220,631,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFiveRuns.getText(), 220,617,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSixRuns.getText(), 220,603,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSevenRuns.getText(), 220,590,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bEightRuns.getText(), 220,575,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bNineRuns.getText(), 220,560,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTenRuns.getText(), 220,545,0);
        firstRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bElevenRuns.getText(), 220,531,0);
        firstRuns.endText();

        PdfContentByte firstOut = pdfStamper.getUnderContent(1);
        firstOut.beginText();
        firstOut.setFontAndSize(myFont, 12);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bOneOut.getText(), 370,675,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTwoOut.getText(), 370,660,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bThreeOut.getText(), 370,645,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFourOut.getText(), 370,631,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFiveOut.getText(), 370,617,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSixOut.getText(), 370,603,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSevenOut.getText(), 370,590,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bEightOut.getText(), 370,575,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bNineOut.getText(), 370,560,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTenOut.getText(), 370,545,0);
        firstOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bElevenOut.getText(), 370,531,0);
        firstOut.endText();

        PdfContentByte firstTotals = pdfStamper.getUnderContent(1);
        firstTotals.beginText();
        firstTotals.setFontAndSize(myFont, 12);
        firstTotals.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + (runs - extraRuns), 220,518,0);
        firstTotals.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + extras.getText(), 220,504,0);
        firstTotals.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + runs , 220,490,0);
        firstTotals.endText();

        PdfContentByte firstResult = pdfStamper.getUnderContent(1);
        firstResult.beginText();
        firstResult.setFontAndSize(myFont, 16);
        firstResult.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + runs, 258,456,0);
        firstResult.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + wickets, 295,456,0);
        firstResult.endText();

        TextView secondbatsmanName1 = (TextView) getActivity().findViewById(R.id.b_one_name_x);
        TextView secondbatsmanName2 = (TextView) getActivity().findViewById(R.id.b_two_name_x);
        TextView secondbatsmanName3 = (TextView) getActivity().findViewById(R.id.b_three_name_x);
        TextView secondbatsmanName4 = (TextView) getActivity().findViewById(R.id.b_four_name_x);
        TextView secondbatsmanName5 = (TextView) getActivity().findViewById(R.id.b_five_name_x);
        TextView secondbatsmanName6 = (TextView) getActivity().findViewById(R.id.b_six_name_x);
        TextView secondbatsmanName7 = (TextView) getActivity().findViewById(R.id.b_seven_name_x);
        TextView secondbatsmanName8 = (TextView) getActivity().findViewById(R.id.b_eight_name_x);
        TextView secondbatsmanName9 = (TextView) getActivity().findViewById(R.id.b_nine_name_x);
        TextView secondbatsmanName10 = (TextView) getActivity().findViewById(R.id.b_ten_name_x);
        TextView secondbatsmanName11 = (TextView) getActivity().findViewById(R.id.b_eleven_name_x);

        PdfContentByte secondBatsmen = pdfStamper.getUnderContent(1);
        secondBatsmen.beginText();
        secondBatsmen.setFontAndSize(myFont,12);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName1.getText().toString(), 70,346,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName2.getText().toString(), 70,333,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName3.getText().toString(), 70,318,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName4.getText().toString(), 70,304,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName5.getText().toString(), 70,290,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName6.getText().toString(), 70,275,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName7.getText().toString(), 70,260,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName8.getText().toString(), 70,246,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName9.getText().toString(), 70,233,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName10.getText().toString(), 70,219,0);
        secondBatsmen.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondbatsmanName11.getText().toString(), 70,203,0);
        secondBatsmen.endText();

        TextView secondBRuns1 = (TextView) getActivity().findViewById(R.id.b_one_runs_x);
        TextView secondBRuns2 = (TextView) getActivity().findViewById(R.id.b_two_runs_x);
        TextView secondBRuns3 = (TextView) getActivity().findViewById(R.id.b_three_runs_x);
        TextView secondBRuns4 = (TextView) getActivity().findViewById(R.id.b_four_runs_x);
        TextView secondBRuns5 = (TextView) getActivity().findViewById(R.id.b_five_runs_x);
        TextView secondBRuns6 = (TextView) getActivity().findViewById(R.id.b_six_runs_x);
        TextView secondBRuns7 = (TextView) getActivity().findViewById(R.id.b_seven_runs_x);
        TextView secondBRuns8 = (TextView) getActivity().findViewById(R.id.b_eight_runs_x);
        TextView secondBRuns9 = (TextView) getActivity().findViewById(R.id.b_nine_runs_x);
        TextView secondBRuns10 = (TextView) getActivity().findViewById(R.id.b_ten_runs_x);
        TextView secondBRuns11 = (TextView) getActivity().findViewById(R.id.b_eleven_runs_x);

        PdfContentByte secondRuns = pdfStamper.getUnderContent(1);
        secondRuns.beginText();
        secondRuns.setFontAndSize(myFont,12);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns1.getText().toString(), 220,346,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns2.getText().toString(), 220,333,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns3.getText().toString(), 220,318,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns4.getText().toString(), 220,304,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns5.getText().toString(), 220,290,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns6.getText().toString(), 220,275,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns7.getText().toString(), 220,260,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns8.getText().toString(), 220,246,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns9.getText().toString(), 220,233,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns10.getText().toString(), 220,219,0);
        secondRuns.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBRuns11.getText().toString(), 220,203,0);
        secondRuns.endText();

        TextView secondBOut1 = (TextView)getActivity().findViewById(R.id.b_one_out_x);
        TextView secondBOut2 = (TextView)getActivity().findViewById(R.id.b_two_out_x);
        TextView secondBOut3 = (TextView)getActivity().findViewById(R.id.b_three_out_x);
        TextView secondBOut4 = (TextView)getActivity().findViewById(R.id.b_four_out_x);
        TextView secondBOut5 = (TextView)getActivity().findViewById(R.id.b_five_out_x);
        TextView secondBOut6 = (TextView)getActivity().findViewById(R.id.b_six_out_x);
        TextView secondBOut7 = (TextView)getActivity().findViewById(R.id.b_seven_out_x);
        TextView secondBOut8 = (TextView)getActivity().findViewById(R.id.b_eight_out_x);
        TextView secondBOut9 = (TextView)getActivity().findViewById(R.id.b_nine_out_x);
        TextView secondBOut10 = (TextView)getActivity().findViewById(R.id.b_ten_out_x);
        TextView secondBOut11 = (TextView)getActivity().findViewById(R.id.b_eleven_out_x);

        PdfContentByte secondOut = pdfStamper.getUnderContent(1);
        secondOut.beginText();
        secondOut.setFontAndSize(myFont, 12);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut1.getText().toString(), 370,346,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut2.getText().toString(), 370,333,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut3.getText().toString(), 370,318,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut4.getText().toString(), 370,304,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut5.getText().toString(), 370,290,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut6.getText().toString(), 370,275,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut7.getText().toString(), 370,260,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut8.getText().toString(), 370,246,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut9.getText().toString(), 370,233,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut10.getText().toString(), 370,219,0);
        secondOut.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondBOut11.getText().toString(), 370,203,0);
        secondOut.endText();


        TextView secondTeamRuns = (TextView) getActivity().findViewById(R.id.second_team_runs);
        TextView secondTeamTotalRuns = (TextView) getActivity().findViewById(R.id.runs_two);
        TextView secondExtras = (TextView) getActivity().findViewById(R.id.extras_x);


        PdfContentByte secondTotals = pdfStamper.getUnderContent(1);
        secondTotals.beginText();
        secondTotals.setFontAndSize(myFont, 12);
        secondTotals.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondTeamRuns.getText().toString(), 220,190,0);
        secondTotals.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondExtras.getText().toString(), 220,175,0);
        secondTotals.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + secondTeamTotalRuns.getText().toString(), 220,160,0);
        secondTotals.endText();

        TextView secondTeamWickets = (TextView) getActivity().findViewById(R.id.wickets_two);

        PdfContentByte secondResult = pdfStamper.getUnderContent(1);
        secondResult.beginText();
        secondResult.setFontAndSize(myFont, 16);
        secondResult.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + secondTeamTotalRuns.getText().toString(), 258,127,0);
        secondResult.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + secondTeamWickets.getText().toString(), 295,127,0);
        secondResult.endText();

        try {
            pdfStamper.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pdfReader.close();
    }


    public void stampPDF() {

        AssetManager assetManager = getActivity().getAssets();
        try {
            String[] files = assetManager.list("");
        } catch (IOException e) {
            e.printStackTrace();
        }


        InputStream is = null;
        try {
            is = assetManager.open("score.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PdfReader pdfReader = null;
        try {
            pdfReader = new PdfReader(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PdfReader.unethicalreading = true;

        Date date = new Date();
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(date);

        String outpath = Environment.getExternalStorageDirectory() + "/CricketScorer" + timeStamp + ".pdf";
        PdfStamper pdfStamper = null;
        try {
            pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(outpath));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BaseFont myFont = null;
        try {
            myFont = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1250, BaseFont.EMBEDDED);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Date matchDate = new Date();
        String dateStamp = new SimpleDateFormat("dd.MM.yyyy").format(matchDate);

        PdfContentByte rowOne = pdfStamper.getUnderContent(1);
        rowOne.beginText();
        rowOne.setFontAndSize(myFont, 10);
        rowOne.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + teamOne.getText(), 80, 568, 0);
        rowOne.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBC", 180, 568, 0);
        rowOne.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBC", 290, 568, 0);
        rowOne.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBC", 390, 568, 0);
        rowOne.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + dateStamp, 500, 568, 0);
        rowOne.endText();

        PdfContentByte batsman = pdfStamper.getUnderContent(1);
        batsman.beginText();
        batsman.setFontAndSize(myFont, 10);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bOneName.getText(), 60, 525, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTwoName.getText(), 60, 508, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bThreeName.getText(), 60, 490, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFourName.getText(), 60, 472, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bFiveName.getText(), 60, 455, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSixName.getText(), 60, 437, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bSevenName.getText(), 60, 417, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bEightName.getText(), 60, 399, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bNineName.getText(), 60, 380, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bTenName.getText(), 60, 363, 0);
        batsman.showTextAligned(PdfContentByte.ALIGN_LEFT, "" + bElevenName.getText(), 60, 345, 0);
        batsman.endText();

        PdfContentByte inOut = pdfStamper.getUnderContent(1);
        inOut.beginText();
        inOut.setFontAndSize(myFont, 7);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 531, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 522, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 513, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 504, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 495, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 486, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 477, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 469, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 460, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 450, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 441, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 432, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 423, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 414, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 405, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 396, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 386, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 377, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 368, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 359, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 350, 0);
        inOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 155, 341, 0);
        inOut.endText();

        PdfContentByte balls = pdfStamper.getUnderContent(1);
        balls.beginText();
        balls.setFontAndSize(myFont, 10);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 525, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 508, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 490, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 472, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 455, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 437, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 417, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 399, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 380, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 363, 0);
        balls.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 190, 345, 0);
        balls.endText();

        PdfContentByte runsScored = pdfStamper.getUnderContent(1);
        runsScored.beginText();
        runsScored.setFontAndSize(myFont, 7);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 531, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 522, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 513, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 504, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 495, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 486, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 477, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 469, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 460, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 450, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 441, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 432, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 423, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 414, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 405, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 396, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 386, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 377, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 368, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 359, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 350, 0);
        runsScored.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 215, 341, 0);
        runsScored.endText();

        PdfContentByte foursSixes = pdfStamper.getUnderContent(1);
        foursSixes.beginText();
        foursSixes.setFontAndSize(myFont, 7);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 531, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 522, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 513, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 504, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 495, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 486, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 477, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 467, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 460, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 450, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 441, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 432, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 423, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 414, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 405, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 396, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 386, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 377, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 368, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 359, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 350, 0);
        foursSixes.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 415, 341, 0);
        foursSixes.endText();

        PdfContentByte howOut = pdfStamper.getUnderContent(1);
        howOut.beginText();
        howOut.setFontAndSize(myFont, 9);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bOneOut.getText(), 455, 525, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bTwoOut.getText(), 455, 508, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bThreeOut.getText(), 455, 490, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bFourOut.getText(), 455, 472, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bFiveOut.getText(), 455, 455, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bSixOut.getText(), 455, 437, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bSevenOut.getText(), 455, 417, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bEightOut.getText(), 455, 399, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bNineOut.getText(), 455, 380, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bTenOut.getText(), 455, 363, 0);
        howOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bElevenOut.getText(), 455, 345, 0);
        howOut.endText();

        PdfContentByte bowlerOut = pdfStamper.getUnderContent(1);
        bowlerOut.beginText();
        bowlerOut.setFontAndSize(myFont, 9);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 525, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 508, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 490, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 472, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 455, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 437, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 417, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 399, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 380, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 363, 0);
        bowlerOut.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 505, 345, 0);
        bowlerOut.endText();

        PdfContentByte batterRuns = pdfStamper.getUnderContent(1);
        batterRuns.beginText();
        batterRuns.setFontAndSize(myFont, 10);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bOneRuns.getText(), 547, 525, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bTwoRuns.getText(), 547, 508, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bThreeRuns.getText(), 547, 490, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bFourRuns.getText(), 547, 472, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bFiveRuns.getText(), 547, 455, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bSixRuns.getText(), 547, 437, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bSevenRuns.getText(), 547, 417, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bEightRuns.getText(), 547, 399, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bNineRuns.getText(), 547, 380, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bTenRuns.getText(), 547, 363, 0);
        batterRuns.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + bElevenRuns.getText(), 547, 345, 0);
        batterRuns.endText();

        PdfContentByte runTally = pdfStamper.getUnderContent(1);
        BaseFont tallyFont = null;
        try {
            tallyFont = BaseFont.createFont(BaseFont.TIMES_BOLD, BaseFont.CP1250, BaseFont.EMBEDDED);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        runTally.beginText();
        runTally.setFontAndSize(tallyFont, 45);


        if (runs >= 0) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 568, 0);
        }
        if (runs >= 1) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 568, 0);
        }
        if (runs >= 2) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 568, 0);
        }
        if (runs >= 3) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 568, 0);
        }
        if (runs >= 4) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 568, 0);
        }
        if (runs >= 5) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 568, 0);
        }
        if (runs >= 6) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 568, 0);
        }
        if (runs >= 7) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 568, 0);
        }
        if (runs >= 8) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 568, 0);
        }
        if (runs >= 9) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 568, 0);
        }
        if (runs >= 10) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 558, 0);
        }
        if (runs >= 11) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 558, 0);
        }
        if (runs >= 12) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 558, 0);
        }
        if (runs >= 13) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 558, 0);
        }
        if (runs >= 14) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 558, 0);
        }
        if (runs >= 15) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 558, 0);
        }
        if (runs >= 16) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 558, 0);
        }
        if (runs >= 17) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 558, 0);
        }
        if (runs >= 18) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 558, 0);
        }
        if (runs >= 19) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 558, 0);
        }
        if (runs >= 20) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 548, 0);
        }
        if (runs >= 21) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 548, 0);
        }
        if (runs >= 22) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 548, 0);
        }
        if (runs >= 23) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 548, 0);
        }
        if (runs >= 24) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 548, 0);
        }
        if (runs >= 25) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 548, 0);
        }
        if (runs >= 26) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 548, 0);
        }
        if (runs >= 27) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 548, 0);
        }
        if (runs >= 28) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 548, 0);
        }
        if (runs >= 29) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 548, 0);
        }
        if (runs >= 30) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 538, 0);
        }
        if (runs >= 31) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 538, 0);
        }
        if (runs >= 32) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 538, 0);
        }
        if (runs >= 33) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 538, 0);
        }
        if (runs >= 34) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 538, 0);
        }
        if (runs >= 35) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 538, 0);
        }
        if (runs >= 36) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 538, 0);
        }
        if (runs >= 37) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 538, 0);
        }
        if (runs >= 38) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 538, 0);
        }
        if (runs >= 39) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 538, 0);
        }
        if (runs >= 40) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 528, 0);
        }
        if (runs >= 41) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 528, 0);
        }
        if (runs >= 42) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 528, 0);
        }
        if (runs >= 43) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 528, 0);
        }
        if (runs >= 44) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 528, 0);
        }
        if (runs >= 45) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 528, 0);
        }
        if (runs >= 46) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 528, 0);
        }
        if (runs >= 47) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 528, 0);
        }
        if (runs >= 48) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 528, 0);
        }
        if (runs >= 49) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 528, 0);
        }
        if (runs >= 50) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 518, 0);
        }
        if (runs >= 51) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 518, 0);
        }
        if (runs >= 52) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 518, 0);
        }
        if (runs >= 53) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 518, 0);
        }
        if (runs >= 54) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 518, 0);
        }
        if (runs >= 55) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 518, 0);
        }
        if (runs >= 56) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 518, 0);
        }
        if (runs >= 57) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 518, 0);
        }
        if (runs >= 58) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 518, 0);
        }
        if (runs >= 59) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 518, 0);
        }
        if (runs >= 60) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 508, 0);
        }
        if (runs >= 61) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 508, 0);
        }
        if (runs >= 62) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 508, 0);
        }
        if (runs >= 63) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 508, 0);
        }
        if (runs >= 64) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 508, 0);
        }
        if (runs >= 65) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 508, 0);
        }
        if (runs >= 66) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 508, 0);
        }
        if (runs >= 67) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 508, 0);
        }
        if (runs >= 68) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 508, 0);
        }
        if (runs >= 69) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 508, 0);
        }
        if (runs >= 70) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 498, 0);
        }
        if (runs >= 71) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 498, 0);
        }
        if (runs >= 72) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 498, 0);
        }
        if (runs >= 73) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 498, 0);
        }
        if (runs >= 74) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 498, 0);
        }
        if (runs >= 75) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 498, 0);
        }
        if (runs >= 76) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 498, 0);
        }
        if (runs >= 77) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 498, 0);
        }
        if (runs >= 78) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 498, 0);
        }
        if (runs >= 79) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 498, 0);
        }
        if (runs >= 80) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 488, 0);
        }
        if (runs >= 81) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 488, 0);
        }
        if (runs >= 82) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 488, 0);
        }
        if (runs >= 83) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 488, 0);
        }
        if (runs >= 84) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 488, 0);
        }
        if (runs >= 85) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 488, 0);
        }
        if (runs >= 86) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 488, 0);
        }
        if (runs >= 87) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 488, 0);
        }
        if (runs >= 88) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 488, 0);
        }
        if (runs >= 89) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 488, 0);
        }
        if (runs >= 90) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 479, 0);
        }
        if (runs >= 91) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 479, 0);
        }
        if (runs >= 92) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 479, 0);
        }
        if (runs >= 93) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 479, 0);
        }
        if (runs >= 94) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 479, 0);
        }
        if (runs >= 95) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 479, 0);
        }
        if (runs >= 96) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 479, 0);
        }
        if (runs >= 97) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 479, 0);
        }
        if (runs >= 98) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 479, 0);
        }
        if (runs >= 99) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 479, 0);
        }
        if (runs >= 100) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 469, 0);
        }
        if (runs >= 101) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 469, 0);
        }
        if (runs >= 102) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 469, 0);
        }
        if (runs >= 103) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 469, 0);
        }
        if (runs >= 104) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 469, 0);
        }
        if (runs >= 105) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 469, 0);
        }
        if (runs >= 106) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 469, 0);
        }
        if (runs >= 107) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 469, 0);
        }
        if (runs >= 108) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 469, 0);
        }
        if (runs >= 109) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 469, 0);
        }
        if (runs >= 110) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 459, 0);
        }
        if (runs >= 111) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 459, 0);
        }
        if (runs >= 112) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 459, 0);
        }
        if (runs >= 113) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 459, 0);
        }
        if (runs >= 114) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 459, 0);
        }
        if (runs >= 115) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 459, 0);
        }
        if (runs >= 116) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 459, 0);
        }
        if (runs >= 117) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 459, 0);
        }
        if (runs >= 118) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 459, 0);
        }
        if (runs >= 119) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 459, 0);
        }
        if (runs >= 120) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 449, 0);
        }
        if (runs >= 121) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 449, 0);
        }
        if (runs >= 122) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 449, 0);
        }
        if (runs >= 123) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 449, 0);
        }
        if (runs >= 124) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 449, 0);
        }
        if (runs >= 125) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 449, 0);
        }
        if (runs >= 126) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 449, 0);
        }
        if (runs >= 127) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 449, 0);
        }
        if (runs >= 128) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 449, 0);
        }
        if (runs >= 129) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 449, 0);
        }
        if (runs >= 130) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 439, 0);
        }
        if (runs >= 131) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 439, 0);
        }
        if (runs >= 132) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 439, 0);
        }
        if (runs >= 133) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 439, 0);
        }
        if (runs >= 134) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 439, 0);
        }
        if (runs >= 135) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 439, 0);
        }
        if (runs >= 136) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 439, 0);
        }
        if (runs >= 137) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 439, 0);
        }
        if (runs >= 138) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 439, 0);
        }
        if (runs >= 139) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 439, 0);
        }
        if (runs >= 140) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581, 430, 0);
        }
        if (runs >= 141) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599, 430, 0);
        }
        if (runs >= 142) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614, 430, 0);
        }
        if (runs >= 143) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631, 430, 0);
        }
        if (runs >= 144) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648, 430, 0);
        }
        if (runs >= 145) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663, 430, 0);
        }
        if (runs >= 146) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679, 430, 0);
        }
        if (runs >= 147) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693, 430, 0);
        }
        if (runs >= 148) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708, 430, 0);
        }
        if (runs >= 149) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 430, 0);

        }if(runs>=150){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,420,0);
        }if(runs>=151){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,420,0);
        }if(runs>=152){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,420,0);
        }if(runs>=153){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,420,0);
        }if(runs>=154){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,420,0);
        }if(runs>=155){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,420,0);
        }if(runs>=156){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,420,0);
        }if(runs>=157){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,420,0);
        }if(runs>=158){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,420,0);
        }if(runs>=159){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,420,0);
        }if(runs>=160){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,410,0);
        }if(runs>=161){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,410,0);
        }if(runs>=162){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,410,0);
        }if(runs>=163){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,410,0);
        }if(runs>=164){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,410,0);
        }if(runs>=165){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,410,0);
        }if(runs>=166){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,410,0);
        }if(runs>=167){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,410,0);
        }if(runs>=168){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,410,0);
        }if(runs>=169){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,410,0);
        }if(runs>=170){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,400,0);
        }if(runs>=171){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,400,0);
        }if(runs>=172){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,400,0);
        }if(runs>=173){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,400,0);
        }if(runs>=174){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,400,0);
        }if(runs>=175){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,400,0);
        }if(runs>=176){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,400,0);
        }if(runs>=177){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,400,0);
        }if(runs>=178){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,400,0);
        }if(runs>=179){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,400,0);
        }if(runs>=180){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,390,0);
        }if(runs>=181){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,390,0);
        }if(runs>=182){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,390,0);
        }if(runs>=183){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,390,0);
        }if(runs>=184){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,390,0);
        }if(runs>=185){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,390,0);
        }if(runs>=186){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,390,0);
        }if(runs>=187){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,390,0);
        }if(runs>=188){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,390,0);
        }if(runs>=189){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,390,0);
        }if(runs>=190){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,380,0);
        }if(runs>=191){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,380,0);
        }if(runs>=192){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,380,0);
        }if(runs>=193){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,380,0);
        }if(runs>=194){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,380,0);
        }if(runs>=195){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,380,0);
        }if(runs>=196){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,380,0);
        }if(runs>=197){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,380,0);
        }if(runs>=198){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,380,0);
        }if(runs>=199){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,380,0);
        }if(runs>=200){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,370,0);
        }if(runs>=201){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,370,0);
        }if(runs>=202){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,370,0);
        }if(runs>=203){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,370,0);
        }if(runs>=204){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,370,0);
        }if(runs>=205){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,370,0);
        }if(runs>=206){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,370,0);
        }if(runs>=207){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,370,0);
        }if(runs>=208){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,370,0);
        }if(runs>=209){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,370,0);
        }if(runs>=210){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,360,0);
        }if(runs>=211){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,360,0);
        }if(runs>=212){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,360,0);
        }if(runs>=213){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,360,0);
        }if(runs>=214){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,360,0);
        }if(runs>=215){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,360,0);
        }if(runs>=216){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,360,0);
        }if(runs>=217){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,360,0);
        }if(runs>=218){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,360,0);
        }if(runs>=219){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,360,0);
        }if(runs>=220){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,350,0);
        }if(runs>=221){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,350,0);
        }if(runs>=222){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,350,0);
        }if(runs>=223){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,350,0);
        }if(runs>=224){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,350,0);
        }if(runs>=225){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,350,0);
        }if(runs>=226){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,350,0);
        }if(runs>=227){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,350,0);
        }if(runs>=228){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,350,0);
        }if(runs>=229){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,350,0);
        }if(runs>=230){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,340,0);
        }if(runs>=231){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,340,0);
        }if(runs>=232){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,340,0);
        }if(runs>=233){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,340,0);
        }if(runs>=234){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,340,0);
        }if(runs>=235){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,340,0);
        }if(runs>=236){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,340,0);
        }if(runs>=237){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,340,0);
        }if(runs>=238){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,340,0);
        }if(runs>=239){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,340,0);
        }if(runs>=240){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,330,0);
        }if(runs>=241){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,330,0);
        }if(runs>=242){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,330,0);
        }if(runs>=243){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,330,0);
        }if(runs>=244){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,330,0);
        }if(runs>=245){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,330,0);
        }if(runs>=246){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,330,0);
        }if(runs>=247){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,330,0);
        }if(runs>=248){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,330,0);
        }if(runs>=249) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 330, 0);
        }if(runs>=250){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,320,0);
        }if(runs>=251){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,320,0);
        }if(runs>=252){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,320,0);
        }if(runs>=253){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,320,0);
        }if(runs>=254){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,320,0);
        }if(runs>=255){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,320,0);
        }if(runs>=256){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,320,0);
        }if(runs>=257){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,320,0);
        }if(runs>=258){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,320,0);
        }if(runs>=259){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,320,0);
        }if(runs>=260){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,310,0);
        }if(runs>=261){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,310,0);
        }if(runs>=262){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,310,0);
        }if(runs>=263){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,310,0);
        }if(runs>=264){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,310,0);
        }if(runs>=265){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,310,0);
        }if(runs>=266){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,310,0);
        }if(runs>=267){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,310,0);
        }if(runs>=268){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,310,0);
        }if(runs>=269){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,310,0);
        }if(runs>=270){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,300,0);
        }if(runs>=271){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,300,0);
        }if(runs>=272){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,300,0);
        }if(runs>=273){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,300,0);
        }if(runs>=274){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,300,0);
        }if(runs>=275){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,300,0);
        }if(runs>=276){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,300,0);
        }if(runs>=277){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,300,0);
        }if(runs>=278){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,300,0);
        }if(runs>=279){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,300,0);
        }if(runs>=280){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,291,0);
        }if(runs>=281){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,291,0);
        }if(runs>=282){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,291,0);
        }if(runs>=283){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,291,0);
        }if(runs>=284){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,291,0);
        }if(runs>=285){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,291,0);
        }if(runs>=286){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,291,0);
        }if(runs>=287){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,291,0);
        }if(runs>=288){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,291,0);
        }if(runs>=289){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,291,0);
        }if(runs>=290){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,281,0);
        }if(runs>=291){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,281,0);
        }if(runs>=292){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,281,0);
        }if(runs>=293){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,281,0);
        }if(runs>=294){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,281,0);
        }if(runs>=295){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,281,0);
        }if(runs>=296){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,281,0);
        }if(runs>=297){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,281,0);
        }if(runs>=298){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,281,0);
        }if(runs>=299) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 281, 0);
        }if(runs>=300){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,271,0);
        }if(runs>=301){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,271,0);
        }if(runs>=302){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,271,0);
        }if(runs>=303){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,271,0);
        }if(runs>=304){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,271,0);
        }if(runs>=305){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,271,0);
        }if(runs>=306){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,271,0);
        }if(runs>=307){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,271,0);
        }if(runs>=308){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,271,0);
        }if(runs>=309){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,271,0);
        }if(runs>=310){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,261,0);
        }if(runs>=311){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,261,0);
        }if(runs>=312){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,261,0);
        }if(runs>=313){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,261,0);
        }if(runs>=314){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,261,0);
        }if(runs>=315){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,261,0);
        }if(runs>=316){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,261,0);
        }if(runs>=317){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,261,0);
        }if(runs>=318){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,261,0);
        }if(runs>=319){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,261,0);
        }if(runs>=320){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,251,0);
        }if(runs>=321){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,251,0);
        }if(runs>=322){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,251,0);
        }if(runs>=323){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,251,0);
        }if(runs>=324){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,251,0);
        }if(runs>=325){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,251,0);
        }if(runs>=326){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,251,0);
        }if(runs>=327){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,251,0);
        }if(runs>=328){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,251,0);
        }if(runs>=329){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,251,0);
        }if(runs>=330){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,241,0);
        }if(runs>=331){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,241,0);
        }if(runs>=332){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,241,0);
        }if(runs>=333){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,241,0);
        }if(runs>=334){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,241,0);
        }if(runs>=335){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,241,0);
        }if(runs>=336){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,241,0);
        }if(runs>=337){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,241,0);
        }if(runs>=338){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,241,0);
        }if(runs>=339){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,241,0);
        }if(runs>=340){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,231,0);
        }if(runs>=341){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,231,0);
        }if(runs>=342){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,231,0);
        }if(runs>=343){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,231,0);
        }if(runs>=344){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,231,0);
        }if(runs>=345){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,231,0);
        }if(runs>=346){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,231,0);
        }if(runs>=347){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,231,0);
        }if(runs>=348){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,231,0);
        }if(runs>=349) {
            runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724, 231, 0);
        }if(runs>=350){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,222,0);
        }if(runs>=351){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,222,0);
        }if(runs>=352){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,222,0);
        }if(runs>=353){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,222,0);
        }if(runs>=354){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,222,0);
        }if(runs>=355){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,222,0);
        }if(runs>=356){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,222,0);
        }if(runs>=357){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,222,0);
        }if(runs>=358){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,222,0);
        }if(runs>=359){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,222,0);
        }if(runs>=360){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,212,0);
        }if(runs>=361){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,212,0);
        }if(runs>=362){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,212,0);
        }if(runs>=363){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,212,0);
        }if(runs>=364){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,212,0);
        }if(runs>=365){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,212,0);
        }if(runs>=366){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,212,0);
        }if(runs>=367){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,212,0);
        }if(runs>=368){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,212,0);
        }if(runs>=369){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,212,0);
        }if(runs>=370){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,202,0);
        }if(runs>=371){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,202,0);
        }if(runs>=372){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,202,0);
        }if(runs>=373){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,202,0);
        }if(runs>=374){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,202,0);
        }if(runs>=375){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,202,0);
        }if(runs>=376){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,202,0);
        }if(runs>=377){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,202,0);
        }if(runs>=378){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,202,0);
        }if(runs>=379){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,202,0);
        }if(runs>=380){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,192,0);
        }if(runs>=381){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,192,0);
        }if(runs>=382){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,192,0);
        }if(runs>=383){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,192,0);
        }if(runs>=384){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,192,0);
        }if(runs>=385){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,192,0);
        }if(runs>=386){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,192,0);
        }if(runs>=387){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,192,0);
        }if(runs>=388){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,192,0);
        }if(runs>=389){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,192,0);
        }if(runs>=390){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 581,182,0);
        }if(runs>=391){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 599,182,0);
        }if(runs>=392){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 614,182,0);
        }if(runs>=393){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 631,182,0);
        }if(runs>=394){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 648,182,0);
        }if(runs>=395){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 663,182,0);
        }if(runs>=396){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 679,182,0);
        }if(runs>=397){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 693,182,0);
        }if(runs>=398){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 708,182,0);
        }if(runs>=399){
        runTally.showTextAligned(PdfContentByte.ALIGN_CENTER, "·", 724,182,0);
        }
        runTally.endText();

        //result
        PdfContentByte result = pdfStamper.getUnderContent(1);
        result.beginText();
        result.setFontAndSize(myFont,12);
        result.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + runs,605,164,0);
        result.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + wickets,708,164,0);
        result.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + runs + " - " + wickets,648,141,0);
        result.endText();

        PdfContentByte wicketFallScore = pdfStamper.getUnderContent(1);
        wicketFallScore.beginText();
        wicketFallScore.setFontAndSize(myFont, 7);
        if(wickets>=1){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 102,319,0);}
        if(wickets>=2){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 124,319,0);}
        if(wickets>=3){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 145,319,0);}
        if(wickets>=4){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 167,319,0);}
        if(wickets>=5){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 188,319,0);}
        if(wickets>=6){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 210,319,0);}
        if(wickets>=7){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 231,319,0);}
        if(wickets>=8){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 253,319,0);}
        if(wickets>=9){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 275,319,0);}
        if(wickets>=10){
        wicketFallScore.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 296,319,0);}
        wicketFallScore.endText();

        PdfContentByte wicketFallBatsman = pdfStamper.getUnderContent(1);
        wicketFallBatsman.beginText();
        wicketFallBatsman.setFontAndSize(myFont,7);
        if(wickets>=1){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 102,308,0);}
        if(wickets>=2){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 124,308,0);}
        if(wickets>=3){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 145,308,0);}
        if(wickets>=4){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 167,308,0);}
        if(wickets>=5){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 188,308,0);}
        if(wickets>=6){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 210,308,0);}
        if(wickets>=7){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 231,308,0);}
        if(wickets>=8){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 253,308,0);}
        if(wickets>=9){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 275,308,0);}
        if(wickets>=10){
        wicketFallBatsman.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 296,308,0);}
        wicketFallBatsman.endText();

        PdfContentByte extrasScored = pdfStamper.getUnderContent(1);
        extrasScored.beginText();
        extrasScored.setFontAndSize(myFont,7);
        extrasScored.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 361,329,0);
        extrasScored.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 361,319,0);
        extrasScored.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 361,309,0);
        extrasScored.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 361,299,0);
        extrasScored.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 361,288,0);
        extrasScored.endText();

        PdfContentByte totals = pdfStamper.getUnderContent(1);
        totals.beginText();
        totals.setFontAndSize(myFont,7);
        totals.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,329,0);
        totals.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + extraRuns, 547,319,0);
        totals.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,308,0);
        totals.endText();

        PdfContentByte bowlers = pdfStamper.getUnderContent(1);
        bowlers.beginText();
        bowlers.setFontAndSize(myFont,11);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,262,0);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,246,0);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,230,0);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,214,0);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,195,0);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,177,0);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,161,0);
        bowlers.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 99,140,0);
        bowlers.endText();

        PdfContentByte bowler1Overs = pdfStamper.getUnderContent(1);
        bowler1Overs.beginText();
        bowler1Overs.setFontAndSize(myFont,7);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,260,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,269,0);
        bowler1Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,260,0);
        bowler1Overs.endText();

        PdfContentByte bowler2Overs = pdfStamper.getUnderContent(1);
        bowler2Overs.beginText();
        bowler2Overs.setFontAndSize(myFont, 7);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,244,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,252,0);
        bowler2Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,244,0);
        bowler2Overs.endText();

        PdfContentByte bowler3Overs = pdfStamper.getUnderContent(1);
        bowler3Overs.beginText();
        bowler3Overs.setFontAndSize(myFont,7);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,227,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,235,0);
        bowler3Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,227,0);
        bowler3Overs.endText();

        PdfContentByte bowler4Overs = pdfStamper.getUnderContent(1);
        bowler4Overs.beginText();
        bowler4Overs.setFontAndSize(myFont,7);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,210,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,218,0);
        bowler4Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,210,0);
        bowler4Overs.endText();

        PdfContentByte bowler5Overs = pdfStamper.getUnderContent(1);
        bowler5Overs.beginText();
        bowler5Overs.setFontAndSize(myFont,7);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,193,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,201,0);
        bowler5Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,193,0);
        bowler5Overs.endText();

        PdfContentByte bowler6Overs = pdfStamper.getUnderContent(1);
        bowler6Overs.beginText();
        bowler6Overs.setFontAndSize(myFont,7);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,176,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,184,0);
        bowler6Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,176,0);
        bowler6Overs.endText();

        PdfContentByte bowler7Overs = pdfStamper.getUnderContent(1);
        bowler7Overs.beginText();
        bowler7Overs.setFontAndSize(myFont,7);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,158,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,167,0);
        bowler7Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,158,0);
        bowler7Overs.endText();

        PdfContentByte bowler8Overs = pdfStamper.getUnderContent(1);
        bowler8Overs.beginText();
        bowler8Overs.setFontAndSize(myFont,7);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 158,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 180,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 202,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 224,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 246,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 266,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 288,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 310,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 332,140,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,150,0);
        bowler8Overs.showTextAligned(PdfContentByte.ALIGN_LEFT, "TBD", 354,140,0);
        bowler8Overs.endText();

        PdfContentByte bowler1Extras = pdfStamper.getUnderContent(1);
        bowler1Extras.beginText();
        bowler1Extras.setFontAndSize(myFont,12);
        bowler1Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,262,0);
        bowler1Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,262,0);
        bowler1Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,262,0);
        bowler1Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,262,0);
        bowler1Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,262,0);
        bowler1Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,262,0);
        bowler1Extras.endText();

        PdfContentByte bowler2Extras = pdfStamper.getUnderContent(1);
        bowler2Extras.beginText();
        bowler2Extras.setFontAndSize(myFont, 12);
        bowler2Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,246,0);
        bowler2Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,246,0);
        bowler2Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,246,0);
        bowler2Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,246,0);
        bowler2Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,246,0);
        bowler2Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,246,0);
        bowler2Extras.endText();

        PdfContentByte bowler3Extras = pdfStamper.getUnderContent(1);
        bowler3Extras.beginText();
        bowler3Extras.setFontAndSize(myFont, 12);
        bowler3Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,230,0);
        bowler3Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,230,0);
        bowler3Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,230,0);
        bowler3Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,230,0);
        bowler3Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,230,0);
        bowler3Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,230,0);
        bowler3Extras.endText();

        PdfContentByte bowler4Extras = pdfStamper.getUnderContent(1);
        bowler4Extras.beginText();
        bowler4Extras.setFontAndSize(myFont,12);
        bowler4Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,214,0);
        bowler4Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,214,0);
        bowler4Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,214,0);
        bowler4Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,214,0);
        bowler4Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,214,0);
        bowler4Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,214,0);
        bowler4Extras.endText();

        PdfContentByte bowler5Extras = pdfStamper.getUnderContent(1);
        bowler5Extras.beginText();
        bowler5Extras.setFontAndSize(myFont,12);
        bowler5Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,195,0);
        bowler5Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,195,0);
        bowler5Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,195,0);
        bowler5Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,195,0);
        bowler5Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,195,0);
        bowler5Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,195,0);
        bowler5Extras.endText();

        PdfContentByte bowler6Extras = pdfStamper.getUnderContent(1);
        bowler6Extras.beginText();
        bowler6Extras.setFontAndSize(myFont,12);
        bowler6Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,177,0);
        bowler6Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,177,0);
        bowler6Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,177,0);
        bowler6Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,177,0);
        bowler6Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,177,0);
        bowler6Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,177,0);
        bowler6Extras.endText();

        PdfContentByte bowler7Extras = pdfStamper.getUnderContent(1);
        bowler7Extras.beginText();
        bowler7Extras.setFontAndSize(myFont,12);
        bowler7Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,161,0);
        bowler7Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,161,0);
        bowler7Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,161,0);
        bowler7Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,161,0);
        bowler7Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,161,0);
        bowler7Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,161,0);
        bowler7Extras.endText();

        PdfContentByte bowler8Extras = pdfStamper.getUnderContent(1);
        bowler8Extras.beginText();
        bowler8Extras.setFontAndSize(myFont,12);
        bowler8Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 390,140,0);
        bowler8Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 420,140,0);
        bowler8Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 450,140,0);
        bowler8Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 480,140,0);
        bowler8Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 513,140,0);
        bowler8Extras.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 547,140,0);
        bowler8Extras.endText();

        PdfContentByte overView1 = pdfStamper.getUnderContent(1);
        overView1.beginText();
        overView1.setFontAndSize(myFont,6);
        overView1.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 88,107,0);
        overView1.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 88,95,0);
        overView1.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 88,84,0);
        overView1.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 88,72,0);
        overView1.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 88,60,0);
        overView1.endText();

        PdfContentByte overView2 = pdfStamper.getUnderContent(1);
        overView2.beginText();
        overView2.setFontAndSize(myFont,6);
        overView2.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 99,107,0);
        overView2.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 99,95,0);
        overView2.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 99,84,0);
        overView2.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 99,72,0);
        overView2.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 99,60,0);
        overView2.endText();

        PdfContentByte overView3 = pdfStamper.getUnderContent(1);
        overView3.beginText();
        overView3.setFontAndSize(myFont,6);
        overView3.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 110,107,0);
        overView3.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 110,95,0);
        overView3.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 110,84,0);
        overView3.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 110,72,0);
        overView3.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 110,60,0);
        overView3.endText();

        PdfContentByte overView4 = pdfStamper.getUnderContent(1);
        overView4.beginText();
        overView4.setFontAndSize(myFont,6);
        overView4.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 121,107,0);
        overView4.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 121,95,0);
        overView4.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 121,84,0);
        overView4.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 121,72,0);
        overView4.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 121,60,0);
        overView4.endText();

        PdfContentByte overView5 = pdfStamper.getUnderContent(1);
        overView5.beginText();
        overView5.setFontAndSize(myFont,6);
        overView5.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 131,107,0);
        overView5.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 131,95,0);
        overView5.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 131,84,0);
        overView5.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 131,72,0);
        overView5.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 131,60,0);
        overView5.endText();

        PdfContentByte overView6 = pdfStamper.getUnderContent(1);
        overView6.beginText();
        overView6.setFontAndSize(myFont,6);
        overView6.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 141,107,0);
        overView6.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 141,95,0);
        overView6.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 141,84,0);
        overView6.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 141,72,0);
        overView6.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 141,60,0);
        overView6.endText();

        PdfContentByte overView7 = pdfStamper.getUnderContent(1);
        overView7.beginText();
        overView7.setFontAndSize(myFont,6);
        overView7.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 152,107,0);
        overView7.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 152,95,0);
        overView7.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 152,84,0);
        overView7.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 152,72,0);
        overView7.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 152,60,0);
        overView7.endText();

        PdfContentByte overView8 = pdfStamper.getUnderContent(1);
        overView8.beginText();
        overView8.setFontAndSize(myFont,6);
        overView8.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 163,107,0);
        overView8.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 163,95,0);
        overView8.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 163,84,0);
        overView8.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 163,72,0);
        overView8.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 163,60,0);
        overView8.endText();

        PdfContentByte overView9 = pdfStamper.getUnderContent(1);
        overView9.beginText();
        overView9.setFontAndSize(myFont,6);
        overView9.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 173,107,0);
        overView9.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 173,95,0);
        overView9.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 173,84,0);
        overView9.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 173,72,0);
        overView9.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 173,60,0);
        overView9.endText();

        PdfContentByte overView10 = pdfStamper.getUnderContent(1);
        overView10.beginText();
        overView10.setFontAndSize(myFont,6);
        overView10.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 186,107,0);
        overView10.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 186,95,0);
        overView10.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 186,84,0);
        overView10.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 186,72,0);
        overView10.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 186,60,0);
        overView10.endText();

        PdfContentByte overView11 = pdfStamper.getUnderContent(1);
        overView11.beginText();
        overView11.setFontAndSize(myFont,6);
        overView11.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 198,107,0);
        overView11.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 198,95,0);
        overView11.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 198,84,0);
        overView11.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 198,72,0);
        overView11.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 198,60,0);
        overView11.endText();

        PdfContentByte overView12 = pdfStamper.getUnderContent(1);
        overView12.beginText();
        overView12.setFontAndSize(myFont,6);
        overView12.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 213,107,0);
        overView12.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 213,95,0);
        overView12.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 213,84,0);
        overView12.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 213,72,0);
        overView12.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 213,60,0);
        overView12.endText();

        PdfContentByte overView13 = pdfStamper.getUnderContent(1);
        overView13.beginText();
        overView13.setFontAndSize(myFont,6);
        overView13.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 227,107,0);
        overView13.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 227,95,0);
        overView13.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 227,84,0);
        overView13.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 227,72,0);
        overView13.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 227,60,0);
        overView13.endText();

        PdfContentByte overView14 = pdfStamper.getUnderContent(1);
        overView14.beginText();
        overView14.setFontAndSize(myFont,6);
        overView14.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 242,107,0);
        overView14.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 242,95,0);
        overView14.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 242,84,0);
        overView14.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 242,72,0);
        overView14.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 242,60,0);
        overView14.endText();

        PdfContentByte overView15 = pdfStamper.getUnderContent(1);
        overView15.beginText();
        overView15.setFontAndSize(myFont,6);
        overView15.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 256,107,0);
        overView15.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 256,95,0);
        overView15.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 256,84,0);
        overView15.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 256,72,0);
        overView15.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 256,60,0);
        overView15.endText();

        PdfContentByte overView16 = pdfStamper.getUnderContent(1);
        overView16.beginText();
        overView16.setFontAndSize(myFont,6);
        overView16.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 271,107,0);
        overView16.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 271,95,0);
        overView16.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 271,84,0);
        overView16.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 271,72,0);
        overView16.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 271,60,0);
        overView16.endText();

        PdfContentByte overView17 = pdfStamper.getUnderContent(1);
        overView17.beginText();
        overView17.setFontAndSize(myFont,6);
        overView17.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 285,107,0);
        overView17.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 285,95,0);
        overView17.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 285,84,0);
        overView17.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 285,72,0);
        overView17.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 285,60,0);
        overView17.endText();

        PdfContentByte overView18 = pdfStamper.getUnderContent(1);
        overView18.beginText();
        overView18.setFontAndSize(myFont,6);
        overView18.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 300,107,0);
        overView18.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 300,95,0);
        overView18.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 300,84,0);
        overView18.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 300,72,0);
        overView18.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 300,60,0);
        overView18.endText();

        PdfContentByte overView19 = pdfStamper.getUnderContent(1);
        overView19.beginText();
        overView19.setFontAndSize(myFont,6);
        overView19.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 314,107,0);
        overView19.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 314,95,0);
        overView19.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 314,84,0);
        overView19.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 314,72,0);
        overView19.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 314,60,0);
        overView19.endText();

        PdfContentByte overView20 = pdfStamper.getUnderContent(1);
        overView20.beginText();
        overView20.setFontAndSize(myFont,6);
        overView20.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 328,107,0);
        overView20.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 328,95,0);
        overView20.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 328,84,0);
        overView20.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 328,72,0);
        overView20.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 328,60,0);
        overView20.endText();

        PdfContentByte overView21 = pdfStamper.getUnderContent(1);
        overView21.beginText();
        overView21.setFontAndSize(myFont,6);
        overView21.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 343,107,0);
        overView21.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 343,95,0);
        overView21.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 343,84,0);
        overView21.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 343,72,0);
        overView21.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 343,60,0);
        overView21.endText();

        PdfContentByte overView22 = pdfStamper.getUnderContent(1);
        overView22.beginText();
        overView22.setFontAndSize(myFont,6);
        overView22.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 357,107,0);
        overView22.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 357,95,0);
        overView22.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 357,84,0);
        overView22.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 357,72,0);
        overView22.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 357,60,0);
        overView22.endText();

        PdfContentByte overView23 = pdfStamper.getUnderContent(1);
        overView23.beginText();
        overView23.setFontAndSize(myFont,6);
        overView23.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 372,107,0);
        overView23.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 372,95,0);
        overView23.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 372,84,0);
        overView23.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 372,72,0);
        overView23.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 372,60,0);
        overView23.endText();

        PdfContentByte overView24 = pdfStamper.getUnderContent(1);
        overView24.beginText();
        overView24.setFontAndSize(myFont,6);
        overView24.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 386,107,0);
        overView24.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 386,95,0);
        overView24.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 386,84,0);
        overView24.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 386,72,0);
        overView24.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 386,60,0);
        overView24.endText();

        PdfContentByte overView25 = pdfStamper.getUnderContent(1);
        overView25.beginText();
        overView25.setFontAndSize(myFont,6);
        overView25.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 400,107,0);
        overView25.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 400,95,0);
        overView25.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 400,84,0);
        overView25.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 400,72,0);
        overView25.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 400,60,0);
        overView25.endText();

        PdfContentByte overView26 = pdfStamper.getUnderContent(1);
        overView26.beginText();
        overView26.setFontAndSize(myFont,6);
        overView26.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 414,107,0);
        overView26.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 414,95,0);
        overView26.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 414,84,0);
        overView26.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 414,72,0);
        overView26.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 414,60,0);
        overView26.endText();

        PdfContentByte overView27 = pdfStamper.getUnderContent(1);
        overView27.beginText();
        overView27.setFontAndSize(myFont,6);
        overView27.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 429,107,0);
        overView27.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 429,95,0);
        overView27.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 429,84,0);
        overView27.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 429,72,0);
        overView27.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 429,60,0);
        overView27.endText();

        PdfContentByte overView28 = pdfStamper.getUnderContent(1);
        overView28.beginText();
        overView28.setFontAndSize(myFont,6);
        overView28.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 443,107,0);
        overView28.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 443,95,0);
        overView28.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 443,84,0);
        overView28.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 443,72,0);
        overView28.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 443,60,0);
        overView28.endText();

        PdfContentByte overView29 = pdfStamper.getUnderContent(1);
        overView29.beginText();
        overView29.setFontAndSize(myFont,6);
        overView29.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 457,107,0);
        overView29.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 457,95,0);
        overView29.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 457,84,0);
        overView29.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 457,72,0);
        overView29.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 457,60,0);
        overView29.endText();

        PdfContentByte overView30 = pdfStamper.getUnderContent(1);
        overView30.beginText();
        overView30.setFontAndSize(myFont,6);
        overView30.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 471,107,0);
        overView30.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 471,95,0);
        overView30.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 471,84,0);
        overView30.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 471,72,0);
        overView30.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 471,60,0);
        overView30.endText();

        PdfContentByte overView31 = pdfStamper.getUnderContent(1);
        overView31.beginText();
        overView31.setFontAndSize(myFont,6);
        overView31.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 486,107,0);
        overView31.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 486,95,0);
        overView31.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 486,84,0);
        overView31.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 486,72,0);
        overView31.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 486,60,0);
        overView31.endText();

        PdfContentByte overView32 = pdfStamper.getUnderContent(1);
        overView32.beginText();
        overView32.setFontAndSize(myFont,6);
        overView32.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 500,107,0);
        overView32.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 500,95,0);
        overView32.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 500,84,0);
        overView32.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 500,72,0);
        overView32.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 500,60,0);
        overView32.endText();

        PdfContentByte overView33 = pdfStamper.getUnderContent(1);
        overView33.beginText();
        overView33.setFontAndSize(myFont,6);
        overView33.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 515,107,0);
        overView33.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 515,95,0);
        overView33.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 515,84,0);
        overView33.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 515,72,0);
        overView33.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 515,60,0);
        overView33.endText();

        PdfContentByte overView34 = pdfStamper.getUnderContent(1);
        overView34.beginText();
        overView34.setFontAndSize(myFont,6);
        overView34.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 529,107,0);
        overView34.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 529,95,0);
        overView34.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 529,84,0);
        overView34.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 529,72,0);
        overView34.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 529,60,0);
        overView34.endText();

        PdfContentByte overView35 = pdfStamper.getUnderContent(1);
        overView35.beginText();
        overView35.setFontAndSize(myFont,6);
        overView35.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 543,107,0);
        overView35.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 543,95,0);
        overView35.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 543,84,0);
        overView35.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 543,72,0);
        overView35.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 543,60,0);
        overView35.endText();

        PdfContentByte overView36 = pdfStamper.getUnderContent(1);
        overView36.beginText();
        overView36.setFontAndSize(myFont,6);
        overView36.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 557,107,0);
        overView36.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 557,95,0);
        overView36.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 557,84,0);
        overView36.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 557,72,0);
        overView36.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 557,60,0);
        overView36.endText();

        PdfContentByte overView37 = pdfStamper.getUnderContent(1);
        overView37.beginText();
        overView37.setFontAndSize(myFont,6);
        overView37.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 572,107,0);
        overView37.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 572,95,0);
        overView37.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 572,84,0);
        overView37.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 572,72,0);
        overView37.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 572,60,0);
        overView37.endText();

        PdfContentByte overView38 = pdfStamper.getUnderContent(1);
        overView38.beginText();
        overView38.setFontAndSize(myFont,6);
        overView38.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 587,107,0);
        overView38.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 587,95,0);
        overView38.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 587,84,0);
        overView38.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 587,72,0);
        overView38.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 587,60,0);
        overView38.endText();

        PdfContentByte overView39 = pdfStamper.getUnderContent(1);
        overView39.beginText();
        overView39.setFontAndSize(myFont,6);
        overView39.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 601,107,0);
        overView39.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 601,95,0);
        overView39.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 601,84,0);
        overView39.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 601,72,0);
        overView39.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 601,60,0);
        overView39.endText();

        PdfContentByte overView40 = pdfStamper.getUnderContent(1);
        overView40.beginText();
        overView40.setFontAndSize(myFont,6);
        overView40.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 615,107,0);
        overView40.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 615,95,0);
        overView40.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 615,84,0);
        overView40.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 615,72,0);
        overView40.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 615,60,0);
        overView40.endText();

        PdfContentByte overView41 = pdfStamper.getUnderContent(1);
        overView41.beginText();
        overView41.setFontAndSize(myFont,6);
        overView41.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 629,107,0);
        overView41.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 629,95,0);
        overView41.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 629,84,0);
        overView41.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 629,72,0);
        overView41.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 629,60,0);
        overView41.endText();

        PdfContentByte overView42 = pdfStamper.getUnderContent(1);
        overView42.beginText();
        overView42.setFontAndSize(myFont,6);
        overView42.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 643,107,0);
        overView42.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 643,95,0);
        overView42.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 643,84,0);
        overView42.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 643,72,0);
        overView42.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 643,60,0);
        overView42.endText();

        PdfContentByte overView43 = pdfStamper.getUnderContent(1);
        overView43.beginText();
        overView43.setFontAndSize(myFont,6);
        overView43.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 658,107,0);
        overView43.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 658,95,0);
        overView43.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 658,84,0);
        overView43.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 658,72,0);
        overView43.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 658,60,0);
        overView43.endText();

        PdfContentByte overView44 = pdfStamper.getUnderContent(1);
        overView44.beginText();
        overView44.setFontAndSize(myFont,6);
        overView44.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 672,107,0);
        overView44.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 672,95,0);
        overView44.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 672,84,0);
        overView44.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 672,72,0);
        overView44.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 672,60,0);
        overView44.endText();

        PdfContentByte overView45 = pdfStamper.getUnderContent(1);
        overView45.beginText();
        overView45.setFontAndSize(myFont,6);
        overView45.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 687,107,0);
        overView45.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 687,95,0);
        overView45.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 687,84,0);
        overView45.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 687,72,0);
        overView45.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 687,60,0);
        overView45.endText();

        PdfContentByte overView46 = pdfStamper.getUnderContent(1);
        overView46.beginText();
        overView46.setFontAndSize(myFont,6);
        overView46.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 701,107,0);
        overView46.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 701,95,0);
        overView46.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 701,84,0);
        overView46.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 701,72,0);
        overView46.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 701,60,0);
        overView46.endText();

        PdfContentByte overView47 = pdfStamper.getUnderContent(1);
        overView47.beginText();
        overView47.setFontAndSize(myFont,6);
        overView47.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 715,107,0);
        overView47.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 715,95,0);
        overView47.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 715,84,0);
        overView47.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 715,72,0);
        overView47.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 715,60,0);
        overView47.endText();

        PdfContentByte overView48 = pdfStamper.getUnderContent(1);
        overView48.beginText();
        overView48.setFontAndSize(myFont,6);
        overView48.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 730,107,0);
        overView48.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 730,95,0);
        overView48.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 730,84,0);
        overView48.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 730,72,0);
        overView48.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 730,60,0);
        overView48.endText();

        PdfContentByte overView49 = pdfStamper.getUnderContent(1);
        overView49.beginText();
        overView49.setFontAndSize(myFont,6);
        overView49.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 744,107,0);
        overView49.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 744,95,0);
        overView49.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 744,84,0);
        overView49.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 744,72,0);
        overView49.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 744,60,0);
        overView49.endText();

        PdfContentByte overView50 = pdfStamper.getUnderContent(1);
        overView50.beginText();
        overView50.setFontAndSize(myFont,6);
        overView50.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 759,107,0);
        overView50.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 759,95,0);
        overView50.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 759,84,0);
        overView50.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 759,72,0);
        overView50.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 759,60,0);
        overView50.endText();

        PdfContentByte officials = pdfStamper.getOverContent(1);
        officials.beginText();
        officials.setFontAndSize(myFont,12);
        officials.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 170,25,0);
        officials.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 395,25,0);
        officials.showTextAligned(PdfContentByte.ALIGN_CENTER, "TBD", 645,25,0);
        officials.endText();

        try {
            pdfStamper.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pdfReader.close();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(getActivity(), "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
}





