package ejercicio05;

/*

Una organización de torneos de futbol tiene 3 tipos de torneos: de futbol 5, de futbol 8 y de futbol 11. 
En cada torneo, los equipos que se inscriban no pueden superar la cantidad de jugadores permitidas en el torneo. 
Crear la clase Partido que contenga 4 atributos: uno para el equipo local, otro para el equipo visitante, otro para 
los goles del equipo local y por último uno para los goles del equipo visitante. 
Ademas, crear la clase Jornada que contenga una lista de Partidos. La clase torneo será responsable de llevar el 
control de sus Jornadas. 
Al cabo de finalizar la Jornada, se deberá actualizar los puntos de cada equipo. Tambien se deberá mostrar la 
tabla de posiciones indicando cada equipo y su puntaje: 
Torneo Futbol 
11 
Torneo Futbol 
8 
Torneo Futbol 
5 
Partido Ganado 3 puntos 3 puntos 2 puntos 
Partido Empatado 1 punto por 
equipo 
1 punto por 
equipo 
1 punto por 
equipo 
Partido Perdido 0 puntos 1 punto 0 puntos 
Valla invicta (el equipo rival no 
convirtió ningun gol) 
0 puntos 1 punto 0 puntos 
Ganar por más de 4 goles 0 puntos 0 puntos 1 punto 
Empate con mas de 3 goles por equipo 0 puntos 1 punto por 
equipo 
2 puntos por 
equipo 
Ejemplo: 
Si dos equipos del torneo de futbol 8 empatan 4 a 4, sumarán 1 punto cada uno por empatar y además otro punto 
cada uno por haber empatado por más de 3 goles (3 a 3). 
Lista de Partidos agregados al torneo de futbol 8 
Equipo Local Equipo Visitante Goles Local Goles Visitante Fecha 
Boca San Lorenzo 5 4 1 
River Racing 1 2 1 
Velez Independiente 2 6 1 
Boca River 4 3 2 
San Lorenzo Independiente 3 0 2 
Racing Velez 5 1 2 
Boca Velez 6 6 3 
San Lorenzo River 3 1 3 
Racing Independiente 2 4 3 
Boca Racing 0 0 4 
River Independiente 1 2 4 
San Lorenzo Velez 4 4 4 
Boca Independiente 2 1 5 
River Velez 2 5 5 
San Lorenzo Racing 0 3 5 
Instituto de Tecnología ORT 
Carrera de Analista de Sistemas 
Materia: Taller de Programación 1
Página 5
La salida será: 
Torneo de futbol 8
Tabla de posiciones al cabo de 5 fechas:
Boca: 12 puntos
River: 5 puntos
Velez: 9 puntos
San Lorenzo: 11 puntos
Racing: 12 puntos
Independiente: 11 puntos

*/