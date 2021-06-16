package com.tuhin.tasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
 Button buttonSA;
 Button buttonAL;
 Button buttonAA;

 Button buttonSub;
 Button buttonReset;

 TextView tvDisplay_first;
 TextView tvDisplay_second;
 TextView tvDisplay_third;

    int countSA;
    int countAL;
    int countAA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSA = findViewById(R.id.buttonSA);
        buttonAL = findViewById(R.id.buttonAL);
        buttonAA = findViewById(R.id.buttonAA);

//        buttonSub = findViewById(R.id.buttonSub);
        buttonReset= findViewById(R.id.buttonReset);

        tvDisplay_first = findViewById(R.id.tvDisplay_first);
        tvDisplay_second = findViewById(R.id.tvDisplay_second);
        tvDisplay_third = findViewById(R.id.tvDisplay_third);
//-------------------------------- Event Handler start-----------

        // সুবহানাল্লাহ button work start here
        buttonSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countSA = countSA+1;
                tvDisplay_first.setText(""+countSA);
            }
        });

        buttonAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countAL = countAL+1;
                tvDisplay_second.setText(""+countAL);
            }
        });

        buttonAA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countAA = countAA+1;
                tvDisplay_third.setText(""+countAA);
            }
        });








//        // Sub Button
//        buttonSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (count>0) {
//                    count--;
//                    tvDisplay_first.setText("" + count);
//                    tvDisplay_second.setText("" + count);
//                    tvDisplay_third.setText("" + count);
//                }
//                if (count<0){
//                    count=0;
//                    tvDisplay_first.setText( count);
//                    tvDisplay_second.setText(count);
//                    tvDisplay_third.setText(count);
//                }
//            }
//        });
        // Reset Button
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countSA=0;
                countAL=0;
                countAA=0;
                tvDisplay_first.setText(""+countSA);
                tvDisplay_second.setText(""+countAL);
                tvDisplay_third.setText(""+countAA);
            }
        });



    }
}