# Arrays em Java

- Arrays em java são estruturas de dados que armazenam um número fixo de elementos do mesmo tipo. Eles são fundamentais para o armazenamento e manipulção de dados.

## Definição e Declaração

- Um array em java é um objeto que armazena uma coleção de variaveis do mesmo tipo.
- A declaração de um array é escificando o tipo dos elementos que ele vai armazenar seguido por colchetes.

```java
public class Array{
    public static void main(String[] args) {
        int numeros[]; // declara um array de inteiros   
    }
}
```

## Inicialização

- Antes de começar a adicionar e manipular os dados de um array, é necessário inicializa-lo. A inicialização é feita pela palavre chave `new`, seguido pelo tipo do array e pelo tamanho.
- A inicialização pode ser feita das duas formas:
```java
public class Array {
    public static void main(String[] args) {
        int numeros[];
        numeros = new int[5]; // inicializa o vetor
    }
}
```
```java
public class Array {
    public static void main(String[] args) {
        int numeros[] = new int[5]; // Otimiza a leitura do código
    }
}
```
---
### Observação

- Também é possivel criar um array e já definir os valores do mesmo, fazendo que não seja necessário o uso da palavre chave `new`:
```java
public class Array{
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3};
    }
}
```

##  Acesso e Modificação de Elementos

- Os elementos de um array são acessados e alterados usando os índices, onde cada elemento possui um `índice`.
- É importante lembrar que os indices começam em `0` e vai até o limite do array `tamanho -1`.
```java
public class Array{
    public static void main(String[] args) {
        int numeros[] = new int[10];
        numeros[0] = 10; // o vetor recebe o valor 10 no indice 0
        int valor = numeros[0] // valor recebe o valor do elemento no indice '0' do vetor.
    }
}
```

## Tamanho do Array

- O tamanho do array pode ser obtido através do atributo `length`. Isso é util para percorrer arrays em loops.
```java
public class Array {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int tamanho = numeros.length; // recebe o tamanho do vetor (10);
    }
}
```
# Tipos de Arrays

## Unidimensionais

- São o tipo de array mais comum, e armazenam uma lista simples de valores.
```java
public class Array{
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // inicializa um array com valores
    }
}
```

## Multidimensionais

- Arrays multidimensionais são arrays de arrays. O mais comum é o bidimensional, que pode ser visualizado como uma tabela.
```java
public class Array{
    public static void main(String[] args) {
        int[][] matriz = new int[3][4]; // Cria um array bidimensional de 3x4
    }
}
```

- Inicialização com valores.
```java
public class Array{
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
    }
}
```

# Métodos e Operações Comuns

## 1. Percorrendo Arrays:
- Para arrays unidimensionais
```java
public class Array{
    public static void main(String[] args) {
        int numeros[5] = {1, 2, 3, 4, 5};

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
```
- Para arrays bidimensionais
```java
public class Array{
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for(int i = 0; i < matriz.lenth; i++) { // percorre as linhas
            for(int j = 0; j < matriz.length[i]; j++) { // percorre as colunas
                System.out.println(matriz[i][j]);
            }
        }
    }
}
```


