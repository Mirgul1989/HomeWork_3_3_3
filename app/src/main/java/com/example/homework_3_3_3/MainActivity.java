package com.example.homework_3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvNames;
    private ArrayList<String> namesList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNames=findViewById(R.id.rv_names);
        namesList.add("Бермет");
        namesList.add("Наиля");
        namesList.add("Жибек");
        namesList.add("Айзада");
        namesList.add("Бактыгул");
        namesList.add("Назима");
        namesList.add("Назгул");
        namesList.add("Айпери");
        namesList.add("Нургул");
        namesList.add("Айгул");
        namesList.add("Нуриска");
        namesList.add("Айгерим");
        namesList.add("Мээрим");
        namesList.add("Бегимай");
        namesList.add("Диана");
        namesList.add("Амина");
        namesList.add("Акылай");
        namesList.add("Айсезим");
        namesList.add("Айзирек");
        namesList.add("Алтынай");
        namesList.add("Асылзае");
        namesList.add("Датка");
        NamesAdapter namesAdapter=new NamesAdapter(namesList);
        rvNames.setAdapter(namesAdapter);
    }
}

