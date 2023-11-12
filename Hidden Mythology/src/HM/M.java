package HM;

import java.util.Scanner;

interface Button //abstraction
{
	abstract public void loGin();
}

class Login implements Button
{
	public void loGin() // Run Time polymorphism
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		int age = sc.nextInt();
		
			if(age<12)
			{
				try
				{
					throw new InvalidAgeException("Your Age should be more than 12 years");
				}
				catch(ArithmeticException ae)
				{
					System.out.println("==================");
					System.out.println("YOU ARE UNDER AGE");
					System.out.println("==================");
					loGin();
				}
			}
			else
			{
				Scanner ln = new Scanner(System.in);
				System.out.println("==================");
				System.out.println("Enter the USERNAME : ");
				System.out.println("==================");
			    String username = ln.nextLine();
			    System.out.println("==================");       
				System.out.println("Enter the PASSWORD : ");
				System.out.println("==================");
				long password = ln.nextLong();	
				{
					
					if((username.equals("Shriii_02")) && password==12345)
					{
						System.out.println("======================");
						System.out.println("LOGIN SUCCESSFULL");
						System.out.println("======================");
						System.out.println("THE HIDDEN HINDU");
						User.theHiddenHIndu();
					}
					else
					{
						System.out.println("INVALID CREDENTIALS !!!");
						System.out.println("PLEASE TRY AGAIN...");
						System.out.println("======================");
						loGin();
					}

				}
			}
	    	
	}
}

class InvalidAgeException extends ArithmeticException
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}

class TheHiddenHindu //super class
{
	{
		Scanner thh = new Scanner(System.in);
//		System.out.println("THE HIDDEN HINDU");
		
	}
}

class User extends TheHiddenHindu
{
	public static void theHiddenHIndu()
		{
			Scanner thh = new Scanner(System.in);

			Abc.user();

	        System.out.print("Input your choice: ");
	        int ch = thh.nextInt(); // Here we are reading user's choice

		        switch (ch)
		        {
		            case 1:  // DIVINE UNIVERSE
						
						DivineUniverse.divineUniverse();	
						
		                System.out.print("Input your choice: ");
						int du = thh.nextInt();
		
						if (du==1)
						{
							Lords.lords();	
							
			           
						}
						else if (du==2)
						{
							Yugas.yugas();
							
							System.out.print("Input your choice: ");
					        int ch1 = thh.nextInt(); // Here we are reading user's choice
					        
							 switch (ch1)
						        {
							 		
						            case 1:  // DIVINE UNIVERSE
										thh.nextLine();
										{
											Kreta.kreTa();
									        break;
										}
										
						            case 2:
						            	thh.nextLine();
						            	{
						            		Treta.treTa();
						            		break;
						            	}
									
						            case 3:
						            	thh.nextLine();
						            	{
						            		Dvapara.dvaPara();
						            		break;
						            	}
										
										
						            case 4:
						            	thh.nextLine();	
						            	{
						            		Kali.kali();
						            		break;
						            	}
						            case 5:
						            	
						            	DivineUniverse.divineUniverse();
						            	
									break;
									
									default:
										
						        }
						}
						else if (du==3)
						{
							Chiranjivis.chiranJivis();
							break;
						}
						else if (du==4)
						{
							Ratnas.ratNas();
							break;
						}
						else if (du==5)
						{
							Saptarishis.saptaRishis();
							break;
						}
						else if (du==6)
						{
							Avatars.avaTars();
							break;
						}
						else 
						{
							User.theHiddenHIndu();
						}
		
		                break;
		               
		                
		          
		
		            case 2:  // MYTHOLOGY
		            {
		            	Mythology.mythLogy();
		            }
		
						System.out.print("Input your choice: ");
						int myt = thh.nextInt();
		
						if (myt==1)
						{
							Stories.stoRies();
							break;
						}
						else if (myt==2)
						{
							Facts.facTs();
							break;
						}
						else
						{
							User.theHiddenHIndu();						}
						break;
		
					case 3:  // HINDIUSM

		                Hindiusm.hindiUsm();

		
						System.out.print("Input your choice: ");
						int hind = thh.nextInt();
		
						if (hind==1)
						{
							Vedas.veDas();
							break;
						}
						else if (hind==2)
						{
							Puranas.puraNas();
							break;
						}
						else if (hind==3)
						{
							Sanskars.sansKars();
							break;
						}
						else if (hind==4)
						{
							Concepts.conCepts();
							break;
						}
						else
						{
							User.theHiddenHIndu();
						}
		
		                break;
		
		            case 4: // SPIRITUAL BOOKS
		
		                SpiritualBooks.spiRitualBooks();
		
						System.out.print("Input your choice: ");
						int sb = thh.nextInt();
		
						if(sb==1)
						{
							Spiritual_books.spiritualBooks();
							break;
						}
						else
						{
							User.theHiddenHIndu();
						}
		
						break;
		
		            case 5:  // 33 KOTI GODS
		              
		            	KotiGods.kotiGods();
		
						System.out.print("Input your choice: ");
						int kg = thh.nextInt();
		
						if (kg==1)
						{
							Vasus.vaSus();
							break;
						}
						else if (kg==2)
						{
							Rudras.rudRas();
							break;
						}
						else if (kg==3)
						{
							Adityas.aditTyas();
							break;
						}
						else if (kg==4)
						{
							Indrajit.indraJit();
							break;
						}
						else if (kg==5)
						{
							Prajapati.prajaPati();
						}
						else
						{
							User.theHiddenHIndu();
						}
		
		                break;
		
		            case 6:
		                System.exit(0);
		
		            default:
		                System.out.println("The choice is Invalid! Enter a valid choice. \n\n");
		        }
		    }
}
class Abc
		{
				
				public static void user() 
				{
					System.out.println("======================");
			        System.out.println("1 - DIVINE UNIVERSE");
			        System.out.println("2 - MYTHOLOGY");
			        System.out.println("3 - HINDIUSM");
			        System.out.println("4 - SPIRITUAL BOOKS");
			        System.out.println("5 - 33 KOTI GODS");
					System.out.println("6 - EXIT");
					System.out.println("======================"); 
					
				}
		}
		
class DivineUniverse 
		{
				
				public static void divineUniverse() 
				{					
					System.out.println("======================");
		            System.out.println("CHOOSE ONE OF THE FOLLOWING");
		            System.out.println("======================");
					System.out.println("1.LORDS");
					System.out.println("2.YUGAS");
					System.out.println("3.CHIRANJIVIS");
					System.out.println("4.RATNAS");
					System.out.println("5.SAPTARISHIS");
					System.out.println("6.AVATARS");
					System.out.println("7.PREVIOUS PAGE");
					System.out.println("======================");
			        
					
				}
		}
class Lords
{
				
