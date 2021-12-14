package Zadaca1;

public class MainClass {
	public static void main(String[] args) {
		Covek c= new Covek ();
		c.setIme("Gordana");
		c.setPrezime("Petreska");
		c.setEmbg("070800144xxx");
		
		System.out.println("Ime: " + c.getIme());
		System.out.println("Prezime: " + c.getPrezime());
		System.out.println("EMBG: " + c.getEmbg());

	}

}

