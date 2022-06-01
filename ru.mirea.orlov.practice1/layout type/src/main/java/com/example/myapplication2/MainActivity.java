package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv0ut;
    private Button buttonOk;
    private Button  buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_cancel);
        tv0ut = (TextView) findViewById(R.id.tv0ut);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);
        View.OnClickListener buttonOkListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv0ut.setText("Нажата кнопка ОК");
            }
        };
        buttonOk.setOnClickListener(buttonOkListener);
        View.OnClickListener buttonCancelListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        };
        buttonCancel.setOnClickListener(buttonCancelListener);

    }

}