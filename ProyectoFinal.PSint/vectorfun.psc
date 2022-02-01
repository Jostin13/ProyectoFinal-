Algoritmo vector
	Definir dig,i,contador Como Entero
	i <- 0; contador <- 0; dig <- 0
	Escribir 'Ingrese un digito:'
	Leer dig
	Dimension A[10]
	Para i<-1 Hasta 10 Hacer
		Escribir 'Ingrese un dato en la posición A[',+i,+']'
		Leer A[i]
	FinPara
	contador <- contardig(A,dig)
	Escribir 'Existen ',+contador,+' números que terminan en ',+dig,+' dentro del vector'
FinAlgoritmo

Funcion contador <- contardig(B,d)
	Definir contador,i Como Entero
	contador <- 0
	Para i<-1 Hasta 10 Hacer
		Si B[i] MOD 10==d Entonces
			contador <- contador+1
		FinSi
	FinPara
FinFuncion
