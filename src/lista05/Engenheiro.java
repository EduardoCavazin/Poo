package lista05;

public class Engenheiro extends Funcionario{
    protected double bonus;

    public Engenheiro(String nome, String cpf, int horasTotais, double bonus) {
        super(nome, cpf, horasTotais);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double calcularSalario() {
        return (getBonus() + (horasTotais * 18));
    }

}
