# Stream API e Java
A Streams API traz uma nova opção para manipulação de coleções em Java seguindo os príncipios da programação funcional;
Trata-se de uma poderosa solução para processar coleções de maneira declarativa, ao invés da tradicional e burocrática forma imperativa.

## Programação imperativa X funcional
* **Forma imperativa**: o desenvolvedor precisa se preocupar não só com o que deve ser feito em cada elemento, ou seja, as regras associadas ao processamento desses elementos como também com a maneira de realizar essa iteração.
* **Forma funcional**: O desenvolvedor utilizam os métodos das Collections de forma simples, utilizando as Expressões Lamda e Method Relevance, que são formas simples de escrever os códigos.

### Lamda
* Permitem representar interfaces funcionais(interfaces com um único código abstrato) de forma mais concisa e possibilitam escrever o código no estilo funcional.
* Com isso, criam-se linhas de código que não precisam ter declarações.
* Assim ocupam-se menos linhas de código e ficam mais funcionais e simples.

### Method Reference
* É um novo recurso do Java 8 que permite fazer referência a método ou construtor de uma classe(de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, tornando-o mais simples e legível.
* Para utiliza-lo, basta informar uma classe ou referência seguida do símbolo ``::`` e nome do método sem os parênteses.