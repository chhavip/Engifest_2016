package com.dtu.engifest;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.jorgecastillo.FillableLoader;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.util.ArrayList;
import java.util.regex.Pattern;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        emailId = parent.getItemAtPosition(position).toString();
    }

    EditText name;
    Spinner email;
    String emailId;
    EditText testEmail;
    Activity mActivity;
    Button registerButton;
    MaterialProgressBar progressBar;
    TextView login;
    TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
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
        name = new EditText(this);
        name = (EditText) findViewById(R.id.name);
        email = (Spinner) findViewById(R.id.email);
        progressBar = (MaterialProgressBar)findViewById(R.id.progress_bar);
        login = (TextView) findViewById(R.id.link_login);
        skip = (TextView) findViewById(R.id.skip_button);
        skip.setOnClickListener(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(mActivity, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        registerButton = (Button) findViewById(R.id.register);
        registerButton.setOnClickListener(this);
        ArrayList<String> emails = new ArrayList<>();
        Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
        Account[] accounts = AccountManager.get(this).getAccounts();
        for (Account account : accounts) {
            if (emailPattern.matcher(account.name).matches()) {
                emails.add(account.name);
                String possibleEmail = account.name;
                Log.d("emails", possibleEmail);
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, emails);
// Specify the layout to use when the list of choices appears
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
            email.setAdapter(adapter);
            email.setOnItemSelectedListener(this);
        }
        fillableLoader.setSvgPath(getString(R.string.seventy_five_engi));
        fillableLoader.start();


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.login) {
            progressBar.setVisibility(View.VISIBLE);
            String nameUser = name.getText().toString();
            String emailUser = emailId;
            ParseUser user = new ParseUser();
            user.setUsername(emailUser);
            user.setPassword("testPassword");
            user.setEmail(emailUser);
            user.put("name", nameUser);

            user.signUpInBackground(new SignUpCallback() {
                public void done(ParseException e) {
                    if (e == null) {

                        //  EngifestApplication.updateParseInstallation(user);
                        progressBar.setVisibility(View.GONE);

                        Intent intent = new Intent(mActivity, MenuActivity.class);
                        startActivity(intent);
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
        else if (v.getId() == R.id.skip_button) {
            startActivity(new Intent(mActivity, MenuActivity.class));
            finish();
        }

    }
}
