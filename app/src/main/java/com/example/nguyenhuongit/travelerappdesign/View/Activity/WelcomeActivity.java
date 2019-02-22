package com.example.nguyenhuongit.travelerappdesign.View.Activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nguyenhuongit.travelerappdesign.R;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt_welcome_new_member;
    Button btn_welcome_member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //ấn thanh trạng thái
        HideActionBar();

        //ánh xạ
        Mapping();

        //kiểm soát sự kiện click
        ControlClick();

    }

    private void ControlClick() {
        btn_welcome_member.setOnClickListener(this);
        txt_welcome_new_member.setOnClickListener(this);
    }

    private void Mapping() {
        txt_welcome_new_member = findViewById(R.id.txt_welcome_new_member);
        btn_welcome_member = findViewById(R.id.btn_welcome_member);
    }

    private void HideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_welcome_member:
                Intent intent = new Intent(WelcomeActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.txt_welcome_new_member:
                Intent intent1 = new Intent(WelcomeActivity.this, SignInActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}
