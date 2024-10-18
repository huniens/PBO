public class Segitiga {
    
    // Overloading metode totalSudut
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Overloading metode keliling
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(sisiA * sisiA + sisiB * sisiB);
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // Output untuk metode totalSudut
        System.out.println("Sudut ketiga (jika sudut A 70 derajat): " + segitiga.totalSudut(70) + " derajat");
        System.out.println("Sudut ketiga (jika sudut A 60 dan sudut B 50): " + segitiga.totalSudut(60, 50) + " derajat");

        // Output untuk metode keliling
        System.out.println("Keliling segitiga (sisi A = 3, B = 4, C = 5): " + segitiga.keliling(3, 4, 5));
        System.out.println("Sisi miring segitiga (sisi A = 3, B = 4): " + segitiga.keliling(3, 4));
    }
}
