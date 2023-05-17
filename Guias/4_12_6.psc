Funcion x <- divisores ( num )
	definir  i, x Como Entero
	
	x = 0
	para i = 1 hasta num - 1
		si num mod i = 0
			//Escribir i
			x = x + i
		FinSi
	FinPara
	
Fin Funcion


Algoritmo sin_titulo
	
	definir num, i, x Como Entero
	
	escribir "ingrese numero:"
	leer num
		
	x = divisores(num)
	
	Escribir "la suma de los divisores es: " x
	
FinAlgoritmo
