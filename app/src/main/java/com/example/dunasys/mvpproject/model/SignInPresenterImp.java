package com.example.dunasys.mvpproject.model;

import com.example.dunasys.mvpproject.presentation.SignInPresenter;
import com.example.dunasys.mvpproject.view.SignInView;

public class SignInPresenterImp implements SignInPresenter {

    private  SignInView signInView;



    public SignInPresenterImp(SignInView signInView) {
        this.signInView = signInView;
    }


    @Override
    public void signIn(String user, String pwd) {

        if (user.equals("karthik") && pwd.equals("1234")){
            signInView.signInSucess();
            signInView.startNewActivity();

        }else{
            signInView.signInError();
        }

    }

    @Override
    public void signInCancel() {
        signInView.signInCancel();
    }
}
