package com.example.quickstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class report extends AppCompatActivity  {

    TextView attendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        attendance = (TextView) findViewById(R.id.textView);
        String value = attend.myclass();
        attendance.setText(value);


    }
}

class attend extends MainActivity {
    static String myclass() {

        String value = att.get(index);
        return value;

    }
}
