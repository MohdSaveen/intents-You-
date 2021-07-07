package com.example.youintentq3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
private EditText mEtOrganization;
    private EditText mEtCustomer;
    private EditText mEtMobile;
    private EditText mEtEmail;
    private EditText mEtAddress;
    private EditText mEtTaxId;
    private EditText mEtManufacturer;
    private EditText mEtCompanyId;
    private ImageButton mIgBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inteview();
        mIgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("customer",mEtCustomer.getText().toString());
                intent.putExtra("mobile",mEtMobile.getText().toString());
                intent.putExtra("address",mEtAddress.getText().toString());
                intent.putExtra("email",mEtEmail.getText().toString());
                intent.putExtra("manufacture",mEtManufacturer.getText().toString());
                intent.putExtra("organization",mEtOrganization.getText().toString());
                intent.putExtra("company",mEtCompanyId.getText().toString());
                intent.putExtra("tax",mEtTaxId.getText().toString());
                startActivity(intent);

            }
        });
    }private void inteview() {
        mEtAddress = findViewById(R.id.line4);
        mEtCustomer = findViewById(R.id.line1);
        mEtEmail = findViewById(R.id.line3);
        mEtMobile = findViewById(R.id.line2);
        mEtTaxId = findViewById(R.id.line6);
        mEtCompanyId = findViewById(R.id.line7);
        mEtManufacturer = findViewById(R.id.line5);
        mEtOrganization = findViewById(R.id.EtOrganization);
        mIgBtn=findViewById(R.id.igcheck);
    }
}