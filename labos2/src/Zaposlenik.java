public class Zaposlenik {
    private int staz;
    private int starost;
    private int placa;

    Zaposlenik(int staz, int starost, int placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }

    public void Promjenistaz(int staz) {
        this.staz = staz;
    }
    public void IspisiStaz(){
        System.out.printf("Staz:"+staz);
    }
    public void PromjeniStarost(int starost) {
        this.starost = starost;
    }
    public void IspisiStarost(){
        System.out.printf("Starost:"+starost);
    }
    public void Promjeniplaca(int placa) {
        this.placa = placa;
    }
    public void IspisiPlaca(){
        System.out.printf("Placa:"+placa);
    }
    public int Zarada(){
        return placa*staz*12;
    }
    public static int ZaradaStatic (Zaposlenik zaposlenik){
        return zaposlenik.placa*zaposlenik.staz*12;
    }
}