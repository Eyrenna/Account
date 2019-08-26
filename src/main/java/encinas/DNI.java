package encinas;

public class DNI {

    //PROPIEDADES

    private String dni = null;


    //CONSTRUCTOR

    public DNI() {
    }

    public DNI(String dni) {
        this.dni = dni;
    }


    //MÉTODOS
    //Geters & Seters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    //MÉTODOS
    //Otros

    public boolean longitudCorrecta(){
        Integer longitud = this.dni.length();
        return (longitud == 9);
    }

    public String getParteNumerica(){
        return this.dni.substring(0,8);
    }

    public boolean numeroCorrecto(){
        String parteNumerica = getParteNumerica();
        try {
            Integer numero = Integer.parseInt(parteNumerica);
            return true;
        }catch (NumberFormatException numberFormatException){
            System.out.println("Algunos de los elementos de la parte numérica no son números");
            return false;
        }
    }

    public String getParteLetra(){
        return this.dni.substring(8);
    }

    public double indiceLetra(){
        String numeros = getParteNumerica();
        Double resultado = 0d;
        for(int indice=0;indice<numeros.length();indice++){
            if(indice!=8){
                resultado = resultado + Integer.parseInt(numeros.substring(indice, indice+1));
            }else {
                resultado = resultado + Integer.parseInt(numeros.substring(indice));
            }
        }
        resultado = (resultado/23)*10;
        return resultado.intValue();
    }

    public boolean letraCorrecta(){
            String letra = getParteLetra().toUpperCase();
            TablaLetras tablaLetra = TablaLetras.valueOf(letra);
            double tablaNumero = tablaLetra.getIndice();
            double numero = indiceLetra();
            if (tablaNumero == numero) {
                return true;
            } else {
                return false;
            }
    }

    public boolean dniCorrecto() {
        return ((longitudCorrecta())&&(numeroCorrecto())&&(letraCorrecta()));
    }
}
