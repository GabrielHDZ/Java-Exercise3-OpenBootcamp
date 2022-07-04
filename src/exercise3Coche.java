public class exercise3Coche {
    public static void main(String[] args) {
        Auto coche = new Auto();
        coche.incPuertas();
        coche.incPuertas();
        System.out.println(coche.numPuertas);   
    }
}

class Auto {
    int numPuertas = 4;
    
    public void incPuertas() {
        this.numPuertas++;
    }
    public void decPuertas() {
        this.numPuertas--;
    }
}
