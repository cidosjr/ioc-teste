package br.cid;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        double netSalary = grossSalary * 0.7;
        System.out.printf("Salario liquido: " + netSalary + "\n");

        sc.close();
    }
}
