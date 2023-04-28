package Calculo_Rescisao;

public class C_Proventos extends A_Funcionario {
    // (********** CALCULO Saldo Salário **********)

    double saldoSalario;

    public double getSaldoSalario() {
        return saldoSalario;
    }

    public void setSaldoSalario(double saldoSalario) {
        this.saldoSalario = saldoSalario;
    }

    public C_Proventos(double salario, int diaSaida, int mesesTrabalho) {
        super(salario, diaSaida, mesesTrabalho);
    }


    public double calcularSaldoSalario(double saldoSalario) {
        saldoSalario = (getSalario() / 30) * getDiaSaida();
        return saldoSalario;
    }


}
