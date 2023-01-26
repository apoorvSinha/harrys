package com.example.harrys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTexts);

        button.setOnClickListener(v -> {
//            Toast.makeText(MainActivity.this, "Hi Click listener worked", Toast.LENGTH_SHORT).show();
            calculate();
        });

    }

    public void calculate(){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = kg * 2.205;
        textView.setText("The corresponding value in pound is "+ Math.round(pound));
    }
}