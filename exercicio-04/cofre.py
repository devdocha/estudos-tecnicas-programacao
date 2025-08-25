# Algoritmo cofre

q25 = float(input("Entre com a quantidade de moedas de R$ 0,25: "))
q10 = float(input("Entre com a quantidade de moedas de R$ 0,10: "))
q5 = float(input("Entre com a quantidade de moedas de R$ 0,05: "))

total = (q25 * 0.25) + (q10*0.10) + (q5*0.05)

print(f"O valor total em reais é: R$ {total}")