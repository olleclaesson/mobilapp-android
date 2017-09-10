package com.example.garfiield.utvmobbapp1;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView Toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast = (TextView) findViewById(R.id.Toast);
    }
    public MainActivity () {



    }

    public void onClick (View v){

        Button temp = (Button)v;
        String inkommande = (String)temp.getTag();

        Toast.setText("Toast");
       // System.out.println("hello" +inkommande);

        System.out.println("hej");

    }
}
