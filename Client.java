import java.util.Date;

public class Client{
    public String numCpt;
    public  double solde;
    private Date date_solde = new Date();
    private Agency agency;

    Client(String numCpt, double solde, Date date_solde){
        this.numCpt = numCpt;
        this.solde = solde;
        this.date_solde = date_solde;
    }

    Client(){
    }

    public Client(String num, double solde) {
    }

    public String retrait(String numCpt, double montant){
        if (solde <= montant){
            return "Solde Insufficiant";
        }
        solde -= montant;
        return "Account Solde Updated";
    }
    public void versement(String numcpt, double montant){
        solde += montant;
    }
    public double consultation(String numcpt){
        return solde;
    }


}
