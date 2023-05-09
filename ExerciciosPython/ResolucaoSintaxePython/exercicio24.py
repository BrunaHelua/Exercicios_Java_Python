# Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número
def deseja_continuar_for():
    """
Função que recebe N número e decide se o número é positivo, negativo ou zero
    """
    quantidade_numeros = int(input("Informe a quantidade de números a serem analisados:"))
    for contador in range(0, quantidade_numeros):
        numero = float(input("Digite o {}º número: ".format(contador + 1)))
        if numero == 0:
            print("Você inseriu o valor zero")
        elif numero > 0:
            print("O número é positivo")
        else:
            print("O número é negativo")


def deseja_continuar_while():
    verifica = False
    while not verifica:
        numero1 = float(input("Digite um número que quer analisar"))
        if numero1 == 0:
            print("Você inseriu o valor zero")
        elif numero1 > 0:
            print("O número é positivo")
        else:
            print("O número é negativo")
        continua = input("Deseja continuar? S - sim / N - não ")
        verifica = continua == 'N' or continua == 'n'

# def verifica_string():
# continua = input("Deseja continuar? S - sim / N - não ")
# while type(continua) == float:
# continua = input("Por favor, digite uma das duas opções: S - sim / N - não ")
# return continua

# deseja_continuar_for()
# deseja_continuar_while()
# verifica_string()
