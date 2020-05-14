package com.coderax.onlineeducation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class FragmentViewDiary extends Fragment{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_view_diary, container, false);

        FloatingActionButton fab = root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_diary_activity, new FragmentComposeDiary()).commit();
            }
        });

        ArrayList<ViewDiaryCardClass> cardArrayList = new ArrayList<>();
        cardArrayList.add(new ViewDiaryCardClass(R.drawable.pic6,"Mathematics","Class 9th"));
        cardArrayList.add(new ViewDiaryCardClass(R.drawable.pic6,"Urdu","Class 9th"));
        cardArrayList.add(new ViewDiaryCardClass(R.drawable.pic6,"Physics","Class 9th"));
        cardArrayList.add(new ViewDiaryCardClass(R.drawable.pic6,"Chemistry","Class 9th"));


        recyclerView = root.findViewById(R.id.fragment_view_diary_recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ViewDiaryAdapter(cardArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return root;
    }


}
