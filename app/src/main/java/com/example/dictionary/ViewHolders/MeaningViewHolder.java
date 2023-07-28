package com.example.dictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Models.Phonetics;
import com.example.dictionary.R;

public class MeaningViewHolder extends RecyclerView.ViewHolder {

    public Phonetics textView_partsOfSpeech;
    TextView textView_partsofspeech;
    public RecyclerView recycler_definitions;

    public MeaningViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_partsofspeech = itemView.findViewById(R.id.textView_partsofspeech);
        recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
    }
}
