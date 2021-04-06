package com.thebluesquid.projectladybug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void textView1Click_act6(View view){
        Intent intentAct = new Intent(this, MainActivity8.class);
        startActivity(intentAct);
    }

    public void textView2Click_act6(View view){

        Intent intentAct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stopaapihate.org/safety-tips/"));
        startActivity(intentAct);

    }

}