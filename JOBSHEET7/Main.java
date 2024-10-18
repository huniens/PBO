public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        // Cetak tindakan yang unik untuk setiap objek
        System.out.println("Manusia sedang bernafas");
        manusia.makan();
        dosen.lembur();
        dosen.makan();
        mahasiswa.tidur();
        mahasiswa.makan();
    }
}