package latihan5;

public class FullTimeEmployee extends Employee {
    // Properties
    private double gajiPokok;
    private double tunjangan;

    // Constructor
    public FullTimeEmployee(String name, String employeeId, String department,
                            double gajiPokok, double tunjangan) {
        // TODO: Implementasi
        super(name, employeeId, department);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return gajiPokok + tunjangan
        return gajiPokok + tunjangan;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return 10% dari gaji pokok
        return gajiPokok * 0.10;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Call super dan tambah info full-time
        super.displayInfo();
        System.out.println("Employee Type: Full-Time");
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
    }
}