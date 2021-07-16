package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PersonCompany;
import entities.PersonIndividual;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new PersonIndividual(name, anualIncome, healthExpenditures));
			}
			if (ch == 'c') {

				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				list.add(new PersonCompany(name, anualIncome, anualIncome));
			}
		}

		Double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Person pers : list) {
			Double taxaAnual = pers.valorImposto();
			System.out.println(pers.toString());
			sum += taxaAnual;
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f",sum));
		sc.close();
	}

}
