package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn;
        btn = (Button) findViewById(R.id.btnCalculate);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // Log.e("Hello Calculator","hello calculator app this is wednesday.");



                EditText t1,t2,t3;
                t1 = (EditText)findViewById(R.id.no1);
                t2 = (EditText)findViewById(R.id.no2);
                t3 = (EditText)findViewById(R.id.no3);


                int result = Integer.parseInt(t1.getText().toString()) +  Integer.parseInt(t2.getText().toString());

                Log.e("Result ","Summation result :"+ result);

                t3.setText(String.valueOf(result));

                Toast toast=Toast.makeText(getApplicationContext(),"Result : " + result,Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }
}
