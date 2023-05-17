Funcion x <- par_impar ( a )
	definir x Como Entero
	x = a
	si x % 2 == 0 Entonces
		x = 1
	SiNo
		x = 2
	FinSi
	
Fin Funcion


Algoritmo sin_titulo
	
	definir x, a como entero

	Escribir "ingrese un numero entero"
	leer a
	x = par_impar(a)
	
	si x == 1
		Escribir "El numero es par"
	sino
		Escribir "El numero es impar"
	FinSi
	
	
	
FinAlgoritmo
