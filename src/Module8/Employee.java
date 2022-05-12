package Module8;

public class Employee {
    private String name;
    private String jobTitle;
    private double hourlyWage;
    private static double minimumWage;
    private static Employee employee;

    public Employee() {

    }

    public static Employee getEmployee() {
        if (employee == null) {
            employee = new Employee();
        }
        return employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getHouseWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage < minimumWage) {
            this.hourlyWage = minimumWage;
            return;
        }
        this.hourlyWage = hourlyWage;
    }

    public static double getMinimumWage() {
        return minimumWage;
    }

    public static void setMinimumWage(double minimumWage) {
        Employee.minimumWage = minimumWage;
    }
}
