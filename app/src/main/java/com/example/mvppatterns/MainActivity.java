package com.example.mvppatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Contract.view {
    Contract.Presenterclass presenter1;
    Button login;
    EditText name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       presenter1=new Presenter(this);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=name.getText().toString();
                String password1=password.getText().toString();

                if(TextUtils.isEmpty(name1)||TextUtils.isEmpty(password1)){
                    onError("Feilds Requried to Login");

                }
                else{
                    presenter1.onLogin(name1,password1);
                }
            }
        });
    }

    @Override
    public void onSuccess(String Message) {
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onError(String Message) {
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

    }
}