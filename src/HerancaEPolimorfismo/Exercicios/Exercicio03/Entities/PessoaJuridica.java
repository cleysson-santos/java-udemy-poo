package HerancaEPolimorfismo.Exercicios.Exercicio03.Entities;

public class PessoaJuridica extends TaxPayer{
   private Integer numberEmployees;

   public PessoaJuridica() {
       super();
   }

    public PessoaJuridica(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
       if(numberEmployees > 10) {
           return getAnualIncome() * 0.14;
       } else {
           return getAnualIncome() * 0.16;
       }
    }
}