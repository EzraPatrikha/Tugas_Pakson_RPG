package OOP.dasar;

import java.util.Scanner;
public class lari {
    Scanner gg = new Scanner(System.in);
    String nama;
    int kecepatan;
    
    boolean jatuh(){
        if (kecepatan <=0) return true;
        return false;
   
    }
    void berlari(){
        System.out.println( nama + " Berlari di Lapangan");
        System.out.println("Dengan Kecepatan : "+kecepatan);

        do {
            System.out.println("Berlari...");
            System.out.println("Ada Belokan...");
            System.out.println("1 Ke kiri, 2 Ke kanan, 3 Lurus Saja");
            int belokan = gg.nextInt();
            switch (belokan) {
                case 1: System.out.println("Belok ke Kiri....");      
                    break;
                case 2: System.out.println("Belok ke kanan...");
                break;
                case 3: System.out.println("Lurus....");
                break;
                case 9: System.out.println("EGGI MUGI ABADI GANTENG BANGETTTTTTTTTTTTTTTTTTTT");
                default:
                    break;
            }
        } while (true);
    };

}
