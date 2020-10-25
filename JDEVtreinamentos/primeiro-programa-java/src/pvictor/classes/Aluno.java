package pvictor.classes;

import java.util.ArrayList;
import java.util.List;

import pvictor.constantes.StatusAluno;

/*Esta � a classe/objeto que respresenta o Aluno*/
public class Aluno {

	/* Esses s�o os atributos da classe Aluno */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	/* Objeto que contém a lista de disciplinas e notas */
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	/* Cosntrutor vazio, deve seguir sempre esse padrão */
	public Aluno() {

	}

	/* Construtor com um parametro */
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	/* Construtor com dois parametros */
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	/*
	 * M�todos Getters e Setters GEt e para resgatar ou obter o valor do atributo
	 * SET e para adicionar ou receber dados dos atributos
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/* M�todo que retorna a media do aluno */
	public double getMediaNota() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		if (!disciplinas.isEmpty())
			return somaNotas / disciplinas.size();
		return 0.0;
	}

	/*
	 * M�todo que retorna true para aprovado e false para reprovado Usando esse
	 * metodo, na classe main pode usar operador tern�rio! Apenas para aprovado e
	 * reprovado(true/false)
	 */
	public boolean getAlunoAprovadoBoolean() {
		return getMediaNota() >= 7;

	}

	/* M�todo que retorna se foi aprovado, recupera��o ou reprovado(String) */
	public String getAlunoAprovadoString() {
		double media = this.getMediaNota();
		if (media >= 5) {
			if (media >= 7) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}

	}

	/* toString que cont�m as informa��es do aluno */
	@Override
	public String toString() {
		return "Aluno [" + "\n nome= " + getNome() + ", idade=" + getIdade() + ", dataNascimento= "
				+ getDataNascimento() + "\n, rg= " + getRg() + " cpf= " + getCpf() + "\n, nomeMae= " + getNomeMae()
				+ ", nomePai= " + getNomePai() + "\n, dataMatricula= " + getDataMatricula() + "\n, nomeEscola= "
				+ getNomeEscola() + ", serieMatriculado= " + getSerieMatriculado() + ", disciplinas" + getDisciplinas()
				+ "]";
	}

	/* hashcode gerado pelo java */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/* equals gerado pelo java */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
