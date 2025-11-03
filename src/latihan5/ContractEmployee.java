package latihan5;

public class ContractEmployee extends Employee {
    // Properties
    private double gajiKontrak;
    private int durasiKontrakBulan;

    // Constructor
    public ContractEmployee(String name, String employeeId, String department,
                            double gajiKontrak, int durasiKontrakBulan) {
        // TODO: Implementasi
        super(name, employeeId, department);
        this.gajiKontrak = gajiKontrak;
        this.durasiKontrakBulan = durasiKontrakBulan;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return gaji kontrak
        return gajiKontrak;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return 0 (tidak dapat bonus)
        return 0;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Implementasi
        super.displayInfo();
        System.out.println("Employee Type: Contract");
        System.out.println("Gaji Kontrak: Rp " + gajiKontrak);
        System.out.println("Durasi Kontrak: " + durasiKontrakBulan + " bulan");
    }
}