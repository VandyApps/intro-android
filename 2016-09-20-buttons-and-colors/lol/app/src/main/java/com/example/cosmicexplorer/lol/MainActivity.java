package com.example.cosmicexplorer.lol;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {
    LinearLayout linLayout;
    EditText edit;

    Map<String, Integer> colors = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linLayout = (LinearLayout) findViewById(R.id.layout1);
        edit = (EditText) findViewById(R.id.edittextOOPS);
        colors.put("red", Color.rgb(255, 0, 0));
        colors.put("green", Color.rgb(0, 255, 0));
        colors.put("blue", Color.rgb(0, 0, 255));
        colors.put("white", Color.rgb(255, 255, 255));
    }

    public void handleClickLOL(View view) {
        Log.d("sup", "dddd");
        String text = edit.getText().toString().toLowerCase();
        Log.d(text, "TEXT FROM EDITTEXT");
        Integer result = colors.get(text);
        if (result != null) {
            linLayout.setBackgroundColor(result);
        } else {
            Log.d("was null!", "!!!");
        }
    }
}
