public class Mahasiswa extends Manusia {
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }

    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan di kantin");
    }
}   