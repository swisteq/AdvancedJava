package company;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Jan", 200, 11);
        Manager employeeTwo = new Manager("Bogdan", 250, 50, 22);
        Secretary employeeThree = new Secretary("Kasia", 300, 23);

        Employee employeeFour = new Manager("Ola", 250, 50, 44);
        int salary = employeeFour.getSalary();
        System.out.println("Pensja Oli:" + salary);

        Employee employees [] = new Employee [3];
        employees[0] = employeeOne;
        employees[1] = employeeTwo;
        employees[2] = employeeThree;

        for (Employee e : employees){
            e.show();
            int employeeSalary = e.getSalary();
            System.out.println(employeeSalary);
        }

        employeeTwo.makeCall("123");
        employeeTwo.setSecretary(employeeThree);
        employeeTwo.makeCall("123");

        displayInformation(employeeOne);
        displayInformation(employeeTwo);
        displayInformation(employeeThree);
    }

    public static void displayInformation(Employee employee) {
        System.out.println();
        System.out.println("Przedstawia sie pracownik");
        employee.show();
    }
}
