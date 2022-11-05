public class Main {
    public static void main(String[] args) {
        Zarulja Osram=new Zarulja();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();

        Zaposlenik Luka= new Zaposlenik(10, 40,4000);
        System.out.println(Luka.ZaradaStatic(Luka));
        System.out.println(Luka.Zarada());
    }
}

