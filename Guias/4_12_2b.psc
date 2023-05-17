Funcion par_impar ( a por referencia)
	si a % 2 == 0 Entonces
		a = 1
	SiNo
		a = 2
	FinSi
	
Fin Funcion


Algoritmo sin_titulo
	
	definir  a como entero
	
	Escribir "ingrese un numero entero"
	leer a
	par_impar(a)
	
	si a == 1
		Escribir "El numero es par"
	sino
		Escribir "El numero es impar"
	FinSi
	
	
	
FinAlgoritmo
