package latihan2;

public class Dosen extends Pegawai {
    // Properties tambahan
    private String mataKuliah;
    private int pengalamanMengajar;

    // Constructor
    public Dosen(String nip, String nama, String jurusan,
                 String mataKuliah, int pengalamanMengajar) {
        // TODO: Implementasi dengan super
        super(nip, nama, jurusan);
        this.mataKuliah = mataKuliah;
        this.pengalamanMengajar = pengalamanMengajar;
        System.out.println("Dosen constructor called");
    }


    // ✅✅ FIX: Constructor clone versi OBJECT (dipakai untuk super(other,true) di DosenProfessor)
    protected Dosen(Dosen other, boolean isClone) {   // FIX
        super(other, true); // FIX: memanggil clone constructor Pegawai
        this.mataKuliah = other.mataKuliah;
        this.pengalamanMengajar = other.pengalamanMengajar;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Override dengan info dosen
        super.displayInfo();
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Pengalaman: " + pengalamanMengajar + " tahun");
    }

    // Override clone dengan covariant return type
    @Override
    public Dosen clone() {
        // TODO: Return new Dosen
        return new Dosen(this, true);
    }

    // Override dengan widening access
    @Override
    public void methodProtected() {
        // TODO: Override dari protected ke public
        System.out.println("Widening access: Public method in Dosen");
    }
}