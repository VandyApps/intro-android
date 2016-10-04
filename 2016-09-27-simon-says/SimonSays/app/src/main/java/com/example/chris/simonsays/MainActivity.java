package com.example.chris.simonsays;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // these are the buttons we will use
    // notice that we are declaring them as global variables so that all our
    // methods have access to them
    Button red;
    Button blue;
    Button green;
    Button yellow;

    // our textView to diplay time
    TextView time;

    // initializing our countdown timer
    CountDownTimer timer;

    // color choices
    Button[] colors = new Button[4];

    // the current correct button
    int currentColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize global variables
        red = (Button) findViewById(R.id.red);
        blue = (Button) findViewById(R.id.blue);
        green = (Button) findViewById(R.id.green);
        yellow = (Button) findViewById(R.id.yellow);

        // put buttons into array
        colors[0] = red;
        colors[1] = blue;
        colors[2] = green;
        colors[3] = yellow;

        // initialize time text field
        time = (TextView) findViewById(R.id.time);
        timer = new CountDownTimer(11000, 1000) {

            public void onTick(long millisUntilFinished) {
                String remaining = "Time remaining: " + millisUntilFinished / 1000;
                time.setText(remaining);
            }

            public void onFinish() {
                time.setText("ZERO");
                Toast.makeText(getApplicationContext(), "You Lose!", Toast.LENGTH_SHORT).show();
            }
        };
    }

    // onclick method that our buttons will trigger
    public void onButtonPressed(View view) {
        if (view.getId() == colors[currentColor].getId()) {
            Toast.makeText(getApplicationContext(), "Correct!!!", Toast.LENGTH_SHORT).show();
            chooseNextRandom();
        } else {
            timer.cancel();
            timer.onFinish();
            Toast.makeText(getApplicationContext(), "You Lose!", Toast.LENGTH_SHORT).show();
        }
    }

    // helper method that will choose the next button
    public void chooseNextRandom () {
        // choose a random number with the random class
        Random rand = new Random();
        currentColor = rand.nextInt(3);
        String color;
        // we need to tell the user which color we chose
        switch (currentColor) {
            case 0:
                color = "red";
                break;

            case 1:
                color = "blue";
                break;

            case 2:
                color = "green";
                break;
            case 3:
                color = "yellow";
            default:
                color = "red";
                break;
        }
        // create a popup saying color
        Toast.makeText(getApplicationContext(), color, Toast.LENGTH_LONG).show();
        // reset and start the clock
        timer.onTick(11000);
        timer.start();
    }

    // our method to play again, triggered by the "start new game" button
    public void playAgain(View view) {
        chooseNextRandom();
    }
}
