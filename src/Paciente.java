public class Paciente {

    private int id;
    private String nombre;
    private String apellidos;
    private String telefono;

    // Constructor
    public Paciente(int id, String nombre, String apellidos, String telefono) {

        validarCampo(nombre, "El nombre");
        validarCampo(apellidos, "Los apellidos");
        validarCampo(telefono, "El teléfono");

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    // Validación de campos
    private void validarCampo(String valor, String campo) {

        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(campo + " no puede estar vacío");
        }
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters
    public void setNombre(String nombre) {
        validarCampo(nombre, "El nombre");
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        validarCampo(apellidos, "Los apellidos");
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        validarCampo(telefono, "El teléfono");
        this.telefono = telefono;
    }
}