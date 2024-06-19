
public class Angajati extends Fabrica{
    public String nume;
    public int salariu;
    public int aniVechime;

    public Angajati(String nume,int salariu,int aniVechime){
     this.nume=nume;
     this.salariu=salariu;
     this.aniVechime=aniVechime;}
   
    public void afisareSalariu(){
     double salariuFinal= salariu+(salariu*0.1*aniVechime);
     System.out.println("Salariu"+nume+"este"+salariuFinal);}
}
