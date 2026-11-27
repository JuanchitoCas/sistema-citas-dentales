import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PacienteDAO pacienteDAO = new PacienteDAO();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa los apellidos del paciente: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingresa el teléfono del paciente: ");
        String telefono = scanner.nextLine();

        Paciente nuevoPaciente = new Paciente(0, nombre, apellidos, telefono);
        pacienteDAO.registrar(nuevoPaciente);
        scanner.close();

    }
}
// public class Main {

// public static void main(String[] args) {

// PacienteDAO pacienteDAO = new PacienteDAO();

// var pacientes = pacienteDAO.obtenerTodos();

// System.out.println("===== LISTA DE PACIENTES =====");

// for (Paciente paciente : pacientes) {

// System.out.println("ID: " + paciente.getId());
// System.out.println("Nombre: " + paciente.getNombre());
// System.out.println("Apellidos: " + paciente.getApellidos());
// System.out.println("Teléfono: " + paciente.getTelefono());

// System.out.println("-----------------------------");
// }
// }
// }