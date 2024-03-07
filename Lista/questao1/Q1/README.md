[Q1] (3,0) Você está desenvolvendo um sistema de processamento de pagamento para
uma loja online. Crie uma interface chamada FormaDePagamento que contenha os
seguintes métodos:
● bool autenticar();
● void processarPagamento(double valor);
Agora, crie três classes que implementem a interface FormaDePagamento para
representar diferentes formas de pagamento:
￼
CartaoCredito: Esta classe representa um pagamento com cartão de crédito. O método
autenticar deve pedir a senha do cartão e o código de segurança e retornar true caso seja
sucesso, ou false caso o contrário, se esse método não retornar true, o método
procesarPagamento deve retornar uma exceção avisando que o pagamento não foi
autorizado. O método procesarPagamento deve exibir a mensagem "Pagamento com
cartão de crédito no valor de [valor] processado com sucesso", onde [valor] é o valor
passado como parâmetro.
BoletoBancario: Esta classe representa um pagamento com boleto bancário. O método
autenticar deve pedir o código do boleto e retornar true caso seja sucesso, se esse método
não retornar true, ou false caso o contrário, o método procesarPagamento deve retornar
uma exceção avisando que o pagamento não foi autorizado. O método

procesarPagamento deve exibir a mensagem "Pagamento com boleto bancário no valor de
[valor] processado com sucesso", onde [valor] é o valor passado como parâmetro.
PayPal: Esta classe representa um pagamento com PayPal. O método autenticar deve
pedir o login e senha e retornar true caso seja sucesso, ou false caso o contrário, se esse
método não retornar true, o método procesarPagamento deve retornar uma exceção
avisando que o pagamento não foi autorizado. O método deve exibir a mensagem
"Pagamento com PayPal no valor de [valor] processado com sucesso", onde [valor] é o
valor passado como parâmetro.
Para a autenticação, cada implementação deverá salvar em um array de tuplas ou de
algum objeto (escolha do aluno) que salve as informações necessárias para autenticação.
Exemplo para paypal:

Ao autenticar, você deve conferir se as informações enviadas pelo usuário (Pelo stdin,
nesse caso, use a classe Scanner para receber o input) batem com um das entradas
salvas no seu array, se sim retorne true, se não, false.
Para a main, pergunte ao usuário o método de pagamento desejado e receba pelo stdin
alguma string ou número que simboliza um dos métodos(fica a sua escolha), após isso,
instancie a classe apropriada e chame os métodos, autenticar e procesarPagamento.
