public class Main {

    public static void main(String[] args) {

        PacienteDAO pacienteDAO = new PacienteDAO();

        var pacientes = pacienteDAO.obtenerTodos();

        System.out.println("===== LISTA DE PACIENTES =====");

        for (Paciente paciente : pacientes) {

            System.out.println("ID: " + paciente.getId());
            System.out.println("Nombre: " + paciente.getNombre());
            System.out.println("Apellidos: " + paciente.getApellidos());
            System.out.println("Teléfono: " + paciente.getTelefono());

            System.out.println("-----------------------------");
        }
    }
}