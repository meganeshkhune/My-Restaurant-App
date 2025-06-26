package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapters.FeaturedAdapter;
import com.example.myapplication.adapters.FeaturedVerAdapter;
import com.example.myapplication.modeis.FeatureVerModel;
import com.example.myapplication.modeis.FeaturedModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {
    //////////////////////////Featured Hor Recyclerview
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;
    //////////////////////////Featured Ver Recyclerview
    List<FeatureVerModel> featureVerModelList;

    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;



    public FirstFragment() {



        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        //////////////////////////Featured Hor Recyclerview

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelList = new ArrayList<>();
        featuredModelList.add(new FeaturedModel(R.drawable.fav1,"Featured 1","Decription 1"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav2,"Featured 2","Decription 2"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav3,"Featured 3","Decription 3"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);

        //////////////////////////Featured Ver Recyclerview
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featureVerModelList = new ArrayList<>();

        featureVerModelList.add(new FeatureVerModel(R.drawable.ver1,"Featured1","Description 1","4.8","10am to 2pm"));
        featureVerModelList.add(new FeatureVerModel(R.drawable.ver2,"Featured2","Description 2","4.8","10am to 2pm"));
        featureVerModelList.add(new FeatureVerModel(R.drawable.ver3,"Featured3","Description 3","4.8","10am to 2pm"));
        featureVerModelList.add(new FeatureVerModel(R.drawable.ver1,"Featured1","Description 1","4.8","10am to 2pm"));
        featureVerModelList.add(new FeatureVerModel(R.drawable.ver2,"Featured2","Description 2","4.8","10am to 2pm"));
        featureVerModelList.add(new FeatureVerModel(R.drawable.ver3,"Featured3","Description 3","4.8","10am to 2pm"));


        featuredVerAdapter = new FeaturedVerAdapter(featureVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return view;
    }
}