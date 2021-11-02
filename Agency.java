import java.util.ArrayList;
import java.util.List;

public class Agency {

    private String codeAg;
    private String adresse;
    private String tel;
    private List<Client> cpt = new ArrayList<>();

    Agency(String codeAg, String adresse, String tel){
        this.codeAg = codeAg;
        this.adresse = adresse;
        this.tel = tel;

    }
    Agency(){

    }

    public String addressAgency(String codeAg){
        return adresse;
    }
}
