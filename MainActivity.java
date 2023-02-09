package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private Button btnCheckTicket;
    private EditText ticketNumberIn;


    private Algorithm algorithm = new Algorithm();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        btnCheckTicket = findViewById(R.id.btnCheckTicket);
        ticketNumberIn = findViewById(R.id.ticketNumberIn);

        btnCheckTicket.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String number = ticketNumberIn.getText().toString();
            if (algorithm.isHappyTicket(number)) {
                txtResult.setText("Это число счастливое");
            } else {
                int newHappyNumber = algorithm.nextHappyInt(number);
                txtResult.setText("Новое счастливое число" + newHappyNumber);
            }
        }
    };
}