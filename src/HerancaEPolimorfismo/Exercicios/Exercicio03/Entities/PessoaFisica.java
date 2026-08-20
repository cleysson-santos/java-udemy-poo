package HerancaEPolimorfismo.Exercicios.Exercicio03.Entities;

public class PessoaFisica extends TaxPayer {
    private Double healthExpenses;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double anualIncome, Double healthExpenses) {
        super(name, anualIncome);
        this.healthExpenses = healthExpenses;
    }

    public PessoaFisica(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double tax(){
       double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;

       basicTax -= getHealthExpenses() * 0.5;

       if(basicTax < 0.0) {
           basicTax = 0.0;
       }
       return basicTax;
    }

}
