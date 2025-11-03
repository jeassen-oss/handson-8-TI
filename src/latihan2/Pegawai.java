package latihan2;

public class Pegawai {
    // Properties
    protected String nip;
    protected String nama;
    protected String jurusan;

    // Constructor
    public Pegawai(String nip, String nama, String jurusan) {
        // TODO: Implementasi
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        System.out.println("Pegawai constructor called");
    }

    public Pegawai(Dosen other, boolean b) {
    }

    // Method untuk di-override
    public void displayInfo() {
        // TODO: Print info pegawai
        System.out.println("=== Info Pegawai ===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    // Method clone dengan return type Pegawai
    public Pegawai clone() {
        // TODO: Return new Pegawai dengan data yang sama
        return new Pegawai(nip, nama, jurusan);
    }

    // Protected method untuk ditest widening
    protected void methodProtected() {
        // TODO: Print "Protected method in Pegawai"
        System.out.println("Protected method in Pegawai");
    }

    // Final method - tidak bisa di-override
    public final void calculateSalary() {
        // TODO: Print "Menghitung gaji pegawai..."
        System.out.println("Menghitung gaji pegawai...");
    }

    @Override
    public String toString() {
        // TODO: Override toString()
        return "Pegawai{nip='" + nip + "', nama='" + nama + "', jurusan='" + jurusan + "'}";
    }
}