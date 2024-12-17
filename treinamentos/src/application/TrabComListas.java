package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Lista é um tipo de interface
public class TrabComListas {

    public static void main (String []arg) {

        List<String> list = new ArrayList<>(); //Dps do sinal de "=" é preciso utilizar uma classe que implementa uma interface

        list.add("Maria"); //Adicionando elementos na lista
        list.add("Sirineu");
        list.add("Aluiso");
        list.add("Alex");
        list.add("João");
        list.add(2, "Marco"); //Adicionando elemento na posição 2

        System.out.println(list.size()); //Tamanho da lista
        //list.remove(0);
        list.remove("Alex");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        //Remova toda String X tal que caractere na posicao 0 = M
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------");
        System.out.println("Index of João: " + list.indexOf("João"));
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        //indexOf serve para confirmar se palavra existe ou não na lista

        System.out.println("-------------------------");
        // filtrando Lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // A partir do collect estamos covertendo para lista de novo
        //Stream é uma sequência de elementos de uma fonte de dados que suporta operações de agregação. As streams são úteis para trabalhar com grandes volumes
        // de dados, pois suportam operações paralelas de forma simples e eficiente. Elas podem ser usadas para: Filtrar, Modificar,
        // Transformar o elemento em outro.
    for (String x : result) {
        System.out.println(x);
    }

        System.out.println("-------------------------");
    String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    //                                            Encontrar o primeiro elemento que começa com a letra A, se não encontrar retorna null
    System.out.println(name);
    }

}
