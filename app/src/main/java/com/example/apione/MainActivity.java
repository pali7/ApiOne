package com.example.apione;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import API.EmployeeApi;
import Model.Employee;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
 private TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Employees");

        tvData=findViewById(R.id.tvData);

        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EmployeeApi employeeApi =retrofit.create(EmployeeApi.class);
        Call<List<Employee>> listcall = employeeApi.getEmployee();

        listcall.enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                if (!response.isSuccessful()){
                    tvData.setText("code:" + response.code());
                    return;

                }
                List<Employee> employeeList = response.body();
                for (Employee employee: employeeList){
                    String content="";
                    content += "Id:" +employee.getID() + "\n";
                    content += "Name:" +employee.getEmployee_name() + "\n";
                    content += "Salary:" +employee.getEmployee_salary() + "\n";
                    content += "age:" +employee.getEmployee_age() + "\n";
                    content += "image:" +employee.getProfile_image()+ "\n";
                    content += "..............."  + "\n";

                    tvData.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {
             tvData.setText("error" + t.getMessage());
            }
        });

    }
}
