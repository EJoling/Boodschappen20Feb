// Klant geeft geld: omzet Supermarkt stijgt: boodschap gaat naar klant: boodschap gaat weg bij supermarkt

 class Boodschappen{
	 
 
	public static void main(String[] args) {
		Klant bert = new Klant();
		System.out.println("Geld Bert :" + bert.geld);
		Supermarkt supermarkt = new Supermarkt();
		System.out.println("Omzet Supermarkt :" + supermarkt.omzet);
		System.out.println("Boodschap in supermarkt :" + supermarkt.boodschap.aanwezig);
		System.out.println("Omzet Supermarkt: " + supermarkt.bezoeken(bert, supermarkt.boodschap.prijs));
		System.out.println("Boodschap in supermarkt :" + supermarkt.boodschap.aanwezig);
		System.out.println("Geld Bert :" + bert.geld);
		System.out.println("Boodschap Bert :" + bert.klantBoodschap.aanwezig);
		
		
	}
}
class Supermarkt{
	int omzet = 0;
	Boodschap boodschap = new Boodschap();
		
	int bezoeken(Klant naam, int prijs){
		omzet += prijs;
		boodschap.aanwezig = false;
		naam.geld -= boodschap.prijs;
		naam.klantBoodschap = new Boodschap();
		naam.klantBoodschap.aanwezig = true;
		
		return omzet;	
		}//end bezoeken
	
}//end Supermarkt

class Klant{
	int geld = 50;
	Boodschap klantBoodschap;
}
class Boodschap{
	int prijs = 30;
	boolean aanwezig = true;
}

