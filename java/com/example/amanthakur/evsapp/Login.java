package com.example.amanthakur.evsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText ed,ed1;
    SQLiteDatabase sqLiteDatabase;
    int count;
    Button btn,btn2,btn3,btn4;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sqLiteDatabase=openOrCreateDatabase("Admin",MODE_PRIVATE,null);
        sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
        String s=sharedPreferences.getString("email","0");
        if(s!=String.valueOf(0)){
            Intent i=new Intent(Login.this,Content.class);
            startActivity(i);
        }
        ed=(EditText) findViewById(R.id.editText6);
        ed1=(EditText) findViewById(R.id.editText7);
        btn=(Button) findViewById(R.id.button3);
        btn2=(Button) findViewById(R.id.button4);
        btn3=(Button) findViewById(R.id.button5);
        btn4=(Button) findViewById(R.id.button6);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                String email=ed.getText().toString();
                String password=ed1.getText().toString();
                Cursor c=sqLiteDatabase.rawQuery("select* from emp where email='"+email+"' and password='"+password+"'",null);
                c.moveToFirst();
                do {
                    count=c.getCount();
                }while(c.moveToNext());

//
                if(count==1){
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("email",email);
                    editor.apply();
                    Intent in=new Intent(Login.this,Content.class);
                    startActivity(in);
                }
                else {
                    Toast.makeText(getApplicationContext(),"worng email or password",Toast.LENGTH_SHORT).show();

                }
//
//
//
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Login.this,MainActivity.class);
                startActivity(in1);
            }
        });

    }
}
