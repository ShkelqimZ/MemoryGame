package com.example.pc.memory_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Single_level_activity extends AppCompatActivity {

    Button btnBegginer,btnMedium,btnHard;
    String language="";
    String username="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_level_activity_layout);

        btnBegginer=(Button)findViewById(R.id.btnBegginer);
        btnMedium=(Button)findViewById(R.id.btnMedium);
        btnHard=(Button)findViewById(R.id.btnHard);

        Intent objIntent=getIntent();
        language=objIntent.getStringExtra("language");
        username=objIntent.getStringExtra("username");



        //Toast.makeText(getApplicationContext(),language,Toast.LENGTH_LONG).show();

        if (language.equals("albanian"))
        {
            btnBegginer.setText("FILLESTAR");
            btnMedium.setText("MESATARE");
            btnHard.setText("VESHTIRE");
        }
        else
        {
            btnBegginer.setText("BEGGINER");
            btnMedium.setText("MEDIUM");
            btnHard.setText("HARD");
        }

        btnBegginer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objRegjistroActivity=new Intent(getApplicationContext(),Single_Begginer_Activity.class);
                objRegjistroActivity.putExtra("language",language);
                objRegjistroActivity.putExtra("username",username);
                startActivity(objRegjistroActivity);
            }
        });

        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objRegjistroActivity=new Intent(getApplicationContext(),Single_Medium_Activity.class);
                objRegjistroActivity.putExtra("language",language);
                objRegjistroActivity.putExtra("username",username);
                startActivity(objRegjistroActivity);
            }
        });

        btnHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objRegjistroActivity=new Intent(getApplicationContext(),Single_Hard_Activity.class);
                objRegjistroActivity.putExtra("language",language);
                objRegjistroActivity.putExtra("username",username);
                startActivity(objRegjistroActivity);
            }
        });
    }
}
