public class Manager  extends Angajati{
   
        private String addMuncitori;
    
        public Manager(String nume, int salariu, int aniVechime, String addMuncitori) {
         super(nume,salariu,aniVechime);
         this.addMuncitori= addMuncitori;
        }
    
        @Override
        public void afisareSalariu() {
         super.afisareSalariu(); 
         System.out.println("Adauga muncitori"+addMuncitori);
        }
    }
    
