Algoritmo sin_titulo
	
	definir vector, i, n, mayor Como Entero
	Escribir "Ingrese el numero de dimension"
	leer n
	dimension vector(n)
	mayor = 0
	para i = 0 hasta n-1
		Escribir "Ingrese el valor " i 
		leer vector(i)
		si vector(i) > mayor
			mayor = vector(i)
		FinSi
	FinPara
	
	Escribir mayor 
	
	
	
FinAlgoritmo
