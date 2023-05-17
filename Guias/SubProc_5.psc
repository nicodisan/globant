Algoritmo sin_titulo
	
	definir frase, deletreo, fraseFinal como caracter
	definir i, j Como Entero
	
	leer frase
	escribir frase
	fraseFinal = ""
	para i = 0 Hasta Longitud(frase)
		deletreo = Subcadena(frase,i,i)
		convertirEspaciado(deletreo)
		para j = 0 hasta 0
			fraseFinal = fraseFinal + Concatenar(deletreo,)
		FinPara
		
	FinPara
	
escribir fraseFinal
FinAlgoritmo


SubProceso convertirEspaciado(deletreo Por Referencia)
	deletreo = deletreo + " "
FinSubProceso
	 