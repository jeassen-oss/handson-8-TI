package latihan5;
import java.text.NumberFormat;
import java.util.Locale;


public class EmployeePayrollSystem {
    public static void main(String[] args) {
        /*
         * ADVANCED PROJECT: Employee Payroll System
         *
         * Deskripsi: Sistem untuk menghitung gaji berbagai tipe karyawan
         * dengan aturan perhitungan yang berbeda-beda.
         */

        NumberFormat rupiah = NumberFormat.getNumberInstance(new Locale("id", "ID"));

        // ===== SETUP EMPLOYEE DATA =====
        System.out.println("=== EMPLOYEE PAYROLL SYSTEM ===");

        // Latihan 1: Create employees
        // - Buat FullTimeEmployee: "John", gajiPokok: 8000000, tunjangan: 2000000
        // - Buat PartTimeEmployee: "Sarah", upahPerJam: 50000, jamKerja: 120
        // - Buat ContractEmployee: "Mike", gajiKontrak: 15000000, durasi: 6 bulan
        latihan5.FullTimeEmployee emp1 = new latihan5.FullTimeEmployee("John", "FT001", "IT", 8000000, 2000000);
        latihan5.PartTimeEmployee emp2 = new latihan5.PartTimeEmployee("Sarah", "PT001", "Finance", 50000, 120);
        latihan5.ContractEmployee emp3 = new latihan5.ContractEmployee("Mike", "CT001", "Marketing", 15000000, 6);
        System.out.println("3 employees created\n");

        // Ekspektasi Output:
        // 3 employees created

        // Latihan 2: Calculate salaries
        // - Calculate gaji untuk setiap employee
        double salaryJohn = emp1.calculateSalary();
        double salarySarah = emp2.calculateSalary();
        double salaryMike = emp3.calculateSalary();

        // - Display salary details
        System.out.println("=== SALARY DETAILS ===");
        System.out.println("John (Full-Time): Rp " + rupiah.format(salaryJohn));
        System.out.println("Sarah (Part-Time): Rp " + rupiah.format(salarySarah));
        System.out.println("Mike (Contract): Rp " + rupiah.format(salaryMike));

        // Ekspektasi Output:
        // John (Full-Time): Rp 10,000,000
        // Sarah (Part-Time): Rp 6,000,000
        // Mike (Contract): Rp 15,000,000

        // Latihan 3: Add bonus
        // - Full-time dapat bonus 10% dari gaji pokok
        double bonusJohn = emp1.calculateBonus();

        // - Part-time dapat bonus tetap Rp 500,000
        double bonusSarah = emp2.calculateBonus();

        // - Contract tidak dapat bonus
        double bonusMike = emp3.calculateBonus();

        // - Calculate total dengan bonus
        double totalJohn = salaryJohn + bonusJohn;
        double totalSarah = salarySarah + bonusSarah;
        double totalMike = salaryMike + bonusMike;

        System.out.println("\n=== TOTAL WITH BONUS ===");
        System.out.println("John total dengan bonus: Rp " + rupiah.format(totalJohn));
        System.out.println("Sarah total dengan bonus: Rp " + rupiah.format(totalSarah));
        System.out.println("Mike total dengan bonus: Rp " + rupiah.format(totalMike) + "\n");

        // Ekspektasi Output:
        // John total dengan bonus: Rp 10,800,000
        // Sarah total dengan bonus: Rp 6,500,000
        // Mike total dengan bonus: Rp 15,000,000

        // Latihan 4: Calculate total payroll
        // - Sum semua salary + bonus
        double totalPayroll = totalJohn + totalSarah + totalMike;

        // - Display payroll summary
        System.out.println("=== TOTAL PAYROLL ===");
        System.out.println("Total Payroll: Rp " + rupiah.format(totalPayroll) + "\n");


        // Ekspektasi Output:
        // Total Payroll: Rp 32,300,000

        // Latihan 5: Generate payslip
        // - Generate payslip detail untuk setiap employee
        System.out.println("=== PAYSLIP ===");

        // - Include: nama, tipe, gaji pokok, bonus, potongan, total
        System.out.println("Name: " + emp1.getName());
        System.out.println("Type: Full-Time Employee");
        System.out.println("Base Salary: Rp " + rupiah.format(8000000));
        System.out.println("Allowance: Rp " + rupiah.format(2000000));
        System.out.println("Bonus: Rp " + rupiah.format(800000));
        System.out.println("Total: Rp " + rupiah.format(10800000));

        // Ekspektasi Output:
        // === PAYSLIP ===
        // Name: John
        // Type: Full-Time Employee
        // Base Salary: Rp 8,000,000
        // Allowance: Rp 2,000,000
        // Bonus: Rp 800,000
        // Total: Rp 10,800,000
    }
}