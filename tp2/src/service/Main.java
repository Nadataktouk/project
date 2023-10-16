package service;

public class Main {

	public static void main(String[] args) {
		BanqueService bs = new BanqueService();
		double montantEnUCD=100.0;
		double montantConverti=bs.conversion(montantEnUCD);
		System.out.println("montant converti:"+montantConverti);
		
		}

}
