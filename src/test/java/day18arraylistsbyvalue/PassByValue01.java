package day18arraylistsbyvalue;

public class PassByValue01 {

    /*
    1)Java variable'larin orjinal degerlerini korumak ister.
    2)Variable method'lar icinde kullanildiginda,Java method'un
    icine orjinal degeri koymaz, o degerin kopyasini uretir
    ve method'a kopyayi yollar.Method kopya ustunde degisiklikler
    yapar dolayisiyla variable'in orjinal degeri korunmus olur.
    Bu sisteme "Pass By Value" denir.
    Note: Java "Pass By Value" kullanir. Java "Pass By Reference"  kullanmaz
    Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir.
    Bu isi developer'lara birakmistir.
    Bu tarz diller "Pass By Reference" kullanir.
    */


    public static void main(String[] args) {

        int x = 5;//Gomlek
        System.out.println(x);//5
        //static method olan "main method"un icindeki hersey
        //static olmalidir.
        change(x);//Ogrenci gomlegi

        System.out.println(x);//Gomlek

        int ucret = 100;

        ucret = indirim(ucret);

        System.out.println(ucret);//100
    }

    public static void change(int a){
        System.out.println(a*3);
    }
    //void disindaki "return" type'larda method body'si icinde
    //"return" keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti - 10;
    }

}
