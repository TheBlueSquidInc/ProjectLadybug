package com.thebluesquid.projectladybug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void textView1Click(View view){

        Intent intentAct = new Intent(this, MainActivity3.class);
        startActivity(intentAct);

    }

    public void textView1Click1(View view){

        Intent intentAct1 = new Intent(this, MainActivity4.class);
        startActivity(intentAct1);
    }


    public void textView1Click2(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stopaapihate.org/reportincident/"));
        startActivity(browserIntent);

    }


}