Algoritmo enteroenvector
	Definir n,i,num Como Entero
	n <- 0; num <- 0
	Escribir 'Ingrese el tama�o del vector (Mayor a 10): '
	Leer n
	Dimension A[n]
	Si (n>=10) Entonces
		Escribir 'Ingrese un n�mero entero: '
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
				Escribir 'El n�mero ',+num,+' se encuentra en la posici�n A[',+i,+'] del vector.'
			FinSi
		FinPara
	SiNo
		Escribir 'n NO PUEDE ser menor a 10, reinicie el programa.'
		Escribir '************'
	FinSi
FinAlgoritmo
