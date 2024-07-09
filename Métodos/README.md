# Métodos
Correspondem a **funções** ou **sub-rotinas** disponíveis dentro das classes.

### Exemplo:
Carro --> **é uma classe**
            
frear, acelerar, dar a ré ---> **São métodos**

## Critérios de nomeação

Não são obrigatórios, é uma convenção para tornar o código mais légivel. São eles:

• Deve ser nomeado como verbo

• Seguir o padrão **camelCase**(Todas as letras minúsculas com a execeção da primeira letra da segundda palavra)

## Critérios de definição dos métodos

Para definir os métodos é preciso seguir uma convenção. São eles:

1. Qual o objetivo do método?

2. O método vai retornar algum valor? 
    
    Se não, o método será representado pela palavra-chave ``    void``. 
    
    Se sim, será representado pela palavra-chave ``return`` no final da expressão. Entranto deve-se estar á alguns métodos como por exemplo o método ``imprimir``, nesse caso, não é necessário escrever ``return`` pois naquele momento não retornará nenhum valor.
3. Quais parâmetros serão necessários?
4. O método possui o risco de apresentar alguma exceção?
5. Qual a visibilidade do método?
### Exemplo:

    
        public void somar (int num1, int num2){
        //finalidade do método
        return}

### Tipos de métodos
``public void`` --> É visível para outras classes

``private void`` --> Não é visível para outras classes, somente na classe a qual está inserido.

``trows Exception`` --> indica que o código pode gerar uma exceção


