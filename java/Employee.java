public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void updateSalary(double increasePercentage) {
        double increaseAmount = salary * (increasePercentage / 100);
        salary += increaseAmount;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Software Engineer", 50000);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Annual Salary: $" + employee.calculateAnnualSalary());

        employee.updateSalary(10); // Increase salary by 10%

        System.out.println("\nUpdated Salary: $" + employee.getSalary());
    }
}
