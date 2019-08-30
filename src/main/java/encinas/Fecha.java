package encinas;

import java.lang.reflect.Array;

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

    public void incrementarFecha(Integer dias){
        while(dias > 0){
            Integer diaLimite;
            Integer proximoMes = getMes() + 1;
            Integer proximoAnno = getAnno() + 0;
            if(getMes() == 12) {
                diaLimite = 31;
                proximoMes = 1;
                proximoAnno = getAnno() + 1;
            }else{
                if(getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11) {
                    diaLimite = 30;
                }else{
                    if(getMes() == 2){
                        if(((getAnno() - 1896) % 4) == 0){
                            diaLimite = 29;
                        }else {
                            diaLimite = 28;
                        }
                    }else{
                        diaLimite = 31;
                    }
                }
            }
            while(getDia() < diaLimite && dias != 0){
                setDia(getDia() + 1);
                dias -= 1;
            }
            if(getDia() == diaLimite && dias != 0){
                setDia(1);
                setMes(proximoMes);
                setAnno(proximoAnno);
                dias -= 1;
            }
        }
    }

    public void imprimirFecha(){
        System.out.print("Fecha: " + getDia() + "/" + mesLetra() + "/" + getAnno());
    }


    //MÉTODOS
    //Otros PRIVADOS

    private String mesLetra(){
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return meses[getMes() - 1];
    }
}
