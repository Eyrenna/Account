package encinas;

public class Hora {

    //PROPIEDADES

    private Integer horas = 0;
    private Integer minutos = 0;
    private Integer segundos = 0;


    //CONSTRUCTOR

    public Hora() {
    }

    public Hora(Integer horas, Integer minutos, Integer segundos) {
        setHora(horas, minutos, segundos);
    }


    //MÉTODOS
    //Geters & Setters

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }


    //MÉTODOS
    //Otros
    public void setHora(Integer horas, Integer minutos, Integer segundos){
        if((horas>24) || (minutos>59) || (segundos>59)){
            setHoras(0);
            setMinutos(0);
            setSegundos(0);
        }else{
            setHoras(horas);
            setMinutos(minutos);
            setSegundos(segundos);
        }
    }

    public String getHora() {
        return "Horas: " + getHoras() + " Minutos: " + getMinutos() + " Segundos: " + getSegundos();
    }

    public void imprimirHora(){
        System.out.print(getHora());
    }


}
