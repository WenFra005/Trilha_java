# Collection Framework API
É uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes precisão ser Objetos.

Pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo específico.

Há quatro tipos de coleções:
* ``List`` (lista);
* ``Set`` (conjunto); 
* ``Queue`` (fila);
* ``Map`` (mapa).

## Generics Type
É uma classe genérica ou interface que é parametrizada em relação a tipos.
Para demonstrar, a classe Box será modificada:
~~~java
public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
~~~
O símbolo ``<>`` é chamado de "diamond" ou "diamond operator". É usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.

Para atualizar a classe Box para usar generics, você cria uma declaração do tipo genérico alterando o código ``public class Box`` para ``public class Box <T>``

~~~~~java
public class Box <T>{
    private T t;
    public void set(T t) {this.t = t;}
    public T get() { return t;}
}
~~~~~
Fazendo isso, todas as correspondências de Object são substituídas por T.

Os nomes de parâmetros de tipo mais comumente usados são:
* E - Elemento
* K - Chave
* N - Número
* T - Tipo
* V - Valor
* S, U, V, - 2º, 3º, 4º tipos

### Vantagens simples
* Segurança do tipo de dados
* Código mais legível
* Detecta erros mais cedo
* Reutilização de código
* Melhor desempenho

## Comparable x comparator
É um conjunto de códigos que organizam os elementos de uma coleção acordo com uma regra específica em sua ordem natural, como por exemplo organizar nomes em ordem alfabética. Abaixo segue os códigos com suas descrições.

### Comparable
 * Fornece uma única sequência de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
* Afeta a classe original, ou seja, a classe atual é modificada.
* Fornece o método ``compareTo[]`` para ordenar os elementos
* está presente no pacote ``java.lang``.
* Podemos ordenar os elementos da lista do tipo ``Comparable`` usando o método ``Collections.sort(List)``.

### Comparator
* Fornece o método ``compare()`` para ordenar elementos.
* Fornece múltiplos sequências de ordenação. Podemos ordenar a coleção com base em múltiplos elementos como id, nome e preço.
* Não afeta a classe original, ou seja, a classe atual não é modificada.
* Está presente no pacote ``java.util``
* Podemos ordenar os elementos da lista do tipo ``Comparator`` usando o método ``Collections.sort(List, Comparator).

### Collections
É uma classe usada para operações comuns em coleções. Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções.

O método ``sort()`` é usado para ordenar uma lista em ordem ascendente. Esse método usado em conjunto com ``Collections.reverseOrder()`` permite ordenar em ordem descendente.

## Explicando Collections
### List
É uma coleção ordenada que permite a inclusão de elementos duplicados. É um dos tipos de coleção mais utilizados em Java e as classes de implementação comuns são ``ArrayList`` e ``LinkedList``

Fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice e obter sublistas usando índices.

A classe ``Collections`` fornece algoritmos úteis para manipulação de ``List``, como: 

* ordenação (``sort``); 
* embaralhamento (``shuffle``); 
* reversão (``reverse``);  
* busca binária (``binarySearch``)

### Set
É uma coleção que não permite a inclusão de elementos duplicados. Essa interface representa o conceito matemático de um conjunto e é usada para representar conjuntos, como um baralho de cartas.

Não permite acesso aleatório da um elemento na criação. Para percorrer os elementos de um ``Set``, você pode usar um iterador ou um loop foreach.

### Map
É usada para mapear dados na forma de chaves e valores. É um objeto que mapeia chaves para valores.

Um ``Map`` não pode conter chaves duplicadas: cada chave pode mapear para no máximo um valor. A plataforma Java possui três implementações gerais de ``Map``: ``HashMap``, ``TreeMap`` e ``LinkedHashMap``.

As operações básicas do ``Map`` são: 
* ``put`` (inserir); 
* ``get`` (obter); 
* ``containsKey`` (verificar se contém uma chave); 
* ``containsValue`` (verificar se contém um valor); 
* ``size`` (obter o tamanho); 
* ``isEmpty`` (verificar se está vazio)