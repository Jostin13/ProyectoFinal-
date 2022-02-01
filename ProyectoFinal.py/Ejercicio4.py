# Una matriz tiene un punto de silla en una de sus componentes si 
# este es el mayor valor de su columna y el menor de su fila. Dise˜ne un algoritmo que
# recibiendo una matriz n×n muestre las coordenadas de todos sus puntos silla
n= int(input("Ingrese el tamaño de la matriz cuadrada:"))
A=[]
contador=0
l=0
for i in range(n):       
    A.append( [0]*n)
        
for fila in range(0,n):
    for columna in range(0,n):
        A[fila][columna]= int(input(f'Ingrese datos de la matriz A:[{fila}][{columna}]= '))
    
    
    
for fila in range(0,n):
    for columna in range(0,n):
        print(str(A[fila][columna]) + "  ", end="")
    print() 
        
for j in range( n):            
    mayor = 0;
    mayor1=0;
    for i in range(n):
        if mayor<A[i][j]:
            mayor = A[i][j]
            k=i                
        menor = mayor+1 
                           
    for  m in range(n):
        if(mayor <= A[k][m]):
            mayor1 = A[k][m]               
            
    for  g in range(n):
        if((menor>A[k][g])and(mayor != mayor1)):
            menor = A[k][g]
            l=g  
           
    if((mayor == A[k][l] )and( menor== A[k][l])):
        contador = contador +1
        print(f"El punto silla número {contador} se encuentra en A[ {k}]"
                    + f"[{l}]")