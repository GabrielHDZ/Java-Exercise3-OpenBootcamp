public class App {
    int pro1=19;
    static int myMethod(int x) {
        return 5+x;
    }

    static String myMethod(String txt){
        return "sobres";
    }
    static int myRecursion(int x){
        return (x>0)?( x+myRecursion(x-1)): 0;
    }

    public static boolean myMethod(double c,boolean f){
        return true;
    }

    public static void dataPrimitive() {
        //variables camelCase
        String v1="";
        //acepta ACII
        char v4='D';
        char a=65;
        boolean v6=true;
        final String v7="data";
        //datos primitivos de tipo numbers
        //integer
        int v2=2147483647;
        byte v8=100;
        short v9=32767;
        long v10=9227;
        //floating
        float v3=15.99f;
        double v5=19.99d;
        //cientificos
        float f1 = 35e3f;
        double d1 = 12E4d;
    }

    public static void widening(int entero){
        //conversiones automaticas byte -> short -> char -> int -> long -> float -> double
        double doble=entero;
        System.out.println("recibe " +entero +"convierte a: " +doble);
    }

    public static void narrowing(double doble){
        //conversiones manuales double -> float -> long -> int -> char -> short -> byte
        int entero=(int)doble;
        System.out.println("recibe " +doble +"convierte a: " +entero);
    } 

    public static void what() {
        int x = 5;
        x = x << 3;
        System.out.println(x);
    }

    public static void Strings() {
        String txt="esto es un texto",txt2="this is a second text";
        String txt3 = "We are the so-called \"Vikings\" from the north.";
        String txt4 = "It\'s alright.";
        String txt5 = "The character \\ is called backslash.";
        System.out.println(txt.concat(" ").concat(txt2));


    }

    public static void Cicles() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) System.out.println(i);

        for (int i = 0; i < 10; i++) {
            if (i > 4) {
              break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                System.out.println("adentro de condicion");
              continue;
            }
            System.out.println(i);
        }
    }

    public static void Arreglos() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(cars[0]);
        cars[1]="Tsuru";
        System.out.println(cars.length);
        for (String i : cars) System.out.println(i);

        //multidimensional
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
        }
    
    
    
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Cicles();
        //System.out.println(myMethod(5));
        int resu=myRecursion(4);
        System.out.println(resu);

    }

}
