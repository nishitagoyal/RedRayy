package com.example.goyal.redrayy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BloodRequest(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void BMI(View view){
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void Bank(View view){
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public void CallRedCross(View view){
        Intent intent1 = new Intent();
        intent1.setAction(Intent.ACTION_DIAL);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT,"abcd");
        Uri uri = Uri.parse("tel:011 23716441");
        intent1.setData(uri);
        startActivity(intent1);
    }

}
