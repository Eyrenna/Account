package encinas;

public class TarjetaPrepago {

    //PROPIEDADES
    private String numeroTelefono = null;
    private DNI dni = null;
    private Double saldo = 0d;
    private Hora consumo = null;


    //CONSTRUCTOR

    public TarjetaPrepago() {
    }

    public TarjetaPrepago(String numeroTelefono, DNI dni, Double saldo) {
        this.numeroTelefono = numeroTelefono;
        this.dni = dni;
        this.saldo = saldo;
    }


    //MÉTODO
    //Getters & Setters

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Hora getConsumo() {
        return consumo;
    }

    public void setConsumo(Hora consumo) {
        this.consumo = consumo;
    }


    //MÉTODOS
    //Otros

    public void ingresarSaldo(double importe){
        setSaldo(getSaldo()+importe);
    }

}
