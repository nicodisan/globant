Algoritmo sin_titulo
	
	definir op, op2 Como Caracter
	definir i, retorno, vectorA, vectorB, vectorC como entero
	Dimension vectorA(5), vectorB(5), vectorC(5)
	
	//menu
	
	Escribir "Menu"
	Escribir "Que desea realizar??"
	Escribir "A. Llenar Vector A. (aleatorio)"
	Escribir "B. Llenar Vector B. (aleatorio)"
	Escribir "C. Llenar Vector C. Suma de elementos de A y B"
	Escribir "D. Llenar Vector D. Resta de elementos de B y A"
	Escribir "E. Mostrar. Elegir entre Vecter A, B o C"
	Escribir "F. Salir"
	
	
	Hacer
		leer op
		segun op
			"a":
				para i = 0 hasta 4
					vectorA(i) = Aleatorio(1,10)
				FinPara
				
				para i = 0 hasta 4
					Escribir vectorA(i) 
				FinPara
			"b":
				para i = 0 hasta 4
					vectorB(i) = Aleatorio(1,10)
				FinPara
				
				para i = 0 hasta 4
					Escribir vectorB(i) 
				FinPara
				
			"c":
				para i = 0 hasta 4
					Escribir vectorA(i) + vectorB(i)
				FinPara
				
			"d":
				para i = 0 hasta 4
					Escribir vectorA(i) - vectorB(i)
				FinPara
			"e":
				Escribir "Ingrese que vector ver:"
				leer op2
				Segun op2
					"a":
						para i = 0 hasta 4
							Escribir vectorA(i) 
						FinPara
					"b":
						para i = 0 hasta 4
							Escribir vectorB(i) 
						FinPara
					"c":
						para i = 0 hasta 4
							Escribir vectorC(i) 
						FinPara
					
				FinSegun
			"f":
				
		FinSegun
		
	Mientras Que op <> "f"
	
	
	
	
	
FinAlgoritmo




