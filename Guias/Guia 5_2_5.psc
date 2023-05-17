Algoritmo sin_titulo
	definir frase, matriz, i, j Como Caracter
	Dimension matriz(3,3)
		
	Escribir "Ingrese una palabra de 9 letras"
	leer frase
	Hacer
		si Longitud(frase) <> 9
			Escribir "Error, la palabra debe contener solo 9 letras, ingrese nuevamente"
			leer frase
		FinSi
	Mientras Que Longitud(frase)  <> 9
	
	rellenar(matriz,frase)
	
	
	
FinAlgoritmo


SubProceso rellenar(matriz,frase)
	definir i,j, cont Como Entero
	cont = 0
	Para i= 0 hasta 2
		para j = 0 hasta 2
			matriz(i,j) = Subcadena(frase,cont,cont)
			escribir sin saltar matriz(i,j) " "
			cont = cont + 1
			
		FinPara
		escribir ""
		
	FinPara
	
	
FinSubProceso
	