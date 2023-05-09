# Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
# se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
# de venda de cada produto, amédia de preço de custo e do preço de venda;

quantidadeProdutos = int(input("Informe a quantidade de produtos"))
ven = 0
cus = 0
for contador in range(1, quantidadeProdutos + 1):
    nome_produto = input("Informe o nome do {}º produto".format(contador))
    preco_custo = float(input("Informe o valor de custo de {}".format(nome_produto)))
    preco_venda = float(input("Informe o valor de venda de ".format(nome_produto)))
    total_vendas = 0
    total_custos = 0
    if preco_venda == preco_custo:
        print("O {}º produto, chamado de {} não deu lucro nem prejuízo".format(contador, nome_produto))
    elif preco_venda < preco_custo:
        print("O {}º produto, com o nome de {}, deu prejuízo ".format(contador, nome_produto))
    else:
        print("O {}º produto, com o nome de {}, deu lucro".format(contador, nome_produto))

    total_vendas += preco_venda
    total_custos += preco_custo
    ven = total_custos/quantidadeProdutos
    cus = total_vendas/quantidadeProdutos

print("A média de preço de custo é de {}".format(cus))
print("A média de preço de venda é de {}".format(ven))