package com.example.android.quizproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    String name = "";
    boolean question1;
    boolean question2;
    boolean question3;
    boolean question4;
    boolean question5;
    boolean question6;
    boolean question7;
    boolean question8;
    boolean question9;
    boolean question10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nameInput(View view) {

        EditText inputName = (EditText) findViewById(R.id.name_field);
        name = inputName.getText().toString().trim();
    }

    public void questionOne(View view) {
        RadioButton secondRadioButton = (RadioButton) findViewById(R.id.Q1A1);
        question1 = secondRadioButton.isChecked();
    }

    public void questionTwo(View view) {
        RadioButton secondRadioButton = (RadioButton) findViewById(R.id.Q2A2);
        question2 = secondRadioButton.isChecked();
    }

    public void questionThree(View view) {

        CheckBox hobgoblinCheckBox = (CheckBox) findViewById(R.id.hobgoblin);
        boolean hobgoblinChecked = hobgoblinCheckBox.isChecked();

        CheckBox jokerCheckBox = (CheckBox) findViewById(R.id.joker);
        boolean jokerChecked = jokerCheckBox.isChecked();

        question3 = (hobgoblinChecked && jokerChecked);
    }

    public void questionFour(View view) {
        RadioButton nixonRadioButton = (RadioButton) findViewById(R.id.nixon);
        question4 = nixonRadioButton.isChecked();
    }

    public void questionFive(View view) {
        RadioButton roentgenRadioButton = (RadioButton) findViewById(R.id.roentgen);
        question5 = roentgenRadioButton.isChecked();
    }

    public void questionSix(View view) {

        CheckBox denmarkCheckBox = (CheckBox) findViewById(R.id.denmark);
        boolean denmarkChecked = denmarkCheckBox.isChecked();

        CheckBox atlantaCheckBox = (CheckBox) findViewById(R.id.atlanta);
        boolean atlantaChecked = atlantaCheckBox.isChecked();

        CheckBox montrealCheckBox = (CheckBox) findViewById(R.id.montreal);
        boolean montrealChecked = montrealCheckBox.isChecked();

        question6 = (denmarkChecked && atlantaChecked && montrealChecked);
    }

    public void questionSeven(View view) {
        RadioButton gorbachevRadioButton = (RadioButton) findViewById(R.id.gorbachev);
        question7 = gorbachevRadioButton.isChecked();
    }

    public void questionEight(View view) {
        RadioButton backrubRadioButton = (RadioButton) findViewById(R.id.backrub);
        question8 = backrubRadioButton.isChecked();
    }

    public void questionNine(View view) {
        RadioButton quantumRadioButton = (RadioButton) findViewById(R.id.quantum);
        question9 = quantumRadioButton.isChecked();
    }

    public void questionTen(View view) {
        RadioButton wiisportsRadioButton = (RadioButton) findViewById(R.id.wiisports);
        question10 = wiisportsRadioButton.isChecked();
    }

    public void calculateScore(View view) {
        nameInput(view);
        questionOne(view);
        questionTwo(view);
        questionThree(view);
        questionFour(view);
        questionFive(view);
        questionSix(view);
        questionSeven(view);
        questionEight(view);
        questionNine(view);
        questionTen(view);

        if (question1) {
            score++;
        }

        if (question2) {
            score++;
        }
        if (question3) {
            score++;
        }
        if (question4) {
            score++;
        }
        if (question5) {
            score++;
        }
        if (question6) {
            score++;
        }
        if (question7) {
            score++;
        }
        if (question8) {
            score++;
        }
        if (question9) {
            score++;
        }
        if (question10) {
            score++;
        }

        String result = getString(R.string.format_result_message, name, score, 10);
        displayResult(result);
    }

    public void displayResult(String message) {
        TextView result = (TextView) findViewById(R.id.result);
        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();
    }

}