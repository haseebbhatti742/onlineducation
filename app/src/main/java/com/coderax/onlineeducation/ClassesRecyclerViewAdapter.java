package com.coderax.onlineeducation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.coderax.onlineeducation.ui.diary.DiaryFragment;

import java.util.ArrayList;

public class ClassesRecyclerViewAdapter extends RecyclerView.Adapter<ClassesRecyclerViewAdapter.Holder> {
    ArrayList<ClassesRecyclerViewCard> arrayList;

    public static Context context;

    public static class Holder extends RecyclerView.ViewHolder{
        public ImageView circleImageView;
        public TextView textViewName;
        public TextView textViewClass;

        public Holder(View itemView){
            super(itemView);
            context = itemView.getContext();
            circleImageView = itemView.findViewById(R.id.classes_recycler_view_image);
            textViewName = itemView.findViewById(R.id.classes_recycler_view_class);
            textViewClass = itemView.findViewById(R.id.classes_recycler_view_students);
        }
    }

    @NonNull
    @Override
    public ClassesRecyclerViewAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_classes, parent, false);
        ClassesRecyclerViewAdapter.Holder holder = new ClassesRecyclerViewAdapter.Holder(v);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Class Clicked", Toast.LENGTH_LONG).show();
//                FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.host_fragment_diary_activity, new DiaryFragment()).commit();
                context.startActivity(new Intent(context, NewActivity.class));
            }
        });
        return holder;
    }

    public ClassesRecyclerViewAdapter(ArrayList<ClassesRecyclerViewCard> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public void onBindViewHolder(@NonNull ClassesRecyclerViewAdapter.Holder holder, int position) {
        ClassesRecyclerViewCard card = this.arrayList.get(position);

        holder.circleImageView.setImageResource(card.getImageResource());
        holder.textViewName.setText(card.getTextName());
        holder.textViewClass.setText(card.getTextClass());

    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }
}
