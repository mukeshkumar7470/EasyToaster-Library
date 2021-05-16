package com.mukeshkpdeveloper.easytoasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mukeshkpdeveloper.easytoasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowMsg = findViewById(R.id.msgShowBtn);

        btnShowMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToasterMessage.s(MainActivity.this, "Thanks for Click here");
            }
        });



    }
}