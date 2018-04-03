/*
K�sz�tsen futtathat� oszt�lyt
az el�bb defini�lt oszt�lyokat mag�ba foglal� csomag
alcsomagj�ban (pl. szemelyek.teszt.SzemelyTeszt)!

Ebben deklar�ljon k�t szem�ly t�pus� referenci�t!
Olvassa be az adataikat (n�v, kor)!

A referenci�k dinamikus t�pus�t ellen�rz�tt m�don hat�rozza meg
(ha 18 �v alatti akkor Gyermek, egy�bk�nt Feln�tt),
majd �rtelemszer�en olvassa be a Gyermek iskol�j�t,
ill. a Feln�tt munkahely�t �s hozza l�tre az objektumokat!

K�rdezze le a l�trej�tt objektumok t�pus�t
(instanceof) �s irassa ki az adataikat!
 */

/*
Eg�sz�tse ki a futtathat� oszt�lyt!
Amikor meghat�rozza a Szem�ly t�pus�ra deklar�lt referenci�k dinamikus t�pus�t,
a Feln�ttek eset�n ellen�rizze a munkahely �rt�k�t:
csak akkor lehet Alkalmazott, ha a munkahely nem "null"
(nem minden feln�tt alkalmazott)!

Ezek ut�n k�rdezze le a l�trej�tt objektumok t�pus�t (instanceof)
�s irassa ki az adataikat!

A String-ek egyez�s�nek vizsg�lat�ra haszn�lja a String oszt�ly
boolean equalsIgnoreCase(String anotherString)
met�dus�t!

M�dos�tsa �gy a futtathat� oszt�lyban a main metodus k�dj�t,
hogy hozzon l�tre egy n elem� Szem�ly t�mb�t!

Az adatok beolvas�sakor d�lj�n el,
hogy az adott szem�ly Gyermek, Feln�tt, vagy Alkalmazott!

Majd �letkoruk szerint n�vekv�en rendezve �rja ki az adataikat!
Haszn�lja a minimum kiv�laszt�sos rendez� elj�r�st!
 */

package szemelyek.teszt;

import java.util.Scanner;

//import szemelyek.Szemely;
//import szemelyek.Felnott;
//import szemelyek.Gyermek;
import szemelyek.*;

public class SzemelyTeszt {

	public static void main(String[] args) {
		//hazi feladat megvalositani tombbel is
		Szemely elso_szemely;
		Szemely masodik_szemely;
		
		String nev;
		int kor;
		String iskola_munkahely;
		
		Scanner beolvasas = new Scanner(System.in);

		//elso szemely
		System.out.println("Kerem adja meg az elso szemely nevet!");
		System.out.println("nev: ");
		nev = beolvasas.nextLine();

		System.out.println("Kerem adja meg az elso szemely korat!");
		System.out.println("kor: ");
		kor = beolvasas.nextInt(); beolvasas.nextLine();
		
		if (kor < 18) {
			System.out.println("Kerem adja meg az elso szemely iskolajat!");
			System.out.println("iskola: ");
			iskola_munkahely = beolvasas.nextLine();
			elso_szemely = new Gyermek(nev, kor, iskola_munkahely);
		} else {
			System.out.println("Kerem adja meg az elso szemely munkahelyet!");
			System.out.println("munkahely: ");
			iskola_munkahely = beolvasas.nextLine();

			if (iskola_munkahely.equalsIgnoreCase("null")) {
				elso_szemely = new Felnott(nev, kor, iskola_munkahely);
			} else {
				System.out.println("Kerem adja meg az elso alkalmazott fizeteset!");
				System.out.println("fizetes: ");
				long fizetes = beolvasas.nextLong(); beolvasas.nextLine();
				elso_szemely = new Alkalmazott(nev, kor, iskola_munkahely, fizetes);
			}			
		
		}
		
		//masodik szemely
		System.out.println("Kerem adja meg a masodik szemely nevet!");
		System.out.println("nev: ");
		nev = beolvasas.nextLine();

		System.out.println("Kerem adja meg a masodik szemely korat!");
		System.out.println("kor: ");
		kor = beolvasas.nextInt(); beolvasas.nextLine();
		
		if (kor < 18) {
			System.out.println("Kerem adja meg a masodik szemely iskolajat!");
			System.out.println("iskola: ");
			iskola_munkahely = beolvasas.nextLine();
			masodik_szemely = new Gyermek(nev, kor, iskola_munkahely);
		} else {
			System.out.println("Kerem adja meg a masodik szemely munkahelyet!");
			System.out.println("munkahely: ");
			iskola_munkahely = beolvasas.nextLine();
			
			if (iskola_munkahely.equalsIgnoreCase("null")) {
				masodik_szemely = new Felnott(nev, kor, iskola_munkahely);
			} else {
				System.out.println("Kerem adja meg a masodik alkalmazott fizeteset!");
				System.out.println("fizetes: ");
				long fizetes = beolvasas.nextLong(); beolvasas.nextLine();
				masodik_szemely = new Alkalmazott(nev, kor, iskola_munkahely, fizetes);
			}			
			
		}
		
		//K�rdezze le a l�trej�tt objektumok t�pus�t,
		//�s irassa ki az adataikat!

		System.out.println("elso szemely tipusa:");
		System.out.println(elso_szemely.getClass());
		System.out.println("elso szemely Szemely? Gyermek? Felnott? Alkalmazott?");
		System.out.println(elso_szemely instanceof Szemely);
		System.out.println(elso_szemely instanceof Gyermek);
		System.out.println(elso_szemely instanceof Felnott);
		System.out.println(elso_szemely instanceof Alkalmazott);
		
		System.out.println(elso_szemely);

		System.out.println();
		System.out.println("masodik szemely tipusa:");		
		System.out.println(masodik_szemely.getClass());
		System.out.println("masodik szemely Szemely? Gyermek? Felnott? Alkalmazott?");
		System.out.println(masodik_szemely instanceof Szemely);
		System.out.println(masodik_szemely instanceof Gyermek);
		System.out.println(masodik_szemely instanceof Felnott);
		System.out.println(masodik_szemely instanceof Alkalmazott);

		System.out.println(masodik_szemely);
				
		beolvasas.close();

/*
Hozzon l�tre egy n elem� Szem�ly t�mb�t!

Az adatok beolvas�sakor d�lj�n el,
hogy az adott szem�ly Gyermek, Feln�tt, vagy Alkalmazott!

Majd �letkoruk szerint n�vekv�en rendezve �rja ki az adataikat!
Haszn�lja a minimum kiv�laszt�sos rendez� elj�r�st!
 */
	
	}

}
