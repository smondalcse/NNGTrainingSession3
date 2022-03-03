package com.nitolniloygroup.nngtrainingsession;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText et_empid, et_password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_empid = findViewById(R.id.et_empid);
        et_password = findViewById(R.id.et_password);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input_empID = et_empid.getText().toString();
                String input_password = et_password.getText().toString();

                if(input_empID.equalsIgnoreCase("123") && input_password.equalsIgnoreCase("321")){

                    UserModel user = new UserModel();
                    user.setEmpID(input_empID);
                    user.setEmpName("Nitol Niloy Group");
                    user.setEmpMobile("547896541");

                    Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
//                    intent.putExtra("empid", input_empID);
//                    intent.putExtra("name", "Sanat Mondal");
//                    intent.putExtra("mobile", 1712995265);

                    intent.putExtra("user", user);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid EmpID or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageView imgLogo = findViewById(R.id.imgLogo);
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgLogo.setImageResource(R.drawable.logo1);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("nng training sesison", "on start: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("nng training sesison", "on resume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("nng training sesison", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("nng training sesison", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("nng training sesison", "onDestroy: ");
    }


}