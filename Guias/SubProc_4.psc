Algoritmo sin_titulo
	definir frase, deletreo, fraseFinal Como Caracter
	definir i, j como entero
	leer frase
	escribir frase
	fraseFinal = ""	
	Para i = 0 hasta Longitud(frase)
		deletreo = Subcadena(frase,i,i)
		codificacion(deletreo)
		
		para j = 0 hasta 0
			
			fraseFinal = fraseFinal + concatenar(deletreo,)
		FinPara
	FinPara
	
	escribir fraseFinal
		
FinAlgoritmo

SubProceso codificacion(deletreo Por Referencia)
	Segun deletreo Hacer
		"a" o "á" o "A":
			deletreo = "@"
		"e" o "é" o "E":
			deletreo = "#"
		"i" o "í" o "I":
			deletreo = "$"
		"o" o "ó" o "O":
			deletreo = "%"
		"u" o "ú" o "U":
			deletreo = "*"
		De Otro Modo:
			deletreo = deletreo
	Fin Segun
FinSubProceso
