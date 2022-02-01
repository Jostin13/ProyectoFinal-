# Leer dos matrices 4x6 enteras y determinar si el mayor número primo de una matriz 
#está repetido en la otra matriz.
mA, mB=0,0
tamanioFilas=4   # int(input('Ingrese numero de fila'))
tamanioColumnas=6 # int(input('Ingrese numero de Columnas'))
   
  
A=[
    [0,0,0,0,0,0],
    [0,0,0,0,0,0],
    [0,0,0,0,0,0],
    [0,0,0,0,0,0]]
    
B=[
    [0,0,0,0,0,0],
    [0,0,0,0,0,0],
    [0,0,0,0,0,0],
    [0,0,0,0,0,0]]
        


print("datos de la matriz A") 
for fila in range(0,tamanioFilas):
    for columna in range(0,tamanioColumnas):
        A[fila][columna]= int(input(f'Ingrese datos de la matriz A:[{fila}][{columna}]= '))
    
print("Datos de la matriz B") 
for fila in range(0,tamanioFilas):
    for columna in range(0,tamanioColumnas):
        B[fila][columna]=int(input(f'Ingrese datos de la matriz B:[{fila}][{columna}]= ')) 


#Se presentan las dos marices     
print("Matriz A")
for fila in range(0,tamanioFilas):
    for columna in range(0,tamanioColumnas):
        print(str(A[fila][columna]) + "  ", end="")
    print()   
    
print("Matriz B")
for fila in range(0,tamanioFilas):
    for columna in range(0,tamanioColumnas):
        print(str(B[fila][columna]) + "  ", end="")
    print()    

#se comprueba el numero mayor primo de las dos matrices        
for i in range(tamanioFilas):       
    for j in range(tamanioColumnas):
        div=0
        numero= A[i][j] 
        for k in range(1,numero+1):
            if numero%k == 0:
                div = div + 1
        if (mA<numero)and(div==2):
                mA=numero
print(f"Mayor de la matriz A = {mA}")  
    
        
for i in range(tamanioFilas):       
    for j in range(tamanioColumnas):
        div=0
        numero= B[i][j] 
        for k in range(1,numero+1):
            if numero%k ==0:
                    div = div + 1
        if (mB<numero)and(div==2):
                mB=numero
print(f"Mayor de la matriz B = {mB}") 
    
  
#Comprobar mayor primo A en matriz B
        
for i in range(tamanioFilas): 
    for j in range(tamanioColumnas):
        if mA == B[i][j]:
            print(f"El mayor numero primo de la matriz A ({mA}) "
                + f"está repetido en la matriz B, posición B[{i}][{j}])")   
                
#Comprobar mayor primo B en matriz A
        
for i in range(tamanioFilas): 
    for j in range(tamanioColumnas):
        if mB == A[i][j]:
            print(f"El mayor numero primo de la matriz B ({mB}) "
                + f"está repetido en la matriz B, posición A[{i}][{j}])")