				public static void lords() 
				{
					System.out.println("======================");
					System.out.println("1.BRAHMA");
					System.out.println("2.VISHNU");
					System.out.println("3.SHIVA");
					System.out.println("4.GANESHA");
					System.out.println("5.KRISHNA");
					System.out.println("6.HANUMAN");
					System.out.println("7.LAKSHMI");
					System.out.println("8.DURGA");
					System.out.println("9.KALI");
					System.out.println("10.SARASWATI");
					System.out.println("11.INDRA");
					System.out.println("12.SITA");
					System.out.println("13.AGNI");
					System.out.println("14.KARTIKEYA");
					System.out.println("15.KARMA");				
					System.out.println("16.FOR MAIN PAGE"); 
					System.out.println("17.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int lo = thh.nextInt();
					
					if(lo==1)
					{
						Brahma.brahma();
						
					}
					else if(lo==2)
					{
						Vishnu.vishnu();
					}
					else if(lo==3)
					{
						Shiva.shiva();
					}
					else if(lo==4)
					{
						Ganesha.ganesha();
					}
					else if(lo==5)
					{
						Krishna.krishna();
					}
					else if(lo==6)
					{
						Hanuman.hanuman();
					}
					else if(lo==7)
					{
						Laxmi.laxmi();
					}
					else if(lo==8)
					{
						Durga.durga();
					}
					else if(lo==9)
					{
						Kali.kali();
					}
					else if(lo==10)
					{
						Saraswati.saraswati();
					}
					else if(lo==11)
					{
						Indra.indra();
					}
					else if(lo==12)
					{
						Sita.sita();
					}
					else if(lo==13)
					{
						Agni.agni();
					}
					else if(lo==14)
					{
						Kartikeya.kartikeya();
					}
					else if(lo==15)
					{
						Karma.karma();
					}
					else if(lo==16)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
				}
}

		class Brahma
		{
			public static void brahma() 
			{
				System.out.println("BRAHMA");
			}
							
							
		}
		
		class Vishnu
		{
			public static void vishnu() 
			{
				System.out.println("VISHNU");
			}
		}
		
		class Shiva
		{
			public static void shiva() 
			{
				System.out.println("SHIVA");
				
			}
		}
		
		class Ganesha
		{
			public static void ganesha() 
			{
				System.out.println("GANESHA");
				
			}
		}
		
		class Krishna
		{
			public static void krishna() 
			{
				System.out.println("KRISHNA");
			}
		}
		
		class Hanuman
		{
			public static void hanuman() 
			{
				System.out.println("HANUMAN");
				
			}
		}
		
		class Laxmi
		{
			public static void laxmi() 
			{
				System.out.println("LAKSHMI");
				
			}
		}
		
		class Durga
		{
			public static void durga() 
			{
				System.out.println("DURGA");
				
			}
		}
		
		class Kali
		{
			public static void kali() 
			{
				System.out.println("KALI");
			}
		}
		
		class Saraswati
		{
			public static void saraswati() 
			{
				System.out.println("SARASWATI");
				
			}
		}
		
		class Indra
		{
			public static void indra() 
			{
				System.out.println("INDRA");
				
			}
		}
		
		class Sita
		{
			public static void sita() 
			{
				System.out.println("SITA");
				
			}
		}
		
		class Agni
		{
			public static void agni() 
			{
				System.out.println("AGNI");
				
			}
		}
		
		class Kartikeya
		{
			public static void kartikeya() 
			{
				System.out.println("KARTIKEYA");
				
			}
		}
		
		class Karma
		{
			public static void karma() 
			{
				System.out.println("KARMA");
				
			}
		}


class Yugas
{
				
				public static void yugas() 
				{
					System.out.println("======================");
		            System.out.println("CHOOSE ONE OF THE FOLLOWING");
					System.out.println("===========");
					System.out.println("1. KRETA");
					System.out.println("2. TRETA");
					System.out.println("3. DVAPARA");
					System.out.println("4. KALI");
					System.out.println("5. PREVIOUS PAGE");
					System.out.println("======================");
					

					
				}
}

class Kreta
{
				
				public  static void kreTa() 
				{
					System.out.println("======================");
					System.out.println("WLCOME TO KRETA YUGA");	
					System.out.println("======================");				
					System.out.println("PRESS 1 FOR MAIN PAGE OR PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int kr = thh.nextInt();
					
					if(kr==1)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
				}
}

class Treta
{
		
