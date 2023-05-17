funcion retorno = es_multiplo(a , b)
	definir retorno Como Entero
	retorno = 0
	si a mod b == 0
		retorno = 1
	SiNo
		retorno = 2
	FinSi
	
FinFuncion

Algoritmo sin_titulo
	
	definir a, b, retorno Como Entero
	
	Escribir "ingrese un num:"
	leer a
	Escribir "ingrese otro num:"
	leer b
	
	retorno = es_multiplo(a,b)
		
	si retorno == 1
		Escribir "Es multiplo"
	SiNo
		Escribir "No es multiplo"
	FinSi
		
FinAlgoritmo
