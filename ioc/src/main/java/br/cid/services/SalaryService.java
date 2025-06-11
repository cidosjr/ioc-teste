package br.cid.services;

import br.cid.entities.Employee;

public class SalaryService {

    // Forma errada
    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();
    
    
    public double netSalary(Employee employee){
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) 
        - pensionService.discount(employee.getGrossSalary());
    }
}
