package com.example.nguyenhuongit.travelerappdesign.View.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.nguyenhuongit.travelerappdesign.Adapter.RecentAdapter;
import com.example.nguyenhuongit.travelerappdesign.Data.Recent;
import com.example.nguyenhuongit.travelerappdesign.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentRecent extends Fragment {
    List<Recent> recentList;
    GridView gridView;
    int myImagelists[] = {R.drawable.image_recent_2, R.drawable.image_recent_3, R.drawable.image_recent_4, R.drawable.image_recent_6,
            R.drawable.image_recent_7, R.drawable.image_recent_8, R.drawable.image_recent_9, R.drawable.image_recent_10, R.drawable.image_recent_6,
            R.drawable.image_recent_2};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_recent, container,false);
        gridView = view.findViewById(R.id.main_gridview_recect);
        RecentAdapter recentAdapter = new RecentAdapter(getContext(),myImagelists);
        gridView.setAdapter(recentAdapter);
        return view;
    }
}
