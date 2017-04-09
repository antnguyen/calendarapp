package com.example.calendar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Important_calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Important_calendar = (Button)findViewById(R.id.button);

        Important_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //will read text from document and store into Google Calendar

            }
        });
    }

}
