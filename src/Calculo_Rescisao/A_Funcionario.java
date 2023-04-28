package Calculo_Rescisao;

public class A_Funcionario {

    double salario;
    int diaSaida, mesesTrabalho;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDiaSaida() {
        return diaSaida;
    }

    public void setDiaSaida(int diaSaida) {
        this.diaSaida = diaSaida;
    }

    public int getMesesTrabalho() {
        return mesesTrabalho;
    }

    public void setMesesTrabalho(int mesesTrabalho) {
        this.mesesTrabalho = mesesTrabalho;
    }

    public A_Funcionario(double salario, int diaSaida, int mesesTrabalho) {
        this.salario = salario;
        this.diaSaida = diaSaida;
        this.mesesTrabalho = mesesTrabalho;
    }
}
