package latihaninterface;

public class MainClass {
    public static void main(String[] args) {
        // Instansiasi objek
        Kulkas kulkas = new Kulkas(2, 3000000, "Putih", "Samsung");
        Kipas kipas = new Kipas("Tornado", 500000, "Hitam", "Panasonic");
        SmartFridge smartFridge = new SmartFridge(10, 3, 10000000, "Perak", "LG");
        TV tv = new TV("LED", 15, 5000000, "Hitam", "Sony");

        // Menampilkan info
        System.out.println("Informasi Perangkat Elektronik:");
        System.out.println("--------------------------------");
        System.out.println("Kulkas       : " + kulkas.getInfo());
        System.out.println("Kipas        : " + kipas.getInfo());
        System.out.println("Smart Fridge : " + smartFridge.getInfo());
        System.out.println("TV           : " + tv.getInfo());
    }
}
