import java.util.Scanner;

public class Konyvtar {
	public static void main(String[] args) {
		//hozzunk letre egy konyv objektumot
		Konyv konyv = new Konyv("Kalman konyvei", "Kiss Kalman", 2018, 2000);
		
		//irassuk ki a konyv adatait
		System.out.println("A konyv adatai");
		System.out.println(konyv);
		
		//noveljuk a kony arat 3%-kal
		konyv.arat_szazalekkal_novel(3);		
		System.out.println(konyv);		

		//hasznaljuk a 2 paramteres konstruktort
		Konyv masik_konyv = new Konyv("Nora novenyei", "Nagy Nora");
		System.out.println(masik_konyv);
		
		//�rjon futtathat� oszt�lyt, amelyben l�trehoz 2 k�nyvet
		//(az adatokat beolvasva, mindk�t konstruktort haszn�lva),
		//majd ki�rja a String-be �sszef�z�tt adataikat!
		//Hasonl�tsa �ssze a k�t k�nyvet, hogy megegyezik-e a c�m�k!
		Scanner beolvasas = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az 1. konyv szerzojet!\nszerzo:");
		String szerzo = beolvasas.nextLine();

		System.out.println("Kerem adja meg az 1. konyv cimet!\ncim:");
		String cim = beolvasas.nextLine();

		System.out.println("Kerem adja meg az 1. konyv megjelenesi evet!\nmegjelenesi ev:");
		int megjelenesi_ev = beolvasas.nextInt();
		
		System.out.println("Kerem adja meg az 1. konyv arat!\nar:");
		int ar = beolvasas.nextInt();
		
		Konyv elso_konyv = new Konyv(cim, szerzo, megjelenesi_ev, ar);
		
		System.out.println("Az elso konyv adatai:");
		System.out.println(elso_konyv);
		
		System.out.println("Kerem adja meg a 2. konyv szerzojet!\nszerzo:");
		szerzo = beolvasas.nextLine(); szerzo = beolvasas.nextLine();

		System.out.println("Kerem adja meg a 2. konyv cimet!\ncim:");
		cim = beolvasas.nextLine();
		
		Konyv masodik_konyv = new Konyv(cim, szerzo);
		
		System.out.println("A masodik konyv adatai:");
		System.out.println(masodik_konyv);
		
		System.out.println("Az utolso 2 konyv cime megegyezik-e?");
		System.out.println(elso_konyv.cimEgyezikE(masodik_konyv));
		
		beolvasas.close();

	}
}
