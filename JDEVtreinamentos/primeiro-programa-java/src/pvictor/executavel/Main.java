package pvictor.executavel;

import static pvictor.util.Util.buscarDisciplinaPorNome;
import static pvictor.util.Util.concatenate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import pvictor.classes.Aluno;
import pvictor.classes.Disciplina;
import pvictor.constantes.StatusAluno;

public class Main {

	private static String nome;

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		if (logar(login, senha)) {

			JOptionPane.showMessageDialog(null, "Acesso liberado ao sistema! Pressione OK!");

			String qtdAlunos = JOptionPane.showInputDialog("Quantidade de alunos?");

			List<Aluno> alunos = new ArrayList<Aluno>();
			/* � uma lista que dentro dela temos uma chave que identifica uma sequencia de valores tamb�m */

			// Estrutua de dados que representa os elementos por uma chave e um valor
			// associado � chave
			HashMap<String, List<Aluno>> alunosStatus = new HashMap<>();

			// qtd de alunos
			for (int qtd = 1; qtd <= Integer.parseInt(qtdAlunos); qtd++) {
				// Entrada de dados com o teclado
				String nome = JOptionPane.showInputDialog("Nome do " + qtd + " " + " aluno ");
				// Informações do aluno, sempre que precisar de alguma basta tirar o comentário
				/*
				 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
				 * dataNascimento =
				 * JOptionPane.showInputDialog("Qual a data de nascimento do aluno?"); String rg
				 * = JOptionPane.showInputDialog("Qual o rg do aluno? "); String cpf =
				 * JOptionPane.showInputDialog("Qual o cpf do aluno? "); String mae =
				 * JOptionPane.showInputDialog("Qual o nome da mae do aluno? "); String pai =
				 * JOptionPane.showInputDialog("Qual o nome do pai do aluno? "); String
				 * dataMatricula =
				 * JOptionPane.showInputDialog("Qual a data de matricula do aluno? "); String
				 * escola = JOptionPane.showInputDialog("Qual o nome da escola? "); String serie
				 * = JOptionPane.showInputDialog("Qual a serie do aluno? ");
				 */

				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				/*
				 * aluno.setIdade(Integer.valueOf(idade));
				 * aluno.setDataNascimento(dataNascimento); aluno.setRg(rg);
				 * aluno.setCpf(cpf); aluno.setNomeMae(mae); aluno.setNomePai(pai);
				 * aluno.setDataMatricula(dataMatricula); aluno.setNomeEscola(escola);
				 * aluno.setSerieMatriculado(serie);
				 */

				informarDisciplinas(aluno);
				removerDisciplinas(aluno);
				alunos.add(aluno);
			}
			separarListasPorStatus(alunos, alunosStatus);
			imprimir(alunosStatus);

		} else {
			JOptionPane.showMessageDialog(null,
					"Acesso negado!" + "Login ou Senha inválidos!" + "\n" + "Pressione Ok e tente novamente!");
		}
	}

	private static void imprimir(HashMap<String, List<Aluno>> alunosStatus) {
		verificarAlunosAprovados(alunosStatus);
		verificarAlunosReprovados(alunosStatus);
		verificarAlunosEmRecuperacao(alunosStatus);

	}

	private static void verificarAlunosEmRecuperacao(HashMap<String, List<Aluno>> alunosStatus) {
		System.out.println("==============================");
		System.out.println("Lista dos alunos em RECUPERAÇÃO!");
		System.out.println("==============================");
		if (!alunosStatus.get(StatusAluno.RECUPERACAO).isEmpty()) {
			for (Aluno aluno : alunosStatus.get(StatusAluno.RECUPERACAO)) {
				imprimirDadosAluno(aluno, alunosStatus.get(StatusAluno.RECUPERACAO).size() > 1);
			}
		} else {
			System.err.println("Não há alunos em Recuperação!");
		}
	}

	private static void verificarAlunosReprovados(HashMap<String, List<Aluno>> alunosStatus) {
		System.out.println("==============================");
		System.out.println("Lista dos alunos REPROVADOS!");
		System.out.println("==============================");
		if (!alunosStatus.get(StatusAluno.REPROVADO).isEmpty()) {
			for (Aluno aluno : alunosStatus.get(StatusAluno.REPROVADO)) {
				imprimirDadosAluno(aluno, alunosStatus.get(StatusAluno.REPROVADO).size() > 1);
			}
		} else {
			System.err.println("Não há alunos Reprovados!");
		}

	}

	private static void verificarAlunosAprovados(HashMap<String, List<Aluno>> alunosStatus) {
		System.out.println("==============================");
		System.out.println("Lista dos alunos APROVADOS!");
		System.out.println("==============================");
		if (!alunosStatus.get(StatusAluno.APROVADO).isEmpty()) {
			for (Aluno aluno : alunosStatus.get(StatusAluno.APROVADO)) {
				imprimirDadosAluno(aluno, alunosStatus.get(StatusAluno.APROVADO).size() > 1);
			}
		} else {
			System.err.println("Não há alunos Aprovados!");
		}
	}

	private static void imprimirDadosAluno(Aluno aluno, boolean separacao) {

		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Média: " + aluno.getMediaNota());

		if (separacao)
			System.out.println("-------------------");
	}

	private static void separarListasPorStatus(List<Aluno> alunos, HashMap<String, List<Aluno>> alunosStatus) {
		alunosStatus.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		alunosStatus.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		alunosStatus.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosStatus.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosStatus.get(StatusAluno.RECUPERACAO).add(aluno);
			} else if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				alunosStatus.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
	}

	private static void informarDisciplinas(Aluno aluno) {
		String qtdDisciplinas = JOptionPane
				.showInputDialog("Quantas disciplinas desejar cadastrar para o aluno " + aluno.getNome() + "?");
		for (int pos = 1; pos <= Integer.parseInt(qtdDisciplinas); pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + pos + " : ");
			String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina " + pos + "  : ");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno.getDisciplinas().add(disciplina);
		}

	}

	private static void removerDisciplinas(Aluno aluno1) {
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		if (escolha == 0) {
			int continuarRemover = 0;
			while (continuarRemover == 0 && !aluno1.getDisciplinas().isEmpty()) {
				List<String> opcoes = new ArrayList<>();
				for (Disciplina disciplina : aluno1.getDisciplinas()) {
					opcoes.add(disciplina.getDisciplina());
				}
				String nomeDisciplinaRemover = JOptionPane.showInputDialog(null,
						"Informe a disciplina a ser removida [ " + concatenate(opcoes) + " ]");
				Disciplina disciplinaOpcao = buscarDisciplinaPorNome(nomeDisciplinaRemover, aluno1.getDisciplinas());
				if (disciplinaOpcao != null) {
					aluno1.getDisciplinas().remove(disciplinaOpcao);
					JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso!");
				}
				if (!aluno1.getDisciplinas().isEmpty()) {
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
				} else {
					JOptionPane.showMessageDialog(null, "Todas as disciplinas foram removidas! Processo finalizado!");
				}
			}
		}
	}

	private static boolean logar(String login, String senha) {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}

