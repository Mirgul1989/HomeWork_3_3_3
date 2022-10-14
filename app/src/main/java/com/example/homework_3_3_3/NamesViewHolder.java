package com.example.homework_3_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NamesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNames;
    public NamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNames=itemView.findViewById(R.id.tv_names);
    }
    public void bind (String colors){
        tvNames.setText(colors);
    }
}
