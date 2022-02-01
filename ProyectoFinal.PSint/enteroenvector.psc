Algoritmo enteroenvector
	Definir n,i,num Como Entero
	n <- 0; num <- 0
	Escribir 'Ingrese el tamaño del vector (Mayor a 10): '
	Leer n
	Dimension A[n]
	Si (n>=10) Entonces
		Escribir 'Ingrese un número entero: '
		Leer num
		Para i<-1 Hasta n Hacer
			Escribir 'A [',+i,+'] = '
			Leer A[i]
		FinPara
		Para i<-1 Hasta n Hacer
			Escribir A[i],+'  ' Sin Saltar
		FinPara
		Escribir ' '
		Para i<-1 Hasta n Hacer
			Si (A[i]==num) Entonces
				Escribir 'El número ',+num,+' se encuentra en la posición A[',+i,+'] del vector.'
			FinSi
		FinPara
	SiNo
		Escribir 'n NO PUEDE ser menor a 10, reinicie el programa.'
		Escribir '************'
	FinSi
FinAlgoritmo
