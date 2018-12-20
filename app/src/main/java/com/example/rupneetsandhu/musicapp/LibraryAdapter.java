package com.example.rupneetsandhu.musicapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class LibraryAdapter extends RecyclerView.Adapter<MusicLibraryViewHolder> {
   ArrayList arrayList;
   MusicLibrary musicLibrary;
    @NonNull
    @Override
    public MusicLibraryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       LayoutInflater layoutInflater=LayoutInflater.from(musicLibrary.getBaseContext());
       View view =layoutInflater.inflate(R.layout.library_view,viewGroup,false);
        return new MusicLibraryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicLibraryViewHolder musicLibraryViewHolder, int i) {
 
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
