import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private   List<String>listaAngajati;
    private List<String>Clienti;
    private List<String>Acte;
    public Fabrica(){
    this.listaAngajati= new ArrayList<>();
     this.Clienti= new ArrayList<>();
     this.Acte= new ArrayList<>();
    }
    public void adaugaClient(String client){
     Clienti.add(client);
     System.out.println("Client"+client+" adăugat");
    }

    public void adaugaAct(String act){
     Acte.add(act);
     System.out.println("Act"+act+"adăugat");
    }
    public void adaugaAngajat(String angajat){
        listaAngajati.add(angajat);
        System.out.println("Angajat"+angajat+" adăugat.");
    }

    public List<String> getListaAngajati(){
        return listaAngajati;
    }

    public List<String> getClienti(){
        return Clienti;
    }

    public List<String> getActe(){
        return Acte;
    }
}
   
