import java.util.Scanner;

public class lesBoucles {

	public static void main(String[] args) {
		// saisir et afficher un prenom
		
	Scanner clavier=new Scanner(System.in);
	String reponse ="OUI";
	String prenom;
	while (reponse =="OUI")
	{
		System.out.println("Veuillez siaisir un prenom :");
		prenom = clavier.nextLine();
		System.out.println("Bonjour " +prenom);
		reponse = "";
		while(reponse.equals("OUI") )
		{
			System.out.println("voulez vous saisir un autre prenom: ? OUI/NON");
			reponse = clavier.nextLine();
			System.out.println("la reponse est " +reponse );
			
		}
			
	}
	
	System.out.println("Au revoir soyez heureux au moins pour aujourd'hui ");
	
	}	
}
	
