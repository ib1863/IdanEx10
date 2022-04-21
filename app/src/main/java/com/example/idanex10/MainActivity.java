package com.example.idanex10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioGroup rG;
    int x;
    RadioButton rB1;
    RadioButton rB2;
    RadioButton rB3;
    RadioButton rB4;
    Switch swCh;
    ConstraintLayout cL;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cL = (ConstraintLayout) findViewById(R.id.clVar1);
        rG = (RadioGroup) findViewById(R.id.radioGroup);
        x = rG.getCheckedRadioButtonId();
        btn = (Button) findViewById(R.id.button);
        rB1 = (RadioButton) findViewById(R.id.rb1);
        rB2 = (RadioButton) findViewById(R.id.rb2);
        rB3 = (RadioButton) findViewById(R.id.rb3);
        rB4 = (RadioButton) findViewById(R.id.rb4);
        swCh = (Switch) findViewById(R.id.switch1);




    }
    public void ClickedBtn(View view) {
        if(swCh.isChecked()) {
            if (rB1.isChecked()) {
                cL.setBackgroundColor(Color.GREEN);
            } else if (rB2.isChecked()) {
                cL.setBackgroundColor(Color.BLUE);
            } else if (rB3.isChecked()) {
                cL.setBackgroundColor(Color.BLACK);
            } else {
                cL.setBackgroundColor(Color.YELLOW);
            }
        }
    }

    public void Blue(View view) {
        if(swCh.isChecked() == false) {
            cL.setBackgroundColor(Color.BLUE);
        }
    }

    public void Green(View view) {
        if(swCh.isChecked() == false) {
            cL.setBackgroundColor(Color.GREEN);
        }
    }

    public void Black(View view) {
        if(swCh.isChecked() == false) {
            cL.setBackgroundColor(Color.BLACK);
        }
    }

    public void Yellow(View view) {
        if(swCh.isChecked() == false) {
            cL.setBackgroundColor(Color.YELLOW);
        }
    }
}