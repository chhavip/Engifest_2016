package com.dtu.engifest;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.github.jorgecastillo.FillableLoader;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.util.regex.Pattern;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    Spinner email;
    EditText testEmail;
    Activity mActivity;
    Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mActivity = this;
        ParseUser currentUser = ParseUser.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(mActivity, MenuActivity.class);
            startActivity(intent);
            finish();
            // do stuff with the user
        } else {
            // show the signup or login screen
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FillableLoader fillableLoader = (FillableLoader) findViewById(R.id.fillableLoader);
        name = (EditText) findViewById(R.id.name);
        testEmail = (EditText) findViewById(R.id.email);

        registerButton = (Button) findViewById(R.id.register);
        registerButton.setOnClickListener(this);
//        Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
//        Account[] accounts = AccountManager.get(this).getAccounts();
//        for (Account account : accounts) {
//            if (emailPattern.matcher(account.name).matches()) {
//                String possibleEmail = account.name;
//                Log.d("emails", possibleEmail);
//            }
//        }
        fillableLoader.setSvgPath(getString(R.string.seventy_five_engi));
        fillableLoader.start();


    }

    @Override
    public void onClick(View v) {

        String nameUser = "me";
        String emailUser = "shikhark211@gmail.com";
        Toast.makeText(mActivity, "onClick", Toast.LENGTH_SHORT).show();
        ParseUser user = new ParseUser();
        user.setUsername(nameUser);
        user.setPassword("testPassword");
        user.setEmail(emailUser);
        Intent intent = new Intent(mActivity, MenuActivity.class);
        startActivity(intent);
        user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {

                    finish();
                    // Hooray! Let them use the app now.
                } else {

                    Log.d("error", e.toString());
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                }
            }
        });
    }
}
