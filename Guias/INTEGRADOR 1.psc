Algoritmo sin_titulo
	definir matriz, muestra, transpuesta Como caracter
	definir n, i, j,cont como entero
	n = 3
	muestra = ""
	dimension matriz(n,n), transpuesta(n,n)
	
	ingreso(matriz,n,muestra)
	
	validacion(matriz,n,muestra)
	
	validacion2(matriz,n,muestra)
	
	
FinAlgoritmo


SubProceso ingreso(matriz,n, muestra)
	Definir i,j,cont como entero
	cont = 0
	para i = 0 hasta n -1
		para j = 0 hasta n-1
			matriz(i,j) = Subcadena(muestra,cont,cont)
			Escribir sin saltar matriz(i,j) "  "
			cont = cont + 1
			
		FinPara
		Escribir ""
	FinPara
	
	
FinSubProceso
	
SubProceso validacion(matriz,n,muestra)
		
		definir i,j,cont como entero
		cont = 0
				
		para j = 0 hasta n -1
				si matriz(0,0) = matriz(j,j)
					Escribir "Correcta"
					cont = cont + 1
					//escribir cont
				sino
					Escribir "Incorrecta"
				FinSi
		FinPara
		
		Si cont = n
			Escribir "ok"
		FinSi
				
FinSubProceso

subproceso validacion2(matriz,n,muestra)
	definir i,j,cont, cont2 como entero
	cont = n-1
	cont2 = 0
	para j = 0 hasta n-1
		si matriz(0,n-1) = matriz(cont,j)
			Escribir "Correcta"
			cont = cont - 1			
			cont2 = cont2 + 1
			//Escribir cont2 
		sino
			Escribir "Incorrecta"
			
		FinSi
		
	FinPara
	
	si cont2 = n
		Escribir "ok"
		
	FinSi
FinSubProceso
