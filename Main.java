public class Main {
    public static void main(String[] args) {
        suma(10,20,30);

        Coche miCoche = new Coche();
        miCoche.ContarPuertas();
        System.out.println(miCoche.puertas);

    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b +c;

        System.out.println(resultado);
    }
}

class Coche {
    public int puertas = 0;

    public void ContarPuertas(){
        this.puertas++;
    }
}