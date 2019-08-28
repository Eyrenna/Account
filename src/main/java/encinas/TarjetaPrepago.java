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
        setSaldo(getSaldo() + importe);
    }

    public void enviarMensaje(Integer mensajesEnviados){
        setSaldo(getSaldo() - (0.09*mensajesEnviados));
    }

    public void realizarLlamada(Integer segundosHablados){
        setSaldo(getSaldo() - (0.15 + (0.01 * segundosHablados)));
        consumoToSegundos();
        consumo.setSegundos(consumo.getSegundos() + segundosHablados);
        segundosToConsumo();
    }

    public void visualizarTarjeta(){
        System.out.print("*************************" + "\n" +
                         "******DATOS TARJETA******" + "\n" +
                         "*************************" + "\n" +
                         "Número: " + getNumeroTelefono() + "\n" +
                         "DNI: " + getDni().getDni() + "\n" +
                         "Saldo: " + getSaldo() + "\n" +
                         "Consumo: " + getConsumo().getHora());
    }


    //MÉTODOS
    //Otros - PRIVADOS

    private void consumoToSegundos(){
        Integer horasToSegundos = consumo.getHoras() * 3600;
        Integer minutosToSegundos = consumo.getMinutos() * 60;
        consumo.setSegundos(consumo.getSegundos() + minutosToSegundos + horasToSegundos);
    }

    private void segundosToConsumo(){
        consumo.setHoras(consumo.getSegundos() / 3600);
        consumo.setSegundos(consumo.getSegundos() % 3600);
        consumo.setMinutos(consumo.getSegundos() / 60);
        consumo.setSegundos(consumo.getSegundos() % 60);
    }

}
