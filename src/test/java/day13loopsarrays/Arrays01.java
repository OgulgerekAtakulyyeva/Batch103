package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {


    public static void main(String[] args) {
        /*
        Byte boolean short,int gibi ... containerlar iclerinde sadece tek bir deger barindirabilir.Ancak bazen coklu deger
        tasimasini istedigimiz containerlara ihtiyac duyariz.Buna Array denir.
        Icine yerlestirdigimiz Datalarin Data Type'i hep ayni olmalidir
         */


        /*
        Ayni data tipinde, coklu data'i depolamak icin Java'nin olusturdugu yapilar vardir.
        Bu yapilardan birisi de "Array"lerdir.
         */

        //Array nasil olusturulur?
        int stdAges[] = new int[7];// [0, 0, 0, 0, 0, 0, 0 ]


        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));


        //Array'lere elemanlar (element) nasil eklenir?
        stdAges[0]=12;
        stdAges[1]=11;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;

        System.out.println(Arrays.toString(stdAges));

        //Array'deki herhangi bir elemani nasil yazdriabiliriz?
        System.out.println(stdAges[4]);//10

        //Example 1:Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        //Note: "length()" String'lerde kullanilir,"length" Array'lerde kullanilir
        int son = stdAges[stdAges.length -1];
        System.out.println(ilk + son);//24

        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.

        int sum = 0;
        for(int i=0; i< stdAges.length;i++ ){
            sum = sum + stdAges[i];

        }

        System.out.println(sum);



        //2.Yol: while-loop
        int i=0;
        int toplam = 0;
        while(i<stdAges.length){

            toplam = toplam + stdAges[i];
            i++;
            }
        System.out.println(toplam);

        //3.Yol: do-while-loop
        int k =0;
        int s = 0;
        do {
            s=s+stdAges[k];
            k++;
        }while(k<stdAges.length);
        System.out.println(s);

        //4. Yol: for each loop Array'lerde ve Collections'larda kullanilir

        int t = 0;

        for(int w : stdAges){
            t = t + w;
        }

        System.out.println(t);


















        }


    }

