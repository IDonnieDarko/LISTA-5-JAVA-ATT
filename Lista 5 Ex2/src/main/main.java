
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
  
 public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de veículos que deseja cadastrar:");
        int numVeiculos = scanner.nextInt();

        for (int i = 0; i < numVeiculos; i++) {
            System.out.println("Digite '1' para cadastrar uma moto ou '2' para cadastrar um carro:");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                Moto moto = new Moto("", 0, 0);
                moto.insertData();
                veiculos.add(moto);
            } else if (opcao == 2) {
                Carro carro = new Carro("", 0, 0);
                carro.insertData();
                veiculos.add(carro);
            }
        }

        System.out.println("\nRelatório de Veículos Cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            System.out.println();
        }

        double totalPrecoAntes = 0;
        for (Veiculo veiculo : veiculos) {
            totalPrecoAntes += veiculo.getPreco();
        }

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                moto.setAno(2008);
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                carro.setKm(120000);
            }
        }

        double totalPrecoDepois = 0;
        for (Veiculo veiculo : veiculos) {
            totalPrecoDepois += veiculo.getPreco();
        }

        System.out.println("\nTotal de Preços dos Veículos Antes do Reajuste: R$" + totalPrecoAntes);
        System.out.println("Total de Preços dos Veículos Depois do Reajuste: R$" + totalPrecoDepois);
    }
}