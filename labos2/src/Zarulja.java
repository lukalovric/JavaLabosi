public class Zarulja {
    private boolean stanje;

    Zarulja(){
        stanje=false;
    }

    public void PritisniPrekidac(){
        stanje=!stanje;
    }
    public void Provjeri(){
        if (stanje) {
            System.out.println(" Svijetli ");
        }
            else System.out.println(" Mrak je ");

    }



}

