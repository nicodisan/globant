Algoritmo sin_titulo
	definir num, numBusqueda, count, i Como Entero
	dimension num(5)
	count = 0
	escribir "Ingrese 5 numeros"
	
	para i = 0 hasta 4
		leer num(i)
	FinPara
	
	escribir "ingrese un numero a buscar"
	leer numBusqueda
	
	para i = 0 hasta 4
		si num(i) = numBusqueda
			count = i
			Escribir sin saltar  count " / "
			
		FinSi
		
	FinPara
	
FinAlgoritmo
