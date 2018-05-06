package com.example.amanthakur.evsapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    EditText ed,ed1,ed2,ed3,ed4,ed5;
    SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqLiteDatabase = openOrCreateDatabase("Admin", MODE_PRIVATE, null);
        sqLiteDatabase.execSQL("create table if not exists emp(name varchar,email varchar,password varchar,mobile varchar,address varchar)");
        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        final EditText ed=(EditText) findViewById(R.id.editText);
        final EditText ed2=(EditText) findViewById(R.id.editText2);
        final EditText ed3=(EditText) findViewById(R.id.editText3);
        final EditText ed4=(EditText) findViewById(R.id.editText4);
        final EditText ed5=(EditText) findViewById(R.id.editText5);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed.getText().length()>0 & ed2.getText().length()>0 & ed3.getText().length()>0 & ed4.getText().length()>0 & ed5.getText().length()>0 ) {
                    String name = ed.getText().toString();
                    String email = ed2.getText().toString();
                    String password = ed3.getText().toString();
                    String mobile = ed4.getText().toString();
                    String address = ed5.getText().toString();

                    sqLiteDatabase.execSQL("insert into emp values('" + name + "','" + email + "','" + password + "','" + mobile + "','" + address + "')");
                    Toast.makeText(getApplicationContext(),"Successfully Registered",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Fill the form completely",Toast.LENGTH_SHORT).show();

                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Login.class);
                startActivity(in);
            }
        });

    }
}


