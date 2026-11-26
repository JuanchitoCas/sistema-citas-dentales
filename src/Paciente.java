public class Paciente {
    private int id;
    private String nombre;
    private String apellidos;
    private String telefono;

    // Constructor de la clase Paciente
    public Paciente(int id, String nombre, String apellidos, String telefono) {

        validarCampo(nombre, "El nombre");
        validarCampo(apellidos, "Los apellidos");
        validarCampo(telefono, "El teléfono");

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    //Se valida que los campos obligatorios no sean nulos ni estén vacíos
    private void validarCampo(String valor, String campo) {
    if (valor == null || valor.isBlank()) {
        throw new IllegalArgumentException(campo + " no puede estar vacio");
    }
    }

    // Métodos para consultar los atributos del paciente
    public String getNombre(){
        return  nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getTelefono(){
        return telefono;
    }
    // Métodos para modificar los atributos del paciente
    public void setNombre(String nombre){
        validarCampo(nombre, "El nombre");
        this.nombre = nombre;
        
    }

    public void setApellidos(String apellidos){
        validarCampo(apellidos, "Los apellido");
        this.apellidos = apellidos;
  
    }

    public void setTelefono(String telefono){
        validarCampo(telefono, "El teléfono");
        this.telefono = telefono;
    
    }


}
