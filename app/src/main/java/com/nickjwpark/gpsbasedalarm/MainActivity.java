package com.nickjwpark.gpsbasedalarm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    int global_var = 4;
    EditText txtGrade;
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int a = myLibrary.add(1, 2);

        txtGrade = (EditText) findViewById(R.id.txtGrade);
        btnTest = (Button) findViewById(R.id.btnTest);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int grade = Integer.parseInt(txtGrade.getText().toString());
                Toast.makeText(getApplicationContext(), ""+grade, Toast.LENGTH_SHORT).show();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        String [] arr = new String [5];
//        Toast.makeText(this, ""+ Arrays.toString(arr), Toast.LENGTH_SHORT).show();
        int [] arr2 = new int [5];
//        Toast.makeText(this, ""+ Arrays.toString(arr2), Toast.LENGTH_SHORT).show();
        double [] arr3 = new double [5];
//        Toast.makeText(this, ""+ Arrays.toString(arr3), Toast.LENGTH_SHORT).show();

//        String [] arr = {"Hello", "World", "Android", "Java"};
//        int [] arr2 = new int [5];
        for(int i : arr2){
            arr2[i] = i;
        }

        String [] first_names = {"김", "이", "박", "최", "조"};
        String [] last_names = {"아람", "민수", "셋별", "철수"};
        for(String first_name : first_names){
            for(String last_name : last_names){
                Log.d("nested_for_loop", first_name + last_name);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
