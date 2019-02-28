package br.com.estudo.employee;

public class CommissonEmployee {
    private String fisrtName;
    private String lastName;
    private String socialSecurityNamber;
    private double glossSales; //total de vendas brutas semanais.
    private double commissionRate; //taxa de comissão de vendas juros.

    public CommissonEmployee(String fisrtName, String lastName, String socialSecurityNamber, double glossSales, double commissionRate) {
        if (glossSales < .0) {
            throw new IllegalArgumentException("Gloss Sales most be >= 0.0");
        }

        if (commissionRate < .0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Commition rate most be >= 0.0 and < 1.0");
        }

        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.socialSecurityNamber = socialSecurityNamber;
        this.glossSales = glossSales;
        this.commissionRate = commissionRate;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNamber() {
        return socialSecurityNamber;
    }

    public void setSocialSecurityNamber(String socialSecurityNamber) {
        this.socialSecurityNamber = socialSecurityNamber;
    }

    public double getGlossSales() {
        if (glossSales < .0) {
            throw new IllegalArgumentException("Gloss Sales most be >= 0.0");
        }
        return glossSales;
    }

    public void setGlossSales(double glossSales) {
        this.glossSales = glossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < .0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Commition rate most be >= 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }
}
