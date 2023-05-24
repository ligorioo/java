package principal;

import java.util.Scanner;
import entidades.Aluno;
import entidades.Professor;
import entidades.TipoDisciplina;
import entidades.Turma;

public class Main {
	public static void menuPrincipal() {
		System.out.println("-------------MENU-------------");
		System.out.println("     Codigo     Evento");
		System.out.println("------------------------------");
		System.out.printf("%8s       Cadastrar;\n", "1");
		System.out.printf("%8s       Notas;\n", "2");
		System.out.printf("%8s       Encerrar.\n", "9");
		System.out.println("------------------------------");
		System.out.println("Digite o codigo da sua opcao: ");
	}

	public static void menuCadastrar() {
		System.out.println("---------------CADASTRAR----------------");
		System.out.println("     Código          Evento");
		System.out.println("----------------------------------------");
		System.out.printf("%8s      Voltar ao menu principal;\n", "0");
		System.out.printf("%8s      Adicionar aluno na turma;\n", "1");
		System.out.printf("%8s      Remover aluno da turma;\n", "2");
		System.out.printf("%8s      Listar turma;\n", "3");
		System.out.printf("%8s      Cadastrar professor;\n", "4");
		System.out.printf("%8s      Encerrar.\n", "9");
		System.out.println("----------------------------------------");
		System.out.println("Digite o codigo da sua opcao: ");
	}

	public static void menuNotas() {
		System.out.println("-----------------NOTAS------------------");
		System.out.println("     Codigo          Evento");
		System.out.println("----------------------------------------");
		System.out.printf("%8s      Voltar ao menu principal;\n", "0");
		System.out.printf("%8s      Adicionar nota;\n", "1");
		System.out.printf("%8s      Remover nota;\n", "2");
		System.out.printf("%8s      Listar notas;\n", "3");
		System.out.printf("%8s      Alterar nota;\n", "4");
		System.out.printf("%8s      Encerrar.\n", "9");
		System.out.println("------------------------------------");
		System.out.println("Digite o codigo da sua opcao: ");
	}

	public static boolean caseCadastrar(int codigoMenu, Turma turma, Scanner scanner) {
		int disciplina;
		boolean encerrar = false;

		switch (codigoMenu) {
		case 0:
			break;
		case 1:
			scanner.nextLine();
			System.out.println("Nome completo: ");
			String nome = scanner.nextLine();

			System.out.println("CPF (Modelo - 000.000.000-00): ");
			String cpf = scanner.nextLine();

			System.out.println("Matricula do aluno: ");
			int matricula = scanner.nextInt();

			System.out.println("Codigo da turma: ");
			String codigoTurma = scanner.next();

			do {
				System.out.println("Disciplina (Digite FPOO, HR, SO ou LM): ");
				System.out.println("1- FPOO;");
				System.out.println("2- HR;");
				System.out.println("3- SO;");
				System.out.println("4- LM;");
				System.out.println("Digite o codigo da disciplina: ");
				disciplina = scanner.nextInt();
			} while ((disciplina < 1) || (disciplina > 4));

			if (disciplina == 1) {
				Aluno aluno = new Aluno(nome, cpf, matricula, codigoTurma, TipoDisciplina.FPOO);
				turma.adicionarAluno(aluno);
				System.out.println("Aluno adicionado! Retornando ao menu principal...");
				System.out.println();
				break;
			}
			if (disciplina == 2) {
				Aluno aluno = new Aluno(nome, cpf, matricula, codigoTurma, TipoDisciplina.HR);
				turma.adicionarAluno(aluno);
				System.out.println("Aluno adicionado! Retornando ao menu principal...");
				System.out.println();
				break;
			}

			if (disciplina == 3) {
				Aluno aluno = new Aluno(nome, cpf, matricula, codigoTurma, TipoDisciplina.SO);
				turma.adicionarAluno(aluno);
				System.out.println("Aluno adicionado! Retornando ao menu principal...");
				System.out.println();
				break;
			}

			if (disciplina == 4) {
				Aluno aluno = new Aluno(nome, cpf, matricula, codigoTurma, TipoDisciplina.LM);
				turma.adicionarAluno(aluno);
				System.out.println("Aluno adicionado! Retornando ao menu principal...");
				System.out.println();
				break;
			}
			break;

		case 2:
			System.out.println("Digite a matricula do aluno para remover: ");
			matricula = scanner.nextInt();
			turma.removerAluno(matricula);
			break;

		case 3:
			turma.listarTurma();
			break;

		case 4:
			System.out.println("Nome do professor: ");
			scanner.nextLine();
			nome = scanner.nextLine();

			System.out.println("CPF: ");
			cpf = scanner.nextLine();

			System.out.println("Especialidade: ");
			String especialidade = scanner.nextLine();

			System.out.println("Periodo: ");
			String periodo = scanner.next();

			do {
				System.out.println("Disciplina (Digite FPOO, HR, SO ou LM): ");
				System.out.println("1- FPOO;");
				System.out.println("2- HR;");
				System.out.println("3- SO;");
				System.out.println("4- LM;");
				System.out.println("Digite o codigo da disciplina: ");
				disciplina = scanner.nextInt();
			} while ((disciplina < 1) || (disciplina > 4));

			if (disciplina == 1) {
				Professor professor = new Professor(nome, cpf, especialidade, TipoDisciplina.FPOO, periodo);
				System.out.println("Dados cadastrados: ");
				professor.exibirInformacoes();
				break;
			}
			if (disciplina == 2) {
				Professor professor = new Professor(nome, cpf, especialidade, TipoDisciplina.FPOO, periodo);
				System.out.println("Dados cadastrados: ");
				professor.exibirInformacoes();
				break;
			}

			if (disciplina == 3) {
				Professor professor = new Professor(nome, cpf, especialidade, TipoDisciplina.FPOO, periodo);
				System.out.println("Dados cadastrados: ");
				professor.exibirInformacoes();
				break;
			}

			if (disciplina == 4) {
				Professor professor = new Professor(nome, cpf, especialidade, TipoDisciplina.FPOO, periodo);
				System.out.println("Dados cadastrados: ");
				professor.exibirInformacoes();
				break;
			}
			break;

		case 9:
			encerrar = true;
			break;

		default:
			System.out.println("Código invalido. Retornando ao Menu Principal...");
			break;
		}
		return encerrar;
	}

