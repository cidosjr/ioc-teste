package br.cid;

import java.util.Locale;
import java.util.Scanner;

import br.cid.entities.Employee;
import br.cid.services.PensionService;
import br.cid.services.SalaryService;
import br.cid.services.TaxService;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        SalaryService salaryService = new SalaryService();

        double netSalary = salaryService.netSalary(employee);
        
        System.out.printf("Salario liquido: " + netSalary + "\n");

        

        sc.close();
    }
}
