package Model;

public class Employee {
    private int id;
    private String employee_name;
    private Float employee_salary;
    private int employee_age;
    private String profile_image;

    public Employee(int ID, String employee_name, Float employee_salary, int employee_age, String profile_image) {
        this.id = id;
        employee_name = employee_name;
        employee_salary = employee_salary;
        employee_age = employee_age;
        profile_image=profile_image;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        employee_name = employee_name;
    }

    public Float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Float employee_salary) {
        employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        employee_age = employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
