package latihan5;


public class Employee {
    // Properties
    protected String name;
    protected String employeeId;
    protected String department;

    // Constructor
    public Employee(String name, String employeeId, String department) {
        // TODO: Implementasi
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    // Method untuk calculate salary (akan di-override)
    public double calculateSalary() {
        // TODO: Return 0 (override di subclass)
        return 0;
    }

    // Method untuk calculate bonus (akan di-override)
    public double calculateBonus() {
        // TODO: Return 0 (override di subclass)
        return 0;
    }

    // Method display info
    public void displayInfo() {
        // TODO: Print employee info
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    // Method generate payslip
    public void generatePayslip() {
        // TODO: Generate dan print payslip
        System.out.println("\n=== PAYSLIP ===");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Base Salary: Rp " + calculateSalary());
        System.out.println("Bonus: Rp " + calculateBonus());
        System.out.println("Total: Rp " + (calculateSalary() + calculateBonus()));
        System.out.println("====================\n");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}