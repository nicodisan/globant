Algoritmo calculadora_de_materiales_equipo
	
	menu()
	
FinAlgoritmo
	
SubProceso menu()
	Definir salir Como Logico
	Definir opcionUsuario Como Entero
	salir = Falso
	Mientras salir == Falso Hacer
		opcionUsuario = mostrarOpcionesMenu()
		Segun opcionUsuario Hacer
			1:
				// Llamar al subproceso para realizar operacion.
				calcularMuro()
			2:
				// Llamar al subproceso para realizar operacion.
				calcularViga()
			3:
				// Llamar al subproceso para realizar operacion.
				calcularColumna()
			4:
				// Llamar al subproceso para realizar operacion.
				calcularContrapisos()
			5:
				// Llamar al subproceso para realizar operacion.
				calcularTecho()
			6:
				// Llamar al subproceso para realizar operacion.
				calcularPisos()
			7:
				// Llamar al subproceso para realizar operacion.
				qPintura()
			8:
				// Llamar al subproceso para realizar operacion.
				iluminacion()
			9:
				salir = Verdadero
			De Otro Modo:
				Escribir "Ha ingresado una opcion invalida. Intente nuevamente"
		FinSegun
	Fin Mientras
FinSubProceso

Funcion opcionUsuario <- mostrarOpcionesMenu ()
	Definir opcionUsuario Como Entero
	Escribir ""
	Escribir "Seleccione una opción"
	Escribir "Ingrese 1 Para Calcular muro de ladrillo"
	Escribir "Ingrese 2 Para Calcular viga de hormigón"
	Escribir "Ingrese 3 Para Calcular columnas de hormigón"
	Escribir "Ingrese 4 Para Calcular contrapisos"
	Escribir "Ingrese 5 Para Calcular techo"
	Escribir "Ingrese 6 Para Calcular pisos"
	Escribir "Ingrese 7 Para Calcular pintura"
	Escribir "Ingrese 8 Para Calcular iluminación"
	Escribir "Ingrese 9 Para salir del programa"
	Leer opcionUsuario
Fin Funcion

// Calculo Volumen //
Funcion m3 = calcularVolumen(largo Por Referencia,ancho Por Referencia,alto Por Referencia)
	Definir m3 como real
	m3 = largo * ancho * alto
FinFuncion

// Calculo Superficie

Funcion superficie <- calcularSuperficie (alto, largo)
	Definir superficie Como Real
	// Multiplicamos alto por largo para obtener los metros cuadrados de una superficie.
	superficie = alto * largo
Fin Funcion

// Subprocesos de cada uno:

// 1 - Vivi

SubProceso calcularMuro
	Definir espesorMuro, largo, alto, superficie Como Entero
	Definir kgsCemento, arena, ladrillos Como Real
	// Pedir los datos necesarios.
	Escribir "Espesor del muro. Ingrese 1 si el espesor es de 20 cm o 2 si es de 30cm"
	leer espesorMuro
	Escribir "Ingrese el alto del muro en metros"
	Leer alto
	Escribir "Ingrese el largo del muro en metros"
	Leer largo
	superficie = calcularSuperficie(alto, largo)
	// Si el espesor es de 20cms. Es decir la opcion 1.
	Si espesorMuro == 1
		kgsCemento = 10.9 * superficie
		arena = 0.09 * superficie
		ladrillos = 90 * superficie
		Escribir "Para el muro de espesor de 20cm, con una superficie total de ", superficie," mts2, necesitaremos en total: ", kgsCemento " kg de cemento, ",arena " m3 de arenay ", ladrillos, " ladrillos."
	SiNo
		// Si el espesor es de 30 cms. Es decir la opcion 2.
		Si espesorMuro == 2
			kgsCemento = 15.2 * superficie
			arena = 0.115 * superficie
			ladrillos = 120 * superficie
			Escribir "Para el muro de espesor de 30 cm, con una superficie total de ", superficie," mts2, necesitaremos en total: ", kgsCemento " kg de cemento, ",arena " m3 de arenay ", ladrillos " ladrillos."
		SiNo
			// Si el usuario ingreso un numero diferente a 1 o 2.
			Escribir "El espesor ingresado es invalido. Debe ingresar una opcion valida. Intente de nuevo"
		FinSi
	FinSi
FinSubProceso

// 2 - Tomy

