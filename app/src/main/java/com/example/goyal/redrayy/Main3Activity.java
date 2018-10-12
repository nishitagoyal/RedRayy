package com.example.goyal.redrayy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
 EditText textView1, textView2, textView3,editText;
 Button button;
 Double BMI;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        button= findViewById(R.id.button);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        editText = findViewById(R.id.finalans);




            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String heightStr = textView2.getText().toString();
                    String weightStr = textView3.getText().toString();
                    if (heightStr != null && !"".equals(heightStr)
                            && weightStr != null && !"".equals(weightStr)) {
                        float heightValue = Float.parseFloat(heightStr) / 100;
                        float weightValue = Float.parseFloat(weightStr);
                        float bmi = weightValue / (heightValue * heightValue);
                        displayBMI(bmi);
                    }
                }
            });

        }
    public void displayBMI(float bmi) {
        if (Float.compare(bmi, 15f) <= 0) {
            editText.setText("very_severely_underweight");
        } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
            editText.setText("severely_underweight");
        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            editText.setText("underweight");
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            editText.setText("normal");
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            editText.setText("overweight");
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            editText.setText("obesity_class_i");
        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
            editText.setText("obesity_class_ii");
        } else {
            editText.setText("obesity_class_iii");
        }


    }

}

