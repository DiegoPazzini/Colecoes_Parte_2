package colecoes_Parte_1;

import java.util.*; // Importa todas as classes do pacote java.util

public class Programa { // Declaração da classe Programa

    public static void main(String args[]) { // Declaração do método main

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        List<String> list = new ArrayList<>(); // Cria uma lista vazia para armazenar os nomes
        List<String> listM = new ArrayList<>(); // Cria uma lista vazia para armazenar os nomes masculinos
        List<String> listF = new ArrayList<>(); // Cria uma lista vazia para armazenar os nomes femininos

        // Solicita que o usuário digite os nomes das pessoas separados por vírgula e espaço
        System.out.print("Digite o nome das pessoas separados por vírgula seguido de um espaço: ");
        String nome = sc.nextLine(); // Lê a entrada do usuário e armazena os nomes
        String[] nomes = nome.split(", "); // Divide a entrada em um array de nomes

        // Itera sobre os nomes, solicitando e armazenando o sexo de cada pessoa
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Qual o sexo de " + nomes[i] + " (f/m): ");
            char sexo = sc.nextLine().charAt(0);
            if (sexo == 'f') {
                listF.add(nomes[i]); // Adiciona o nome à lista de nomes femininos
            } else {
                listM.add(nomes[i]); // Adiciona o nome à lista de nomes masculinos
            }
        }

        // Adiciona todos os nomes à lista geral de nomes
        for (int i = 0; i < nomes.length; i++) {
            list.add(nomes[i]);
        }

        // Imprime os nomes sem ordenação e, em seguida, os nomes ordenados em ordem alfabética
        System.out.println();
        System.out.println("Sem ordenação: " + list);
        Collections.sort(list);
        System.out.println("Com ordenação: " + list);
        System.out.println();

        // Imprime os nomes separados por sexo
        System.out.println("Pessoas do sexo Feminino: " + listF);
        System.out.println("Pessoas do sexo Masculino: " + listM);

        sc.close(); // Fecha o objeto Scanner para liberar recursos do sistema
    }
}





