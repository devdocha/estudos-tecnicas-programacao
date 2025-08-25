# Algoritmo Equação Quadrática

import math

a = float(input("Digite o valor de a: "))
b = float(input("Digite o valor de b: "))
c = float(input("Digite o valor de c: "))

x1 = (-b + math.sqrt(b**2 - 4*a*c))/(2*a)
x2 = (-b - math.sqrt(b**2 - 4*a*c))/(2*a)
          
print(f"x1 é igual a {x1} e x2 é igual a {x2}")