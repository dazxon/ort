package ejercicio01;

/*
Crear la clase NumeroTelefonico, la cual tiene como atributos numéricos característica,
numeroDeAbonado y codigoDePais, además un atributo de tipo TIpoDeLinea que indicará el
tipo de línea (CELULAR, FIJO, FAX). Generar los constructores por defecto y parametrizado y
los setters y getters que creas necesarios. Tiene también un método llamado getValor() que
devolverá un String en formato “(+PPP) CCCC-AAAA”, donde +PPP es un signo más (+)
seguido por el código del país. Crear también la clase EMail cuyo constructor deberá recibir un
único String con el formato “cuenta@dominio.del.mail”. Para llenar los atributos cuenta y
dominio, ambos de tipo String, se deberá usar el método split(separador) de la clase String,
usando la arroba (”@”) como separador. El método getValor() devolverá el String con la
“reconstrucción” de la dirección, utilizando ambos atributos más la arroba. Por último, crear la
clase Persona (su constructor recibe apellido y nombre) podrá contener de 0 a N teléfonos y de
0 a N emails. Su método mostrarTodo() debe mostrar por pantalla el contenido completo de la
persona. Por ejemplo:

Messi, Lionel
Telefonos: Celular:
549-114111-2222
Celular:
068-032444-5678 Fijo:
054-4411-5472 email:
lio@messi.com
*/