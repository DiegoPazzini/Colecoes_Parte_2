package Colecoes_Parte_2; // Declaração do pacote Colecoes_Parte_2

import java.util.ArrayList; // Importa a classe ArrayList do pacote java.util
import java.util.List; // Importa a interface List do pacote java.util
import java.util.Scanner; // Importa a classe Scanner do pacote java.util

public class SepararPorSexo { // Declaração da classe SepararPorSexo
    public static void main(String[] args) { // Método principal do programa
        List<String> masculino = new ArrayList<String>(); // Cria uma lista vazia para os nomes masculinos
        List<String> feminino = new ArrayList<String>(); // Cria uma lista vazia para os nomes femininos

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        String nome, sexo; // Declara variáveis para armazenar o nome e o sexo

        while (true) { // Inicia um loop infinito
            System.out.print("Digite o nome (ou 'sair' para encerrar): "); // Solicita que o usuário digite um nome
            nome = scanner.nextLine(); // Lê a entrada do usuário e armazena o nome

            if (nome.equalsIgnoreCase("sair")) { // Verifica se o usuário digitou 'sair'
                break; // Encerra o loop se o usuário digitou 'sair'
            }

            System.out.print("Digite o sexo (M/F): "); // Solicita que o usuário digite o sexo
            sexo = scanner.nextLine(); // Lê a entrada do usuário e armazena o sexo

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) { // Verifica se o sexo é masculino
                masculino.add(nome); // Adiciona o nome à lista de nomes masculinos
            } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Feminino")) { // Verifica se o sexo é feminino
                feminino.add(nome); // Adiciona o nome à lista de nomes femininos
            } else {
                System.out.println("Sexo não reconhecido. Digite M ou F."); // Se o sexo não é reconhecido, exibe uma mensagem de erro
            }
        }

        scanner.close(); // Fecha o objeto Scanner

        System.out.println("Nomes do sexo masculino: " + masculino); // Exibe os nomes do sexo masculino
        System.out.println("Nomes do sexo feminino: " + feminino); // Exibe os nomes do sexo feminino
    }
}
