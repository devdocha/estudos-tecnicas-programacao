# Exercício 06 - Verificar Número Par

## Descrição

Este exercício verifica se um número inteiro fornecido pelo usuário é par.

## Lógica do Algoritmo

1. Solicitar ao usuário um número inteiro
2. Verificar se o número é par usando o operador módulo (%)
3. Se o resto da divisão por 2 for igual a 0, o número é par
4. Exibir o resultado apenas se o número for par

## Conceito Matemático

Um número é considerado **par** quando é divisível por 2, ou seja, quando o resto da divisão por 2 é igual a zero.

**Operação:** num % 2 == 0

## Arquivos

- `par.alg`: Pseudocódigo do algoritmo
- `Par.java`: Implementação em Java

## Como Executar

### Java
```bash
javac Par.java
java Par
```

## Exemplo de Execução

**Entrada:** 8  
**Saída:** O número 8 é par

**Entrada:** 7  
**Saída:** (nenhuma saída, pois 7 é ímpar)

**Nota:** O algoritmo atual apenas informa quando o número é par. Para números ímpares, não há saída.
