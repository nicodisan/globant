Algoritmo sin_titulo
	definir num, matriz, i, j Como Entero
	dimension matriz(5,5)
	
	Escribir "Ingrese numero a buscar"
	leer num
	
	rellenado(matriz)
	
	Para i=0 hasta 4 
		Para j = 0 hasta 4
			escribir sin saltar matriz(i,j), "  "
			
		FinPara
		escribir ""
	FinPara
	
	busqueda(matriz,num)
	
FinAlgoritmo

SubProceso rellenado(matriz)
	Definir i, j Como Entero
	
	Para i=0 hasta 4 
		Para j = 0 hasta 4
			matriz(i,j) = Aleatorio(1,10)
			
		FinPara
	FinPara
	
FinSubProceso

SubProceso busqueda(matriz,num)
	Definir i, j, x Como Entero
	x = 0
	Para i=0 hasta 4 
		Para j = 0 hasta 4
			si num = matriz(i,j)
				Escribir "El numero " num,  " se encuentra en fila: " i+1, " Columna: " j+1
				x = x + 1
			FinSi
			
		FinPara
	FinPara
	
	si x = 0
		Escribir "Valor no encontrado"
	FinSi
	
FinSubProceso
