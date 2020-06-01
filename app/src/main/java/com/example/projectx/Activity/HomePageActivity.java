package com.example.projectx.Activity;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projectx.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.cardview.widget.CardView;

import androidx.recyclerview.widget.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HomePageActivity extends AppCompatActivity  {

    RecyclerView horizontal_recycler_view;
    HorizontalAdapter horizontalAdapter;
    private List<Data> data;

    CardView cardView;
    CardView card;
    CardView card1;
    CardView card2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        cardView = findViewById(R.id.md);
        card = findViewById(R.id.cd);
        card1 = findViewById(R.id.fha);
        card2 = findViewById(R.id.tqt);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, MeetDoc.class);
                startActivity(intent);
            }
        });
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, ConsultDoc.class);
                startActivity(intent);
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, FreeHealthAdvices.class);
                startActivity(intent);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, TrendingQuestions.class);
                startActivity(intent);
            }
        });

        horizontal_recycler_view = findViewById(R.id.rv);
        data = fill_with_data();
        horizontalAdapter = new HorizontalAdapter(data, getApplication());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(HomePageActivity.this, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
        horizontal_recycler_view.setAdapter(horizontalAdapter);

    }


    public List<Data> fill_with_data() {
        List<Data> data = new ArrayList<>();

        data.add(new Data(R.drawable.woman, "Women's Health"));
        data.add(new Data(R.drawable.sh, "Skin and Hair"));
        data.add(new Data(R.drawable.stethoscope, "General Physician"));
        data.add(new Data(R.drawable.mental, "Mental Weekness "));
        data.add(new Data(R.drawable.baby, "Child Specialist"));
        data.add(new Data(R.drawable.dentalcare, "Dental Care"));

        return data;

    }


    public class HorizontalAdapter extends RecyclerView.Adapter<MyViewHolder> {

        List<Data> horizontalList = Collections.emptyList();
        Context context;

        public HorizontalAdapter(List<Data> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_itemone, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt;
                    Toast.makeText(HomePageActivity.this, list, Toast.LENGTH_SHORT).show();
                }

            });

        }

        @Override
        public int getItemCount() {
            return horizontalList.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtview;

        public MyViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.women);
            txtview = view.findViewById(R.id.womentxt);
        }

    }




}
