import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        //Objeto File que usa la dirección del fichero con los datos
        File archivo = new File("C:\\Users\\mia.merelo\\IdeaProjects\\ProjectMia\\src\\DatosEj1.txt");

        //Objeto que se ocupa de la lectura del fichero
        BufferedReader lector = new BufferedReader(new FileReader(archivo));

        //Array que guarda
        List<Persona> personas = new ArrayList();
        String linea = new String();
        String[] splitText = new String[2];
        while ((linea = lector.readLine()) != null) {
            splitText = linea.split(":");
            personas.add(new Persona(splitText));
            Arrays.fill(splitText, null);
        }

        personas.stream()
                .filter(persona -> persona.getPoblacion().equals(""))
                .forEach(poblacion -> poblacion.setPoblacion("Desconocida"));

        personas.stream()
                .filter(persona -> persona.getEdadInt() < 25)
                .forEach(poblacion -> System.out.println(poblacion.toString()));
    }
}