//	/* Percorrendo a lista por posi��o do aluno */
//	for (int pos = 0; pos < alunos.size(); pos++) {
//
//		Aluno aluno = alunos.get(pos);
//
//		if (aluno.getNome().equalsIgnoreCase("alex")) {
//			Aluno trocar = new Aluno();
//			JOptionPane.showMessageDialog(null,
//					"Caso o aluno " + aluno.getNome() + " esteja na lista deve ser trocado");
//			// trocar.setNome("Aluno foi trocado");
//			trocar.setNome(JOptionPane.showInputDialog(
//					"Trocar " + aluno.getNome() + " por favor,  " + "\n" + "Digite o nome do novo aluno? "));
//
//			Disciplina disciplina = new Disciplina();
//			disciplina.setDisciplina(
//					JOptionPane.showInputDialog(aluno.getNome() + " tinha as seguintes informa��es: " + "\n"
//							+ aluno.getDisciplinas() + "  deve ser trocado," + "\n" + "Nome da nova disciplina? "));
//			disciplina.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota da nova disciplina:  ")));
//
//			trocar.getDisciplinas().add(disciplina);
//
//			alunos.set(pos, trocar);
//			aluno = alunos.get(pos);
//		}
//		JOptionPane.showMessageDialog(null,
//				"Aluno = " + aluno.getNome() + "\n" + "M�dia do " + aluno.getNome() + " = " + aluno.getMediaNota()
//						+ "\n" + "Resultado = " + aluno.getAlunoAprovado2() + "\n" + aluno.getDisciplinas());
//
//		// Percorrendo a lista por posi��o da disciplina 
////		for (int posdisc = 0; posdisc < aluno.getDisciplinas().size(); posdisc++) {
////			Disciplina disc = aluno.getDisciplinas().get(posdisc);
////			System.out.println("Materia: " + disc.getDisciplina() + ", Nota = " + disc.getNota());
////			System.out.println("------------------------------------------");
////
////		}
//
//	}
}
