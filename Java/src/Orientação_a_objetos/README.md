# Orientação a objetos
A medida que as tecnologias vem evoluindo, as linguagens de programação também evoluem. Essa transição, determina que existem linguagens de **baixo e alto nível**.

**Baixo nível**: São linguagens que estão mais próxima da interpretação da máquina diante do algoritmo desenvolvido.
Exemplo: **Linguagem Assembly** e **C**.
**Alto nível**: São linguagens que disponibilizam uma proposta de sintaxe  (forma de escrever processos para serem executados pelo computador) mais próxima da interpretação humana. Exemplo: **Java**, **JavaScript**, **Python** e **C++**.

## Programação Estruturada
É um  paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um programa de computador, fazendo uso de fluxo de controle estruturado de seleção ( ``if``/``then``/``else``) e repetição (``while``/``for``), estruturas de bloco e sub-rotinas.

## Programação orientada a objetos
Também referido como **POO** é uma paradigma de programação baseado no conceito de **objetos**, que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos **métodos**.

### Qual é a diferença?
Enquanto que a programação estruturada é voltada a procedimentos e funções definidas pelo usuário, a programação orientada a objetos é voltada a conceitos como o de classes e objetos, e sua aplicação fica mais próxima do mundo real.

# Pilares da Programação orientada objetos

Existem **quatro pilares** que são:
* **Encapsulamento**: Se refere a visibilidade do código quanto aos atores do mesmo, nem todas as ações de um ator precisam estar visíveis ao outro ator. 
Exemplo: um engenheiro sabe todas as funcionalidades e etapas de um carro, entretanto o condutor só visualiza as funções de dar a ignição, dar a partida e as ações restantes acontecem.
* **Herança**: Características e comportamentos iguais podem ser elevados e compartilhados através de uma hierarquia de objetos.
    **Importante**: Java não permite herança múltipla, ou seja, existe apenas **uma classe-base** e não mais de uma como acontece com **Python** e **C++**. Isso vai ser explicado posteriormente.
Exemplo: um carro e uma bicicleta possui propriedades como chassi, ano de fabricação e métodos como acelerar e frear. Então para que não haja redundância, pode ser criado uma classe chamada **Veículo** para que então suas características e métodos sejam compartilhados para as classes-filhas **Carro** e **Bicicleta**.
* **Abstração**: É a indisponibilidade para determinar a lógica de um vários comportamentos em um objeto.
Exemplo: **Veículo** determina duas ações como acelerar e frear, logos estes comportamentos deverão ser *Abstratos* pois existem mais de uma maneira de se realizar a mesma operação.
* **Poliformismo**: São as inúmeras maneiras de se realizar uma mesma ação.
Exemplo: Veículo determina duas ações como acelerar e frear, primeiramente precisamos identicar se estaremos nos referindo a **Carro** ou **Motocicleta** para determinar a lógica de aceleração e frenagem dos respectivos veículos 

### Interface
**Não é uma interface gráfica**
É o conceito máximo de abstração. 

A medida que o código é desenvolvido acaba surgindo classes com funcionalidades bem específicas como **Impressoras**, **Copiadoras** e **Digitalizadoras**. Não há uma marca, modelo ou capacidades de execução especificadas nessas classes e por isso podemos dizer esse é o nível mais alto de abstração que denominamos como **interfaces**.

Entretanto, Java não permite herança múltipla, ou seja, **não pode ter várias classes-base passando suas funcionalidades para suas classes-filhas** em Java só há uma classe base. Porém isso pode ser feito baseado em **interfaces**. 

Nesse caso a classe *Impressora* pode herdar funcionalidades das classes *Laserjet*  e *Deskjet*, isso é um caso de herança simples, pois as classes estão passando suas funcionalidades somente para uma classe.
Entretanto, é possível criar uma classe chamanda *EquipamentoMultifuncional* e esta pode passar suas funcionalidades paras as classes *Impressora*, *Copiadora* e *Digitalizador* que nesse caso passarão a ser chamados de **interfaces**.

A palavra reservada para fazer herança é ``extends`` e para fazer herança múltipla na forma de interfaces é ``implements``.

Fazendo isso possível atribuir varias funções especifícas a um único equipamento. Como aconteceu nesse caso.