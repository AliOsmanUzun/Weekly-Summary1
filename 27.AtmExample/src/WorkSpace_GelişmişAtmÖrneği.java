
import java.util.Scanner;



public class WorkSpace_GelişmişAtmÖrneği {
	public static void main(String[] args) {

		// Ali Uzun : İBAN TR1234 000 567 985 123 3456 11 22
		// Necmi Kılıç : İBAN TR1234 000 0080 987 123 3456 11 22

		/*
		 * Ali'nin Kullanıcı Adı : alibaba58 , şifre : 5858 
		 * Bilal Kullanıcı Adı :hikobilal34 , şifre : 1234
		 *  Bakiye görüntülemek için -->1 
		 *  Para çekmek için -->2 
		 * Farklı hesaba para yatırmak için -->3 
		 * Uygulamadan çıkmak için --> q'tuşuna basınız.
		 */
		String menu = "Bakiye görüntülemek için -->1 \n" // \n operatörü ile string metinlerde satır atlanabiliyor
				+ "Para çekmek için -->2\n" + "Farklı hesaba para yatırmak için -->3\n"
				+ "Uygulamadan çıkmak için --> q'tuşuna basınız.";

		Scanner input = new Scanner(System.in);

		double ali_Bakiye = 6589;
		String ali_IBAN = "TR1234 000 567 985 123 3456 11 22";
		String ali_KullaniciAd = "alibaba58";
		String ali_Sifre = "5858";

		double necmi_Bakiye = 1458;
		String necmi_IBAN = "TR1234 000 0080 987 123 3456 11 22";
		String necmi_KullaniciAd = "hikonecmi34";
		String necmi_Sifre = "1234";

		System.out.println("ATM'ye HOŞGELDİNİZ :) ");
		System.out.println("Lütfen Bilgilerinizi Giriniz ");

		System.out.print("Kullanıcı Adı : ");
		String kullaniciAdi = input.nextLine();

		System.out.print("Şifre : ");
		String sifre = input.nextLine();

		// equals metodu iki string veriyi karşılaştırır birbirlerine eşitseler true
		// değer döndürür
		// Bir nevi eşittir operatörü ile aynı mantıkta çalışıyor.
		// Bu if deki koşulumun açıklaması şu kullanciAdi değikeni ile ali_KullaniciAd
		// birbirine eşit mi ve
		// sifre değişkenim ile ali_Sifre değişkenim birbirine eşit mi eşitse kod
		// bloğunu çalıştır.

		if (kullaniciAdi.equals(ali_KullaniciAd) && sifre.equals(ali_Sifre)) {
			System.out.println("Ali Uzun Hesabına Giriş Yapıldı... ");
			System.out.println(menu + "\n");
			System.out.print("Lütfen menü'den bir seçim yapınız : ");
			String secim_ali = input.nextLine();

			switch (secim_ali) {
			case "1":
				System.out.println("Mevcut Bakiyeniz : " + ali_Bakiye);
				break;
			case "2":
				System.out.print("Para çekmek için bir tutar giriniz : ");
				int ali_paracekim = input.nextInt();
				if (ali_Bakiye >= ali_paracekim) {
					System.out.println(ali_paracekim + " TL para çekimi yaptınız.");
					ali_Bakiye -= ali_paracekim;
					System.out.println("  Güncel bakiyeniz : " + ali_Bakiye);

				} else {
					System.out.println("Mevcut bakiyenizden fazla para çekemezsiniz!!!");
				}
				break;
			case "3":
				System.out.print("Ne kadar para yatırmak istiyorsunuz : ");
				int ali_parayatirma = input.nextInt();
				if (ali_Bakiye >= ali_parayatirma) {
					System.out.print("İban numarası giriniz : ");
					// Burada hata aldım nedeni ise nextInt metodu yalnızca sayıyı okuyor ve satır
					// sonu karakterini \n bırakıyor ardından gelen nextLine metoduda bu satır sonu
					// karakterini okuyor ve bu yüzden satır atlıyor boş bir satırmış gibi okuyor
					input.nextLine();
					String ali_KisiIBAN = input.nextLine();// Bunun nedeni, bir sayı girdiğimizde ve Enter tuşuna
															// bastığımızda , input.nextInt()yalnızca sayıyı tüketir,
															// "satır sonunu" değil.
					if (ali_KisiIBAN.equals(necmi_IBAN)) {
						System.out.println("Para Necmi Kılıç adlı kişiye yatırılıyor... ");
						System.out.println(ali_parayatirma + " TL Necmi Kılıç hesabına gönderildi ");
						ali_Bakiye -= ali_parayatirma;
						necmi_Bakiye += ali_parayatirma;
						System.out.println("Güncel bakiyeniz : " + ali_Bakiye);
					}
				} else {
					System.out.println("Mevcut bakiyenizden fazla para çekemezsiniz!!!");
				}

				break;
			case "q":
				System.out.println();
				System.out.println("Uygulamadan Çıkış Yaptınız");
				break;
			default:
				System.out.println("Lütfen Geçerli Bir Seçim Yapınız");
				break;
			}

		} else if (kullaniciAdi.equals(necmi_KullaniciAd) && sifre.equals(necmi_Sifre)) {
			System.out.println("Necmi Kılıç Hesabına Giriş Yapıldı...");
			System.out.println(menu + "\n");
			System.out.print("Lütfen menü'den bir seçim yapınız");
			String secim2 = input.nextLine();

			switch (secim2) {
			case "1":
				System.out.println("Mevcut Bakiyeniz : " + necmi_Bakiye);
				break;
			case "2":
				System.out.print("Para çekmek için bir tutar giriniz : ");
				int necmi_paracekim = input.nextInt();
				if (necmi_Bakiye >= necmi_paracekim) {
					System.out.println(necmi_paracekim + "TL para çekimi yaptınız.");
					necmi_Bakiye -= necmi_paracekim;
					System.out.println((necmi_Bakiye) + " : Güncel bakiyeniz");
				} else {
					System.out.println("Mevcut bakiyenizden fazla para çekemezsiniz!!!");
				}

				break;
			case "3":
				System.out.print("Ne kadar para yatırmak istiyorsunuz : ");
				int necmi_parayatirma = input.nextInt();

				if (necmi_Bakiye >= necmi_parayatirma) {
					System.out.print("İban numarası giriniz : ");
					// Burada hata aldım nedeni ise nextInt metodu yalnızca sayıyı okuyor ve satır
					// sonu karakterini \n bırakıyor ardından gelen nextLine metoduda bu satır sonu
					// karakterini okuyor ve bu yüzden satır atlıyor boş bir satırmış gibi okuyor
					input.nextLine();
					String necmi_KisiIBAN = input.nextLine();// Bunun nedeni, bir sayı girdiğimizde ve Enter tuşuna
																// bastığımızda , input.nextInt()yalnızca sayıyı
																// tüketir, "satır sonunu" değil.
					if (necmi_KisiIBAN.equals(ali_IBAN)) {
						System.out.println("Para Ali Uzun adlı kişiye yatırılıyor... ");
						System.out.println(necmi_parayatirma + " TL Necmi Kılıç hesabına gönderildi ");
						ali_Bakiye -= necmi_parayatirma;
						necmi_Bakiye += necmi_parayatirma;
						System.out.println("Güncel bakiyeniz : " + necmi_Bakiye);
					}
				} else {
					System.out.println("Mevcut bakiyenizden fazla para çekemezsiniz!!!");
				}
				break;
			case "q":
				System.out.println("Uygulamadan Çıkış Yaptınız");
				break;
			default:
				System.out.println("Lütfen Geçerli Bir Seçim Yapınız");
				break;
			}

		} else {
			System.out.println("Lütfen Doğru Kullanıcı Adı ve Şifre Giriniz...");
		}
		input.close();
	}
}
