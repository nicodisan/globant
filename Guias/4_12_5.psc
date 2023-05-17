Funcion primo <- es_primo ( num )
	definir x, i, primo Como Entero
	
	x = 0
	para i = 1 hasta num
		si num mod i = 0
			x = x + 1
		FinSi
	FinPara
	
	si x = 2
		primo = 1
	sino
		primo = 2
		
	FinSi
Fin Funcion

Algoritmo sin_titulo
	
	definir num, x, i, primo Como Entero
	
	
	Escribir "ingrese un numero"
	leer num
	
	primo = es_primo(num)
	
	Si primo = 1
		Escribir "Es primo"
	SiNo
		Escribir "No es primo"
	FinSi
	
	
	
	
	
FinAlgoritmo
