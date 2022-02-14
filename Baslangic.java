package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
    //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
        // kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //Java ile kombinasyon hesaplayan program yazınız.
        //
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        int n,r,i,toplamN=1,toplamR=1,k,s,toplamNS=1,C;
        Scanner input=new Scanner(System.in);
        System.out.println("sayiyi girin");
        n=input.nextInt();
        System.out.println("sayiyi girin");
        r=input.nextInt();
        for (i=1;i<=n;i++){
            toplamN=toplamN*i;
            //System.out.println(toplamN);
        }
        //System.out.println(toplamN);
        for (k=1;k<=r;k++){
            toplamR=toplamR*k;

        }
        //System.out.println(toplamR);
        for (s=1;s<=(n-r);s++){
             toplamNS=toplamNS*s;
           // System.out.println(n-r);

        }
        //System.out.println(toplamNS);

        C = toplamN / (toplamR * toplamNS);
        System.out.println(C);




    }


    }




