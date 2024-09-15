# Collections em Java

## Definição
- As `Collection`, referem-se a uma estrutura de dados que agrupa múltiplos objetos em uma única unidade. Elas fornecem uma maneira padronizada de lidar com grupos de objetos, oferecendo diversas operações, como inserção, remoção e acesso.
- A biblioteca de `Collections` fornece uma série de interface e classes para diferentes tipos de agrupamentos e operações sobre esses agrupamentos.

## Hierarquias das Collections
- A hierarquia de Collections é bem estruturada e segue um padrão que facilita a implementação e o uso dessas estruturas.

    - `Collection`: É a interface raiz de todas as coleções. Define os métodos básicos como `add`, `remove`, e `size`.

        - `List`: Estende `Collection` e representa uma sequência ordenada de elementos que pode ter duplicatas. Implementações comuns: `ArrayList`, `LinkedList`.
        - `Set`: Também estende `Collection`, mas não permite elementos duplicados. Implementações comuns: `HashSet`, `TreeSet`.
        - `Queue`: Estende `Collection` e é usada para representar uma fila de elementos (FIFO - First In, First Out). Implementações comuns: `LinkedList`, `PriorityQueue`.
        - `Deque`: Uma extensão da interface `Queue` que permite a inserção e remoção de elementos em ambas as extremidades da fila. Implementações comuns: `ArraysDeque`.
    - `Map`: Embora não seja uma extensão direta de `Collection`, é uma parte importante da biblioteca de Collections. Representa uma coleção de pares chave-valor. Implementações comuns: `HashMap`, `TreeMap`.

# Interfaces Fundamentais

## Collection

- A interface `Collection`, como previamente dito é a raiz da hierarquia de coleções. Ela define as operações básicas que todas as coleções devem suportar, como adicionar, remover e verificar o tamanho da coleção.
```java
public class Collections{
    public static void main(String[] args) {
        // Inicializando coleção utilizando ArrayList
        Collection<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");

        // Verificando se a coleção contém um elemento
        boolean existe = linguagens.contains("Java"); // Output: true

        // Mostrando tamanho da coleção
        int tamanho = linguagens.size(); // Output: 2

        // Removendo um elemento 
        linguagens.remove("Java");
        boolean contemJava = linguagens.contains("Java"); // Output: false
    }
}
```

## List

- A interface `List` estende `Collection` e representa uma sequência ordenada de elementos. Ela permite a duplicação de elementos e acesso baseado em índices.
```java
public class Collections    {
    public static void main(String[] args) {
        // Inicializando a lista
        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C");

        // Acessando elementos pelo índice
        String elemento = linguagens.get(1); // Ouput: Python

        // Adicionando um elemento em uma posição especifica
        linguagens.add(1, "Kotlin"); // Output: [Kotlin, Python, C]
         
        // Removendo um elemento pelo índice
        linguagens.remove(0); // Output: [Java, Kotlin, Python, C]
    }
}
```
## Set

- A interface `Set` estende `Collection` e não permite elementos duplicados. A ordem dos elementos não é garantida, exceto em implementações específicas.
```java
public class Collections{
    public static void main(String[] args) {
        // Criando um conjunto
        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Java"); // Duplicata, não será adicionada 

        System.out.println(linguagens); // Output: [Python, Java]
    }
}
```
## Queue

- A interface `Queue` estende `Collection` e representa uma estrutura de dados para organizar elementos em uma fila (First In, First Out).
```java
public class Collections{
    public static void main(String[] args) {
        // Inicializando uma fila
        Queue<String> linguagens = new LinkedList<>();
        linguagens.offers("Java");
        linguagens.offers("Python");
        linguagens.offers("C++");

        // Removendo e retornando o primeiro elemento 
        linguagens.poll(); // Output: Java

        System.out.println(linguagens); // Output: [Python, C++]
    } 
}
```
## Deque

- A interface `Deque` estende `Queue` e permite a inserção e remoção de elementos em ambas as extremidades da fila (double-ended queue)
```java
public class Collections{
    public static void main(String[] args) {
        // Criando uma deque
        Deque<String> linguagens = new ArrayDeque<>();
        linguagens.addFirst("Java");
        linguagens.addLast("Python");
        linguagens.addLast("C++");
        
        // Removendo e retornando o primeiro e o ultimo elemento
        linguagens.removeFirst(); // Output: Java
        linguagens.removeLast(); // Output: C++

        System.out.println(linguagens); // Ouput: [Python]
    }  
}
```
## Map

- A interface `Map` representa uma coleção de pares chave-valor. Não é uma extensão direta de `Collection`, mas é parte da biblioteca de Collections. Cada chave é unica e mapeia um valor.
```java
public class Collections{
    public static void main(String[] args) {
        // Criando um mapa
        Map<String, Integer> linguagens = new HashMap<>();
        linguagens.put("Java",1);
        linguagens.put("Python",2);
        linguagens.put("C++", 3);

        // Acessando valores por chave
        int chave = linguagens.get("Java");

        // Removendo uma entrada
        linguagens.remove("Python");
        System.out.println(linguagens); // Output: [Java=1, C++=3]
    }
}
```