Algoritmo sin_titulo
	
	definir num1, num2, result, i Como Real
	
	Escribir "ingrese los dos num"
	leer num1, num2
	result = 0
	i = 0
	Hacer
		calculo(num1,num2,result)
		i = i + 1
		Escribir num1 " - " num2 " = " result "------" i " restas realizadas"
		num1 = result
	Mientras Que result >= num2
	
FinAlgoritmo

SubProceso calculo (num1 por referencia, num2, result por referencia)
	result = num1 - num2
FinSubProceso
	