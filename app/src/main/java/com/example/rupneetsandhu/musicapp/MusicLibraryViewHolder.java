package com.example.rupneetsandhu.musicapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MusicLibraryViewHolder extends RecyclerView.ViewHolder {
    public ImageView songImage;
    public Button btSongTitle;

    public MusicLibraryViewHolder(@NonNull View itemView) {
        super(itemView);
        songImage = itemView.findViewById(R.id.songImage);
        btSongTitle = itemView.findViewById(R.id.btSongTitle);
    }
}
