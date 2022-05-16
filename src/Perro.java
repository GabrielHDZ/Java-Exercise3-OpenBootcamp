public class Perro{
    final static String NAME="buffer";
    public String perroClase;
    protected int perroAge;
    public Perro(String clase,int age){
        perroClase=clase;
        perroAge=age;
    }
    //publics se llaman creando instancias de la class
    //public--private--protected
    final String correr(){
        return "hi, el ".concat(NAME).concat(" corre ").concat(perroClase);
    }
    //statics se llaman sin la necesidad de instancia de class
    static String sentarse(){
        return "el prro ".concat(NAME).concat(" se sienta");
    }
}

class Cachorro{
    
    public static void main(String[] args) {
        Perro cacho=new Perro("labrador",12);
        Perro cacho2=new Perro("Husky",2);
        System.out.println(cacho.correr());
        System.out.println(cacho.sentarse());

        System.out.println(cacho2.correr());
    }
}

