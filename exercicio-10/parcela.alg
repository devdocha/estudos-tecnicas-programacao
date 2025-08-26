algoritmo parcela

    real valor_parcelado, valor_compra, valor_final
    inteiro qtde_parcelas, juros

    início
        escreva "Entre com o valor da compra"
        leia valor_compra
        escreva "Entre com a qtde de parcelas"
        leia qtde_parcelas
        escolha (qtde_parcelas)
            Caso 2: juros = 3
                pare 
            Caso 4: juros = 7
                pare
            Caso 6: juros = 9
                pare
            Caso 8: juros = 12
                pare
            padrao juros = -1
        fim_escolha
            se (juros == -1)
                escreva "Número de parcelas incorreto"
            senao
                valor_final = valor_compra + valor_compra * juros / 100
                valor_parcelado = valor_final / qtde_parcelas
                escreva "O valor de cada parcela é " + valor_parcelado
            fim_se
    fim