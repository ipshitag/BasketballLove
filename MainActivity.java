package com.example.ipshita.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int teamA = 0;
    int teamB = 0;

    public void plus2A(View view)
    {
        TextView TeamA = (TextView) findViewById(R.id.TeamA);
        teamA += 2;
        TeamA.setText("" + teamA);
    }

    public void plus3A(View view)
    {
        TextView TeamA = (TextView) findViewById(R.id.TeamA);
        teamA += 3;
        TeamA.setText("" + teamA);
    }

    public void plus1A(View view)
    {
        TextView TeamA = (TextView) findViewById(R.id.TeamA);
        teamA += 1;
        TeamA.setText("" + teamA);
    }

    public void showToast()
    {
        if(teamA>teamB)
        {
            Toast toast1 = Toast.makeText(this, "Team A wins!!", Toast.LENGTH_SHORT);
            toast1.show();
            return;
        }
        else if(teamB>teamA)
        {
            Toast toast2 = Toast.makeText(this, "Team B wins!!", Toast.LENGTH_SHORT);
            toast2.show();
            return;
        }
        else if(teamA==teamB)
        {
            Toast toast3 = Toast.makeText(this, "DRAW!!", Toast.LENGTH_SHORT);
            toast3.show();
            return;
        }
    }


    public void plus2B(View view)
    {
        TextView TeamB = (TextView) findViewById(R.id.TeamB);
        teamB += 2;
        TeamB.setText("" + teamB);
    }

    public void plus3B(View view)
    {
        TextView TeamB = (TextView) findViewById(R.id.TeamB);
        teamB += 3;
        TeamB.setText("" + teamB);
    }

    public void plus1B(View view)
    {
        TextView TeamB = (TextView) findViewById(R.id.TeamB);
        teamB += 1;
        TeamB.setText("" + teamB);
    }

    public void reset(View view)
    {
        showToast();
        TextView TeamB = (TextView) findViewById(R.id.TeamB);
        teamB = 0;
        TeamB.setText("" + teamB);
        TextView TeamA = (TextView) findViewById(R.id.TeamA);
        teamA = 0;
        TeamA.setText("" + teamA);
    }

}
