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

    // ✅ FIX: Constructor khusus untuk cloning (tidak mencetak output)
    protected Pegawai(Pegawai other, boolean isClone) {
        this.nip = other.nip;
        this.nama = other.nama;
        this.jurusan = other.jurusan;
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
    @Override
    public Pegawai clone() {
        // TODO: Return new Pegawai dengan data yang sama
        return new Pegawai(this, true);
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