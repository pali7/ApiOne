package com.example.apione;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnShow, btnRegister, btnSearch, btnUpdate, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_);
        getSupportActionBar().setTitle("Dashboard");
        init();
    }

    public void init() {
        btnShow = findViewById(R.id.btnShow);
        btnRegister = findViewById(R.id.btnRegister);
        btnSearch = findViewById(R.id.btnSearch);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);

        btnShow.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShow:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btnRegister:
                startActivity((new Intent(this, RegisterActivity.class)));
                break;
            case R.id.btnSearch:
                startActivity((new Intent(this, Search_Employee.class)));
                break;
            case R.id.btnUpdate:
                startActivity((new Intent(this, Update_employee.class)));
                break;
            case R.id.btnDelete:
                startActivity((new Intent(this, Delete_employee.class)));
                break;
        }
    }
}
