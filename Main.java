public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Felipe";
        cliente.telefono = 40167938;
        cliente.credito = 150.00;

        System.out.println("ESTA ES LA CLASE CLIENTE");
        System.out.println("La edad es: " + cliente.getEdad());
        System.out.println("El nombre es: " + cliente.getNombre());
        System.out.println("El telefono es: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Ramon";
        trabajador.telefono = 1312312;
        trabajador.salario = 2500.00;

        System.out.println("ESTA ES LA CLASE TRABAJADOR");
        System.out.println("La edad es: " + trabajador.getEdad());
        System.out.println("El nombre es: " + trabajador.getNombre());
        System.out.println("El telefono es: " + trabajador.getTelefono());
        System.out.println("Credito: " + trabajador.getSalario());
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;

    //EDAD
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //TELEFONO
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

    //CLIENTE
class Cliente extends Persona {
    double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

    //INFOCLIENTE
class InfoCliente extends Cliente{

}

//TRABAJADOR
class Trabajador extends Persona {
    double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
