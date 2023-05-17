Algoritmo ej7
	definir numText Como Caracter
	definir num como entero
	Escribir "Ingrese un numero"
	leer numText
	Escribir texto_entero(numText)
		
FinAlgoritmo

Funcion num <- texto_entero ( numText )
	definir num como entero
	
	si Longitud(numText) <= 3
		num  = ConvertirANumero(numText)
		Escribir "El numero de texto a entero es: "
	SiNo
		Escribir "Error: Ingresó mas de 3 digitos"
	finsi	
	
Fin Funcion