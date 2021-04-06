package com.thebluesquid.projectladybug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_num1 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button_num1 = (Button) findViewById(R.id.button);
    }


    public void openNewsLink(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stopaapihate.org/news/"));
        startActivity(browserIntent);
    }



    public  void startNextAct(View view){
        Intent nextActivity = new Intent(this, MainActivity2.class);
        startActivity(nextActivity);
    }

    public void openDonationLink(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gofundme.com/f/stopasianhate-toolkit-app?utm_source=customer&utm_medium=copy_link&utm_campaign=p_cf+share-flow-1"));
        startActivity(browserIntent);
    }


}