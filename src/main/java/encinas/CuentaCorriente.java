package encinas;

/**
 * Hello world!
 *
 */
public class CuentaCorriente {

    //PROPIEDADES

    private String nombre = null;
    private String apellidos = null;
    private String direccion = null;
    private String telefono = null;
    private DNI dni = null;
    private double saldo = 0d;


    //CONSTRUCTOR

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono, DNI dni, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.saldo = saldo;
    }


    //MÉTODOS
    // Geters & Seters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //MÉTODOS
    //Otros

    public void retirarDinero(double importe) {
        setSaldo(getSaldo()-importe);
    }
}
