Algoritmo sin_titulo
	Definir dias, tempMax, tempMin, i, temp Como Real
	
	Escribir "Ingrese cantidad de dias:"
	leer dias
	i = 1
	temp = 30
	
	Hacer
		Escribir "Ingrese temp max:" 
		leer tempMax
		Escribir "Ingrese tem min:"
		leer tempMin
		tempMedia(tempMax,tempMin,temp)
		Escribir "La media del dia " i " es: " temp
		i = i + 1
	Mientras Que i <> dias + 1


FinAlgoritmo

SubProceso tempMedia(tempMax Por Referencia, tempMin Por Referencia, temp Por Referencia)
	temp = (tempMax + tempMin) / 2
	
FinSubProceso