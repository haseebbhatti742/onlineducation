package com.coderax.onlineeducation.ui.classes;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.coderax.onlineeducation.ClassesRecyclerViewAdapter;
import com.coderax.onlineeducation.ClassesRecyclerViewCard;
import com.coderax.onlineeducation.FragmentComposeDiary;
import com.coderax.onlineeducation.FragmentViewDiary;
import com.coderax.onlineeducation.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class ClassesFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_classes, container, false);

        ArrayList<ClassesRecyclerViewCard> cardArrayList = new ArrayList<>();
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover1,"Class 7th","15 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover2,"Class 8th","22 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover3,"Class 9th","20 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover4,"Class 10th","35 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover1,"Class 7th","15 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover2,"Class 8th","22 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover3,"Class 9th","20 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover4,"Class 10th","35 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover1,"Class 7th","15 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover2,"Class 8th","22 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover3,"Class 9th","20 Students"));
        cardArrayList.add(new ClassesRecyclerViewCard(R.drawable.cover4,"Class 10th","35 Students"));


        recyclerView = root.findViewById(R.id.fragment_classes_recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 2);
        adapter = new ClassesRecyclerViewAdapter(cardArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return root;
    }
}