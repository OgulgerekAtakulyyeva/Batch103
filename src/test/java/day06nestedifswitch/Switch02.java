package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
        Kullanicidan ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz
         */

        //Note: toLowerCase() methodu bir String'deki tum character'leri kucuk harfe cevirir.
        //      toUpperCase() methodu bir String'deki tum character'leri buyuk harfe cevirir.



        Scanner input = new Scanner(System.in) ;
        System.out.println("Ay ismini giriniz....");
        String ayIsmi = input.next().toLowerCase();


        switch(ayIsmi){

            case "Ocak":
                System.out.println("Ocak");
            case "Subat":
                System.out.println("Subat");
            case "Mart":
                System.out.println("Mart");
            case "Nisan":
                System.out.println("Nisan");
            case "Mayis":
                System.out.println("Mayis");
            case "Haziran":
                System.out.println("Haziran");
            case "Temmuz":
                System.out.println("Temmuz");
            case "Agustos":
                System.out.println("Agustos");
            case "Eylul":
                System.out.println("Eylul");
            case "Ekim":
                System.out.println("Ekim");
            case "Kasim":
                System.out.println("Kasim");
            case "Aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli bir ay ismi yaziniz");
        }



    }

}
