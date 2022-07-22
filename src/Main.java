import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        /*EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.

         ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.

         18’in bölenleri : 1, 2, 3, 6, 9, 18

         24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24

         Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.

         EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.

         ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.

         6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …

         8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …

         Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.

         EKOK = (n1*n2) / EBOB

         Ödev
         Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.*/

        int sayi1, sayi2;
        int sayac=1, ebob=0, ekok=0, carpim;
        boolean durum = true;

        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz = ");

        sayi1 = inp.nextInt();

        System.out.println("Ikinci sayiyi giriniz = ");

        sayi2 = inp.nextInt();

        while(sayac<sayi1){

            if(sayi1 % sayac == 0 && sayi2 % sayac == 0){
                ebob = sayac;
            }
            sayac++;

        }

        if(ebob == 0){
            System.out.println("Girdiginiz sayinin ebobu yoktur.");
        }else{
            System.out.println("En buyuk ortak bolen (EBOB) = "+ebob);
        }

        sayac = 1 ;

        while(durum){

            carpim = sayi1 * sayac;

            if((carpim % sayi1 == 0 )&& (carpim % sayi2 == 0)){
                ekok = carpim;
                durum = false;
            }
            sayac++;

        }

        System.out.println("En kucuk ortak katlari (EKOK) = "+ekok);

        System.out.println("EKOK = (sayi1 * sayi2) / EBOB formulu ile ekok degeri = "+(sayi1*sayi2)/ebob);









    }

}