				public static void treTa() 
				{
					System.out.println("======================");
					System.out.println("WLCOME TO TRETA YUGA");	
					System.out.println("======================");				
					System.out.println("PRESS 1 FOR MAIN PAGE OR PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int tr = thh.nextInt();
					
					if(tr==1)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Dvapara
{
				
				public static void dvaPara() 
				{
					System.out.println("======================");
					System.out.println("WLCOME TO DVAPARA YUGA");
					System.out.println("======================");				
					System.out.println("PRESS 1 FOR MAIN PAGE OR PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int dv = thh.nextInt();
					
					if(dv==1)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class KaliYuga
{
				public static void kaLi() 
				{
					System.out.println("======================");
					System.out.println("WLCOME TO KALI YUGA");
					System.out.println("======================");				
					System.out.println("PRESS 1 FOR MAIN PAGE OR PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int ka = thh.nextInt();
					
					if(ka==1)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Chiranjivis
{
				
				public static void chiranJivis() 
				{
					System.out.println("======================");
					System.out.println("1.ASHWATTAMA");
					System.out.println("2.MAHABALI");
					System.out.println("3.SAGE VYASA");
					System.out.println("4.LORD HANUMANA");
					System.out.println("5.VIBHISHANA");
					System.out.println("6.KRIPACHARYA");
					System.out.println("7.LORD PARSHURAM");
					System.out.println("8.MAIN PAGE");
					System.out.println("9.EXIT");			
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int chi = thh.nextInt();
					
					if(chi==1)
					{
						Ashwattama.ashwattama();
						
					}
					else if(chi==2)
					{
						Mahabali.mahabali();
					}
					else if(chi==3)
					{
						SageVyasa.sageVyasa();
					}
					else if(chi==4)
					{
						LordHanuman.lordHanuman();
					}
					else if(chi==5)
					{
						Vibhishana.vibhishana();
					}
					else if(chi==6)
					{
						Kripacharya.kripacharya();
					}
					else if(chi==7)
					{
						LordParshuram.lordParshuram();
					}
					else if(chi==8)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
				}
}

		class Ashwattama
		{
			public static void ashwattama() 
			{
				System.out.println("ASHWATTAMA");
			}
							
							
		}
		
		class Mahabali
		{
			public static void mahabali() 
			{
				System.out.println("MAHABALI");
			}
		}
		
		class SageVyasa
		{
			public static void sageVyasa() 
			{
				System.out.println("SAGE VYASA");
				
			}
		}
		
		class LordHanuman
		{
			public static void lordHanuman() 
			{
				System.out.println("LORD HANUMAN");
				
			}
		}
		
		class Kripacharya
		{
			public static void kripacharya() 
			{
				System.out.println("KRIPACHARYA");
			}
		}
		
		class LordParshuram
		{
			public static void lordParshuram() 
			{
				System.out.println("LORD PARSHURAM");
				
			}
		}


class Ratnas
{
				
				public static void ratNas() 
				{
					System.out.println("======================");
					System.out.println("1.CHANDRA");
					System.out.println("2.PARIJATA");
					System.out.println("3.AIRAVATA");
					System.out.println("4.KAMADHENU");
					System.out.println("5.MADIRA");
					System.out.println("6.KALPAVRIKSHA");
					System.out.println("7.THE APSARAS");
					System.out.println("8.UCCAIHSHRAVAS");
					System.out.println("9.GODDESS LAKSHMI");
					System.out.println("10.PANCHJANYA");
					System.out.println("11.VISHNU MACE AND MAGIC BOW");
					System.out.println("12.VARIOUS GEMS LIKE KAUSTUBHA AND CHINTAMANI");
					System.out.println("13.DHANVANTARI");
					System.out.println("14.THE AMRITA");
					System.out.println("15.MAIN PAGE");;				
					System.out.println("16.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int ra = thh.nextInt();
					
					if(ra==1)
					{
						Chandra.chandra();
						
					}
					else if(ra==2)
					{
						Parijata.parijata();
					}
					else if(ra==3)
					{
						Airavata.airavata();
					}
					else if(ra==4)
					{
						Kamadhenu.kamadhenu();
					}
					else if(ra==5)
					{
						Madira.madira();
					}
					else if(ra==6)
					{
						Kalpavriksha.kalpavriksha();
					}
					else if(ra==7)
					{
						TheApsaras.theApsaras();
					}
					else if(ra==8)
					{
						Uccaihshivas.uccaihshivas();
					}
					else if(ra==9)
					{
						GoddessLaxmi.goddessLaxmi();
					}
					else if(ra==10)
					{
						Panchjanya.panchjanya();
					}
					else if(ra==11)
					{
						VishnuMace.vishnuMace();
					}
					else if(ra==12)
					{
						Gems.gems();
					}
					else if(ra==13)
					{
						Dhanvantari.dhanvantari();
					}
					else if(ra==14)
					{
						TheAmrita.theAmrita();
					}
					else if(ra==15)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
				}
}

		class Chandra
		{
			public static void chandra()
			{
				System.out.println("CHANDRA");
			}
							
							
		}
		
		class Parijata
		{
			public static void parijata()
			{
				System.out.println("PARIJATA");
			}
		}
		
		class Airavata
		{
			public static void airavata()
			{
				System.out.println("AIRAVATA");
				
			}
		}
		
		class Kamadhenu 
		{
			public static void kamadhenu()
			{
				System.out.println("KAMADHENU");
				
			}
		}
		
		class Madira
		{
			public static void madira()
			{
				System.out.println("MADIRA");
			}
		}
		
		class Kalpavriksha
		{
			public static void kalpavriksha()
			{
				System.out.println("KALPAVRIKSHA");
				
			}
		}
		
		class TheApsaras
		{
			public static void theApsaras()
			{
				System.out.println("THE APSARAS");
				
			}
		}
		
		class Uccaihshivas
		{
			public static void uccaihshivas()
			{
				System.out.println("UCCAIHSHIVAS");
				
			}
		}

		class GoddessLaxmi
		{
			public static void goddessLaxmi()
			{
				System.out.println("GODDESS LAXMI");
				
			}
		}

		class Panchjanya
		{
			public static void panchjanya()
			{
				System.out.println("PANCHJANYA");
				
			}
		}

		class VishnuMace
		{
			public static void vishnuMace()
			{
				System.out.println("VISHNU MACE AND MAGIC BOW");
				
			}
		}

		class Gems
		{
			public static void gems()
			{
				System.out.println("GEMS LIKE ");
				
			}
		}

		class Dhanvantari
		{
			public static void dhanvantari()
			{
				System.out.println("DHANVANTARI");
				
			}
		}

		class TheAmrita
		{
			public static void theAmrita()
			{
				System.out.println("THE AMRITA");
				
			}
		}

		


class Saptarishis
{
				
				public static void saptaRishis() 
				{
					System.out.println("======================");
					System.out.println("1.ATRI");
					System.out.println("2.BHARADVAJA");
					System.out.println("3.GAUTAMA MAHARISHI");
					System.out.println("4.JAMADAGNI");
					System.out.println("5.KASHYAPA");
					System.out.println("6.VASHISTHA");
					System.out.println("7.VISHWMITRA");
					System.out.println("8.MAIN PAGE");				
					System.out.println("9.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int sa = thh.nextInt();
					
					if(sa==1)
					{
						Atri.atri();
						
					}
					else if(sa==2)
					{
						Bharadvaja.bharadvaja();
					}
					else if(sa==3)
					{
						GautamaMaharishi.gautamaMaharishi();
					}
					else if(sa==4)
					{
						Jamadagni.jamadagni();
					}
					else if(sa==5)
					{
						Kashyapa.kashyapa();
					}
					else if(sa==6)
					{
						Vashishtha.vashishtha();
					}
					else if(sa==7)
					{
						Vishwmitra.vishwmitra();
					}
					else if(sa==8)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}
				class Atri
				{
					public static void atri()
					{
						System.out.println("ATRI");
						
					}
				}

				class Bharadvaja
				{
					public static void bharadvaja()
					{
						System.out.println("BHARADVAJA");
						
					}
				}

				class GautamaMaharishi
				{
					public static void gautamaMaharishi()
					{
						System.out.println("GAUTAMA MAHARISHI");
						
					}
				}

				class Jamadagni
				{
					public static void jamadagni()
					{
						System.out.println("JAMADAGNI");
						
					}
				}

				class Kashyapa
				{
					public static void kashyapa()
					{
						System.out.println("KASHYAPA ");
						
					}
				}

				class Vashishtha
				{
					public static void vashishtha()
					{
						System.out.println("VASHISHTHA");
						
					}
				}

				class Vishwmitra
				{
					public static void vishwmitra()
					{
						System.out.println("VISHWMITRA");
						
					}
				}


class Avatars
{
				
				public static void avaTars() 
				{
					System.out.println("======================");
					System.out.println("1.BRAHMA");
					System.out.println("2.VISHNU");
					System.out.println("3.SHIVA");
					System.out.println("4.MAIN PAGE");				
					System.out.println("5.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int av = thh.nextInt();
					
					if(av==1)
					{
						BrahmaAvatar.brahmaAvatar();
					}
					if(av==2)
					{
						VishnuAvatar.vishnuAvatar();
					}
					if(av==3)
					{
						ShivaAvatar.shivaAvatar();
					}
					if(av==4)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class BrahmaAvatar
{
	public static void brahmaAvatar()
	{
		System.out.println("BRAHMA AVATAR");
	}
}

class VishnuAvatar
{
	public static void vishnuAvatar()
	{
		System.out.println("VISHNU AVATAR");
	}
}

class ShivaAvatar
{
	public static void shivaAvatar()
	{
		System.out.println("SHIVA AVATAR");
	}
}


class Mythology
{
				
				public static void mythLogy() 
				{
					System.out.println("======================");
		            System.out.println("CHOOSE ONE OF THE FOLLOWING");
		            System.out.println("======================");
					System.out.println("1.STORIES");
					System.out.println("2.FACTS");
					System.out.println("3.PREVIOUS PAGE");
					System.out.println("======================");
					
				}
}

class Stories
{
				String name;
				String character;
				
				
				public static void stoRies() 
				{
					System.out.println("======================");
					System.out.println("1.THE VALIANT ABHIMANYU");
					System.out.println("2.EKALAVYA’S ALLEGIANCE TO HIS TEACHER");
					System.out.println("3.PRAHLADA’S FAITH IN GOD");
					System.out.println("4.SHRAVAN KUMAR’S DEVOTION TO HIS PARENTS");
					System.out.println("5.ARJUNA’S CONCENTRATION");
					System.out.println("6.GANESHA AND VED VYAS");
					System.out.println("7.VIBHISHANA’S DEVOTION");
					System.out.println("8.KRISHNA’S COIN");
					System.out.println("9.GANESHA AND KUBERA");
					System.out.println("10.BHAIRAVNATH AND VAISHNODEVI");
					System.out.println("11.KARNA’S GENEROSITY");				
					System.out.println("12.FOR MAIN PAGE");
					System.out.println("PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int st = thh.nextInt();
					
					if(st==1)
					{
						Abhimanyu.abhimanyu();
						
					}
					else if(st==2)
					{
						Ekalavya.ekalavya();
					}
					else if(st==3)
					{
						Prahlad.prahlad();
					}
					else if(st==4)
					{
						Shravan.shravan();
					}
					else if(st==5)
					{
						Arjuna.arjuna();
					}
					else if(st==6)
					{
						GaneshaVyas.ganeshaVyas();
					}
					else if(st==7)
					{
						Vibhishana.vibhishana();
					}
					else if(st==8)
					{
						Krishna.krishna();
					}
					else if(st==9)
					{
						GaneshaKuber.ganeshaKuber();
					}
					else if(st==10)
					{
						BhairavnathVaishnodevi.bhairavnathVaishnodevi();
					}
					else if(st==11)
					{
						Karna.karna();
					}
					else if(st==12)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}


			class Abhimanyu
			{
				public static void abhimanyu() 
				{
					System.out.println("THE VALIANT ABHIMANYU");
					
				}
			}
			
			class Ekalavya
			{
				public static void ekalavya() 
				{
					System.out.println("EKALAVYA’S ALLEGIANCE TO HIS TEACHER");
				}
			}
			
			class Prahlad
			{
				public static void prahlad() 
				{
					System.out.println("PRAHLADA’S FAITH IN GOD");
				}
			}
			
			class Shravan
			{
				public static void shravan()
				{
					System.out.println("SHRAVAN KUMAR’S DEVOTION TO HIS PARENTS");
					
				}
			}
			
			class Arjuna
			{
				public static void arjuna() 
				{
					System.out.println("ARJUNA’S CONCENTRATION");
				}
			}
			
			class GaneshaVyas
			{
				public static void ganeshaVyas() 
				{
	
					System.out.println("GANESHA AND VED VYAS");
					
				}
			}
			
			class Vibhishana
			{
				public static void vibhishana() 
				{
					System.out.println("VIBHISHANA’S DEVOTION");

					
				}
			}
			
			class KrishnaStory
			{
			
				public static void krishna() 
				{
					System.out.println("KRISHNA’S COIN");
				}
			}
			
			class GaneshaKuber
			{
			
				public static void ganeshaKuber() 
				{

					System.out.println("GANESHA AND KUBERA");
				}
			}
			
			class BhairavnathVaishnodevi
			{
			
				public static void bhairavnathVaishnodevi() 
				{
					System.out.println("BHAIRAVNATH AND VAISHNODEVI");
					
				}
			}
			
			class Karna
			{
				public static void karna()
				{
					System.out.println("KARAN STORY");

				}
				
			}


class Facts
{
		
		
				public static void facTs() 
				{
					System.out.println("======================");
					System.out.println("FACTS");
					System.out.println("======================");				
					System.out.println("PRESS 1 FOR MAIN PAGE OR PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int fa = thh.nextInt();
					
					if(fa==1)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Hindiusm
{
				
				public static void hindiUsm() 
				{
					System.out.println("======================");
	                System.out.println("CHOOSE ONE OF THE FOLLOWING");
	                System.out.println("======================");
					System.out.println("1.VEDAS");
					System.out.println("2.PURANAS");
					System.out.println("3.SANSKARS");
					System.out.println("4.CONCEPTS");
					System.out.println("5.PREVIOUS PAGE");
					System.out.println("======================");
					
					
					
				}
}

class Vedas
{
		
				public static void veDas() 
				{
					System.out.println("======================");
					System.out.println("1.RIGVEDA");
					System.out.println("2.YAJURVEDA");
					System.out.println("3.SAMAVEDA");
					System.out.println("4.ATHARVAVEDA");
					System.out.println("5.MAIN PAGE");			
					System.out.println("6.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int ve = thh.nextInt();
					
					if(ve==1)
					{
						Rigveda.rigveda();
					}
					else if(ve==2)
					{
						Yajurveda.yajurveda();
					}
					else if(ve==3)
					{
						Samaveda.samaveda();
					}
					else if(ve==4)
					{
						Atharvaveda.atharvaveda();
					}
					
					else if(ve==5)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

				
				class Rigveda
				{
					public static void rigveda()
					{
						System.out.println("SHRAVAN KUMAR’S DEVOTION TO HIS PARENTS");
						
					}
				}
				
				class Yajurveda
				{
					public static void yajurveda() 
					{
						System.out.println("PRAHLADA’S FAITH IN GOD");
					}
				}
				
				class Samaveda
				{
					public static void samaveda() 
					{
						System.out.println("EKALAVYA’S ALLEGIANCE TO HIS TEACHER");
					}
				}
				
				class Atharvaveda
				{
					public static void atharvaveda() 
					{
						System.out.println("THE VALIANT ABHIMANYU");
						
					}
				}

class Puranas
{
				
				public static void puraNas() 
				{
					System.out.println("======================");
					System.out.println("1.BRAHMA PURANA");
					System.out.println("2.PADMA PURANA");
					System.out.println("3.VISHNU PURANA");
					System.out.println("4.SHIVA PURANA");
					System.out.println("5.BHAGAVATA PURANA");
					System.out.println("6.NARADA PURANA");
					System.out.println("7.MARKANDEYA PURANA");
					System.out.println("8.AGNI PURANA");
					System.out.println("9.BHAVISYA PURANA");
					System.out.println("10.BRAHMAVAIVARTA PURANA");
					System.out.println("11.LINGA PURANA");
					System.out.println("12.VARAHA PURANA");
					System.out.println("13.SKANDA PURANA");
					System.out.println("14.VAMANA PURANA");
					System.out.println("15.KURMA PURANA");
					System.out.println("16.MATSYA PURANA");
					System.out.println("17.GARUDA PURANA");
					System.out.println("18.BRAHMANDA PURANA");
					System.out.println("19.MAIN PAGE");				
					System.out.println("20.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int pu = thh.nextInt();
					
					if(pu==1)
					{
						BrahmaPurana.brahmaPurana();
					}
					else if(pu==2)
					{
						PadmaPurana.padmaPurana();
					}
					else if(pu==3)
					{
						VishnuPurana.vishnuPurana();
					}
					else if(pu==4)
					{
						ShivaPurana.shivaPurana();
					}
					else if(pu==5)
					{
						BhagavataPurana.bhagavataPurana();
					}
					else if(pu==6)
					{
						NaradaPurana.naradaPurana();
					}
					else if(pu==7)
					{
						MarkandeyaPurana.markandeyaPurana();
					}
					else if(pu==8)
					{
						AgniPurana.agniPurana();
					}
					else if(pu==9)
					{
						BhavishyaPurana.bhavishyaPurana();
					}
					else if(pu==10)
					{
						BrahmaVaivartaPurana.brahmaVaivartaPurana();
					}
					else if(pu==11)
					{
						LingaPurana.lingaPurana();
					}
					else if(pu==12)
					{
						VarahaPurana.varahaPurana();
					}
					else if(pu==13)
					{
						SkandaPurana.skandaPurana();
					}
					else if(pu==14)
					{
						VamanaPurana.vamanaPurana();
					}
					else if(pu==15)
					{
						KurmaPurana.kurmaPurana();
					}
					else if(pu==16)
					{
						MatsyaPurana.matsyaPurana();
					}
					else if(pu==17)
					{
						GarudaPurana.garudaPurana();
					}
					else if(pu==18)
					{
						BrahmandaPurana.brahmandaPurana();
					}
					else if(pu==19)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}
				class BrahmaPurana
				{
					public static void brahmaPurana()
					{
						System.out.println("CHANDRA");
					}
									
									
				}
				
				class PadmaPurana
				{
					public static void padmaPurana()
					{
						System.out.println("PARIJATA");
					}
				}
				
				class VishnuPurana
				{
					public static void vishnuPurana()
					{
						System.out.println("AIRAVATA");
						
					}
				}
				
				class ShivaPurana 
				{
					public static void shivaPurana()
					{
						System.out.println("KAMADHENU");
						
					}
				}
				
				class BhagavataPurana
				{
					public static void bhagavataPurana()
					{
						System.out.println("MADIRA");
					}
				}
				
				class NaradaPurana
				{
					public static void naradaPurana()
					{
						System.out.println("KALPAVRIKSHA");
						
					}
				}
				
				class MarkandeyaPurana
				{
					public static void markandeyaPurana()
					{
						System.out.println("THE APSARAS");
						
					}
				}
				
				class AgniPurana
				{
					public static void agniPurana()
					{
						System.out.println("UCCAIHSHIVAS");
						
					}
				}

				class BhavishyaPurana
				{
					public static void bhavishyaPurana()
					{
						System.out.println("GODDESS LAXMI");
						
					}
				}

				class BrahmaVaivartaPurana
				{
					public static void brahmaVaivartaPurana()
					{
						System.out.println("PANCHJANYA");
						
					}
				}

				class LingaPurana
				{
					public static void lingaPurana()
					{
						System.out.println("VISHNU MACE AND MAGIC BOW");
						
					}
				}

				class VarahaPurana
				{
					public static void varahaPurana()
					{
						System.out.println("GEMS LIKE ");
						
					}
				}

				class SkandaPurana
				{
					public static void skandaPurana()
					{
						System.out.println("DHANVANTARI");
						
					}
				}

				class VamanaPurana
				{
					public static void vamanaPurana()
					{
						System.out.println("THE AMRITA");
						
					}
				}
				
				class KurmaPurana
				{
					public static void kurmaPurana()
					{
						System.out.println("THE AMRITA");
						
					}
				}
				
				class MatsyaPurana
				{
					public static void matsyaPurana()
					{
						System.out.println("THE AMRITA");
						
					}
				}
				
				class GarudaPurana
				{
					public static void garudaPurana()
					{
						System.out.println("THE AMRITA");
						
					}
				}
				
				class BrahmandaPurana
				{
					public static void brahmandaPurana()
					{
						System.out.println("THE AMRITA");
						
					}
				}


class Sanskars
{
				
				public static void sansKars() 
				{
					System.out.println("======================");
					System.out.println("1.GARBHADHAAN");
					System.out.println("2.PUNSAVAN");
					System.out.println("3.SIMANTONAYAN");
					System.out.println("4.JATKARMA");
					System.out.println("5.NAAMKARAN");
					System.out.println("6.NISHKRAMANA");
					System.out.println("7.ANNPRASHAN");
					System.out.println("8.CHAUL");
					System.out.println("9.VIDYARAMBH");
					System.out.println("10.KARNAVEDH");
					System.out.println("11.UPNAYAN");
					System.out.println("12.VEDARAMBHA");
					System.out.println("13.KESHANI SAMSKAR");
					System.out.println("14.SAMAVARTAN");
					System.out.println("15.VIVAH");
					System.out.println("16.ANTYESTHI");
					System.out.println("17.MAIN PAGE");				
					System.out.println("18.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int sa = thh.nextInt();
					
					if(sa==1)
					{
						Garbhadhaan.garbhadaan();
					}
					else if(sa==2)
					{
						Punsavan.punsavan();
					}
					else if(sa==3)
					{
						Simantonayan.simantonayan();
					}
					else if(sa==4)
					{
						Jatkarma.jatkarma();
					}
					else if(sa==5)
					{
						Naamkaran.naamkaran();
					}
					else if(sa==6)
					{
						Nishkramana.nishkramana();
					}
					else if(sa==7)
					{
						Annaprashan.annaprashan();
					}
					
					else if(sa==8)
					{
						Chaul.chaul();
					}
					else if(sa==9)
					{
						Vidyarambh.vidyarambh();
					}
					else if(sa==10)
					{
						Karnavedh.karnavedh();
					}
					else if(sa==11)
					{
						Upnayan.upnayan();
					}
					else if(sa==12)
					{
						Vedarambha.vedarambha();
					}
					else if(sa==13)
					{
						KeshaniSamskar.keshaniSamskar();
					}
					else if(sa==14)
					{
						Samavartan.samavartan();
					}
					else if(sa==15)
					{
						Vivah.vivah();
					}
					else if(sa==16)
					{
						Antyeshthi.antyeshthi();
					}
					else if(sa==17)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Garbhadhaan
{
	public static void garbhadaan()
	{
		System.out.println("GARBHADHAAN");
		
	}
}

class Punsavan 
{
	public static void punsavan()
	{
		System.out.println("PUNSAVAN");
		
	}
}

class Simantonayan
{
	public static void simantonayan()
	{
		System.out.println("SIMANTONAYAN");
	}
}

class Jatkarma
{
	public static void jatkarma()
	{
		System.out.println("JATKARMA");
		
	}
}

class Naamkaran
{
	public static void naamkaran()
	{
		System.out.println("NAAMKARAN");
		
	}
}

class Nishkramana
{
	public static void nishkramana()
	{
		System.out.println("NISHKRAMANA");
		
	}
}

class Annaprashan
{
	public static void annaprashan()
	{
		System.out.println("ANNAPRASHAN");
		
	}
}

class Chaul
{
	public static void chaul()
	{
		System.out.println("CHAUL");
		
	}
}

class Vidyarambh
{
	public static void vidyarambh()
	{
		System.out.println("VIDYARAMBH");
		
	}
}

class Karnavedh
{
	public static void karnavedh()
	{
		System.out.println("KARNAVEDH");
		
	}
}

class Upnayan
{
	public static void upnayan()
	{
		System.out.println("UPNAYAN");
		
	}
}

class Vedarambha
{
	public static void vedarambha()
	{
		System.out.println("VEDARAMBHA");
		
	}
}

class KeshaniSamskar
{
	public static void keshaniSamskar()
	{
		System.out.println("KESHANI SAMSKAR");
		
	}
}

class Samavartan
{
	public static void samavartan()
	{
		System.out.println("SAMAVARTAN");
		
	}
}

class Vivah
{
	public static void vivah()
	{
		System.out.println("VIVAH");
		
	}
}

class Antyeshthi
{
	public static void antyeshthi()
	{
		System.out.println("ANTYESHTHI");
		
	}
}

class Concepts
{
				
				public static void conCepts() 
				{
					System.out.println("======================");
					System.out.println("1.ATMAN");
					System.out.println("2.DHARMA");
					System.out.println("3.VARNA");
					System.out.println("4.KARMA");
					System.out.println("5.SAMSARA");
					System.out.println("6.PURUSHARTHA");
					System.out.println("7.MOKSHA");
					System.out.println("8.BRAHMAN");
					System.out.println("9.BHAGAVAN");
					System.out.println("10.ISHVARA");
					System.out.println("11.MAIN PAGE");				
					System.out.println("12.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int co = thh.nextInt();
					
					if(co==1)
					{
						Atman.atman();
					}
					else if(co==2)
					{
						Dharma.dharma();
					}
					else if(co==3)
					{
						Varna.varna();
					}
					else if(co==4)
					{
						KarmaConcept.karmaConcept();
					}
					else if(co==5)
					{
						Samsara.samsara();
					}
					else if(co==6)
					{
						Purushartha.purushartha();
					}
					else if(co==7)
					{
						Moksha.moksha();
					}
					else if(co==8)
					{
						Brahman.brahman();
					}
					else if(co==9)
					{
						Bhagavan.bhagavan();
					}
					else if(co==10)
					{
						Ishwara.ishwara();
					}
					else if(co==11)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Atman
{
	public static void atman()
	{
		System.out.println("ATMAN");
		
	}
}

class Dharma
{
	public static void dharma()
	{
		System.out.println("DHARMA");
		
	}
}

class Varna
{
	public static void varna()
	{
		System.out.println("VARNA");
		
	}
}

class KarmaConcept
{
	public static void karmaConcept()
	{
		System.out.println("KARMA");
		
	}
}

class Samsara
{
	public static void samsara()
	{
		System.out.println("SAMSARA");
		
	}
}

class Purushartha
{
	public static void purushartha()
	{
		System.out.println("PURUSHARTHA");
		
	}
}

class Moksha
{
	public static void moksha()
	{
		System.out.println("MOKSHA");
		
	}
}

class Brahman
{
	public static void brahman()
	{
		System.out.println("BRAHMAN");
		
	}
}

class Bhagavan
{
	public static void bhagavan()
	{
		System.out.println("BHAGAVAN");
		
	}
}

class Ishwara
{
	public static void ishwara()
	{
		System.out.println("ISHWARA");
		
	}
}

class SpiritualBooks
{
				
				public static void spiRitualBooks() 
				{
					System.out.println("======================");
	                System.out.println("CHOOSE ONE OF THE FOLLOWING");
	                System.out.println("======================");
					System.out.println("1.SPIRITUAL BOOOKS");
					System.out.println("2.PREVIOUS PAGE");
					System.out.println("======================");
					
				}
}

class Spiritual_books
{
				
				public static void spiritualBooks() 
				{
					System.out.println("======================");
					System.out.println("1.BHAGAVAD GITA");
					System.out.println("2.VALMIKI RAMAYANA");
					System.out.println("3.SHRI RAMCHARITRA MANAS");
					System.out.println("4.VEDAS");
					System.out.println("5.UPANISHADS ");
					System.out.println("6.SUNDERKAND");
					System.out.println("7.MANUSMRITI");
					System.out.println("8.AUTOBIOGRAPHY OF A YOGI");
					System.out.println("9.THE KRISHNA KEY");
					System.out.println("10.THE IMMORTALS OF MELUHA (SHIVA TRILOGY)");
					System.out.println("11.MAIN PAGE");				
					System.out.println("12.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int sb = thh.nextInt();
					
					switch(sb)
					{
					case 1:
					{
						BhagavadGita.bhagavadGita();
						break;
								
					}
					
					
					case 2:
					{
						ValmikiRamayana.valmikiRamayana();
						break;
					}
					case 3:
					{
						ShriRamcharitraManas.shriRamcharitraManas();
						break;
					}
					case 4:
					{
						VedasBook.vedasBook();
						break;
					}
					case 5:
					{
						Upanishads.upanishads();
						break;
					}
					case 6:
					{
						Sunderkand.sunderkand();
						break;
					}
					case 7:
					{
						Manusmriti.manusmriti();
						break;
					}
					case 8:
					{
						Yogi.yogi();
						break;
					}
					case 9:
					{
						TheKrishnaKey.theKrishnaKey();
						break;
					}
					case 10:
					{
						ShivaTrilogy.shivaTrilogy();
						break;
					}
					case 11:
					{
						User.theHiddenHIndu();
						break;
					}
					case 12:
					{
						System.exit(0);
						break;
					}
					default:
						System.out.println("THE END");
				 }
					
					
					
				}
}

class Books
{
	String name;
	String author;
	long verses;
	String language;

}

class BhagavadGita extends Books //INHERITANCE
{
	public static void bhagavadGita()
	{
		System.out.println("BOOK 1");
		BhagavadGita bg = new BhagavadGita("BHAGAVAD GITA","VYASA",700,"SANSKRIT",260);
		Spiritual_books.spiritualBooks();
		
	}
	private double price; //ENCAPSULATION
	public double getprice()
	{
		return price;
	}
	
	public void setprice(double price)
	{
		this.price=price;
	}
	
	BhagavadGita(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getprice() );
		
		
		
	}
	
}

class ValmikiRamayana extends Books
{
	public static void valmikiRamayana()
	{
		System.out.println("BOOK 2");
		ValmikiRamayana vr = new ValmikiRamayana("VALMIKI RAMAYANA","VALMIKI",24000,"SANSKRIT",1233);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getprice()
	{
		return price;
	}
	
	public void setprice(double price)
	{
		this.price=price;
	}
	ValmikiRamayana(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getprice() );
		
	}
}

class ShriRamcharitraManas extends Books
{
	public static void shriRamcharitraManas()
	{
		System.out.println("BOOK 3");
		ShriRamcharitraManas srm = new ShriRamcharitraManas("SHRI RAMCHARITRA MANAS","TULSIDAS",10902,"AWADHI,HINDUSTANI",407);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	ShriRamcharitraManas(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice() );
		
	}
}

class VedasBook extends Books
{
	public static void vedasBook()
	{
		System.out.println("BOOK 4");
		VedasBook vb = new VedasBook("VEDAS","VYASA",20379,"VEDIC SANSKRIT",2390);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	VedasBook(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice() );
		
	}
}

class Upanishads extends Books
{
	public static void upanishads()
	{
		System.out.println("BOOK 5");
		Upanishads u = new Upanishads("UPANISHADS","UNKNOWN",1676,"SANSKRIT",179);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	Upanishads(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice() );
		
	}
}

class Sunderkand extends Books
{
	public static void sunderkand()
	{
		System.out.println("BOOK 6");
		Sunderkand s = new Sunderkand("SUNDERKAND","VALMIKI",2885,"SANSKRIT",109);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	Sunderkand(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice() );
		
	}
}

class Manusmriti extends Books
{
	public static void manusmriti()
	{
		System.out.println("BOOK 7");
		Manusmriti m = new Manusmriti("MANUSMRITI","BRAHMA",2685,"SANSKRIT",419);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	Manusmriti(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice() );
		
	}
}

class Yogi extends Books
{
	public static void yogi()
	{
		System.out.println("BOOK 8");
		Yogi y = new Yogi("AUTOBIOGRAPHY OF YOGI","PARAMAHANSA YOGANANDA",0,"ENGLISH,HINDI,TAMIL",144);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	Yogi(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice() );
		
	}
}

class TheKrishnaKey extends Books
{
	public static void theKrishnaKey()
	{
		System.out.println("BOOK 9");
		TheKrishnaKey tkk = new TheKrishnaKey("THE KRISHNA KEY","ASHWIN SANGHI",0,"ENGLISH",450);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	TheKrishnaKey(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice() );
		
	}
}

class ShivaTrilogy extends Books
{
	public static void shivaTrilogy()
	{
		System.out.println("BOOK 10");
		ShivaTrilogy st = new ShivaTrilogy("THE IMMORTALS OF MELUHA(SHIVATRIOLOGY)","AMISH TRIPATHI",0,"ENGLISH",310);
		Spiritual_books.spiritualBooks();
	}
	private double price;
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	ShivaTrilogy(String name,String author,long verses, String language, double price)
	{
		this.name=name;
		this.author=author;
		this.verses=verses;
		this.language=language;
		this.price=price;
		
		System.out.println("Name: "+this.name );
		System.out.println("Author: "+this.author );
		System.out.println("Verses: "+this.verses );
		System.out.println("Original Language: "+this.language );
		System.out.println("Price: "+this.getPrice());
		
	}
}

class KotiGods
{


				public static void kotiGods() 
				{
					System.out.println("======================");
	                System.out.println("CHOOSE ONE OF THE FOLLOWING");
	                System.out.println("======================");
					System.out.println("1.8 VASUS");
					System.out.println("2.11 RUDRAS");
					System.out.println("3.12 ADITYAS");
					System.out.println("4.INDRAJIT");
					System.out.println("5.PRAJAPATI");
					System.out.println("6. PREVIOUS PAGE");
					System.out.println("======================");
					
				}
}

class Vasus
{

				
				
				public static void vaSus() 
				{
					System.out.println("======================");
					System.out.println("1.AAPA");
					System.out.println("2.DHRUVA");
					System.out.println("3.SOMA");
					System.out.println("4.DHARA");
					System.out.println("5.ANILA");
					System.out.println("6.ANALA");
					System.out.println("7.PRATHYUSHA");
					System.out.println("8.PRABHASA");
					System.out.println("9.MAIN PAGE");				
					System.out.println("10.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int va = thh.nextInt();
					
					if(va==1)
					{
						Aapa.aapa();
					}
					else if(va==2)
					{
						Dhruva.dhruva();
					}
					else if(va==3)
					{
						Soma.soma();
					}
					else if(va==4)
					{
						Dhara.dhara();
					}
					else if(va==5)
					{
						Anila.anila();
					}
					else if(va==6)
					{
						Anala.anala();
					}
					else if(va==7)
					{
						Pratyusha.pratyusha();
					}
					else if(va==8)
					{
						Prabhasa.prabhasa();
					}
					else if(va==9)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Aapa
{
	public static void aapa()
	{
		System.out.println("AAPA");
		
	}
}

class Dhruva
{
	public static void dhruva()
	{
		System.out.println("DHRUVA");
		
	}
}

class Soma
{
	public static void soma()
	{
		System.out.println("SOMA");
		
	}
}

class Dhara
{
	public static void dhara()
	{
		System.out.println("DHARA");
		
	}
}

class Anila
{
	public static void anila()
	{
		System.out.println("ANILA");
		
	}
}

class Anala
{
	public static void anala()
	{
		System.out.println("ANALA");
		
	}
}

class Pratyusha
{
	public static void pratyusha()
	{
		System.out.println("PRATYUSHA");
		
	}
}

class Prabhasa
{
	public static void prabhasa()
	{
		System.out.println("PRABHASA");
		
	}
}

class Rudras
{
				
				public static void rudRas()
				{
					System.out.println("======================");
					System.out.println("1.KAPALI");
					System.out.println("2.PINGAL");
					System.out.println("3.BHEEM");
					System.out.println("4.VIRUPAKSHAV");
					System.out.println("5.VILOHIT");
					System.out.println("6.SHASTRA");
					System.out.println("7.AJAPAAD");
					System.out.println("8.AHIRBUDHNYA");
					System.out.println("9.SHAMBHU");
					System.out.println("10.CHAND");
					System.out.println("11.BHAV");
					System.out.println("12.MAIN PAGE");				
					System.out.println("13.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int ru = thh.nextInt();
					
					if(ru==1)
					{
						Kapali.kapali();
					}
					else if(ru==2)
					{
						Pingal.pingal();
					}
					else if(ru==3)
					{
						Bheem.bheem();
					}
					else if(ru==4)
					{
						Virupakshav.virupakshav();
					}
					else if(ru==5)
					{
						Vilohit.vilohit();
					}
					else if(ru==6)
					{
						Shastra.shastra();
					}
					else if(ru==7)
					{
						Ajapaad.ajapaad();
					}
					else if(ru==8)
					{
						Ahirbudhnya.ahirbudhnya();
					}
					else if(ru==9)
					{
						Shambhu.shambhu();
					}
					else if(ru==10)
					{
						Chand.chand();
					}
					else if(ru==11)
					{
						Bhav.bhav();
					}
					else if(ru==12)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Kapali
{
	public static void kapali()
	{
		System.out.println("KAPALI");
		
	}
}

class Pingal
{
	public static void pingal()
	{
		System.out.println("PINGAL");
		
	}
}

class Bheem
{
	public static void bheem()
	{
		System.out.println("BHEEM");
		
	}
}

class Virupakshav
{
	public static void virupakshav()
	{
		System.out.println("VIRUPAKSHAV");
		
	}
}

class Vilohit
{
	public static void vilohit()
	{
		System.out.println("VILOHIT");
		
	}
}

class Shastra
{
	public static void shastra()
	{
		System.out.println("SHASTRA");
		
	}
}

class Ajapaad
{
	public static void ajapaad()
	{
		System.out.println("AJAPAAD");
		
	}
}

class Ahirbudhnya
{
	public static void ahirbudhnya()
	{
		System.out.println("AHIRBUDHNYA");
		
	}
}

class Shambhu
{
	public static void shambhu()
	{
		System.out.println("SHAMBHU");
		
	}
}

class Chand
{
	public static void chand()
	{
		System.out.println("CHAND");
		
	}
}

class Bhav
{
	public static void bhav()
	{
		System.out.println("BHAV");
		
	}
}

class Adityas
{
				
				public static void aditTyas() 
				{
					System.out.println("======================");
					System.out.println("1.VIVASVAN");
					System.out.println("2.ARYAMAN");
					System.out.println("3.TVASHTA");
					System.out.println("4.SAVITR");
					System.out.println("5.BHAGA");
					System.out.println("6.DHATA");
					System.out.println("7.MITRA");
					System.out.println("8.VARUNA");
					System.out.println("9.AMSA");
					System.out.println("10.PUSHAN");
					System.out.println("11.INDRA");
					System.out.println("12.VISHNU ");
					System.out.println("13.MAIN PAGE");				
					System.out.println("14.EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int ad = thh.nextInt();
					
					if(ad==1)
					{
						Vivasvan.vivasvan();
					}
					else if(ad==2)
					{
						Aryaman.aryaman();
					}
					else if(ad==3)
					{
						Tvashta.tvashta();
					}
					else if(ad==4)
					{
						Savitr.savitr();
					}
					else if(ad==5)
					{
						Bhaga.bhaga();
					}
					else if(ad==6)
					{
						Dhata.dhata();
					}
					else if(ad==7)
					{
						Mitra.mitra();
					}
					else if(ad==8)
					{
						Varuna.varuna();
					}
					else if(ad==9)
					{
						Amsa.amsa();
					}
					else if(ad==10)
					{
						Pushan.pushan();
					}
					else if(ad==11)
					{
						IndraAdityas.indraAdityas();
					}
					else if(ad==12)
					{
						VishnuAdityas.vishnuAdityas();
					}
					else if(ad==13)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
}

class Vivasvan
{
	public static void vivasvan()
	{
		System.out.println("VIVASVAN");
		
	}
}

class Aryaman
{
	public static void aryaman()
	{
		System.out.println("ARYAMAN");
		
	}
}

class Tvashta
{
	public static void tvashta()
	{
		System.out.println("TVASHTA");
		
	}
}

class Savitr
{
	public static void savitr()
	{
		System.out.println("SAVITR");
		
	}
}

class Bhaga
{
	public static void bhaga()
	{
		System.out.println("BHAGA");
		
	}
}

class Dhata
{
	public static void dhata()
	{
		System.out.println("DHATA");
		
	}
}

class Mitra
{
	public static void mitra()
	{
		System.out.println("MITRA");
		
	}
}

class Varuna
{
	public static void varuna()
	{
		System.out.println("VARUNA");
		
	}
}

class Amsa
{
	public static void amsa()
	{
		System.out.println("AMSA");
		
	}
}

class Pushan
{
	public static void pushan()
	{
		System.out.println("PUSHAN");
		
	}
}

class IndraAdityas
{
	public static void indraAdityas()
	{
		System.out.println("INDRA");
		
	}
}

class VishnuAdityas
{
	public static void vishnuAdityas()
	{
		System.out.println("VISHNU");
		
	}
}

class Indrajit
{
				
				public static void indraJit() 
				{
					System.out.println("======================");
					System.out.println("INDRAJIT");
					System.out.println("======================");				
					System.out.println("PRESS 1 FOR MAIN PAGE OR PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int in = thh.nextInt();
					
					if(in==1)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
				}
}

class Prajapati
{


				public static void prajaPati() 
				{
					System.out.println("======================");
					System.out.println("PRAJAPATI");
					System.out.println("======================");				
					System.out.println("PRESS 1 FOR MAIN PAGE OR PRESS ANY NUMBER TO EXIT");
					System.out.println("======================");
					
					System.out.print("Input your choice: ");
					Scanner thh = new Scanner(System.in);
					int pr = thh.nextInt();
					
					if(pr==1)
					{
						User.theHiddenHIndu();
					}
					else
					{
						System.exit(0);
					}
					
					
				}
				
}


class M

	{
		public static void main(String[] args) 
		{
			
			Login lgn = new Login();
		    lgn.loGin();
			
			TheHiddenHindu tHH = new User();
	
		}
	}

	
