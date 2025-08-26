algoritmo triângulo

    real a,b,c,

    início
        escreva "Entre com o valor de a: "
        leia a
        escreva "Entre com o valor de b: "
        leia b
        escreva "Entre com o valor de c: "
        leia c
        se ((a<b+c) e (b<a+c) e (c<a+b))
            escreva "Estes valores formam um triângulo"
            se ((a=b) e (b=c))
                escreva "Triângulo Equilátero"
            senao
                se ((a=b) ou (b=c) ou (a=c))
                    escreva "Triângulo Isóceles"
                senao  
                    escreva "Triângulo escaleno"
            fim_se
        fim_se
        senao
            escreva "Estes valore não formam um triângulo"          
    fim