package com.example.youintentq2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private Button mbtnlogin;
private EditText mEtPassword;
private EditText mEtemail;
private String validemail="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mbtnlogin=findViewById(R.id.btnlogin);
        mEtemail=findViewById(R.id.etEmail);
        mEtPassword=findViewById(R.id.etPassword);
        mbtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isvalidEmail()&&isvalidPassword()){
                    Intent intent=new Intent(MainActivity2.this,HomeScreen.class);
                    intent.putExtra("key",mEtemail.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
    private boolean isvalidEmail(){
        if(  mEtemail.getText().toString().matches(validemail)){
            return true;
        }else{
            mEtemail.setError("Invalid Email");
                    return false;
        }
    }private boolean isvalidPassword(){
        if(mEtPassword.getText().toString().length()>6){
            return true;
        }else{
            mEtPassword.setError("Invalid Password");
        }return false;
    }
}