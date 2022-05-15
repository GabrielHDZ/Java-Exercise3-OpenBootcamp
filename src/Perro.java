public class Perro{
    final static String name="buffer";
    String clase;
    int age;
    //publics se llaman creando instancias de la class
    public String correr(){
        return "hi, el ".concat(name).concat(" corre ").concat(clase);
    }
    //statics se llaman sin la necesidad de instancia de class
    static String sentarse(){
        return "el prro ".concat(name).concat(" se sienta");
    }
}

class Cachorro extends Perro{
    
    public static void main(String[] args) {
        Perro cacho=new Perro();
        cacho.clase="labrador";
        Perro cacho2=new Perro();
        cacho2.clase="husky";
        System.out.println(cacho.correr());
        System.out.println(cacho.sentarse());
        sentarse();

        System.out.println(cacho2.correr());
    }
}

