//Klavyeden derece cinsinden girilen açıyı radyan cinsine çeviren program.
/*
Adım 1: Başla.
Adım 2: Kullanıcıdan bir değer al.
Adım 3: Aldığın değeri (pi/180)= radyan olarak yap.
Adım 4: Aldığın değeri Ekrana Yazdır.
Adım 5: Dur.
*/

package aci_cevirme;
import java.util.Scanner; //Util kütüphanesini kullanarak Scanner class' import ettik.


public class Aci_cevirme {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Consoldan değer qlmqk için tanımladık.
        System.out.println("Lütfen derece cinsinden bir açı giriniz :");
        double aci=input.nextDouble();
        double pi =3.14;
        double radyan = ((aci*pi)/180);
        double gradyan=((aci*200)/180);
        
        System.out.println("Radyan Cinsinden Değerleri :" +radyan); // En son yaptığımız işlemi ekrana yazdırdık.
        System.out.println("Gradyan Cinsinden Değeri :" +gradyan);  // En son yaptığımız işlemi ekrana yazdırdık.
        
        
    }
    
}
