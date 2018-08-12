package com.example.dunasys.mvpproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dunasys.mvpproject.model.ListViewPresenterImpl;
import com.example.dunasys.mvpproject.model.MyAdapter;
import com.example.dunasys.mvpproject.presentation.ListViewPresenter;
import com.example.dunasys.mvpproject.view.ListIemView;

public class ListActivity extends Activity implements ListIemView{

    RecyclerView recyclerView;
    ListViewPresenter listView_Presenter;

    @Override
    public void init() {

        recyclerView =(RecyclerView) findViewById(R.id.recycler_View);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView_Presenter = new ListViewPresenterImpl(this);

        MyAdapter adapter = new MyAdapter( listView_Presenter.getData());
        recyclerView.setAdapter(adapter);

    }
}
