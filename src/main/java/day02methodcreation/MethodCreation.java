package day02methodcreation;

public class MethodCreation {
    //main method içinde kullanacağınız herşey static olmalidir.

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));
        System.out.println(üçSayiyiÇarp( 2, 1.5, 6));
        System.out.println(üçsayıişlemi(2,8,3.2));

        //sout yazip Enter e basın System.out.println() otomatik larak gelir.
        //Ekrana birşey yazdırmak için 2 tane kod var i)System.out.println() ln satırbaşi yapar ii)System.out.print() satır başı yapmaz.


    }

    //Example 1 : Toplama işlemi yapan bir method oluşturunuz.
    public static double toplamaYap(double a, double b){

        return  a+b;

    }
    //Example 2 : üç sayıyı birbiri ile çarpan bir method oluşturunuz.

    public static double üçSayiyiÇarp(double a, double b, double c){
        return  a*b*c;
    }
    //Example 3 : Üç sayıdan ilk ikisini toplayıp üçünçü ile çarpan method oluşturup ekrana yazdırınız.

    public static double üçsayıişlemi(double a, double b, double c){
        return (a+b)*c;
    }
}

