import java.util.ArrayList;
import java.util.List;

public class Muncitor extends Angajati{
private List<String>responsabilitati;

    public Muncitor(String nume,int salariu,int aniVechime){
     super(nume,salariu,aniVechime);
     this.responsabilitati= new ArrayList<>();
    }
    public void addResponsabilitati(String responsabilitate) {
     responsabilitati.add(responsabilitate);
    }}

   

