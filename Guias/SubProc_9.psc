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
		"a" o "�" o "A":
			deletreo = "@"
		"e" o "�" o "E":
			deletreo = "#"
		"i" o "�" o "I":
			deletreo = "$"
		"o" o "�" o "O":
			deletreo = "%"
		"u" o "�" o "U":
			deletreo = "*"
		De Otro Modo:
			deletreo = deletreo
	Fin Segun
FinSubProceso
