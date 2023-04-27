package Calculo_Rescisao;

public class B_Deducoes {


	// (********** CALCULO INSS**********)
	private static final double baseINSS = 7507.49;
	// FAIXA 1 = 0 até 1.302,00
	private static final double inss1 = 0.075;
	// FAIXA 2 = 1.302,01 até 2.571,29
	private static final double inss2 = 0.09;
	// FAIXA 3 = 2.571,30 até 3.856,94
	private static final double inss3 = 0.12;
	// FAIXA 4 = 3.856,95 até 7.507,49
	private static final double inss4 = 0.14;

	public static double calcularINSS(double salarioBruto) {
		if (salarioBruto <= 1302.00) {
			return salarioBruto * inss1;
		} else if (salarioBruto >= 1302.01 && salarioBruto <= 2571.29) {
			return salarioBruto * inss2;
		} else if (salarioBruto >= 2571.30 && salarioBruto <= 3856.94) {
			return salarioBruto * inss3;
		} else if (salarioBruto >= 3856.95 && salarioBruto <= 7507.49) {
			return salarioBruto * inss4;
		}
	}

	// (********** CALCULO IRRF**********)
	private static final double baseIRRF = 4664.68;

	// FAIXA 1 = até 1.903.98
	private static final double irrf1 = 0.0;
	// FAIXA 2 = 1.903.99 até 2.826.65
	private static final double irrf2 = 0.075;
	// FAIXA 3 = 2.826.66 até 3.751,05
	private static final double irrf3 = 0.15;
	// FAIXA 4 = 3.751,06 até 4.664,68
	private static final double irrf4 = 0.225;
	// FAIXA 5 = acima 4.664,69
	private static final double irrf5 = 0.275;

	public static double calcularIRRF(double salarioBruto) {
	        double baseCalculo = salarioBruto - calcularINSS(salarioBruto);
	        
	        if (baseCalculo <= 1903.98) {
	            return 0.0;
	        } else if (baseCalculo >= 1903.99 && baseCalculo <= 2826.65) {
	            return (baseCalculo * irrf2) - 142.80;
	        } else if (baseCalculo >= 2826.66 && baseCalculo <= 3751.05) {
	            return (baseCalculo * irrf3) - 354.80;
	        } else if (baseCalculo >= 3751.06 && baseCalculo <= 4664.68) {
	            return (baseCalculo * irrf4) - 636.13;
	        } else {
	            return (baseCalculo * irrf5) - 869.36;
	        }
	    }
}
}
