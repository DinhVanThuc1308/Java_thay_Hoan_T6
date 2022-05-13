import java.util.ArrayList;
public class Main {
   

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<Employee>();
        Employees.add(new Employee("iker casillas", 5, 2.09, 100000.0));
        Employees.add(new Employee("roberto calos", 12, 3.0, 100000.0));
        Employees.add(new Employee("ronaldo", 16, 3.99, 100000.0));
        Employees.add(new Employee("raul", 17, 3.1, 100000.0));
        Employees.add(new Employee("marcelo", 10, 3.5, 100000.0));
        
        for (int i = 0; i < Employees.size(); i++) {
            System.out.println("\n- Nhan Vien Ma: "+ Employees.get(i).getEmployeeID());
            System.out.print("Ten: "+ Employees.get(i).getName());
            System.out.print(" - Luong: "+ Employees.get(i).Salary());
        }

    }
}
}
