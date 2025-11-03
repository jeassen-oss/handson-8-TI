package latihan5;

public class PartTimeEmployee extends Employee {
    // Properties
    private double upahPerJam;
    private int jamKerja;

    // Constructor
    public PartTimeEmployee(String name, String employeeId, String department,
                            double upahPerJam, int jamKerja) {
        // TODO: Implementasi
        super(name, employeeId, department);
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }


    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return upahPerJam * jamKerja
        return upahPerJam * jamKerja;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return bonus tetap 500000
        return 500000;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Implementasi
        super.displayInfo();
        System.out.println("Employee Type: Part-Time");
        System.out.println("Upah Per Jam: Rp " + upahPerJam);
        System.out.println("Jam Kerja: " + jamKerja + " jam");
    }
}