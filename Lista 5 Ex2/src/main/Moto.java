
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Moto extends Veiculo {
    private int ano;

    public Moto(String nome, double preco, int ano) {
        super(nome, preco);
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome da moto:");
        nome = scanner.nextLine();
        System.out.println("Insira o preço da moto:");
        preco = scanner.nextDouble();
        System.out.println("Insira o ano da moto:");
        ano = scanner.nextInt();
    }

    @Override
    public double getPreco() {
        if (ano >= 2008) {
            return preco * 1.1;
        } else {
            return preco;
        }
    }
}