package Calculo_Rescisao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class A_Funcionario {

	//Atributos:
	
	String nome;
	Boolean demissaoVoluntaria = true; // se false, segue adiante
	int feriasVencidas; // a quantidade de férias 0, 1 ou 2
	float salario;
	
	//Construtor:
	
	public A_Funcionario(String nome, Boolean demissaoVoluntaria, int feriasVencidas, float salario) {
		super();
		this.nome = nome;
		this.demissaoVoluntaria = demissaoVoluntaria;
		this.feriasVencidas = feriasVencidas;
		this.salario = salario;
	}
	
	//getters & setters:

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getDemissaoVoluntaria() {
		return demissaoVoluntaria;
	}

	public void setDemissaoVoluntaria(Boolean demissaoVoluntaria) {
		this.demissaoVoluntaria = demissaoVoluntaria;
	}

	public int getFeriasVencidas() {
		return feriasVencidas;
	}

	public void setFeriasVencidas(int feriasVencidas) {
		this.feriasVencidas = feriasVencidas;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// metodo:

	public void dia() {
		LocalDate startDay = LocalDate.of(2021, 01, 15);
		LocalDate endDay = LocalDate.of(2023, 7, 20);

		long days = ChronoUnit.DAYS.between(startDay, endDay);
		System.out.println(days);
		
	}
	
	public void mes() {
		LocalDate startMonth = LocalDate.of(2021, 01, 15);
		LocalDate endMonth = LocalDate.of(2023, 7, 20);

		long month = ChronoUnit.MONTHS.between(startMonth, endMonth);
		System.out.println(month);
		
	}
	
	public void ano() {
		LocalDate startYear = LocalDate.of(2021, 01, 15);
		LocalDate endYear = LocalDate.of(2023, 7, 20);

		long year = ChronoUnit.YEARS.between(startYear, endYear);
		System.out.println(year);
	}
	
}
