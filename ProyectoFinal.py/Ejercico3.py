#Construir una función que reciba como parámetro un vector de 10 posiciones 
# enteras y un dígito y que retorne la cantidad de números del vector que terminan en dicho dígito
def contardig(B,d):
    n=0;
    for i in range(10):
        if B[i]% 10 ==d:
            n=n+1
    return n
if "_name_" == '_main_':
    A = []      
    dig = int(input(" Ingrese un digito: "))    
    for i in range(10):            
        A.append( int(input(f"Ingrese un dato en la posición A[{i}]=")))
  
    contador = contardig(A,dig);
    print(f"Existen {contador} números que terminan en {dig} dentro del vector");