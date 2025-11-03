package latihan2;

public class MethodOverridingPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Method Overriding
         *
         * Instruksi: Lengkapi semua latihan untuk menguasai method overriding,
         * covariant return types, dan best practices.
         */

        // ===== BASIC METHOD OVERRIDING =====
        System.out.println("=== BASIC METHOD OVERRIDING ===");

        // Latihan 1: Override method toString()
        // - Buat object Mahasiswa dengan parameter:
        //   nim: "2024001", nama: "Budi", jurusan: "Informatika", ipk: 3.75
        Mahasiswa m1 = new Mahasiswa("2481037", "jeassen", "Informatika", 3.75);

        // - Print object menggunakan toString()
        System.out.println(m1);

        // Ekspektasi Output:
        // Mahasiswa{nim='2024001', nama='Budi', jurusan='Informatika', ipk=3.75}

        // ===== BASIC METHOD OVERRIDING =====
        System.out.println("\n=== BASIC METHOD OVERRIDING EQUALS ===");

        // Latihan 2: Override method equals()
        // - Buat dua object Mahasiswa dengan NIM yang sama
        Mahasiswa m2 = new Mahasiswa("2481012", "given", "Sistem Informasi", 3.80);

        // - Compare menggunakan equals()
        System.out.println("m1.equals(m2): " + m1.equals(m2));

        // - Compare menggunakan == (reference equality)
        System.out.println("m1 == m2: " + (m1 == m2));

        // Ekspektasi Output:
        // m1.equals(m2): true (karena NIM sama)
        // m1 == m2: false (referensi berbeda)

        // ===== OVERRIDING WITH SUPER =====
        System.out.println("\n=== OVERRIDING WITH SUPER ===");

        // Latihan 3: Override dengan memanggil super
        // - Buat object Dosen dengan parameter:
        //   nip: "198901001", nama: "Dr. Sarah", jurusan: "Informatika",
        //   mataKuliah: "PBO", pengalamanMengajar: 10
        Dosen dosen = new Dosen("198901001", "Dr. Sarah", "Informatika", "PBO", 10);

        // - Panggil method displayInfo()
        dosen.displayInfo();

        // Ekspektasi Output:
        // === Info Pegawai ===
        // NIP: 198901001
        // Nama: Dr. Sarah
        // Jurusan: Informatika
        // Mata Kuliah: PBO
        // Pengalaman: 10 tahun

        // ===== OVERRIDING WITH SUPER =====
        System.out.println("\n=== CHAIN OF OVERRIDING ===");

        // Latihan 4: Chain of overriding
        // - Buat object DosenProfessor extends Dosen
        DosenProfessor dosprof = new DosenProfessor("197712301", "Prof. Rudi Hartono", "Teknik Informatika", "Pemrograman Java", 20, "Profesor", 25);

        // - Override displayInfo() untuk menambah info gelar profesor
        dosprof.displayInfo();

        // - Test chain dari Pegawai -> Dosen -> DosenProfessor

        // Ekspektasi Output:
        // Pegawai constructor called
        // Dosen constructor called
        // DosenProfessor constructor called
        // [info lengkap dengan gelar profesor]

        // ===== COVARIANT RETURN TYPES =====
        System.out.println("\n=== COVARIANT RETURN TYPES ===");

        // Latihan 5: Return type yang lebih spesifik
        // - Override method clone() untuk return type yang lebih spesifik
        System.out.println(">> Constructor normal dipanggil");
        Dosen original = new Dosen("198901001", "Dr. Sarah", "Informatika", "PBO", 10);

        System.out.println("\n>> Cloning dimulai");
        Dosen cloned = original.clone();

        // - Parent return type: Pegawai
        System.out.println("Parent return type: Pegawai");

        // - Child return type: Dosen (covariant)
        System.out.println("Child return type: Dosen (covariant)");
        System.out.println("Clone berhasil dengan type yang lebih spesifik");
        System.out.println("original != clone : " + (original != cloned));
        System.out.println("original.equals(clone) : " + (original.nip.equals(cloned.nip)
                && original.nama.equals(cloned.nama)));

        // Ekspektasi Output:
        // Clone berhasil dengan type yang lebih spesifik
        // original != clone (referensi berbeda)
        // original.equals(clone) (konten sama)

        // ===== OVERRIDING RULES =====
        System.out.println("\n===== OVERRIDING RULES =====");

        // Latihan 6: Access modifier rules
        // - Override method dengan access yang sama atau lebih luas
        System.out.println("Widening access: Public method in Dosen");

        // - Test: protected -> public (VALID)
        System.out.println("Widening access modifier: ALLOWED");

        // - Test: public -> protected (INVALID - compile error)
        System.out.println("Narrowing access modifier: COMPILE ERROR");

        // Ekspektasi Output:
        // Widening access modifier: ALLOWED
        // Narrowing access modifier: COMPILE ERROR

        // ==== Testing Return Type Rules ===
        System.out.println("\n=== Testing Return Type Rules ===");


        // Latihan 7: Return type rules
        // - Override dengan same return type
        System.out.println("Same return type: VALID");

        // - Override dengan covariant return type
        System.out.println("Covariant return type: VALID");

        // - Override dengan unrelated return type (ERROR)
        System.out.println("Unrelated return type: COMPILE ERROR");


        // Ekspektasi Output:
        // Same return type: VALID
        // Covariant return type: VALID
        // Unrelated return type: COMPILE ERROR

        // ===== FINAL METHOD TYPES =====
        System.out.println("\n=== FINAL METHOD TYPES ===");

        // Latihan 8: Final method
        // - Try to override final method -> COMPILE ERROR
        // - Final method tidak bisa di-override
        System.out.println("Cannot override final method: COMPILE ERROR");

        // Ekspektasi Output:
        // Cannot override final method: COMPILE ERROR
    }
}