class Etudiant{
     String nom;
     String prenom;
     String filiere;
     int age;
   public Etudiant(String n, String p, int a, String f){
        nom = n;
        prenom = p;
        age = a;
        filiere = f;
    }
    public String toString(){
        return nom + " " + prenom + " " + age + " " + filiere;
    }
}

class EtudiantSHN extends Etudiant {
     String sport;
    public EtudiantSHN(String n, String p, int a, String f,String s){
        //nom = n;
        //prenom = p;
        //age = a;
        //filiere = f;

        super(n, p, a, f);
        sport = s;
    }
    public String toString(){
        return super.toString() + " " + sport;
    }
}


class EtudiantALT extends Etudiant{
     String entreprise;
    public EtudiantALT(String n, String p, int a, String f,String e){
        //nom = n;
        //prenom = p;
        //age = a;
        //filiere = f;
        super(n, p, a, f);
        entreprise = e;
    }
    public String toString(){
        return super.toString() + " " + entreprise;
      }
}
class ExempleAvecToString{
        public static void main(String args[]){
         Etudiant e1 = new Etudiant("Baez", "Joan", 22, "Musique");
         EtudiantSHN e2 = new EtudiantSHN("Turing", "Allan", 22, "Science", "Course");
         EtudiantALT e3 = new EtudiantALT("French", "Melinda", 20, "Gestion", "Microsoft");
         System.out.println(e1);
         System.out.println(e2);
         System.out.println(e3);
        }
}
