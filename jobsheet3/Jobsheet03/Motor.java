package Jobsheet03;

public class Motor {

    public String platNomor;
    public boolean isMesinOn;
    public int kecepatan;

    private static final int MAX_SPEED = 100;  // Set maximum speed to 100

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("=======================");
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > MAX_SPEED) {
            System.out.println("Kecepatan tidak boleh lebih dari " + MAX_SPEED + " km/h");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh kurang dari 0 km/h");
        } else {
            this.kecepatan = kecepatan;
        }
    }
}
