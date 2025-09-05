/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CodigoCorregido;

//Código a Corregir (Java)
import java.util.*;

public class BuggyActividad {

    public static void main(String[] args) {

        // LISTA de nombres
        List<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana");

        // Error: índice fuera de rango
        // Correcion: se accede a la posición 2 para que sea valida
        System.out.println("Elemento en posición 3: " + nombres.get(2));

        // Error: comparación de cadenas con == en lugar de equals 
        // Correción: Se usa equals para la comparación
        String buscado = "Ana";
        if ("Ana".equals(buscado)) {
            System.out.println("Encontrado");
        }

        // MAPA de teléfonos
        Map<String, String> telefonos = new HashMap<>();

        telefonos.put("Ana", "0991111111");
        telefonos.put("Luis", "0992222222");
        telefonos.put("Ana", "0993333333"); // sobrescribe sin control

        // Error: obtener clave inexistente sin validación    
        // Correcion: Se valida si la clave existe antes de usar el valor
        String telefonoDeBea = telefonos.get("Bea");
        if (telefonoDeBea != null) {
            System.out.println("Bea: " + telefonoDeBea);
        } 
        else {
            System.out.println("Bea: El telefono no fue encontrado.");
        }

        // SET de inscritos (debería no permitir duplicados lógicos)

        Set<Alumno> inscritos = new HashSet<>();

        inscritos.add(new Alumno(1, "Ana"));
        inscritos.add(new Alumno(2, "Luis"));
        inscritos.add(new Alumno(1, "Ana")); // duplicado lógico
        
        System.out.println("Tamaño del Set: " + inscritos.size());
        System.out.println(inscritos);

    }
}