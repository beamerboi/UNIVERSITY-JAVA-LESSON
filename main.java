import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{
    public static void main (String[] args){
        Client cpt = new Client();
        List<Client> compte = new ArrayList<>() ;
        Scanner s = new Scanner(System.in);
        Agency a = new Agency();


        for(int i=0; i<5; i++){
            System.out.println("Client = ");
            String num = s.nextLine();
            double solde = s.nextDouble();
            Client e = new Client(num, solde);
            compte.add(e);
        }


        for(Client co:compte){
            System.out.println(co.numCpt);
            System.out.println(co.solde);
        }
    }
}
