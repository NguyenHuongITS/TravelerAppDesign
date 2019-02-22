package com.example.nguyenhuongit.travelerappdesign.View.Activity;

import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.nguyenhuongit.travelerappdesign.Adapter.ViewPagerAdapter;
import com.example.nguyenhuongit.travelerappdesign.R;
import com.example.nguyenhuongit.travelerappdesign.View.Fragment.FragmentPopular;
import com.example.nguyenhuongit.travelerappdesign.View.Fragment.FragmentRecent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //khai báo đối tượng
    Button btn_main_follow;

    //tablayout
    TabLayout tab_layout_main;
    ViewPager view_pager_main;
    ViewPagerAdapter viewPagerAdapter;

    //fragment
    FragmentRecent fragmentRecent = new FragmentRecent();
    FragmentPopular fragmentPopular = new FragmentPopular();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ẩn thanh trạng thái
        HideActionBar();

        //ánh xạ
        Mapping();

        //quản lý sự kiện click
        ControlClick();

        //thêm fragment
        AddFragment();
    }

    private void AddFragment() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //add fragment adapter
        viewPagerAdapter.AddFragment(fragmentRecent, "Recent");
        viewPagerAdapter.AddFragment(fragmentPopular, "Popular");
        view_pager_main.setAdapter(viewPagerAdapter);
        tab_layout_main.setupWithViewPager(view_pager_main);

        //set color icon
    }

    private void ControlClick() {
        btn_main_follow.setOnClickListener(this);
    }

    private void Mapping() {
        btn_main_follow = findViewById(R.id.btn_main_follow);
        tab_layout_main = findViewById(R.id.tab_layout_main);
        view_pager_main = findViewById(R.id.view_pager_main);
    }

    private void HideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_main_follow:
                Toast.makeText(this, btn_main_follow.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
