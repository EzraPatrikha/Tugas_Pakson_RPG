package OOP.dasar;

import java.util.Random;
public class RNG {
    public static void main(String[] args) {
        Random random = new Random();
        int Palabapakkau;
        
        
        Palabapakkau = random.nextInt();
        System.out.println("My random Number: "+ Palabapakkau);
        
        Palabapakkau = random.nextInt(10); //0-10
        System.out.println("0-10? = "+Palabapakkau);
        
        //shifting
        Palabapakkau = random.nextInt(10) + 1; //1-10
        System.out.println("My Random Number : "+Palabapakkau);
    }
    
    /*Cara Bekerjanya RNG adalah jika Class = random.nextInt(); Maka Akan Melakukan RNG nah, Bedanya
     * Ketika kita Class = random.nextInt(10); Dari Code tersebut, Hanya akan RNG dari 0-9
     * Tetapi ketika ingin dibuat menjadi 1-10, Class = random.nextInt(9) + 1 ini akan jadi 1-10
     * Mengapa? Dikarenakan komputer selalu berjalan mulai dari 0, dengan ada (9) + 1 maka anda akan menambahkan
     * 0+1 dan 9+1 Ia akan menghitung dari 1-10 dan 0 sudah Tidak Termasuk.
    */
}
