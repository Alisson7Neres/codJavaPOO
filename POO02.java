package poo02;
public class POO02 {
    public static void main(String[] args) {
        Caneta C1 = new Caneta();
        C1.cor = "Azul";
        C1.ponta = 0.5f;
        //C1.tampada = false;
        C1.status();
        C1.tampar();
        C1.rabiscar();
        
        Caneta C2 = new Caneta();
        C2.cor = "Preta";
        C2.ponta = 0.5f;
        C2.destampar();
        C2.status();
        C2.rabiscar();
    }
    
}
