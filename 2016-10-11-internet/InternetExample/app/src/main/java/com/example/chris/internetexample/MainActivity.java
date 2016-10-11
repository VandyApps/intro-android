package com.example.chris.internetexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // this is our button that will open whatever url is in the edittext
    // we declare it as a global so that all our methods can see it
    Button button;

    // this is the edittext into which the user can enter the url
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // when our app is created, we want button and editText to be assigned
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit);
    }
    // this method will get called when our button is clicked because we assigned this method
    // to our button in our activity_main.xml file
    public void openUrl (View view) {
        // get the string from our editText field
        String strUrl = editText.getText().toString();
        // if the user mistakenly left out the https://, let's generously put it in for them
        if (!strUrl.toLowerCase().contains("http")) {
            strUrl = "http://" + strUrl;
        }
        // parse our string to as uri
        Uri url = Uri.parse(strUrl);
        // create an intent
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, url);
        // start Activity (launch the browser)
        try {
            startActivity(browserIntent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Please enter a valid url", Toast.LENGTH_SHORT).show();
        }
    }
}
