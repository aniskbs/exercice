package mystere;

import java.io.Reader;
import java.util.Random;
import java.util.Scanner;

import javax.naming.ldap.HasControls;

public class mystere {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int nb = 0;
		int i = 1;
		char cb = 'a';
		int asc = 0;
		int asci = 0;
		
		System.out.println("-----------------Binvenue au jeu mystere------------------");
		System.out.println("-----------------veuillez choisir le niveau------------------");
		System.out.println("-----------------1: niveau facile------------------");
		System.out.println("-----------------2: niveau moyen------------------");
		System.out.println("-----------------3: niveau difficile------------------");
		System.out.println("-----------------0: quitter------------------");

		
		int niv = scan.nextInt();

		random.setSeed(123456789);
		
		

		
		switch (niv){
			case 1:
				int mys = random.nextInt(100);
				 
				
				int max = 15;
				System.out.println("niv facile: donner le mystere est un nombre entre 0 et 100");
				
				do {
					System.out.println("donner votre tentative, il vous reste "+(16 - i));
					nb = scan.nextInt();
					i++;
					
					if(nb < mys)
			        {
			            System.out.print("C'est plus !\n");
			        }
			         
			        else if(nb > mys)
			        {
			            System.out.print("C'est moins !\n");
			        }
			         
			        else
			        {
			            System.out.print("Bravo ! Vous avez trouvé le nombre " +mys+ " en " +i+ " essais !");
			        }
				}
				while (nb != mys && i < 16 );
				if (nb == mys) {
					System.out.println("Bravo");
				}
				break;
				
			case 2:
				mys = random.nextInt(10000);
				 
				max = 10;
				
				System.out.println("niv moyen: donner le mystere est un nombre entre 0 et 10000");
				do {
					System.out.println("donner votre tentative, il vous reste "+(11 - i));
					nb = scan.nextInt();
					i++;
					if(nb < mys)
			        {
			            System.out.print("C'est plus !\n");
			        }
			         
			        else if(nb > mys)
			        {
			            System.out.print("C'est moins !\n");
			        }
			         
			        else
			        {
			            System.out.print("Bravo ! Vous avez trouvé le nombre " +mys+ " en " +i+ " essais !");
			        }
				}
				while (nb != mys && i < 11 );
				break;
				
				
			case 3:
				char c = (char) ('a' + random.nextInt(26));
				
				mys = random.nextInt((100-10)+1)+10;
				 
				max = 10;
				
				
				 asci = (int) c;
	                while(i!=0){
	                    do{
	                    	System.out.println("niv difficile: donner le mystere est un nombre entre 10 et 100");
	                        nb=scan.nextInt();
	                        i--;
	                    }while(nb>100||nb<10);


	                    do{
	                        System.out.println(" Donner le caractere mystere entre a et z");
	                        c = scan.next().charAt(0);
	                        asc = (int) c;
	                    }while(asc<97||asc>122);




	                    if((nb==mys)&&(asc==asci))
	                    {
	                        System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
	                        i=0;
	                    }




	                    else if(nb>mys)
	                    {
	                        System.out.println("c'est moins, ");
	                        if(asc<asci)
	                        {
	                            System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
	                        }
	                        else if(asc>asci)
	                        {
	                            System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
	                        }
	                        else if((nb==mys))
	                        {
	                            System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
	                        } else if((asc==asci))
	                        {
	                            System.out.println("Le caractere est correct, il vous restes " +i+" tentatives");
	                        }


	                    }
	                    else if(nb<mys)
	                    {
	                        System.out.println("c'est plus");
	                        if(asc<asci)
	                        {
	                            System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
	                        }
	                        else if(asc>asci)
	                        {
	                            System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
	                        }
	                        else if((nb==mys))
	                        {
	                            System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
	                        } else if((asc==asci))
	                        {
	                            System.out.println("Le caractere est correct, il vous restes " +i+" tentatives");
	                        }
	                    }

	                    else if(nb==mys){
	                        System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
	                        if(asc<asci)
	                        {
	                            System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
	                        }
	                        else if(asc>asci)
	                        {
	                            System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
	                        }else if((asc==asci))
	                        {
	                            System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
	                        }
	                    }

	                    else if(asc==asci){
	                        System.out.println("Le caractere correct, il vous restes " +i+" tentatives");
	                        if(asc<asci)
	                        {
	                            System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
	                        }
	                        else if(asc>asci)
	                        {
	                            System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
	                        }else if((nb==mys))
	                        {
	                            System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
	                        }
	                    }


	                }
				break;
				
				
			
			case 0:	
				break;	
			
			
		}
	
	
	}

}
