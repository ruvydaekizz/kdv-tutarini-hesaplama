import java.util.Scanner;

public class KDV {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, kdvOran= 0.18 ;
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        System.out.println("KDV'siz tutar: "+ tutar);


        System.out.println("KDV Oranı: " + kdvOran);


        double kdvTutar= tutar * kdvOran;
        System.out.println("KDV tutarı: " + kdvTutar);


        double kdvliTutar= tutar + kdvTutar;                //(toplam)
        System.out.println("KDV'li tutar: " + kdvliTutar);

        //girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesapla
        double sonuc = (tutar > 0 && tutar <= 1000) ? (tutar * 0.18) : (tutar * 0.8) ;

        System.out.println("Sonuç: " + sonuc);


    }
}
