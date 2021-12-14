package Zadaca2;

public class MainClass2 {

		public static void main(String[] args) {
		Restoran rest= new Restoran ();
		rest.setIme("Mirror");
		rest.setLokacija("Prilep");
		rest.setTelefon("078 730 687");
		rest.setBrsedishta("49");

		
		System.out.println("Kontakt telefonot na restoranot " + rest.getIme() + " koj se naogja vo " + rest.getLokacija() + " e: " + rest.getTelefon());
		System.out.println("Restoranot ima kapacitet od: " + rest.getBrsedishta() + " sedishta.");
		}

	}