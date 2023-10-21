package service;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

	public class BanqueService {
	public double conversion(double mt) {
	return mt*10.6;
	}
	   private Compte compte;
	    private List<Compte> comptes;

	    public Compte getCompte() {                                 
	        return new Compte(12345, 1000.0, "2023-10-21"); // Exemple, remplacez par la logique réelle
	   
	    }

	    public void setCompte(Compte compte) {
	        this.compte = compte;
	    }

	    public List<Compte> getComptes() {
	        List<Compte> comptes = new ArrayList<Compte>();
	        comptes.add(new Compte(12345, 1000.0, "2023-10-21")); // Exemple, remplacez par la logique réelle
	        comptes.add(new Compte(67890, 2000.0, "2023-10-22")); // Exemple, remplacez par la logique réelle
	       
	        return comptes;
	    }

	    public void setComptes(List<Compte> comptes) {
	        this.comptes = comptes;
	    }
	    

	
	
	
	
}
