package com.example.dunasys.mvpproject.presentation;

import android.content.Context;

public interface SignInPresenter {

    public void signIn(String user,String pwd);
    public void signInCancel();

}
