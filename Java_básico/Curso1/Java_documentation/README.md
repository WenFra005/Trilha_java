# Documentação
Desde as primeiras versões da linguagem Java, estava disponível uma documentação rica e detalhada dos seus recursos.

Graças à isso, é possível compreender e explorar todos os recursos organizados por pacotes e classes bem definidas sem nesmo esvrever uma linha de código. 

Para se tornar um desenvolvedor avançado, é extrememamente importante saber a documentação oficial da linguagem java.

## Tags
São dados relevantes para a compreensão da proposta de uma classe e os conjunto de seus métodos. Abaixo estão as tags e suas descrições:

|Tag|Descrição|
|:---|:---|
|@autor|Autor / Criador|
|@version|Versão do recurso disponibilizado
|@since|Versão / Data de início da disponibilização do recurso|
|@param|Definição dos parâmetros dos métodos criados|
|@return|Definição do tipo de retorno de um método|
|@throws|Se o método lança alguma exceção|

## Comentários
A documentação do código é feita através de comentários, que fica dentro do código porém a linguagem reconhece que não é para executar.

Há três tipos de comentários conforme é mostrado abaixo
 ### One line
 ~~~~java
 //Olá eu sou um comentário de uma única linha
 ~~~~
 ### Mult line
 ~~~java
 /* Olá,
 * Eu sou um comentário
 * que posso ser mais detalhado
 * quando necessário
 */
~~~
 ### Documentation
~~~java
/**
* Estes dois asteriscos acima
* é para identicar que você
* pretende 
* elaborar um comentário
* a nível de documentação``
*/
~~~

### ❗ ATENÇÃO
Um comentário não possui a finalidade de *amenizar um algoritmo não estruturado conforme as convenções da linguagem.

## Javadoc
É um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML