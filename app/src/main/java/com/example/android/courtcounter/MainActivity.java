package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_a = 0;
    int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void point3A(View view) {
        score_a += check() ? -3 : 3;
        if(score_a<0){score_a = 0;}
        display();
    }

    public void point3B(View view) {
        score_b += check() ? -3 : 3;
        if(score_b<0){score_b = 0;}
        display();
    }

    public void point2A(View view) {
        score_a += check() ? -2 : 2;
        if(score_a<0){score_a = 0;}
        display();
    }

    public void point2B(View view) {
        score_b += check() ? -2 : 2;
        if(score_b<0){score_b = 0;}
        display();
    }

    public void freeThrowA(View view) {
        score_a += check() ? -1 : 1;
        if(score_a<0){score_a = 0;}
        display();
    }

    public void freeThrowB(View view) {
        score_b += check() ? -1 : 1;
        if(score_b<0){score_b = 0;}
        display();
    }
    public void reset(View view) {
        score_a=0;
        score_b=0;
        display();
        if(check()) {
            toggler();
        }
    }

    private void toggler(){
        CheckBox checkBox = (CheckBox) findViewById(R.id.undo);
        checkBox.toggle();
    }

    private boolean check(){
        CheckBox checkBox = (CheckBox) findViewById(R.id.undo);
        return checkBox.isChecked();
    }

    private void display() {
        TextView a = (TextView) findViewById(R.id.team_points_a);
        a.setText(""+ score_a);
        TextView b = (TextView) findViewById(R.id.team_points_b);
        b.setText(""+ score_b);
    }
}
