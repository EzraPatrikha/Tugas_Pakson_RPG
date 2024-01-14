package OOP.dasar;

import java.util.Scanner;
public class senjata {
    Scanner gg = new Scanner(System.in);
    String merek;
    int peluru;
    String loop;
    
    void tembak(){
        System.out.print("Tembak? : ");
        loop = gg.next();
        if (loop.equalsIgnoreCase("y")) {
            do {
                for (int i = peluru; i > 0; i--) {
                    System.out.print(i + " ");
                }
            System.out.print("Reload? : ");
            loop = gg.next();
            } while (loop.equalsIgnoreCase("y"));
            System.out.println("Oki ;3");
        } else if (loop.equalsIgnoreCase("n")) {
            System.out.println("Oki ;3");
        }
        }
    }
