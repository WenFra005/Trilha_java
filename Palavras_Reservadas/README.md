# Palavras Reservadas
São identificadores de uma linguagem que **já possuem uma finalidade específica** e por isso **não podem ser utilizados para nomear variáveis, classes métodos ou atributos**.

A linguagem Java possui 52 palavras reservadas. São classificadas em grupos e escritas com letra **minúscula**, sendo identificada com uma cor especial pela maioria das IDE's.

Abaixo temos uma lista de palavras agrupadas por suas finalidades:

|❗ ATENÇÃO|
|---|
|O uso dessas palavras reservadas vai depender do tamanho e da complexidade que o projeto vai exigir do código. Por isso dependendo da experiência do programador, pode ser que tenha palavras que nunca usou ou até mesmo palavras que nunca irão usar. Mas é importante ter conhecimento dessas palavras para possível uso no futuro, se quiser se desenvolver usando a linguagem Java.|

## Controle de pacotes
1. ``import`` --> importa pacotes ou classes para dentro do código

2. ``package`` --> Especifica a que pacote todas as classes de um arquivo pertecem

## Modificadores de acesso
3. ``public`` --> acesso de qualquer classe

4. ``private`` --> acesso apenas dentro da classe

5. ``Protected`` --> acesso por classes no mesmo pacote e subclasses (**Usado para heranças de código**) 

## Primitivo

6. ``boolean`` --> um valor indicadando verdadeiro ou falso

7. ``byte`` -->  um inteiro de 8 bits(signed)

8. ``char`` --> um character unicode (16-bit unsigned)

9. ``double`` --> um número de ponto flutuante de 64 bits(signed)

10. ``float`` --> um número de ponto flutuante de 32 bits (signed)

11. ``int`` --> um inteiro de 32 bits (signed)

12. ``long`` --> um inteiro de 64 bits (signed)

13. ``short`` --> um inteiro de 32 bits (signed)

14. ``void`` --> indica que o método não tem retorno de **valor**.

## Modificadores de classes, variáveis ou métodos

15. ``abstract`` --> classe que não ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata

16. ``class`` --> especifica uma classe

17. ``extends`` --> indica a superclasse que a subclasse está estendendo

18. ``final`` --> impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.

19. ``implements`` --> indica as interfaces que uma classe irá implementar

20. ``interface`` --> especifica uma interface

21. **``native``** --> indica que um método está escrito em uma linguagem depedente de plataforma, como o **C**.

22. ``new`` --> instancia um novo objeto, chamando seu construtor.

23. ``static`` --> faz um método ou variável pertencer à classe ao invés de às instâncias

24. **``strictfp``** --> usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas expressões

25. ``sinchronized`` --> indica que um método só pode ser acessado por uma thead de cada vez

26. ``transient`` --> impede a serialização de campos

27. **``volatile``** --> indica que uma variável pode ser alterada durante o uso de theads

## Controle de fluxo dentro de um bloco de código

28. ``break`` --> sai do bloco de código em que ele está

29. ``case`` --> executa um bloco de código dependendo do teste do switch

30. ``continue`` --> pula a execução do código que viria após essa linha e vai para a próxima passagem do loop

31. ``default`` --> executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro

32. ``do`` --> executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente

33. ``else``--> executa um bloco de código alternativo caso o teste if seja falso

34. ``for``--> usado para realizar um loop condicional de um bloco de código

35. ``if`` --> usado para realizar um teste lógico de verdadeiro o falso

36. ``instanceof`` --> determina se um objeto é uma instância de determinada classe, superclasse ou interface

37. ``return`` --> retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)

38. ``switch`` --> indica a variável a ser comparada nas expressões case

39. ``while`` --> executa um bloco de código repetidamente enquanto a condição for verdadeira

## Tratamento de erros

40. ``assert`` --> testa uma expressão condicional para verificar uma suposição do programador

41. ``catch`` --> declara o bloco de código usado para tratar uma exceção

42. ``finally`` --> bloco de código, após um ``try-catch``, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção

43. ``throw`` --> usado para passar uma exceção para o método que o chamou

44. ``throws`` --> indica que um método pode passar uma exceção para o método que o chamou

45. ``try`` -->  bloco de código que tentará ser executado, mas que pode causar uma exceção

## Variáveis de referência
46. ``super`` --> refere-se a superclasse imediata

47. ``this`` --> refere-se a instância atual do objeto

## Palavras reservadas não utilizadas
48. ``const`` --> Não utilize para declarar constantes; use public static final

49. ``goto`` --> não implementada na linguagem Java por ser considerada prejudicial

## Literais reservados
De acordo com a "Java Language Specification", as seguintes palvras reservadas: 

50. ``null``

51. ``true``

52. ``false`` 

São tecnicamente chamados de valores literais, e não *keywords*. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.


# Referências 
SABINO, Vanessa. As 52 palavras reservadas do Java. Linha de Código, [20?]. Disponível em: http://www.linhadecodigo.com.br/artigo/83/as-52-palavras-reservadas-do-java.aspx. Acesso em: 10 jul. 2024.




