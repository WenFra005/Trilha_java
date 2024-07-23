# Tratamento de Exceções

Diferentes erros podem acontecer ao executar código Java. São erros que podem ser feitos pelo programador, devido a entrada errada ou outros imprevistos.

Quando isso ocorre, o Java para e gera uma mensagem de erro. O termo técnico se chama **lançamento de exceção**. Em Java um erro é irreparável e por isso a aplicação trava ou é encerrado drasticamente.

Porém exceções, são fluxos imprevistos. É como querer dividir um valor por zero, abrir um arquivo que não existe ou abrir uma conexão com nome de usuário ou senha inválida. Estes cenários não são erros, mas sim fluxos não previstos pela aplicação.

Essa é mais uma responsabilidade do desenvolvedor, é prever estas situações e fazer o **Tratamento de exceções**.

A linguagem Java possuem classes que representam o tratamento de exceções. São eles:

|Nome|Causa|
|:---|:---|
|``java.lang.NullPointerException``| Quando tentamos obter alguma informação de uma variável nula|
|``java.lang.ArithmeticException``| Quando tentamos dividir um valor por zero|
|``java.sql.SQL.Exception``|Quando existe algum erro relacionado a interação com base de dados|
|``java.io.FileNotFoundException``|Quando tentamos ler ou escrever em um arquivo que não existe|

Há também as palavras reservadas que também fazem o tratamento de exceções. São eles:

|Comando|Descrição|
|:---|:---|
|``try``|Permite que defina um bloco de código para ser testado quanto a erros enquanto está sendo.|
|``catch``|Permite define um bloco de código a ser executado, caso ocorra um erro no bloco. ``try``|
|``finally``|Permite um código a ser executado independente de ocorrer erro ou não.|

### ❗ ATENÇÃO
As palavras ``try`` e ``catch`` vêm em pares

## Hierarquia das exceções

As classes que representam as exceções organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions** ou "Exceções Checadas e Não Checadas"

<img src = "https://miro.medium.com/v2/resize:fit:1147/1*zlGR-9vQMljXqaPTgGagJw.png">

É possível também criar nossas próprias exceções. Veja nos arquivos "CepInvalidoException" e "FormatadorCep" localizados na pasta "MinhaExceção"