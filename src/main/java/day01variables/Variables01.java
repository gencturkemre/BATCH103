package day01variables;

public class Variables01 {

    //Variable nasil oluşturulur?

    // 1)Access Modifier  2) Data Type 3)Variable ismi 4) =    5)Deger 6) ;
    // Javada ; ingilizcedeki . gibidir yani cümle bitti demektir.
    // ingilizcede cümle deriz java da statement deriz. yani statementden sonra ; konur. ;sonra boşluk koyma koysan sıkıntı olmaz.


    // = sembolü Assinment(Atama) operatör olarak adlandırılır
    //    Assinment(Atama) operatör sağdaki değeri alır soldaki variablenin içine koyar.

    public int age = 13;
    public int height = 183;

                         //Java da Data Typleri
    /*
                      Primitive(ilkel) Data Types
    1)int: integer in kısaltmasıdır. türkçede tam sayı demektir. 32 bit kullanır.
           Normalde matematikte tam sayıların başı ve sonu yoktur. fakat java da sayıların başı ve sonu vardır.
           En küçük int = -2,147,483,648
           En büyük int=   2,147,483,647

     2)byte: tamsayılar için kullanılır. 8 bit kullanır.
           En küçük byte = -128
           En büyük byte =  127

     3)short: tamsayılar için.        16 bit kullanır.
         En küçük =  -32768
         En büyük =   32767

     4)long : tamsayılar içindir.        64 bit kullanır.
        En küçük long = -9223372036854755808
        En büyük long =  9223372036854755807

     5) float: ondalıklı sayılar içindir. virgülden sonra 7 basamak içerir. 32 bit kullanır.
        sonuna f veua F konması gerekir.

     6)double: ondalıklı sayılar içindir. virgülden sonra 16 basamak içerir. 64 bit kullanır.

     7)boolean: true veya false değerleri için kullanılır. 1 bit kullanır.

     8)char: tek karakter için kullanılır. 16 bit kullanır.
                 A, c, 2, ?, _, =

        Not: charlara değer verirken değer tek tırnak arasına koyunuz Yoksa hata verir.
        Not: java büyük küçük harflere karşı duyarlıdır.
             java için TRUE ile true farklıdır.


        Not: Numeric data types: byte<short<int<long<float<double
             Numeric olayan data types: boolean - char

                       Non -Primitive Data Types

      String: isim, adres, kimlik no gibi bir veya birden fazla karakter içeren değerlerde kullanılır.
             String degerleri mutlaka çift tirnak arasina konulmalıdır.
             String  non-primitive dir. Yani bir String oluşturduğumuzda Java size bir suru metod verir.

     Primitive ile Non- Primitive lerin farkı nedir?
     1) Non- Primitive data tiplerinde değerin yanında metodlar vardır.
     Primitive data typlerinde ise sadece değer vardır. method yoktur.
     2)primitive data typleri java tarafından oluşturulmuştur. toplam 8 tanedir biz primitive data oluşturamayız
      Non - primitive data typleri java tarafından oluşturulmuştur biz de oluşturabiliriz. Non- primitive sayılamayacak kadar coktur
      çünkü her developer Non- Primitive data type oluşturabilir.
      3) Primitive data type isimleri küçük harfle başlar
         Non - Primitive data type isimleri büyük harfle başlar
      4) Primitive data typelar memoryde farklı büyüklükte yerler kullanır.
         Non- Primitivelerin hepsi memoryde aynı büyüklükte yer kullanır.

     */
     public byte price = 12;

     public short populationOfVillage = 23000;

     public float priceofShirt = 13.99f;

     public double weightOfcell = 0.000012045;

     // siz long demenize rağmen java verilen sayıyı int kabul eder.
    // Bu yüzden lon bir variableye int aralığı dıışında bie sayı verirseniz mutlaka sonuna Lveya l koyunuz.

     public long populationOfWorld = 7000000000L;

     // burada l koymadığımız alde problem yok 1234 int aralığına uyar.
    public long x = 1234;

     public boolean isOld = true;
     public boolean isRich = false;
     public char initial = 'S';

     public String name  = "Tom Hanks";

     // Note : "main metod" arabanin motoru gibidir.
     //          "main metod çalişmadan hiçbirşey çalişmaz.



    public static void main(String[] args) {

    }

}
