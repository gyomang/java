package travaux_java;

import java.util.Scanner;

public class hello_world {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String reponse;
		
		
		System.out.println("------------------------------------------------");
		
		
		System.out.println("wsh alors | srola hsw  --ERROR 100456 (DIE MURDER ROBOT WARS)");
		System.out.println("dit un truc maggle  --ERROR 708460 (NIGHT MONSTER CRY DRUGS)");
		
		reponse=scan.nextLine().toLowerCase();
		System.out.println(reponse);
		
		
		
		System.out.println("------------------------------------------------");
		
		
		
		int gui = 4;
		if(gui==4) {
			System.out.println("quel beau chiffre  --ERROR 200753 (BREAK MODE HARD SUICIDE)");
		}else {
			System.out.println("jeune psyco vas  --ERROR 201003 (CREEPY DEVIL PAIN DAMN)");
		}
		

		
		System.out.println("------------------------------------------------");

		
		
		System.out.println("Donne un mot please ...  --ERROR 145960 (END RAGE MADNESS BLOOD)");
		String reponse2=scan.nextLine();
		
		if(reponse2.equals("oui")) {
			System.out.println("bon chien^^  --ERROR 299045 (PUNISH GOD LOOSE DEPRESION)");
		}else {
			System.out.println("you lose^^  --ERROR 490344 (FALSE LAVA BONES RISK)");
		}

		
		
		System.out.println("------------------------------------------------");
		
		
		
		System.out.println("Donne unE ANNEE please ...  --ERROR 145960 (END RAGE MADNESS BLOOD)");
		String reponse3=scan.nextLine();
		int lol = Integer.parseInt(reponse3);
		
		int lol2 = lol / 4;
		if(lol2*4==lol){
			int lol3 = lol / 100;
			if(lol3*100==lol) {
				int lol4 = lol / 400;
				if(lol4*400!=lol) {
					System.out.println("annee non bisextile");
				}else {
					System.out.println("annee bisextile");
				}
			}else {
				System.out.println("annee bisextile");
			}
		}else {
			System.out.println("annee non bisextile");
		}
		
		
		
		System.out.println("---------petit element de correction---------------------------------------");
		
		
		
		System.out.println("donne chiffre");
		int a = scan.nextInt();
		if(a%4==0) {
			System.out.println("xtrmst");
		}
		
		
		
		scan.close();
	}

}
