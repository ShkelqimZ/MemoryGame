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

public class Single_Begginer_Activity extends AppCompatActivity {

    TextView tv_p1,tv_countdown;
    String language="";
    String username="";
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34;
    Boolean check11=false;
    Boolean check12=false;
    Boolean check13=false;
    Boolean check14=false;
    Boolean check21=false;
    Boolean check22=false;
    Boolean check23=false;
    Boolean check24=false;
    Boolean check31=false;
    Boolean check32=false;
    Boolean check33=false;
    Boolean check34=false;

    Integer[] cardsArray={101,102,103,104,105,106,201,202,203,204,205,206};

    int image101,image102,image103,image104,image105,image106,
            image201,image202,image203,image204,image205,image206;

    int firstCard,secondCard;
    int clickedFirst,clickedSecond;

    int cardNumber=1;
    int turn= 1;
    int playerPoints=0;


    String time="";
    CountDownTimer cdTimer;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_begginer_layout);

        tv_p1=(TextView)findViewById(R.id.tv_p1);
        tv_countdown=(TextView)findViewById(R.id.tv_countDown);
        Intent objIntent=getIntent();
        language=objIntent.getStringExtra("language");
        username=objIntent.getStringExtra("username");

        iv_11=(ImageView)findViewById(R.id.iv_11);
        iv_12=(ImageView)findViewById(R.id.iv_12);
        iv_13=(ImageView)findViewById(R.id.iv_13);
        iv_14=(ImageView)findViewById(R.id.iv_14);
        iv_21=(ImageView)findViewById(R.id.iv_21);
        iv_22=(ImageView)findViewById(R.id.iv_22);
        iv_23=(ImageView)findViewById(R.id.iv_23);
        iv_24=(ImageView)findViewById(R.id.iv_24);
        iv_31=(ImageView)findViewById(R.id.iv_31);
        iv_32=(ImageView)findViewById(R.id.iv_32);
        iv_33=(ImageView)findViewById(R.id.iv_33);
        iv_34=(ImageView)findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

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
        countDown();

    }

    private void countDown()
    {
            cdTimer=new CountDownTimer(60000,1000) {
            @Override
            public void onTick(final long millisUntilFinished)
            {
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
        objValue.put("Score",playerPoints);
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
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(Single_Begginer_Activity.this,R.style.MyAlertDialogStyle);
        if (language.equals("albanian"))
        {
            alertDialogBuilder.setTitle("Loja perfundoj");
            alertDialogBuilder.setMessage("\nPIKET: " + playerPoints).setCancelable(false)
                    .setPositiveButton("LOJE E RE", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            databaseInsert();
                            Intent intent = new Intent(getApplicationContext(), Single_Begginer_Activity.class);
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

                }
            });
            if (!time.equals("1")) {
                alertDialogBuilder.setNeutralButton("Niveli Mesatar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        String playerPointsBegginer = Integer.toString(playerPoints);
                        Intent intent = new Intent(getApplicationContext(), Single_Medium_Activity.class);
                        intent.putExtra("playerPointsBegginer", playerPointsBegginer);
                        intent.putExtra("language", language);
                        intent.putExtra("username", username);
                        startActivity(intent);
                        finish();

                    }
                });
            }
        }
        else {
            alertDialogBuilder.setTitle("Game Over");
            alertDialogBuilder.setMessage("\nPOINTS: " + playerPoints).setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            databaseInsert();
                            Intent intent = new Intent(getApplicationContext(), Single_Begginer_Activity.class);
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

                }
            });
            if (!time.equals("1")) {
                alertDialogBuilder.setNeutralButton("Medium Level", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        String playerPointsBegginer = Integer.toString(playerPoints);
                        Intent intent = new Intent(getApplicationContext(), Single_Medium_Activity.class);
                        intent.putExtra("playerPointsBegginer", playerPointsBegginer);
                        intent.putExtra("language", language);
                        intent.putExtra("username", username);
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

        if (cardsArray[card]==101)
        {
            iv.setImageResource(image101);
        }else if (cardsArray[card]==102)
        {
            iv.setImageResource(image102);
        }else if (cardsArray[card]==103)
        {
            iv.setImageResource(image103);
        }else if (cardsArray[card]==103)
        {
            iv.setImageResource(image103);
        }else if (cardsArray[card]==104)
        {
            iv.setImageResource(image104);
        }else if (cardsArray[card]==105)
        {
            iv.setImageResource(image105);
        }else if (cardsArray[card]==106)
        {
            iv.setImageResource(image106);
        }else if (cardsArray[card]==201)
        {
            iv.setImageResource(image201);
        }else if (cardsArray[card]==202)
        {
            iv.setImageResource(image202);
        }else if (cardsArray[card]==203)
        {
            iv.setImageResource(image203);
        }else if (cardsArray[card]==204)
        {
            iv.setImageResource(image204);
        }else if (cardsArray[card]==205)
        {
            iv.setImageResource(image205);
        }else if (cardsArray[card]==206)
        {
            iv.setImageResource(image206);
        }

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
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

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
            }else   if (clickedFirst==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else   if (clickedFirst==11){
                iv_34.setVisibility(View.INVISIBLE);
            }
            if (clickedSecond==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else   if (clickedSecond==11){
                iv_34.setVisibility(View.INVISIBLE);
            }
            //add points to the correct player
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

        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);

        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);

        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        //check if the game is end

        checkEnd();
    }
    private void checkEnd(){
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE
                )

        {
            playerPoints=playerPoints+Integer.parseInt(time);
            cdTimer.cancel();
            dialog();
        }
    }



    private void frontofCardResources(){

        image101=R.drawable.ic_begginer_image101;
        image102=R.drawable.ic_begginer_image102;
        image103=R.drawable.ic_begginer_image103;
        image104=R.drawable.ic_begginer_image104;
        image105=R.drawable.ic_begginer_image105;
        image106=R.drawable.ic_begginer_image106;
        image201=R.drawable.ic_begginer_image201;
        image202=R.drawable.ic_begginer_image202;
        image203=R.drawable.ic_begginer_image203;
        image204=R.drawable.ic_begginer_image204;
        image205=R.drawable.ic_begginer_image205;
        image206=R.drawable.ic_begginer_image206;
    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    private void rotation3D(final View v , final int theCard)
    {
        AnimatorSet objAnimator=(AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.rotate_img);
        objAnimator.setTarget(v);
        objAnimator.setDuration(400);
        objAnimator.start();

        final AnimatorSet objAnimator2= (AnimatorSet) AnimatorInflater.loadAnimator(Single_Begginer_Activity.this,R.animator.rotate_img2);
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
    private void rotation3DRevers(final ImageView v)
    {
        AnimatorSet objAnimator=(AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.rotate_img);
        objAnimator.setTarget(v);
        objAnimator.setDuration(400);
        objAnimator.start();

        final AnimatorSet objAnimator2= (AnimatorSet) AnimatorInflater.loadAnimator(Single_Begginer_Activity.this,R.animator.rotate_img2);
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

