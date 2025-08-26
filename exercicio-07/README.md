# Exercício 07 - Verificar Maioridade

## Descrição

Este exercício verifica se uma pessoa é maior ou menor de idade com base na idade fornecida.

## Lógica do Algoritmo

1. Solicitar ao usuário sua idade
2. Verificar se a idade é maior ou igual a 18 anos
3. Exibir se a pessoa é "Maior de idade" ou "Menor de idade"

## Critério de Maioridade

- **Maior de idade:** Idade ≥ 18 anos
- **Menor de idade:** Idade < 18 anos

## Estrutura Condicional

```
se (idade >= 18) então
    "Maior de idade"
senão
    "Menor de idade"
fim se
```

## Arquivos

- `idade_maior.alg`: Pseudocódigo do algoritmo
- `IdadeMaior.java`: Implementação em Java

## Como Executar

### Java
```bash
javac IdadeMaior.java
java IdadeMaior
```

## Exemplo de Execução

**Entrada:** 20  
**Saída:** Maior de idade

**Entrada:** 16  
**Saída:** Menor de idade
