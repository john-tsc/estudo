package br.com.estudo.employee;

//Using composition.

public class BasePlusCommissionEmployee {
    private double baseSalaty;
    private CommissonEmployee commissonEmployee;

    public BasePlusCommissionEmployee(double baseSalaty, CommissonEmployee commissonEmployee) {
        if (baseSalaty < .0) {
            throw new IllegalArgumentException("Base salary most be >= 0.0.");
        }

        this.baseSalaty = baseSalaty;
        this.commissonEmployee = commissonEmployee;
    }

    public double getBaseSalaty() {
        if (baseSalaty < .0) {
            throw new IllegalArgumentException("Base salary most be >= 0.0");
        }
        return baseSalaty;
    }

    public void setBaseSalaty(double baseSalaty) {
        this.baseSalaty = baseSalaty;

    }

    public CommissonEmployee getCommissonEmployee() {
        return commissonEmployee;
    }

    public void setCommissonEmployee(CommissonEmployee commissonEmployee) {
        this.commissonEmployee = commissonEmployee;
    }


    public double earnings(){
        return getBaseSalaty() + commissonEmployee.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f",
                "Base salaried ", commissonEmployee.toString(),
                "Base salary", getBaseSalaty());
    }
}
