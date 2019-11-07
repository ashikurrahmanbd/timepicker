package com.example.timepicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Button button;
    TimePicker timePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);
        textView = (TextView) findViewById(R.id.texViewId);
        timePicker = (TimePicker) findViewById(R.id.timePickerId);

        timePicker.setIs24HourView(false);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String time = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    time = timePicker.getHour() + ":" + timePicker.getMinute() ;
                }
                textView.setText(time);

            }
        });


    }
}
