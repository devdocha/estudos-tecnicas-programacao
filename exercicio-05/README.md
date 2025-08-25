# Exercício 05 - Equação do Segundo Grau

## Descrição

Este exercício resolve uma equação do segundo grau (equação quadrática) utilizando a fórmula de Bhaskara.

## Lógica do Algoritmo

1. Solicitar os coeficientes a, b e c da equação ax² + bx + c = 0
2. Calcular as raízes usando a fórmula de Bhaskara:
   - x₁ = (-b + √(b² - 4ac)) / (2a)
   - x₂ = (-b - √(b² - 4ac)) / (2a)
3. Exibir os valores de x₁ e x₂

## Fórmula de Bhaskara

Para uma equação do tipo **ax² + bx + c = 0**:

**x = (-b ± √(b² - 4ac)) / (2a)**

Onde:
- a, b, c são os coeficientes da equação
- Δ (delta) = b² - 4ac é o discriminante

## Arquivos

- `equacao.alg`: Pseudocódigo do algoritmo
- `Equacao.java`: Implementação em Java (com interface gráfica usando Swing)
- `equacao.py`: Implementação em Python (interface de terminal)

## Como Executar

### Python
```bash
python3 equacao.py
```

### Java
```bash
javac Equacao.java
java Equacao
```

## Exemplo de Execução

**Entrada:**
- a = 1
- b = -5  
- c = 6

**Saída:** 
- x₁ é igual a: 3.0
- x₂ é igual a: 2.0

**Exemplo no Python:**
```
x1 é igual a 3.0 e x2 é igual a 2.0
```

**Nota:** Este exemplo não trata casos onde o discriminante é negativo (raízes complexas).
