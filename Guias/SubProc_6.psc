Algoritmo sin_titulo
	
	definir letra Como Caracter
	
	leer letra

	letra = Mayusculas(letra)	
	buscaLetra(letra)
		
FinAlgoritmo
 
SubProceso buscaLetra(letra)
	Si letra >= "M" y letra <= "T" Entonces
		Escribir "La letra " letra " SI est� entre la M y la T"
	SiNo
		Escribir "La letra " letra " NO est� entre la M y la T"
	Fin Si
	
FinSubProceso
