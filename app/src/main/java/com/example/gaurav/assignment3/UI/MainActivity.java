package com.example.gaurav.assignment3.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gaurav.assignment3.Adapter.DerpAdapter;
import com.example.gaurav.assignment3.Model.DerpData;
import com.example.gaurav.assignment3.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private DerpAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    recView=(RecyclerView)findViewById(R.id.rec_list);

        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new DerpAdapter(DerpData.getListData(), this);
        recView.setAdapter(adapter);

    }
}
