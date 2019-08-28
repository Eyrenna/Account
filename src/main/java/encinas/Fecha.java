package encinas;

public class Fecha {

    //PROPIEDADES

    private Integer dia = null;
    private Integer mes = null;
    private Integer anno = null;


    //CONSTRUCTOR

    public Fecha() {
    }

    public Fecha(Integer dia, Integer mes, Integer anno) {
        setFecha(dia, mes, anno);
    }


    //MÉTODOS
    //Getters & Setters

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }


    //MÉTODOS
    //Otros

    public void setFecha(Integer dia, Integer mes, Integer anno) {
        if(((dia < 1) && (dia > 31)) || ((mes < 1) && (mes > 12)) || (anno < 1900) || (anno > 3000)){
            setDia(1);
            setMes(1);
            setAnno(1900);
        }else{
            setDia(dia);
            setMes(mes);
            setAnno(anno);
        }
    }
}
