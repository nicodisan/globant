Funcion sumar <- cant_letras ( a, b )
	definir long, i, sumar como entero
	definir iteracion Como Caracter
	
	long = Longitud(a)
	i = 0
	sumar = 0
	Para i<-0 Hasta long
		iteracion =  Subcadena(a,i,i)
		si iteracion == b
			sumar = sumar + 1
		FinSi
	Fin Para
			
Fin Funcion

Algoritmo sin_titulo
	definir iteracion, a, b Como Caracter
	definir long, i, sumar como entero
	
	Escribir "Ingrese frase:"
	leer a
	Escribir "Ingrese letra:"
	leer b
		
	sumar = cant_letras(a,b)
	escribir "En la frase: " a, " existen " sumar " letras: " b
	
	
	
FinAlgoritmo


