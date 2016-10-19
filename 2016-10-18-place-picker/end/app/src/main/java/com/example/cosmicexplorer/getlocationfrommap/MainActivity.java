package com.example.cosmicexplorer.getlocationfrommap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.vision.text.Text;

public class MainActivity extends AppCompatActivity {

    static final int PLACE_PICKER_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPlacePicker(View view) {
        Log.d("PLACE PICKER", "FUNCTION CALLED");
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();
        try {
            startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST);
        } catch (GooglePlayServicesNotAvailableException|GooglePlayServicesRepairableException e) {
            Log.d("GOOGLE PLAY BROKEN", e.toString());
            Toast.makeText(this, "GOOGLE PLAY BROKEN: " + e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST) {
            Log.d("resultCode", new Integer(resultCode).toString());
            if (resultCode == RESULT_OK) {
                Place place = PlacePicker.getPlace(data, this);
                CharSequence placeName = place.getName() + "!!!";
                TextView locView = (TextView) findViewById(R.id.locText);
                locView.setText(placeName);
            } else {
                Toast.makeText(this, "FAILURE", Toast.LENGTH_SHORT).show();
            }
        }
        Log.d("received result", data.toString());
    }
}
