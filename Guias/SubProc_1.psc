Algoritmo sin_titulo
	definir a, b Como Entero
	Escribir "Ingrese valor A"
	leer a
	Escribir "Ingrese valor B"
	leer b
	Escribir "Antes del intercambio, el valor A es: " a " y el valor B es: " b
	intercambio(a,b)
	Escribir "Despues del intercambio, el valor A es: " a " y el valor B es: " b
	
FinAlgoritmo

SubProceso intercambio(a Por Referencia, b por referencia)
	Definir i Como Entero
	i = a
	a = b
	b = i
FinSubProceso
