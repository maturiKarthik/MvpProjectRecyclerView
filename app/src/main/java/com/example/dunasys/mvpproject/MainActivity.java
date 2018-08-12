package com.example.dunasys.mvpproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.dunasys.mvpproject.model.SignInPresenterImp;
import com.example.dunasys.mvpproject.presentation.SignInPresenter;
import com.example.dunasys.mvpproject.view.SignInView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements SignInView,View.OnClickListener {

    ImageView imageView;
    LinearLayout linearLayout;
    SignInPresenter signInPresenter;
    EditText pwd,username;



    Button signIn , cancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.image);
        linearLayout =(LinearLayout) findViewById(R.id.container) ;
        linearLayout.setBackgroundResource(R.mipmap.galaxy);
        signIn =(Button) findViewById(R.id.signIn);
        cancel =(Button) findViewById(R.id.cancel);
        pwd = (EditText) findViewById(R.id.pwd);
        username =(EditText) findViewById(R.id.userName) ;

        signIn.setOnClickListener(this);
        cancel.setOnClickListener(this);

        signInPresenter = new SignInPresenterImp(this);


        // Picasso.get().load("https://cdn.pixabay.com/photo/2016/10/07/14/39/space-1721679_1280.jpg").placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(imageView);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.signIn:

                signInPresenter.signIn(username.getText().toString(),pwd.getText().toString());

                break;
            case R.id.cancel:
                signInPresenter.signInCancel();
                break;
        }
    }
    @Override
    public void signInError() {
        Toast.makeText(this,"Error In Login",Toast.LENGTH_LONG).show();
    }

    @Override
    public void signInCancel() {
        Toast.makeText(this,"cancel In Login",Toast.LENGTH_LONG).show();
    }

    @Override
    public void signInSucess() {
        Toast.makeText(this,"Sucess In Login",Toast.LENGTH_LONG).show();
    }

    @Override
    public void startNewActivity() {
        Intent intent = new Intent(this,ListActivity.class);
        startActivity(intent);
    }
}
