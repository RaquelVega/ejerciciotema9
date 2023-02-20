public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println(cliente.edad = 20);
        System.out.println(cliente.telefono = 50570818);
        System.out.println(cliente.nombre = "Alfonso");
        System.out.println(cliente.credito = "Credito Persona");

        Trabajador trabajador =  new Trabajador();
        System.out.println(trabajador.salario = 20000);

    }

}

















































































class Persona{
 int edad;
 String nombre;
 int telefono;
}

class Cliente extends Persona{
    String credito;
}

class Trabajador extends Persona{
    int salario;
}