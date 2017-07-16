package com.example.pc.memory_test;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainOfMain_Activity extends AppCompatActivity {

    Button btnSingle,btnMulti,btnComputer,btnScore;
    ToggleButton toggleButton;
    String language="albanian";
    EditText edittext;
    String username="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_of_main_layout);

        btnSingle=(Button)findViewById(R.id.btnSingle);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnComputer=(Button)findViewById(R.id.btnComputer);
        btnScore=(Button)findViewById(R.id.btnScore);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggleButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.usaf));
                    btnSingle.setText("PLAY ALONE");
                    btnMulti.setText("PLAY WITH FRIEND");
                    btnComputer.setText("YOU VS COMPUTER");
                    btnScore.setText("SCORE");

                    language="english";
                }
                else {
                    toggleButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.albaniaf));
                    btnSingle.setText("LUAJ VETEM");
                    btnMulti.setText("LUAJ ME SHOKUN");
                    btnComputer.setText("TI VS KOMPJUTERI");
                    btnScore.setText("REZULTATET");
                    language="albanian";
                }
            }
        });


        btnSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent=new Intent(getApplicationContext(),Single_level_activity.class);
                objIntent.putExtra("language",language);
                objIntent.putExtra("username",username);
                startActivity(objIntent);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent=new Intent(getApplicationContext(),Multiplayer_Activity.class);
                objIntent.putExtra("language",language);
                objIntent.putExtra("username",username);
                startActivity(objIntent);
            }
        });

        btnComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent=new Intent(getApplicationContext(),Computer_activity.class);
                objIntent.putExtra("language",language);
                objIntent.putExtra("username",username);
                startActivity(objIntent);
            }
        });
        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent=new Intent(getApplicationContext(),aListaActivity.class);
                objIntent.putExtra("language",language);
                objIntent.putExtra("username",username);
                startActivity(objIntent);
            }
        });

        dialog();
    }
    private void dialog()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainOfMain_Activity.this,R.style.MyAlertDialogStyle);
        if (language.equals("albanian"))
        {
            edittext = new EditText(getApplicationContext());
            alertDialogBuilder.setTitle("Emri i lojtarit").setCancelable(false);

            alertDialogBuilder.setView(edittext);

            alertDialogBuilder.setPositiveButton("Regjistro", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    username = edittext.getText().toString();
                }
            });
        }
        else {
            edittext = new EditText(getApplicationContext());
            alertDialogBuilder.setTitle("Username");

            alertDialogBuilder.setView(edittext);

            alertDialogBuilder.setPositiveButton("Register", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    username = edittext.getText().toString();
                }
            });
        }
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
}
