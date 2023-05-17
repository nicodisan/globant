Algoritmo sin_titulo
	
	definir user, pass como caracter
	definir intentos, i Como Entero
	definir log Como Logico
	intentos = 1
	Hacer
		
		Escribir "Ingrese usuario"
		leer user
		Escribir "ingrese pass"
		leer pass
		
		log = login(user, pass, intentos)
		si log = Verdadero
			intentos = 4
		SiNo
			intentos = intentos + 1
		FinSi
		
	Mientras Que intentos <> 4
	Escribir log
			
FinAlgoritmo

Funcion log <- login ( user, pass, intentos )
	definir log Como Logico
	
	si user = "usuario1" y pass = "asdasd"
		log = Verdadero
	sino
		Escribir "Error, le quedan " (3 - intentos) " intentos"
	FinSi
		
Fin Funcion
