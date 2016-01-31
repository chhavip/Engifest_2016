package com.dtu.engifest;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.jorgecastillo.FillableLoader;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.regex.Pattern;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText registeredEmail;
    String emailId;
    Activity mActivity;
    MaterialProgressBar progressBar;
    Button loginButton;
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        mActivity = this;
        ParseUser currentUser = ParseUser.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(mActivity, MenuActivity.class);
            startActivity(intent);
            finish();
            // do stuff with the user
        } else {
            // show the signup or register screen
        }
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        FillableLoader fillableLoader = (FillableLoader) findViewById(R.id.fillableLoader);

        registeredEmail = new EditText(this);
        registeredEmail = (EditText) findViewById(R.id.email);
        progressBar = (MaterialProgressBar)findViewById(R.id.progress_bar);
        register = (TextView) findViewById(R.id.link_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(mActivity, RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });
        String possibleEmail = "";
        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(this);
        ArrayList<String> emails = new ArrayList<>();
        Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
        Account[] accounts = AccountManager.get(this).getAccounts();
        for (Account account : accounts) {
            if (emailPattern.matcher(account.name).matches()) {
                emails.add(account.name);
                possibleEmail = account.name;
                Log.d("emails", possibleEmail);
            }
            registeredEmail.setText(possibleEmail);
            fillableLoader.setSvgPath(getString(R.string.seventy_five_engi));
            fillableLoader.start();


        }

    }

        @Override
        public void onClick (View v){
            progressBar.setVisibility(View.VISIBLE);
            String registeredEmailUser = registeredEmail.getText().toString();

            ParseUser.logInInBackground(registeredEmailUser, "testPassword", new LogInCallback() {
                public void done(ParseUser user, ParseException e) {
                    if (user != null) {
                        progressBar.setVisibility(View.GONE);
                        Intent intent = new Intent(mActivity, MenuActivity.class);
                        startActivity(intent);
                        finish();
                        // Hooray! The user is logged in.
                    } else {
                        Log.d("errorLogin", e.toString());
                        // Signup failed. Look at the ParseException to see what happened.
                    }
                }
            });
        }
    }
