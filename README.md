# Account

## Cuenta Corriente
Construye una clase de nombre CuentaCorriente que permita almacenar los datos asociados a la cuenta bancaria de un cliente, e interactuar con ellos. Este es nuestro ADT.
Esta clase tendrá las siguientes propiedades, métodos y constructores:
### Propiedades privadas (de momento, en Python nos da igual que sean privadas): 
nombre, apellidos, dirección, teléfono: todas de tipo string.  
NIF: objeto instancia de la clase DNI que resolvimos en clase**. Se trata de una relación “Has-A” o “Tiene-una”.  
saldo: de tipo double.  
Constructores (inicializador en Python):  
Constructor que por defecto inicializa las propiedades de la clase (programación defensiva).  
Constructor al que se le pasen como argumentos todas las propiedades que tiene la clase.  
### Métodos públicos: 
set() y get() para todas las propiedades de la clase [Abstracción y encapsulamiento].  
retirarDinero(): resta al saldo una cantidad de dinero pasada como argumento.  
ingresarDinero(): añade al saldo una cantidad de dinero.  
consultarCuenta(): visualizará los datos de la cuenta.  
saldoNegativo(): devolverá un valor lógico indicando si la cuenta está o no en números rojos.  
** Puedes reutilizar la clase DNI que construimos en clase para definir la clase NIF mediante [herencia], si es que fuese necesario alguna especialización o cambio en la clase DNI. Evalúa si es posible reutilizarla tal cual.  
