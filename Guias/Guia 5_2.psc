Algoritmo sin_titulo
	
	definir num, suma, resta, mult como reales
	dimension num(10)
	definir i como entero
	suma = 0
	resta = 0
	mult = 1
	
	para i = 0 hasta 9
		leer num(i)
	FinPara
	
	
	para i = 0 hasta 9
		
		suma = suma + num(i)
		resta = resta - num(i)
		mult = mult * num(i)
	FinPara
	
	escribir "sumados " suma
	escribir "restados " resta
	Escribir "multiplicados " mult
	
FinAlgoritmo
