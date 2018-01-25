package com.avrilhb.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.avrilhb.platzigram.R;
import com.avrilhb.platzigram.adapter.PictureAdapterRecyclerView;
import com.avrilhb.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

public class SearchFragment extends Fragment {

    RecyclerView searchRecycler;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        searchRecycler = (RecyclerView) view.findViewById(R.id.searchRecycler);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        searchRecycler.setLayoutManager(gridLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(),
                R.layout.cardview_picture, getActivity());
        searchRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg", "Avril Hernández", "4 días", "3 me gusta"));
        pictures.add(new Picture("http://www.enjoyart.com/library/landscapes/tuscanlandscapes/large/Tuscan-Bridge--by-Art-Fronckowiak-.jpg", "Aimée Sánchez", "2 días", "50 me gusta"));
        pictures.add(new Picture("http://www.educationquizzes.com/library/KS3-Geography/river-1-1.jpg", "Ariel cruz", "6 días", "9 me gusta"));

        return pictures;

    }

}
