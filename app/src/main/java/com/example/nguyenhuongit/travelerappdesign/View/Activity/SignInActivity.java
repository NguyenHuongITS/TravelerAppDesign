package com.example.nguyenhuongit.travelerappdesign.View.Activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nguyenhuongit.travelerappdesign.R;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt_signin_footer, txt_signin_forgot_pwd;
    Button btn_sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        //ẩn thanh trạng thái
        HideActionBar();

        //ánh xạ
        Mapping();

        //Control click
        ControlClick();
    }

    private void ControlClick() {
        txt_signin_footer.setOnClickListener(this);
        btn_sign_in.setOnClickListener(this);
        txt_signin_forgot_pwd.setOnClickListener(this);
    }

    private void Mapping() {
        txt_signin_footer = findViewById(R.id.txt_signin_footer);
        btn_sign_in = findViewById(R.id.btn_sign_in);
        txt_signin_forgot_pwd = findViewById(R.id.txt_signin_forgot_pwd);
    }

    private void HideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txt_signin_footer:
                Toast.makeText(this, txt_signin_footer.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_sign_in:
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_signin_forgot_pwd:
                Toast.makeText(this, txt_signin_forgot_pwd.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
