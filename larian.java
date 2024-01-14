package OOP.dasar;

public class larian {
    public static void main(String[] args) {
        lari object = new lari();

        object.nama = "Eggi";
        object.kecepatan = 0;

        object.berlari();
        
        if (object.jatuh()) {
            System.out.println("Anda Telah Jatuh dan Mati.");
        }
    }
}
