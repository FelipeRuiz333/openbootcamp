public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("ramon");
        persona.setTelefono(4219682);
        System.out.println("La edad es: "+persona.getEdad());
        System.out.println("El nombre es: "+persona.getNombre());
        System.out.println("El telefono es: "+persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    //edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    //nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //telefono
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }

}