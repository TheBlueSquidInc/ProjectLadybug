package com.thebluesquid.projectladybug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    public void textView1Click_act4(View view){
        Intent intentAct = new Intent(this, MainActivity5.class);
        startActivity(intentAct);
    }

    public void textView2Click_act4(View view){
        Intent intentAct = new Intent(this, MainActivity6.class);
        startActivity(intentAct);
    }

    public void textView3Click_act4(View view){

        Intent intentAct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.advancingjustice-chicago.org/what-we-do/bystander-intervention-trainings/"));
        startActivity(intentAct);

    }

}