package aplicacao;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class programa {

	public static void main(String[] args) throws ParseException {

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a quantidade de alunos do curso A: ");
		int qtd = ler.nextInt();

		if (qtd != 0) {
			System.out.print("Informe o código dos alunos: ");
			for (int cont = 1; cont <= qtd; cont++) {
				a.add(ler.nextInt());

			}
		}

		System.out.println("");

		System.out.print("Informe a quantidade de alunos do curso B: ");
		int qtd2 = ler.nextInt();
		if (qtd2 != 0) {
			System.out.print("Informe o código dos alunos: ");
			for (int cont = 1; cont <= qtd2; cont++) {
				b.add(ler.nextInt());
			}
		}

		System.out.println("");

		System.out.print("Informe a quantidade de alunos do curso C: ");
		int qtd3 = ler.nextInt();

		if (qtd3 != 0) {
			System.out.print("Informe o código dos alunos: ");
			for (int cont = 1; cont <= qtd3; cont++) {
				c.add(ler.nextInt());
			}
		}

		System.out.println("");
		
		Set<Integer> totalAlunos = new HashSet<>(a);
		totalAlunos.addAll(b);
		totalAlunos.addAll(c);

		System.out.println("Id de Alunos: " + totalAlunos);
		System.out.println("Total de Alunos: " + totalAlunos.size());

		ler.close();
	}
}
