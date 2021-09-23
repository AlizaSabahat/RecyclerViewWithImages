package com.example.recyclerveiwtwoq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerveiwtwoq.ModelClass.Modelclass;
import com.example.recyclerveiwtwoq.RecyclerView.RecyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Modelclass> modelclassArrayList= new ArrayList<>();
        modelclassArrayList.add(new Modelclass("Nimko","500gm","Rs:500","0"));
        modelclassArrayList.add(new Modelclass("Biscuit","350gm","Rs:200","0"));
        modelclassArrayList.add(new Modelclass("Noodles","500gm","Rs:150","0"));
        modelclassArrayList.add(new Modelclass("Lays","150gm","Rs:100","0"));
        modelclassArrayList.add(new Modelclass("Nimko","500gm","Rs:500","0"));
        modelclassArrayList.add(new Modelclass("Biscuit","350gm","Rs:200","0"));
        modelclassArrayList.add(new Modelclass("Noodles","500gm","Rs:150","0"));
        modelclassArrayList.add(new Modelclass("Lays","150gm","Rs:100","0"));
        modelclassArrayList.add(new Modelclass("Nimko","500gm","Rs:500","0"));
        modelclassArrayList.add(new Modelclass("Biscuit","350gm","Rs:200","0"));
        modelclassArrayList.add(new Modelclass("Noodles","500gm","Rs:150","0"));
        modelclassArrayList.add(new Modelclass("Lays","150gm","Rs:100","0"));

        RecyclerAdapter recyclerAdapter= new RecyclerAdapter(modelclassArrayList,MainActivity.this);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(recyclerAdapter);
    }
}