package com.example.youintentq3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main2);
        inteview();
        Intent intent=getIntent();
        String customer=intent.getStringExtra("customer");
        mEtCustomer.setText(customer);
        String email=intent.getStringExtra("email");
        mEtEmail.setText(email);
        String address=intent.getStringExtra("address");
        mEtAddress.setText(address);
        String mobile=intent.getStringExtra("mobile");
        mEtMobile.setText(mobile);
        String tax=intent.getStringExtra("tax");
        mEtTaxId.setText(tax);
        String company=intent.getStringExtra("company");
        mEtCompanyId.setText(company);
        String manufacturer=intent.getStringExtra("manufacturer");
        mEtManufacturer.setText(manufacturer);
        String organization=getIntent().getStringExtra("organization");
        mEtOrganization.setText(organization);



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