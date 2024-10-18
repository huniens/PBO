public class perkalianku {
    void perkalian(int a,int b){
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String args []) {
        perkalianku objek = new perkalianku();

        //objek.perkalian(25, 43);
        //objek.perkalian(34.56, 23.7);

        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}