	public static boolean caseNotas(int codigoMenu, Turma turma, Scanner scanner) {
		boolean encerrar = false;
		char verifica;
		

		switch (codigoMenu) {
		case 0:
			break;
			
		case 1:
			System.out.println("Digite a matricula do aluno que deseja adicionar notas: ");
			int matricula = scanner.nextInt();
			Aluno aluno = turma.buscarAluno(matricula);
			do {
				System.out.println("Digite a nota: ");
				double nota = scanner.nextDouble();
				aluno.adicionarNota(nota);

				System.out.println("Deseja adicionar mais uma nota? s (sim) / n (nao)");
				verifica = scanner.next().charAt(0);

			} while (verifica == 's');
			break;
			
		case 2:
			System.out.println("Digite a matricula do aluno que deseja remover a nota: ");
			matricula = scanner.nextInt();
			aluno = turma.buscarAluno(matricula);
			do {
				aluno.listarNotas();
				System.out.println("Digite o index para remover a nota correspondente (1- Nota1; 2- Nota2; 3- Nota3;...): ");
				int index = scanner.nextInt();
				aluno.removerNota(index);
				System.out.println("Nota removida! Lista atualizada: ");
				aluno.listarNotas();

				System.out.println("Deseja remover mais uma nota? s (sim) / n (nao)");
				verifica = scanner.next().charAt(0);
			} while (verifica == 's');
			break;
			
		case 3:
			System.out.println("Digite matricula do aluno: ");
			matricula = scanner.nextInt();
			aluno = turma.buscarAluno(matricula);
			aluno.listarNotas();

			break;
			
		case 4:
			System.out.println("Digite a matricula do aluno: ");
			matricula = scanner.nextInt();
			aluno = turma.buscarAluno(matricula);
			do {
				aluno.listarNotas();
				System.out.println("Digite o index da nota para altera-la (1- Nota1; 2- Nota2; 3- Nota3;...): ");
				int index = scanner.nextInt();
				System.out.println("Digite a nova nota: ");
				double novaNota = scanner.nextDouble();
				aluno.sobrescreverNota(index, novaNota);
				System.out.println("Nota alterada! Lista atualizada: ");
				aluno.listarNotas();
				
				System.out.println("Deseja alterar mais uma nota? s (sim) / n (nao)");
				verifica = scanner.next().charAt(0);
				
			} while (verifica == 's');
			break;
			
		case 9:
			encerrar = true;
			break;
			
		default:
			System.out.println("Codigo invalido. Retornando ao Menu Principal...");
			break;
		}
		
		return encerrar;
	}
	
	public static void main(String[] args) {
		int codigoMenu, codigoSwitch;
		boolean encerrar = false;
		Turma turma = new Turma();
		Scanner scanner = new Scanner(System.in);

		do {
			menuPrincipal();
			codigoMenu = scanner.nextInt();

			if (codigoMenu == 1) {
				menuCadastrar();
				codigoSwitch = scanner.nextInt();
				encerrar = caseCadastrar(codigoSwitch, turma, scanner);
			} else if (codigoMenu == 2) {
				menuNotas();
				codigoSwitch = scanner.nextInt();
				encerrar = caseNotas(codigoSwitch, turma, scanner);
			}
			else {
				if(codigoMenu != 9) {
					System.out.println("Codigo invalido! Digite codigo valido.");	
				}
			}
			if (encerrar == true) {
				break;
			}

		} while (codigoMenu != 9);
		System.out.println("Programa encerrado.");

		scanner.close();
	}
}
