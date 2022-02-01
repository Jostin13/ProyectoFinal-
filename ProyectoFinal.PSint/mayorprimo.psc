Algoritmo mayorprimo
	Definir j,i,k,mA,mB,div Como Entero
	mA <- 0; mB <- 0; div <- 0
	Dimension A[4,6]
	Dimension B[4,6]
	Escribir 'Ingrese datos de la matriz A: '
	Para i<-1 Hasta 4 Hacer
		Para j<-1 Hasta 6 Hacer
			Escribir 'A[',+i,+'][',+j,+']= '
			Leer A[i,j]
		FinPara
	FinPara
	Escribir 'Ingrese datos de la matriz B: '
	Para i<-1 Hasta 4 Hacer
		Para j<-1 Hasta 6 Hacer
			Escribir 'B[',+i,+'][',+j,+']= '
			Leer B[i,j]
		FinPara
	FinPara
	Escribir "matriz A"
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Escribir Sin Saltar A[i,j] ,+ "  "
		FinPara
		Escribir " "
	FinPara
	Escribir "matriz B"
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Escribir Sin Saltar B[i,j] ,+ "  "
		FinPara
		Escribir " "
	FinPara
	// Comprobar el mayor número primo de las dos matrices
	
	Para i<-1 Hasta 4 Hacer
		div <- 0
		Para j<-1 Hasta 6 Hacer
			Para k<-1 Hasta A[i,j] Hacer
				Si (A[i,j] MOD k==0) Entonces
					div <- div+1
				FinSi
			FinPara
			Si (mA<A[i,j]) Y (div==2) Entonces
				mA <- A[i,j]
			FinSi
		FinPara
	FinPara
	Escribir 'Número primo mayor en A :',+mA

	Para i<-1 Hasta 4 Hacer
		div <- 0
		Para j<-1 Hasta 6 Hacer
			Para k<-1 Hasta B[i,j] Hacer
				Si (B[i,j] MOD k==0) Entonces
					div <- div+1
				FinSi
			FinPara
			Si (mB<B[i,j]) Y (div==2) Entonces
				mB <- B[i,j]
			FinSi
		FinPara
	FinPara
	Escribir 'Número primo mayor en B :',+mB
	// Comprobar mayor primo A en B
	Para i<-1 Hasta 4 Hacer
		Para j<-1 Hasta 6 Hacer
			Si (mA==B[i,j]) Entonces
				Escribir 'El mayor número primo de la matriz A (',+mA,+') está repetido en la matriz B, posición B[',+i,+'][',+j,+']'
			FinSi
		FinPara
	FinPara
	// Comprobar mayor primo B en A
	Para i<-1 Hasta 4 Hacer
		Para j<-1 Hasta 6 Hacer
			Si (mB==A[i,j]) Entonces
				Escribir 'El mayor número primo de la matriz B (',+mB,+') está repetido en la matriz A, posición A[',+i,+'][',+j,+']'
			FinSi
		FinPara
	FinPara
FinAlgoritmo
