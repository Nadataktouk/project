package service;

import java.util.List;


public class Main {

	public static void main(String[] args) {
		BanqueService banqueService = new BanqueService();
		double montantEnUCD=100.0;
		double montantConverti= banqueService.conversion(montantEnUCD);
		System.out.println("montant converti:"+montantConverti);
	 Compte compte = banqueService.getCompte();
	        List<Compte> comptes = banqueService.getComptes();
	       
		 
	                for (Compte C : comptes) {
	                    System.out.println("Code: " + C.getCode());
	                    System.out.println("Solde: " + C.getSolde());
	                    System.out.println("Date de création: " + C.getDateCreation());
	                }
	          }
	   }	        


	    

	

