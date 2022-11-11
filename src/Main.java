public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(33);
        persona.setNombre("Robert Jimenez");
        persona.setTelefono(1234567890);

        System.out.println("La persona de nombre: " + persona.getNombre()
                + " tiene " + persona.getEdad()
                +" y el número de teléfono es: " + persona.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void  setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }
    public void  setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void  setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}