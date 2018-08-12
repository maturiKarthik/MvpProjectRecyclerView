package com.example.dunasys.mvpproject.model;

import com.example.dunasys.mvpproject.presentation.ListViewPresenter;
import com.example.dunasys.mvpproject.view.ListIemView;

public class ListViewPresenterImpl implements ListViewPresenter {

    private ListIemView listIemView;

    public ListViewPresenterImpl(ListIemView listIemView) {
        this.listIemView = listIemView;
        this.listIemView.init();

    }

    @Override
    public String[] getData() {

        String[] data ={"Earth","Mars","Pluto","Jupiter","Satrun","Sun","Uranus","Moon","Satellite"};
        return data;
    }
}
