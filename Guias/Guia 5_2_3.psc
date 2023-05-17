Algoritmo sin_titulo
	definir matriz, n, m, i, j, total Como Entero
	
	Escribir "Ingrese numero de filas, y despues columnas"
	leer n, m
	dimension matriz(n,m)
	
	rellenar(matriz,n,m)
	
	total = suma(matriz,n,m)
		
	// escribit &//
	para i=0 hasta n-1
		para j=0 hasta m-1
			escribir sin saltar matriz(i,j) "  "
			
		FinPara
		Escribir  ""
	FinPara
	
	Escribir "La suma de la matriz es de: " total
	
FinAlgoritmo

// rellenado //
SubProceso rellenar(matriz,n,m)
	definir i, j como entero
	
	para i=0 hasta n-1
		para j=0 hasta m-1
			matriz(i,j) = Aleatorio(1,10)
			
		FinPara
	FinPara
FinSubProceso

// suma //

SubProceso total = suma(matriz,n,m)
	Definir i,j, total Como Entero
	total = 0
	para i=0 hasta n-1
		para j=0 hasta m-1
			total = total + matriz(i,j)
			
		FinPara
	FinPara
	
	
FinSubProceso
	