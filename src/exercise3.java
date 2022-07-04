import java.io.PipedInputStream;

public class exercise3 {
    public static void main(String[] args) {
        //llamada de la funcion y asignarle valores
        int resultado=sumaNums(50, 50, 20);
        System.out.println(resultado);
    }
    //función con tres parámetros que sean números que se suman entre sí.
    public static int sumaNums(int uno,int dos,int tres){
        return uno + dos + tres;
    }
}
