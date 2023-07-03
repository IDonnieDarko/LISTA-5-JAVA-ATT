
package Main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Midia> catalogo = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("CADASTRO DE CD E DVD");
            System.out.println("--------------------");
            System.out.println("1. Cadastrar CD");
            System.out.println("2. Cadastrar DVD");
            System.out.println("3. Listar mídias cadastradas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarCD();
                    break;
                case 2:
                    cadastrarDVD();
                    break;
                case 3:
                    listarMidias();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }
    }

    private static void cadastrarCD() {
        System.out.println("CADASTRO DE CD");
        System.out.println("--------------");

        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Número de músicas: ");
        int nMusicas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        CD cd = new CD(codigo, preco, nome, nMusicas);
        catalogo.add(cd);

        System.out.println("CD cadastrado com sucesso!");
    }

    private static void cadastrarDVD() {
        System.out.println("CADASTRO DE DVD");
        System.out.println("---------------");

        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Número de faixas: ");
        int nFaixas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        DVD dvd = new DVD(codigo, preco, nome, nFaixas);
        catalogo.add(dvd);

        System.out.println("DVD cadastrado com sucesso!");
    }

    private static void listarMidias() {
        System.out.println("MÍDIAS CADASTRADAS");
        System.out.println("------------------");

        if (catalogo.isEmpty()) {
            System.out.println("Nenhuma mídia cadastrada.");
        } else {
            for (Midia midia : catalogo) {
                midia.printDados();
                System.out.println("--------------------");
            }
        }
    }
}