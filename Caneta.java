package poo02;
public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta -> " +this.cor + "\nPonta -> " +this.ponta + "\nTampada -> " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Caneta tampada!");
        }else{
        System.out.println("Estou rabiscando");
    }
    }
    void tampar (){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
