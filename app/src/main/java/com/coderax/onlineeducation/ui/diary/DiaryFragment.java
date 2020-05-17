package com.coderax.onlineeducation.ui.diary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.coderax.onlineeducation.FragmentComposeDiary;
import com.coderax.onlineeducation.FragmentViewDiary;
import com.coderax.onlineeducation.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DiaryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_diary, container, false);

        BottomNavigationView bottomNavigationView = root.findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        getFragmentManager().beginTransaction().replace(R.id.fragment_diary_activity, new FragmentViewDiary()).commit();
        return root;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()){
                case R.id.navigation_compose_diary:
                    selectedFragment = new FragmentComposeDiary();
                    break;
                case R.id.navigation_view_diary:
                    selectedFragment = new FragmentViewDiary();
                    break;
            }

            getFragmentManager().beginTransaction().replace(R.id.fragment_diary_activity, selectedFragment).commit();
            return true;
        }
    };
}