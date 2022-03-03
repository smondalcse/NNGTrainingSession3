package com.nitolniloygroup.nngtrainingsession;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Bundle bundle = getIntent().getExtras();
//        String empID = bundle.getString("empid", "No Employee ID found");
//        String name = bundle.getString("name", "No Employee name found");
//        int mobile = bundle.getInt("mobile", 0);

        UserModel user = (UserModel) bundle.getSerializable("user");

        TextView txtEmpID = findViewById(R.id.txtEmpID);
        txtEmpID.setText(user.getEmpID());

        TextView txtName = findViewById(R.id.txtName);
        txtName.setText(user.getEmpName());

        TextView txtMobile = findViewById(R.id.txtMobile);
        txtMobile.setText(String.valueOf(user.getEmpMobile()));

    }
}