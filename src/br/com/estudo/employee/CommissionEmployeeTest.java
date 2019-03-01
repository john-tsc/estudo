package br.com.estudo.employee;

public class CommissionEmployeeTest {

    public static void main(String args[]){
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(100.00,
                new CommissonEmployee("John", "Dogulas","346356",0.4,0.6));

        System.out.println(basePlusCommissionEmployee);
    }
}
