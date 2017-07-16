package com.example.pc.memory_test;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class aListaActivity extends AppCompatActivity {

    ArrayList<clsResults> lista=new ArrayList<>();
    Adapteri objAdapter;
    Intent shareIntent;
    String shareBody="Mobile programming";
    String language="";
    String username="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_lista);

        //lista.add(new clsStudenti(1,"Filan","Kompjuterike"));//Lidhja me databaze per secilin rresht me kursor e bojme lista.add
        //lista.add(new clsStudenti(2,"Erif","Elektronike"));//

        ListView iv=(ListView)findViewById(R.id.lista);

        Intent objIntent=getIntent();
        language=objIntent.getStringExtra("language");
        username=objIntent.getStringExtra("username");

        objAdapter=new Adapteri();
        iv.setAdapter(objAdapter);
        new clsGetData().execute();
        iv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),((clsResults) lista.get(position)).getUsername()+"",Toast.LENGTH_LONG).show();
                String user=((clsResults) lista.get(position)).getUsername().substring(3);
                if(user.equals(username)) {
                    shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Memory game");
                    if (language.equals("albanian")) {
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Rezultati im eshte " + ((clsResults) lista.get(position)).getScore());
                        startActivity(Intent.createChooser(shareIntent, "Shperndaj nga"));
                    } else {
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "My score is  " + ((clsResults) lista.get(position)).getScore());
                        startActivity(Intent.createChooser(shareIntent, "Share via"));
                    }
                }

                objAdapter.notifyDataSetChanged();
            }
        });

    }

    public class Adapteri extends ArrayAdapter<clsResults>
    {

        public Adapteri() {
            super(getApplicationContext(), R.layout.layout_rows,lista);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            View row=convertView;
            clsResultsHolder holder=null;

            if(row==null)
            {
                LayoutInflater inflater=getLayoutInflater();
                row=inflater.inflate(R.layout.layout_rows,parent,false);
                holder=new clsResultsHolder(row);
                row.setTag(holder);

            }
            else{
                holder=(clsResultsHolder) row.getTag();
            }

            if (position==0)
            {
                holder.getTvUsername().setBackgroundDrawable(getResources().getDrawable(R.drawable.zfirstrowcolor));
                holder.getTvScore().setBackgroundDrawable(getResources().getDrawable(R.drawable.zfirstrowcolor));
            }
            if (position==1)
            {
                holder.getTvUsername().setBackgroundDrawable(getResources().getDrawable(R.drawable.zsecondrowcolor));
                holder.getTvScore().setBackgroundDrawable(getResources().getDrawable(R.drawable.zsecondrowcolor));
            }
            holder.getTvUsername().setText(lista.get(position).getUsername());
            holder.getTvScore().setText(lista.get(position).getScore());

            return row;
        }

    }
    public class clsGetData extends AsyncTask
    {
        @Override
        protected Object doInBackground(Object[] params) {
            SQLiteDatabase objDB=(new Database(getApplicationContext())).getReadableDatabase();
            //objDB.delete("tblScore","Score<300",null);
            Cursor c=objDB.rawQuery("Select * from tblScore order by Score desc",null);
            c.moveToFirst();

            String[] dblUsername=null;
            String[] dblScore=null;

            if (c.getCount()>0)
            {
                dblUsername=new String[c.getCount()];
                dblScore=new String[c.getCount()];

                for (int i=0;i<dblUsername.length;i++)
                {
                    dblUsername[i]=c.getString(1);
                    dblScore[i]=c.getString(2);
                    c.moveToNext();

                }
                c.close();

            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i=0;i<dblUsername.length;i++)
            {
                lista.add(new clsResults(i,i+1+". "+dblUsername[i],dblScore[i]));
            }

            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            objAdapter.notifyDataSetChanged();
            super.onPostExecute(o);
        }
    }

}
