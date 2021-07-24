package com.example.question1b;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView counterTxt;
    private Button btnCounter;
    private int counter;

    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch(view.getId()){
                case R.id.btnCounter:
                    plusCounter();
            }
        }
    };

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTxt = (TextView) findViewById(R.id.counterTxt);
        btnCounter = (Button) findViewById(R.id.btnCounter);
        btnCounter.setOnClickListener(clickListener);

        initCounter();

    }

    private void initCounter(){
        counter = 0;
        counterTxt.setText(0 + "");
    }

    private void plusCounter(){
        counter++;
        counterTxt.setText(counter + "");
    }
}
