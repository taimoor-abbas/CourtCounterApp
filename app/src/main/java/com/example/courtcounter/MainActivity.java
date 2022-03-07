package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int add=0;
    int addB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Teama(int add)
    {
        TextView sumofall=(TextView) findViewById(R.id.Teama);
        sumofall.setText(String.valueOf(add));

    }
    public void ThreeA(View view)
    {
        add=add+3;
        Teama(add);

    }public void TwoA(View view)
    {
        add=add+2;
        Teama(add);


    }public void OneA(View view)
    {
        add=add+1;
        Teama(add);

    }
    public void Teamb(int addB)
    {
        TextView sumofall=(TextView) findViewById(R.id.Teamb);
        sumofall.setText(String.valueOf(addB));

    }
    public void ThreeB(View v)
    {
        addB=addB+3;
        Teamb(addB);

    }public void TwoB(View v)
    {
        addB=addB+2;
        Teamb(addB);


    }public void OneB(View v)
    {
        addB=addB+1;
        Teamb(addB);

    }
    public void Reset(View v)
    {
add=0;
addB=0;
       Teamb(0);
       Teama(0);
    }



}