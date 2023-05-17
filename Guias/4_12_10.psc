Algoritmo Ej10_SumaDigitos
	Definir num Como Entero
	Escribir "Ingrese un número entero positivo:"
    Leer num
	
	Escribir "La suma total de los digitos es de: " sumaDigitos(num)
FinAlgoritmo

/// Suma de los dígitos de un número

Funcion totalSuma <- sumaDigitos(num)
	Definir totalSuma, i, suma, digitos Como Entero
	digitos = 0
	suma = 0
	
    Mientras num > 0 Hacer
		suma = suma + num%10 /// Tomamos el valor del ultimo numero
        num = trunc(num / 10) /// Removemos el ultimo numero
        digitos = digitos + 1 /// Contador
    Fin Mientras
	
	totalSuma = suma
FinFuncion


