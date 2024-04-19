package labJunit.app;

public class CompteBancaire {
    private double solde;

    public CompteBancaire() {
        this.solde = 0.0;
    }

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }
    
    public double debiterSolde(double montant) {
        if(montant > 0) {
        	this.solde -= montant;
            return solde;
        } else {
        	throw new Error("Le débit doit être positif");
        }
    }
    
    public double crediterSolde(double montant) {
        if(montant > 0) {
        	this.solde += montant;
        	return solde;
        } else {
        	throw new Error("Le crédit doit être positif");
        }
   
    }

   

}