package com.example.pc.memory_test;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class Single_Medium_Activity extends AppCompatActivity {

    TextView tv_p1,tv_countdown;
    String language="";
    String username="";
    String playerPointsBegginer="";
    Integer scoreMedium;

    ImageView iv_11,iv_12,iv_13,iv_14,iv_15
            ,iv_21,iv_22,iv_23,iv_24,iv_25
            ,iv_31,iv_32,iv_33,iv_34,iv_35
            ,iv_41,iv_42,iv_43,iv_44,iv_45;
    Boolean check11=false;
    Boolean check12=false;
    Boolean check13=false;
    Boolean check14=false;
    Boolean check15=false;
    Boolean check21=false;
    Boolean check22=false;
    Boolean check23=false;
    Boolean check24=false;
    Boolean check25=false;
    Boolean check31=false;
    Boolean check32=false;
    Boolean check33=false;
    Boolean check34=false;
    Boolean check35=false;
    Boolean check41=false;
    Boolean check42=false;
    Boolean check43=false;
    Boolean check44=false;
    Boolean check45=false;

    //array for images_begginer
    Integer[] cardsArray={101,102,103,104,105,106,107,108,109,110,201,202,203,204,205,206,207,208,209,210};
    //actual images_begginer
    int image101,image102,image103,image104,image105,image106,image107,image108,image109,image110,
            image201,image202,image203,image204,image205,image206,image207,image208,image209,image210;

    int firstCard,secondCard;
    int clickedFirst,clickedSecond;

    int cardNumber=1;
    int turn= 1;
    Integer playerPoints=0;


    String time="";
    CountDownTimer cdTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single__medium_layout);

        tv_p1=(TextView)findViewById(R.id.tv_p1);
        tv_countdown=(TextView)findViewById(R.id.tv_countDown);

        final Intent objIntent=getIntent();
        language=objIntent.getStringExtra("language");
        username=objIntent.getStringExtra("username");
        playerPointsBegginer=objIntent.getStringExtra("playerPointsBegginer");


        iv_11=(ImageView)findViewById(R.id.iv_11);
        iv_12=(ImageView)findViewById(R.id.iv_12);
        iv_13=(ImageView)findViewById(R.id.iv_13);
        iv_14=(ImageView)findViewById(R.id.iv_14);
        iv_15=(ImageView)findViewById(R.id.iv_15);

        iv_21=(ImageView)findViewById(R.id.iv_21);
        iv_22=(ImageView)findViewById(R.id.iv_22);
        iv_23=(ImageView)findViewById(R.id.iv_23);
        iv_24=(ImageView)findViewById(R.id.iv_24);
        iv_25=(ImageView)findViewById(R.id.iv_25);

        iv_31=(ImageView)findViewById(R.id.iv_31);
        iv_32=(ImageView)findViewById(R.id.iv_32);
        iv_33=(ImageView)findViewById(R.id.iv_33);
        iv_34=(ImageView)findViewById(R.id.iv_34);
        iv_35=(ImageView)findViewById(R.id.iv_35);

        iv_41=(ImageView)findViewById(R.id.iv_41);
        iv_42=(ImageView)findViewById(R.id.iv_42);
        iv_43=(ImageView)findViewById(R.id.iv_43);
        iv_44=(ImageView)findViewById(R.id.iv_44);
        iv_45=(ImageView)findViewById(R.id.iv_45);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");

        iv_21.setTag("5");
        iv_22.setTag("6");
        iv_23.setTag("7");
        iv_24.setTag("8");
        iv_25.setTag("9");

        iv_31.setTag("10");
        iv_32.setTag("11");
        iv_33.setTag("12");
        iv_34.setTag("13");
        iv_35.setTag("14");

        iv_41.setTag("15");
        iv_42.setTag("16");
        iv_43.setTag("17");
        iv_44.setTag("18");
        iv_45.setTag("19");

        //load the card Images
        frontofCardResources();

        //shuffle the images_begginer
        Collections.shuffle(Arrays.asList(cardsArray));


        iv_11.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_11,theCard);
                check11 =true;
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_12,theCard);
                check12=true;
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_13,theCard);
                check13=true;
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_14,theCard);
                check14=true;
            }
        });
        iv_15.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_15,theCard);
                check15=true;
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_21,theCard);
                check21=true;
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_22,theCard);
                check22=true;
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_23,theCard);
                check23=true;
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_24,theCard);
                check24=true;
            }
        });
        iv_25.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_25,theCard);
                check25=true;
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_31,theCard);
                check31=true;
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_32,theCard);
                check32=true;
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {

                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_33,theCard);
                check33=true;
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {

                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_34,theCard);
                check34=true;
            }
        });
        iv_35.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_35,theCard);
                check35=true;
            }
        });
        iv_41.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_41,theCard);
                check41=true;
            }
        });
        iv_42.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_42,theCard);
                check42=true;
            }
        });
        iv_43.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {

                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_43,theCard);
                check43=true;
            }
        });
        iv_44.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {

                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_44,theCard);
                check44=true;
            }
        });
        iv_45.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(final View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                rotation3D(iv_45,theCard);
                check45=true;
            }
        });
        countDown();
    }

    private void countDown()
    {
        cdTimer=new CountDownTimer(120000,1000) {
            @Override
            public void onTick(final long millisUntilFinished) {
                time=String.valueOf(millisUntilFinished/1000);
                tv_countdown.setText(time);
                if (time.equals("15"))
                {
                    tv_countdown.setBackgroundDrawable(getResources().getDrawable(R.color.red));
                }
            }

            @Override
            public void onFinish() {
                tv_countdown.setText("0");
                dialog();
            }
        };
        cdTimer.start();

    }

    private void databaseInsert()
    {
        SQLiteDatabase objDB=(new Database(getApplicationContext())).getReadableDatabase();
        ContentValues objValue=new ContentValues();
        objValue.put("Username",username);
        objValue.put("Score",scoreMedium);
        long shto=objDB.insert("tblScore",null,objValue);
        if (shto>0)
        {
            if (language.equals("albanian")) {
                Toast.makeText(getApplicationContext(), "Te dhenat u insertuan", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(), "The data is inserted", Toast.LENGTH_LONG).show();
            }
        }
        objDB.close();
    }

    private void dialog()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(Single_Medium_Activity.this,R.style.MyAlertDialogStyle);
        if (language.equals("albanian"))
        {

            if (playerPointsBegginer != null && !playerPointsBegginer.isEmpty()) {
                scoreMedium = playerPoints + Integer.parseInt(playerPointsBegginer);
            }
            else {
                scoreMedium = playerPoints;
            }
            alertDialogBuilder.setTitle("Loja perfundoj");
            alertDialogBuilder.setMessage("\nPIKET : " +scoreMedium ).setCancelable(false)
                    .setPositiveButton("LOJE E RE", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            databaseInsert();
                            Intent intent = new Intent(getApplicationContext(), Single_Medium_Activity.class);
                            intent.putExtra("language",language);
                            intent.putExtra("username",username);
                            startActivity(intent);
                            finish();
                        }
                    }).setNegativeButton("DIL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    databaseInsert();
                    finish();
                    ;
                }
            });
            if (!time.equals("1")) {
                alertDialogBuilder.setNeutralButton("Niveli i Veshtire", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        Integer scoreMedium;
                        if (playerPointsBegginer != null && !playerPointsBegginer.isEmpty()) {
                            scoreMedium = playerPoints + Integer.parseInt(playerPointsBegginer);
                        } else {
                            scoreMedium = playerPoints;
                        }
                        String playerPointsMedium = Integer.toString(scoreMedium);
                        Intent intent = new Intent(getApplicationContext(), Single_Hard_Activity.class);
                        intent.putExtra("playerPointsMedium", playerPointsMedium);
                        intent.putExtra("language", language);
                        intent.putExtra("username", username);
                        playerPoints = 0;
                        startActivity(intent);
                        finish();

                    }
                });
            }

        }
        else {
            if (playerPointsBegginer != null && !playerPointsBegginer.isEmpty()) {
                 scoreMedium = playerPoints + Integer.parseInt(playerPointsBegginer);
            }
            else {
                scoreMedium = playerPoints;
            }
            alertDialogBuilder.setTitle("Game Over");
            alertDialogBuilder.setMessage("\nPOINTS: " + scoreMedium).setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            databaseInsert();
                            Intent intent = new Intent(getApplicationContext(), Single_Medium_Activity.class);
                            intent.putExtra("language",language);
                            intent.putExtra("username",username);
                            startActivity(intent);
                            finish();
                        }
                    }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    databaseInsert();
                    finish();
                    ;
                }
            });
            if (!time.equals("1")) {
                alertDialogBuilder.setNeutralButton("Hard Level", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        Integer scoreMedium;
                        if (playerPointsBegginer != null && !playerPointsBegginer.isEmpty()) {
                            scoreMedium = playerPoints + Integer.parseInt(playerPointsBegginer);
                        } else {
                            scoreMedium = playerPoints;
                        }
                        String playerPointsMedium = Integer.toString(scoreMedium);
                        Intent intent = new Intent(getApplicationContext(), Single_Hard_Activity.class);
                        intent.putExtra("playerPointsMedium", playerPointsMedium);
                        intent.putExtra("language", language);
                        intent.putExtra("username", username);
                        playerPoints = 0;
                        startActivity(intent);
                        finish();

                    }
                });
            }
        }
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

    private void doStuff(final ImageView iv, int card)
    {
        //set the correct image to the imageview
        if (cardsArray[card]==101)
        {
            iv.setImageResource(image101);
        }
        else if (cardsArray[card]==102)
        {
            iv.setImageResource(image102);
        }
        else if (cardsArray[card]==103)
        {
            iv.setImageResource(image103);
        }
        else if (cardsArray[card]==104)
        {
            iv.setImageResource(image104);
        }
        else if (cardsArray[card]==105)
        {
            iv.setImageResource(image105);
        }
        else if (cardsArray[card]==106)
        {
            iv.setImageResource(image106);
        }
        else if (cardsArray[card]==107)
        {
            iv.setImageResource(image107);
        }
        else if (cardsArray[card]==108)
        {
            iv.setImageResource(image108);
        }
        else if (cardsArray[card]==109)
        {
            iv.setImageResource(image109);
        }
        else if (cardsArray[card]==110)
        {
            iv.setImageResource(image110);
        }
        else if (cardsArray[card]==201)
        {
            iv.setImageResource(image201);
        }
        else if (cardsArray[card]==202)
        {
            iv.setImageResource(image202);
        }
        else if (cardsArray[card]==203)
        {
            iv.setImageResource(image203);
        }
        else if (cardsArray[card]==204)
        {
            iv.setImageResource(image204);
        }
        else if (cardsArray[card]==205)
        {
            iv.setImageResource(image205);
        }
        else if (cardsArray[card]==206)
        {
            iv.setImageResource(image206);
        }
        else if (cardsArray[card]==207)
        {
            iv.setImageResource(image207);
        }
        else if (cardsArray[card]==208)
        {
            iv.setImageResource(image208);
        }
        else if (cardsArray[card]==209)
        {
            iv.setImageResource(image209);
        }
        else if (cardsArray[card]==210)
        {
            iv.setImageResource(image210);
        }

        //check which image is selected and save it to temporary variable
        if (cardNumber==1){

            firstCard=cardsArray[card];
            if (firstCard>200){
                firstCard=firstCard-100;
            }
            cardNumber=2;
            clickedFirst=card;
            iv.setEnabled(false);
        }else if (cardNumber==2){
            secondCard=cardsArray[card];

            secondCard=cardsArray[card];
            if (secondCard>200){
                secondCard=secondCard-100;
            }
            cardNumber=1;
            clickedSecond=card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_25.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_35.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);
            iv_45.setEnabled(false);

            android.os.Handler handler=new android.os.Handler();
            handler.postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
                @Override
                public void run() {
                    //check if selected images_begginer are equal
                    calculate();
                }
            },1000);


        }
    }
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    private  void calculate(){
        if (firstCard==secondCard)
        {
            //if images are equal remove them and add point
            if (clickedFirst==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==4) {
                iv_15.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==5){
                iv_21.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==6){
                iv_22.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==7){
                iv_23.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==8){
                iv_24.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==9) {
                iv_25.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==10){
                iv_31.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==11){
                iv_32.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==12){
                iv_33.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==13){
                iv_34.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==14) {
                iv_35.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==15){
                iv_41.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==16){
                iv_42.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==17){
                iv_43.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==18){
                iv_44.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==19) {
                iv_45.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==4) {
                iv_15.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==5){
                iv_21.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==6){
                iv_22.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==7){
                iv_23.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==8){
                iv_24.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==9) {
                iv_25.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==10){
                iv_31.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==11){
                iv_32.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==12){
                iv_33.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==13){
                iv_34.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==14) {
                iv_35.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==15){
                iv_41.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==16){
                iv_42.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==17){
                iv_43.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==18){
                iv_44.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==19) {
                iv_45.setVisibility(View.INVISIBLE);
            }

            if ( turn==1  ){
                playerPoints=playerPoints+10;
                tv_p1.setText("" + playerPoints);
            }
        }
        else{
            if (check11==true)
            {
                rotation3DRevers(iv_11);
                check11=false;
            }
            if (check12==true)
            {
                rotation3DRevers(iv_12);
                check12=false;
            }
            if (check13==true)
            {
                rotation3DRevers(iv_13);
                check13=false;
            }
            if (check14==true)
            {
                rotation3DRevers(iv_14);
                check14=false;
            }
            if (check15==true)
            {
                rotation3DRevers(iv_15);
                check15=false;
            }
            if (check21==true)
            {
                rotation3DRevers(iv_21);
                check21=false;
            }
            if (check22==true)
            {
                rotation3DRevers(iv_22);
                check22=false;
            }
            if (check23==true)
            {
                rotation3DRevers(iv_23);
                check23=false;
            }
            if (check24==true)
            {
                rotation3DRevers(iv_24);
                check24=false;
            }
            if (check25==true)
            {
                rotation3DRevers(iv_25);
                check25=false;
            }
            if (check31==true)
            {
                rotation3DRevers(iv_31);
                check31=false;
            }
            if (check32==true)
            {
                rotation3DRevers(iv_32);
                check32=false;
            }
            if (check33==true)
            {
                rotation3DRevers(iv_33);
                check33=false;
            }
            if (check34==true)
            {
                rotation3DRevers(iv_34);
                check34=false;
            }
            if (check35==true)
            {
                rotation3DRevers(iv_35);
                check35=false;
            }
            if (check41==true)
            {
                rotation3DRevers(iv_41);
                check41=false;
            }
            if (check42==true)
            {
                rotation3DRevers(iv_42);
                check42=false;
            }
            if (check43==true)
            {
                rotation3DRevers(iv_43);
                check43=false;
            }
            if (check44==true)
            {
                rotation3DRevers(iv_44);
                check44=false;
            }
            if (check45==true)
            {
                rotation3DRevers(iv_45);
                check45=false;
            }

        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);

        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_25.setEnabled(true);

        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_35.setEnabled(true);

        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);
        iv_45.setEnabled(true);
        //check if the game is end

        checkEnd();
    }
    private void checkEnd(){
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_15.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_25.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE &&
                iv_35.getVisibility() == View.INVISIBLE &&
                iv_41.getVisibility() == View.INVISIBLE &&
                iv_42.getVisibility() == View.INVISIBLE &&
                iv_43.getVisibility() == View.INVISIBLE &&
                iv_44.getVisibility() == View.INVISIBLE &&
                iv_45.getVisibility() == View.INVISIBLE
                )

        {
            playerPoints=playerPoints+Integer.parseInt(time);
            cdTimer.cancel();
            dialog();
        }
    }



    private void frontofCardResources(){

        image101=R.drawable.ic_medium_image101;
        image102=R.drawable.ic_medium_image102;
        image103=R.drawable.ic_medium_image103;
        image104=R.drawable.ic_medium_image104;
        image105=R.drawable.ic_medium_image105;
        image106=R.drawable.ic_medium_image106;
        image107=R.drawable.ic_medium_image107;
        image108=R.drawable.ic_medium_image108;
        image109=R.drawable.ic_medium_image109;
        image110=R.drawable.ic_medium_image110;

        image201=R.drawable.ic_medium_image201;
        image202=R.drawable.ic_medium_image202;
        image203=R.drawable.ic_medium_image203;
        image204=R.drawable.ic_medium_image204;
        image205=R.drawable.ic_medium_image205;
        image206=R.drawable.ic_medium_image206;
        image207=R.drawable.ic_medium_image207;
        image208=R.drawable.ic_medium_image208;
        image209=R.drawable.ic_medium_image209;
        image210=R.drawable.ic_medium_image210;
    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    private void rotation3D(final View v , final int theCard)
    {
        AnimatorSet objAnimator=(AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.rotate_img);
        objAnimator.setTarget(v);
        objAnimator.setDuration(400);
        objAnimator.start();

        final AnimatorSet objAnimator2= (AnimatorSet) AnimatorInflater.loadAnimator(Single_Medium_Activity.this,R.animator.rotate_img2);
        objAnimator2.setTarget(v);
        objAnimator2.setDuration(400);

        objAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

                doStuff((ImageView) v,theCard);
                objAnimator2.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }


    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    private void rotation3DRevers(final ImageView v) {
        AnimatorSet objAnimator = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.rotate_img);
        objAnimator.setTarget(v);
        objAnimator.setDuration(400);
        objAnimator.start();

        final AnimatorSet objAnimator2 = (AnimatorSet) AnimatorInflater.loadAnimator(Single_Medium_Activity.this, R.animator.rotate_img2);
        objAnimator2.setTarget(v);
        objAnimator2.setDuration(400);

        objAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

                v.setImageResource(R.drawable.card);
                objAnimator2.start();

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}
