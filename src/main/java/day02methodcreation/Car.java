package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public String fiyat = "20000";


    public static void main(String[] args) {

        //object nasıl oluşturulur?
        // 1) class ismi yazınız  2)objeye bir isim veriniz.  3)=   4) new keyword kullan  5)Class ismi parantezle beraber yazınız
                 Car                      myHonda                =          new                   Car();
              System.out.println(myHonda.fiyat);//20000
              System.out.println(myHonda.marka);//onda



           // MetodCreation classindan object oluşturduk.
                 MethodCreation obj = new MethodCreation();
                 System.out.println(obj.toplamaYap(3, 5)); //8.0


    }

    public void hareketEt(){
        System.out.println("honda güzel areket eder...");

    }

    public void dur(){
        System.out.println("honda güvenli areket eder..");
    }





}




