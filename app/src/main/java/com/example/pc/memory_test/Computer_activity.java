package com.example.pc.memory_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Computer_activity extends AppCompatActivity {

    Button btnBabyBot,btnExpertBot;
    String language="";
    String username="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.computer_layout);

        btnBabyBot=(Button)findViewById(R.id.btnBabyBot);
        btnExpertBot=(Button)findViewById(R.id.btnExpertBot);

        Intent objIntent=getIntent();
        language=objIntent.getStringExtra("language");
        username=objIntent.getStringExtra("username");

        if (language.equals("albanian"))
        {
            btnBabyBot.setText("KOMPJUTERI ENIAC");
            btnExpertBot.setText("SUPER KOMPJUTER");
        }
        else
        {
            btnBabyBot.setText("ENIAC COMPUTER");
            btnExpertBot.setText("SUPER COMPUTER");
        }

        btnBabyBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent=new Intent(getApplicationContext(),YouVsComputerBaby_Activity.class);
                objIntent.putExtra("language",language);
                objIntent.putExtra("username",username);
                startActivity(objIntent);
            }
        });

        btnExpertBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent=new Intent(getApplicationContext(),YouVsComputer_Activity.class);
                objIntent.putExtra("language",language);
                objIntent.putExtra("username",username);
                startActivity(objIntent);
            }
        });


    }
}
