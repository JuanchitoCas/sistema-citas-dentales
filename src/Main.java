public class Main {
    public static void main(String[] args){
        System.out.println("===========================");
        System.out.println(" Sistema de Citas Dentales ");
        System.out.println("===========================");

        System.out.println("\n¡¡Bienvenido al sistema!!");


       // Creamos un paciente con datos válidos.
    Paciente paciente1 = new Paciente(0, "Juan", "Castro", "5610425174");

    // Probamos la validación del setter.
    try {
        paciente1.setNombre("");

    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    System.out.println("Nombre actual: " + paciente1.getNombre());

    // Probamos la validación del constructor.
    try {
        Paciente paciente2 = new Paciente(1, "", "Hernandez", "5610203040");

    } catch (IllegalArgumentException e) {
        System.out.println("Error al registrar paciente: " + e.getMessage());
    }

    System.out.println("El programa continúa ejecutándose.");

    }
}
