package com.example.intentq4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText mEtTo;
private EditText mEtCc;
private EditText mEtSub;
private EditText mEtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtTo=findViewById(R.id.EtTo);
        mEtCc=findViewById(R.id.EtCc);
        mEtSub=findViewById(R.id.EtSubject);
        mEtContent=findViewById(R.id.EtContent);
        Button mBtnSend = findViewById(R.id.btnSend);
        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,mEtSub.getText().toString());
                intent.putExtra(Intent.EXTRA_CC,new String[]{mEtCc.getText().toString()});
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{mEtTo.getText().toString()});
                intent.putExtra(Intent.EXTRA_TEXT,mEtContent.getText().toString());
                startActivity(intent);
            }
        });
    }
}