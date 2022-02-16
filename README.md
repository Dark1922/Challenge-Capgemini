# Desafio Academia Técnica Capgemini

Este projeto tem como objetivo a solução do Desafio da Academia Técnica Capgemini, composto por três questões.
Os desafios se Encontram na pasta src com os nomes challenge1, challenge2, challenge3 seguindo as questão do desafio.

🚀 Começando

Este projeto foi criado com o Intlij idea e pode ser rodado tanto no console da IDE como no Git Bash, Visual Stuidio Code e  Eclipse ,usando os import e o código descrito nos desafios.

📋 Pré-requisitos

Para rodar o código no Git Bash, primeiro intale o Git na sua máquina, você pode clonar o repositório: gh repo clone Dark1922/Challenge-Capgemini, ou baixar direto pelo git code.

🔧 Instalação

Vá na pasta do projeto, entre na pasta bin, clique com o botão direito do mouse e entre na opção "Git Bash Here". Após abrir o prompt escreva: 
java application/QuestionOne (para a questão número um), java application/QuestionTwo (para a questão número dois) ou java application/QuestionThree 
(para a questão número três).

🔩 Questôes

# Questão 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não 
deve conter nenhum espaço.
Exemplo:
Entrada:
n = 6
Saída:
``
          *
        **
      ***
    ****
  *****
******
``
# Questão 02
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa 
ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número 
mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
Exemplo:
Entrada:
Ya3
Saída:
3
Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um 
tamanho mínimo de 6 caracteres.

# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva 
um algoritmo que encontre o número de pares de substrings que são anagramas.
Exemplo:
Exemplo 1)
Entrada:
ovo
Saída:
3
Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1], [1, 2]] respectivamente. 
Exemplo 2)
Entrada:
ifailuhkqq
Saída:
3
Explicação:
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].

🛠️ Construído com

Este projeto foi desenvolvido com a linguagem Java dentro do Intelij idea,  Jdk 11.


