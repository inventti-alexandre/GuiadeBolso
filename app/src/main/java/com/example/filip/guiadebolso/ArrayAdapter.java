package com.example.filip.guiadebolso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdapter extends android.widget.ArrayAdapter<WordTranslate> {

    public ArrayAdapter(@NonNull Context context, @NonNull List<WordTranslate> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView==null) {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.activity_iten_list, parent,false);
        }

        WordTranslate current = getItem(position);

        TextView paraTraduzir = (TextView) listItemView.findViewById(R.id.txtWord);
        TextView traduzido = (TextView) listItemView.findViewById(R.id.txtTranslated);

        paraTraduzir.setText(current.getTranslation().toString());
        traduzido.setText(current.getTheWord().toString());



        return listItemView;
    }
}
