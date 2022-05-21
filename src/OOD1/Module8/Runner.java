package OOD1.Module8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        System.out.println(EnergyMatterCalculator.matterToEnergy(13));
        System.out.println(EnergyMatterCalculator.energyToMatter(1.16838173235786291E18));

        Employee.setMinimumWage(9.53);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        System.out.println(Arrays.asList(employee1, employee2, employee3).getClass());;

//        employee1.setHourlyWage(2);
//        employee2.setHourlyWage(2);
//        employee3.setHourlyWage(10);

//        System.out.println(employee1.getHouseWage());
//        System.out.println(employee2.getHouseWage());
//        System.out.println(employee3.getHouseWage());
        Employee employee = Employee.getEmployee();
        ArrayList<Employee> arrayList = new ArrayList<>(Arrays.asList(employee1, employee2, employee3));
        System.out.println();


    }
}
