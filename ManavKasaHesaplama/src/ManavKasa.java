import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutBirim,elmaBirim,domatBirim,muzBirim,patlicanBirim,armutKilo,elmaKilo,domatKilo,muzKilo,patlicanKilo,toplamKilo,armutFiyat,elmaFiyat,domatFiyat,muzFiyat,patlicanFiyat,toplamFiyat;
        Scanner inp= new Scanner(System.in);
        armutBirim=2.14;
        elmaBirim=3.67;
        domatBirim=1.11;
        muzBirim=0.95;
        patlicanBirim=5.00;
        System.out.println("Lütfen alınan armut miktarını girin:");
        armutKilo=inp.nextDouble();
        System.out.println("Lütfen alınan elma miktarını girin:");
        elmaKilo=inp.nextDouble();
        System.out.println("Lütfen alınan domates miktarını girin:");
        domatKilo=inp.nextDouble();
        System.out.println("Lütfen alınan muz miktarını girin:");
        muzKilo=inp.nextDouble();
        System.out.println("Lütfen alınan patlıcan miktarını girin:");
        patlicanKilo=inp.nextDouble();
        armutFiyat=armutBirim*armutKilo;
        elmaFiyat=elmaBirim*elmaKilo;
        domatFiyat=domatBirim*domatKilo;
        muzFiyat=muzBirim*muzKilo;
        patlicanFiyat=patlicanBirim*patlicanKilo;
        toplamFiyat=armutFiyat+elmaFiyat+muzFiyat+domatFiyat+patlicanFiyat;
        toplamKilo=armutKilo+elmaKilo+domatKilo+muzKilo+patlicanKilo;
        System.out.println("Almış olduğunuz armut miktarı: "+armutKilo+"Kg. Fiyatı ise: "+armutFiyat);
        System.out.println("Almış olduğunuz elma miktarı: "+elmaKilo+"Kg. Fiyatı ise: "+elmaFiyat);
        System.out.println("Almış olduğunuz domates miktarı: "+domatKilo+"Kg. Fiyatı ise: "+domatFiyat);
        System.out.println("Almış olduğunuz muz miktarı: "+muzKilo+"Kg. Fiyatı ise: "+muzFiyat);
        System.out.println("Almış olduğunuz patılacan miktarı: "+patlicanFiyat+"Kg. Fiyatı ise: "+patlicanFiyat);
        System.out.println("Yapmış olduğunuz alışveriş toplam: "+toplamKilo+"Kg. ve ödemeniz gereken tutar: "+toplamFiyat);
    }
}
