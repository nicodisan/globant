Algoritmo sin_titulo
		
	Escribir menu()
		
FinAlgoritmo

// Menu Principal //
Funcion retorno = menu()
	definir op Como Entero
	definir vueltaMenu Como Caracter
	vueltaMenu = ""
	//Hacer
		Hacer
			Escribir "---------------------------------"
			Escribir "Menú Principal"
			Escribir ""
			Escribir "Ingrese una opción"
			Escribir "1. Calcular muro de ladrillo"
			Escribir "2. Calcular viga de hormigón"
			Escribir "3. Calcular columnas de hormigón"
			Escribir "4. Calcular contrapisos"
			Escribir "5. Calcular techos"
			Escribir "6. Calcular pisos"
			Escribir "7. Calcular pintura"
			Escribir "8. Calcular iluminación"
			Escribir "9. Salir"
			leer op
		
			Segun op
				1:
					Escribir calcularMuro()
				2:
					Escribir calcularViga()
				3:
					Escribir calcularColumna()
				4:
					Escribir calcularContrapisos()
				
				
			FinSegun
			Escribir "Presione ENTER para volver al Menú"
			leer vueltaMenu
						
		Mientras Que vueltaMenu = ""
		
		
	//Mientras Que op <> 9
FinFuncion

/////////////////////////////////////////////////////////////////////////////////////////////////////////




// Funcion Calcular Contrapisos //
Funcion retorno = calcularContrapisos()
	
	Definir alto, ancho, largo, cemento, arena, piedra, m3 Como Real
		
	Escribir "---------------------------------"
	Escribir "Calculo de Contrapisos"
	Escribir ""
	Escribir "Ingrese espesor del contrapiso en metros"
	leer alto
	Escribir "Ingrese largo y ancho del contrapiso"
	leer largo, ancho
	m3 = 0
	calcularVolumen(largo,ancho,alto,m3)
	cemento = 105
	arena = 0.45
	piedra = 0.9
	
	Escribir "Volumen: " m3 " m3"
	Escribir "Materiales para el contrapiso de " largo "x" ancho "x" alto "mts:"
	Escribir "Cemento: " cemento * m3 " kg"
	Escribir "Arena: " arena * m3 " m3"
	Escribir "Piedra: " piedra * m3 " m3"
	
FinFuncion

// Calculo Columna //
Funcion retorno = calcularColumna()
	definir largo, cemento, arena, piedra, hierro10, hierro4 Como Real
	
	Escribir "---------------------------------"
	Escribir "Calculo de Columna"
	Escribir ""
	Escribir "Ingrese el largo de la columna en metros: "
	leer largo
	
	cemento = 7.5
	arena = 0.016
	piedra = 0.016
	hierro10 = 6
	hierro4 = 3
	
	Escribir "Materiales para columna de " largo "mts:"
	Escribir "Cemento: " cemento * largo " kg"
	Escribir "Arena: " arena * largo " m3"
	Escribir "Piedra: " piedra * largo " m2"
	Escribir "Hierro del 10: " hierro10 * largo " mts"
	Escribir "Hierro del 4: " hierro4 * largo " mts"
	
FinFuncion


// Funcion Calcular Muro //
Funcion retorno <- calcularMuro()
	
	Definir espesor, largo, alto, m2, cemento, arena, ladrillos como real
	
	Escribir "---------------------------------"
	Escribir "Calculo de Muro"
	Escribir ""
	Escribir "Ingrese espesor del muro en cm: (20 o 30)"
	leer espesor
	Escribir "Ingrese largo y alto del muro"
	leer largo, alto
	
	m2 = 0
	calcularSuperficie(largo,alto,m2)
		
	Segun espesor
		30:
			cemento = 15.2
			arena = 0.115
			ladrillos = 120
		20:
			cemento = 10.9
			arena = 0.09
			ladrillos = 90
		De Otro Modo:
			Escribir "Error, ingresar unicamente 20 o 30"
	Fin Segun
	Escribir "Superficie: " m2 " m2"
	Escribir "Materiales para el muro de " largo "x" alto "x" espesor "cm:"
	Escribir "Cemento: " cemento * m2 " kg"
	Escribir "Arena: " arena * m2 " m3"
	Escribir "Ladrillos: " redon(ladrillos * m2) " unidades"
		
Fin Funcion

// Funcion Calcular viga //
funcion retorno = calcularViga()
	definir largo, cemento, arena, piedra, hierro10, hierro4 Como Real
	
	Escribir "---------------------------------"
	Escribir "Calculo de Viga"
	Escribir ""
	Escribir "Ingrese el largo de la viga en metros: "
	leer largo
	
	cemento = 9
	arena = 0.02
	piedra = 0.02
	hierro10 = 6
	hierro4 = 3
	
	Escribir "Materiales para viga de " largo "mts:"
	Escribir "Cemento: " cemento * largo " kg"
	Escribir "Arena: " arena * largo " m3"
	Escribir "Piedra: " piedra * largo " m2"
	Escribir "Hierro del 10: " hierro10 * largo " mts"
	Escribir "Hierro del 4: " hierro4 * largo " mts"
	
FinFuncion




// Calculo superficie //
SubProceso calcularSuperficie(largo por referencia,alto Por Referencia, m2 por referencia)
	m2 = largo * alto
FinSubProceso
// Calculo Volumen //
SubProceso calcularVolumen(largo Por Referencia,ancho Por Referencia,alto Por Referencia, m3 Por Referencia)
	m3 = largo * ancho * alto
FinSubProceso



