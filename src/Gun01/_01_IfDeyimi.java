package Gun01;

import java.util.Scanner;

public class _01_IfDeyimi {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");

        System.out.println("akın baba burada");

        for (int i = 0; i < 9; i++) {
            System.out.println("fenerbahçe şampiyon oldu");
        }

        System.out.println("hoca değişiklik");

        System.out.print("hoca değişiklik 2");

        System.out.println("deneme");

        System.out.println("deneme değişiklik en güncel gün yarın fenerin kadın futbol takımının maçı var.");

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen takım ismi giriniz = ");
        String takim= oku.nextLine();

        if (takim.equalsIgnoreCase("fener"))
            System.out.println("en büyük ");
        else System.out.println("fenerden başka takım giremezsin");

        System.out.println("bir şeye bakacam");


    }
}
