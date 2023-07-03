
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Carro extends Veiculo {
    private double km;

    public Carro(String nome, double preco, double km) {
        super(nome, preco);
        this.km = km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do carro:");
        nome = scanner.nextLine();
        System.out.println("Insira o preço do carro:");
        preco = scanner.nextDouble();
        System.out.println("Insira a quilometragem do carro:");
        km = scanner.nextDouble();
    }

    @Override
    public double getPreco() {
        if (km > 100000) {
            return preco * 0.92;
        } else {
            return preco;
        }
    }
}

