package com.example.nguyenhuongit.travelerappdesign.View.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.nguyenhuongit.travelerappdesign.Adapter.PopularAdapter;
import com.example.nguyenhuongit.travelerappdesign.Data.Popular;
import com.example.nguyenhuongit.travelerappdesign.Data.Recent;
import com.example.nguyenhuongit.travelerappdesign.R;

import java.util.List;

public class FragmentPopular extends Fragment {

    List<Popular> popularList;
    GridView gridView;
    int myImagelists[] = {R.drawable.image_popular_1, R.drawable.image_popular_2, R.drawable.image_popular_3, R.drawable.image_popular_4,
            R.drawable.image_popular_5, R.drawable.image_popular_6, R.drawable.image_popular_7, R.drawable.image_popular_8, R.drawable.image_popular_9,
            R.drawable.image_popular_10};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_popular, container,false);
        gridView = view.findViewById(R.id.main_gridview_popular);
        PopularAdapter popularAdapter = new PopularAdapter(getContext(),myImagelists);
        gridView.setAdapter(popularAdapter);
        return view;
    }
}
