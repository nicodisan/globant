Algoritmo sin_titulo
	definir vector, frase, vecto, letra Como Caracter
	definir i, posicion Como Entero
	dimension vector(20)
	
	Escribir "ingrese frase de menos o igual q 20 caracteres"
	leer frase
	
	rellenar(frase, vector)
	
	Escribir "ingrese un caracter y despues una posicion"
	leer letra, posicion
	
	si vector(posicion) = " "
		vector(posicion) = letra
		para i = 0 hasta 19
			
			escribir sin saltar vector(i)
		FinPara
	sino
		Escribir "Letra ocupada"
		
	FinSi
	
	
	
FinAlgoritmo




SubProceso rellenar(frase, vector)
	
	definir i Como Entero
	para i = 0 hasta 19
		vector(i) = subcadena(frase,i,i)
	FinPara
	
FinSubProceso

