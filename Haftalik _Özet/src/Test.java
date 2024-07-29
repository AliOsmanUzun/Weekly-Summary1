
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		
		
		// Dikdörtge'nin alanını hesaplama 
		System.out.println("DİKDÖRTGE'NİN ALANINI VE ÇEVRESİNİ HESAPLAMA UYGULAMASI");
		Scanner dikdortgen = new Scanner(System.in);
		System.out.print("Lütfen uzun kenarını giriniz : ");
		double length = dikdortgen.nextDouble();
		dikdortgen.nextLine();
		System.out.print("Lütfen kısa kenarını giriniz : ");
		double width = dikdortgen.nextDouble();
		dikdortgen.nextLine();

		double alan = length*width; 
		double cevre = 2*(length+width);
		
		System.out.println("Dikdörtgenin alanı : " + alan);
		System.out.println("Dikdörtgenin çevresi : " + cevre);
		System.out.println("****************************\n");
		

		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		// Sınav notuna göre harf notu veren uygulama Vize %40 , Final %60
		
		System.out.println("SINAV SONUCUNU ÖĞRENME UYGULAMASI");
		
		Scanner inputsinav = new Scanner(System.in);
		
		System.out.print("Vize notunuzu giriniz lütfen : ");
		double vizeNot = inputsinav.nextDouble();
		inputsinav.nextLine();
		System.out.print("Final notunuzu giriniz lütfen : ");
		double finalNot = inputsinav.nextDouble();
		inputsinav.nextLine();
		
		 double result = (vizeNot*0.40)+(finalNot*0.60) ;
		 String harf_not ; 
		 
		 if (result>=90) {
			harf_not ="A";
		}
		 else if (result>=80) {
			harf_not="B";
		}
		 else if (result>=70) {
			harf_not="C";
		}
		 else if (result>=60) {
			harf_not="D";
		}
		 else { // Koşulların hiç biri sağlanmıyorsa else bloğum çalışır otomatik olarak
			harf_not="F";
		}
		 System.out.println("Notunuz : "+result+" "+"Not dereceniz : "+harf_not);
		 System.out.println("******************************\n");
		 
		 /*
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  */
		 
		 
		 
 // Birden 10'a kadar olan sayıların faktöriyeli ve kullanıcının girmiş olduğu sayının faktöriyeli
		 
		 
	System.out.println("1'den 10'a kadar olan sayıların faktöriyelleri");	 
	for (int i = 1; i <=10; i++) {
		long faktoriyel = 1L;
		for(int j = 1 ; j<=i ; j++) {
			
			faktoriyel*=j;
			
		}
		System.out.println(i+" sayısının faktöriyeli "+ faktoriyel );
	}
	 
	System.out.println("**************************\n");
	System.out.println("FAKTÖRİYEL HESAPLAMA UYGULAMASINA HOŞ GELDİNİZ");
	Scanner input_asal = new Scanner(System.in);
	
	System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz lütfen : ");
	int asalsayi1= input_asal.nextInt();
	input_asal.nextLine();
	
	long sayi_f = 1;
	while(asalsayi1>0)
	{
		sayi_f*=asalsayi1;
		asalsayi1--;
	}
	System.out.println(sayi_f);
	
	
// Bir sayının pozitif tam bölenlerini gösteren ve toplamını ekrana yazan uygulama 
	
	Scanner input_toplam = new Scanner(System.in);
	
	System.out.println("SAYININ BÖLENLERİNİ TOPLAYAN VE GÖSTEREN UYGULAMA ");
	
	System.out.print("Lütfen bir sayı giriniz : ");
	
	int sayi_bolme = input_toplam.nextInt();
	
	System.out.println(sayi_bolme+ " sayısının tam bölen sayıların toplamı : "+toplam_bulma(sayi_bolme));

		
		
	
	
	
	input_asal.close();
	input_toplam.close();
	inputsinav.close();
	dikdortgen.close();
		
	}

	
	public static int toplam_bulma(int sayi) { // Girilen sayinini bölenlerini toplayabilmem için bir değişkene ihtiyacım var
		int toplam_sayi=0;
		for(int i = 1; i<sayi; i++) {
			
			if (sayi%i==0) {
				toplam_sayi+=i;
				System.out.println(i+" sayısı "+sayi+" sayısını tam bölüyor.");
			}
			
		}
		return toplam_sayi;
		
		
	}
	
}
