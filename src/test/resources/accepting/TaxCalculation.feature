#language:pt

Funcionalidade: Calcular imposto com uma taxa de 6% em cima do valor da nota lançado

  Contexto: Uma nota tem os seguintes atributos:
  |corporate name|month|value|tax|net profit|
  |Rafael Tecnologia S.A|092022|25000|1500|23500|


  Cenário: Taxa de 6% em cima do valor da nota lançada
    Dado os parâmetros da nota razão social "Rafael Tecnologia S.A". mês da nota emitida "092022", valor 25000
    Então taxa de imposto sobre a nota deve ser no valor de 1500
    E valor de lucro liquido de ser de 23500

  Exemplo
  |nota|
  |{"corporateName": "Rafael Tecnologia S.A","month":"092022","value":"25000" }|
