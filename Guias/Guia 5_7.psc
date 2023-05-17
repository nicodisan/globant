Algoritmo sin_titulo
	definir vector1, vector2 como enteros
	definir validacion Como Logico
	
	Dimension vector1(5), vector2(5)
	
	rellenos(vector1,vector2)
	
	validacion = iguales(vector1,vector2)
	
	Escribir validacion
	
FinAlgoritmo


SubProceso rellenos(vector1,vector2)
	definir i como entero
	para i = 0 hasta 4
		vector1(i) = Aleatorio(0,10)
		vector2(i) = Aleatorio(0,10)
	FinPara
	
	
FinSubProceso


Funcion validacion  = iguales(vector1, vector2)
	definir i como entero
	definir validacion como logico

		para i = 0 hasta 4
		si vector1(i) = vector2(i)
			validacion = Verdadero
		SiNo
			validacion = Falso
			
			
		FinSi
	FinPara
	


	
FinFuncion
