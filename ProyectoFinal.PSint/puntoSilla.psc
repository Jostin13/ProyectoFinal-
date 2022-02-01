Algoritmo puntoSilla
	Definir mayor0,menor0,i,j,n,k,l,mayor1,contado Como Entero
	i <- 0; j <- 0; n <- 0; k <- 0; l <- 0; mayor1 <- 0; contador <- 0
	Escribir 'Ingrese el tamaño de la matriz cuadrada:'
	Leer n
	Dimension A[n,n]
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta n Hacer
			Escribir 'Ingrese datos de la matriz A[',+i,+'][',+j,+']= '
			Leer A[i,j]
		FinPara
	FinPara
	Para j<-1 Hasta n Hacer
		mayor0 <- 0
		mayor1 <- 0
		Para i<-1 Hasta n Hacer
			Si mayor0<A[i,j] Entonces
				mayor0 <- A[i,j]
				k <- i
			FinSi
			menor0 <- mayor0+1
		FinPara
		Para m<-1 Hasta n Hacer
			Si mayor0<=A[k,m] Entonces
				mayor1 <- A[k,m]
			FinSi
		FinPara
		Para g<-1 Hasta n Hacer
			Si ((menor0>A[k,g]) Y (mayor0<>mayor1)) Entonces
				menor0 <- A[k,g]
				l <- g
			FinSi
		FinPara
		Si ((mayor0==A[k,l]) Y (menor0==A[k,l])) Entonces
			contador <- contador+1
			Escribir 'La matriz tiene ',+contador,+' puntos de silla.'
			Escribir 'El punto silla se encuentra en A[',+k,+'][',+l,+']'
		FinSi
	FinPara
FinAlgoritmo
