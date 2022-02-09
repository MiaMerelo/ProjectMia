import java.util.Optional;

public class Persona {

    public String nombre;
    public String poblacion;
    public String edad;

    //Constructor Optional
    public Persona(String[] persona){
        Optional<String> optNombre;
        Optional<String> optPoblacion;
        Optional<String> optEdad;

        try{
            optNombre = Optional.of(persona[0]);
        }catch(IndexOutOfBoundsException e){
            optNombre = Optional.of("Desconocido");
        }

        try{
            optPoblacion = Optional.of(persona[1]);
        } catch (IndexOutOfBoundsException e){
            optPoblacion = Optional.of("Desconocida");
        }

        try {
            optEdad = Optional.of(persona[2]);
        } catch (IndexOutOfBoundsException e) {
            optEdad = Optional.of("100");
        }

        this.setNombre(optNombre.get());
        this.setPoblacion(optPoblacion.orElse("Desconocida"));
        this.setEdad(optEdad.get());
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getEdad(){
        return edad;
    }

    public int getEdadInt(){
        return Integer.valueOf(edad);
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void  setEdad(String edad){
        this.edad = edad;
    }

    public String toString() {
        return ("Nombre: " + this.nombre + ", Población: " + this.poblacion + ", Edad: " + this.edad);
    }
}
