# eer n números enteros, almacenarlos en un vector. Luego leer un entero y 
# determinar si este último entero se encuentra entre los 10 valores 
# almacenados en el vector.  
n = int(input("Ingrese el tamaño del vector (Mayor a 10)="))
A =[]
if  n>0:
    num= int(input("Ingrese un número entero: "))
    for i in range(n):
        valor= int(input(f"Ingrese datos del vector A [{i}] ="))
        A.append(valor)
        
    print("Los datos del vector son:")
    for i in range(n):
        print(str(A[i]) +" ", end="")
    print()
          
    for i in range(n):
        if A[i]==num:
            print(f"El número {num} se encuentra en la posición "
                        + f"A[{i}] del vector.")
else:
    print("n NO PUEDE ser menor a 10, reinicie el programa.")