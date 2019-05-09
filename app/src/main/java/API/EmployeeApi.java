package API;

import java.util.List;

import Model.Employee;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeApi {
    @GET("employees")
    Call<List<Employee>> getEmployee();
}