SubProceso calcularViga()
	Definir largoViga Como Real
	Escribir "Ingrese el largo de la viga en metros(m)"
	Leer largoViga
	
	Escribir "Dado que el largo de la viga es ",largoViga , "m, se necesitaran: "
	Escribir "- " largoViga*9 "kg de cemento"
	Escribir "- " largoViga*0.02 "m^3 de arena"
	Escribir "- " largoViga*0.02 "m^2 de piedra"
	Escribir "- " largoViga*4 "m de hierro del 8"
	Escribir "- " largoViga*3 "m de hierro del 4"
	
FinSubProceso

// 3 - Sebas

SubProceso calcularColumna()
	
	Definir largo Como Real
	
	Escribir "Ingrese largo de la columna: "
	Leer largo
	
	Escribir "Se necesitan " , ((largo * 7.5)/1) , " kg de cemento"
	Escribir "Se necesitan " , ((largo * 0.016)/1) , " m3 de arena"
	Escribir "Se necesitan " , ((largo * 0.016)/1) , " m2 de piedra"
	Escribir "Se necesitan " , ((largo * 6)/1) , " mts de hierro #10"
	Escribir "Se necesitan " , ((largo * 3)/1) , " mts de hierro #4"
	
FinSubProceso

// 4 - Nico

SubProceso calcularContrapisos()
	
	Definir alto, ancho, largo, cemento, arena, piedra, m3 Como Real
	
	Escribir "---------------------------------"
	Escribir "Calculo de Contrapisos"
	Escribir ""
	Escribir "Ingrese espesor del contrapiso en metros"
	leer alto
	Escribir "Ingrese largo y ancho del contrapiso"
	leer largo, ancho
	m3 = calcularVolumen(largo,ancho,alto)
	cemento = 105
	arena = 0.45
	piedra = 0.9
	
	Escribir "Volumen: " m3 " m3"
	Escribir "Materiales para el contrapiso de " largo "x" ancho "x" alto "mts:"
	Escribir "Cemento: " cemento * m3 " kg"
	Escribir "Arena: " arena * m3 " m3"
	Escribir "Piedra: " piedra * m3 " m3"
	
FinSubProceso

// 5 - Nati

SubProceso calcularTecho()
	
	Definir  cemento, arena, piedra, hierro8, hierro6, vol Como Numero
	Definir espesor, anCho, largo Como Numero
	
	Escribir 'Ingrese espesor', ' Ingrese ancho', ' Ingrese largo'
	Leer espesor, anCho, largo
	
	vol = calcularVolumen(largo, espesor, anCho)
	
	cemento = vol * 33
	arena = vol * 0.072 
	piedra = vol * 0.072
	hierro8 = vol * 7
	hierro6 = vol * 4
	
	Escribir 'Para ', vol, ' metros, se necesita la siguiente cantidad de materiales: '
	Escribir 'Cemento: ' cemento, ' Arena: ' arena, ' Piedra: ' piedra, ' Hierro del 8: ' hierro8, ' Hierro del 6: ' hierro6
	
FinSubProceso

// 6 - Mayra

SubProceso calcularPisos()
	//	Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe calcular la
	//	superficie y añadirle un 10% extra por recortes
	//	Mostrar el resultado en m2
	Definir ancho, largo, recorte como real
	Escribir "Ingresa el ancho y largo del paño de piso a colocar en m"
	Leer ancho
	Leer largo
	recorte= 0
	Escribir "El área del piso es ", calcularSuperficie(ancho,largo), " m2"
	//Si el usuario ingresa las dimensiones en otra unidad, hayq ue hacer una conversión
	recorte = 1.10 * calcularSuperficie(ancho,largo) 
	Escribir "Pero añadiendo el 10% por recortes, el área será: ", recorte, " m2"
FinSubProceso

// 7 - Lucia

Subproceso qPintura()
	Definir mts2, mtsa, mtsl Como Real
	Escribir "Ingrese los metros de alto" 
	Leer mtsa 
	Escribir "Ingrese los metros de largo" 
	Leer mtsl
	mts2 = calcularSuperficie(mtsa, mtsl)
	Escribir "La cantidad de metros cuadrados a calcular es de " mts2 " y la cantidad de pintura a utilizar es de " mts2/6 " litros."
FinSubProceso

// 8 - todos

SubProceso iluminacion()
	Definir mts2, mtsa, mtsl Como Real
	Escribir "Ingrese los metros de alto" 
	Leer mtsa 
	Escribir "Ingrese los metros de largo" 
	Leer mtsl
	mts2 = calcularSuperficie(mtsa, mtsl)
	Escribir "La cantidad de metros cuadrados de la habitacion es de " mts2 " y la superficie minima de iluminación natural debe ser de " mts2 * 0.2 " mts2."
	
FinSubProceso





