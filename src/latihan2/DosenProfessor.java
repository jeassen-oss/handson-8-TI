package latihan2;

public class DosenProfessor extends Dosen {
    // Properties tambahan
    private String gelarProfesor;
    private int jumlahPenelitian;

    // Constructor
    public DosenProfessor(String nip, String nama, String jurusan,
                          String mataKuliah, int pengalamanMengajar,
                          String gelarProfesor, int jumlahPenelitian) {
        super(nip, nama, jurusan, mataKuliah, pengalamanMengajar);
        this.gelarProfesor = gelarProfesor;
        this.jumlahPenelitian = jumlahPenelitian;
        System.out.println("DosenProfessor constructor called");
    }

    protected DosenProfessor(DosenProfessor other, boolean isClone) {
        super(other, true); // FIX: panggil clone constructor dari Dosen (tanpa print)
        this.gelarProfesor = other.gelarProfesor;
        this.jumlahPenelitian = other.jumlahPenelitian;
        // FIX: Tidak ada System.out.println di sini agar cloning tidak spam output
    }

    // Override clone() agar tidak memanggil constructor asli (yang mencetak output)
    @Override
    public DosenProfessor clone() {
        return new DosenProfessor(this, true); // FIX
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Call super dan tambah info profesor
        super.displayInfo();
        System.out.println("Gelar Profesor: " + gelarProfesor);
        System.out.println("Jumlah Penelitian: " + jumlahPenelitian);
    }
}