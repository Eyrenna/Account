# Account

## Cuenta Corriente
Construye una clase de nombre CuentaCorriente que permita almacenar los datos asociados a la cuenta bancaria de un cliente, e interactuar con ellos. Este es nuestro ADT.
Esta clase tendrá las siguientes propiedades, métodos y constructores:
### Propiedades privadas: 
nombre, apellidos, dirección, teléfono: todas de tipo string.  
NIF: objeto instancia de la clase DNI que resolvimos en clase**. Se trata de una relación “Has-A” o “Tiene-una”.  
saldo: de tipo double.  
Constructores:  
Constructor que por defecto inicializa las propiedades de la clase (programación defensiva).  
Constructor al que se le pasen como argumentos todas las propiedades que tiene la clase.  
### Métodos públicos: 
set() y get() para todas las propiedades de la clase [Abstracción y encapsulamiento].  
retirarDinero(): resta al saldo una cantidad de dinero pasada como argumento.  
ingresarDinero(): añade al saldo una cantidad de dinero.  
consultarCuenta(): visualizará los datos de la cuenta.  
saldoNegativo(): devolverá un valor lógico indicando si la cuenta está o no en números rojos.  
** Puedes reutilizar la clase DNI que construimos en clase para definir la clase NIF mediante [herencia], si es que fuese necesario alguna especialización o cambio en la clase DNI. Evalúa si es posible reutilizarla tal cual.  

## Tarjeta Prepago
Construye una clase de nombre TarjetaPrepago que permita interactuar con la información almacenada en una tarjeta de telefonía móvil prepago (este es nuestro ADT).
Esta clase tendrá las siguientes propiedades, métodos y constructores:
### Propiedades privadas:
numeroTeléfono: de tipo string.
NIF: objeto instancia de la clase DNI que resolvimos en clase**. Se trata de una relación “Has-A” o “Tiene-una”  
saldo: de tipo double (en euros).  
consumo: objeto instancia de la clase Hora, para almacenar las horas, minutos y segundos consumidos. Se trata de otra relación “Has-A” o “Tiene-una”. Reutiliza la clase Hora que has construído en el ejercicio anterior.
### Constructores:
Constructor que inicializa las propiedades de la clase (programación defensiva).  
Constructor que recibe como argumentos los valores para las propiedades de clase numeroTelefono, NIF y saldo.  
### Métodos públicos:
set() y get() para todas las propiedades de la clase [Abstracción y encapsulamiento].  
ingresarSaldo(): añade al saldo una cantidad de dinero.  
enviarMensaje(): recibe como argumento un entero que representa un número de mensajes a enviar, y resta al saldo 9 céntimos por mensaje.  
realizarLlamada(): recibe un entero que representa el número de segundos hablados. Se restará al saldo la cantidad correspondiente calculada en base a 15 céntimos por establecimiento de llamada y 1 céntimo por segundo. También se actualizará la propiedad consumo.  
consultarTarjeta(): visualizará todos los datos de la tarjeta en consola.  
### Métodos privados.  
Necesitarás un método que se encargue de la responsabilidad de convertir la hora (hora:minutos:segundos) a segundos para poder sumar la duración de la llamada al total de la duración de las llamadas en la propiedad consumo.  
Haz uso de todos aquellos métodos privados que estimes necesarios.
