public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();
        
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Hanin Mariam";
        m2.alamat = "Batam";
        m2.kelas = "2B";
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Arjuna Wildan";
        m3.alamat = "Lingga";
        m3.kelas = "2C";
        m3.displayBiodata();
    }
}
