package Escola;

import java.util.ArrayList;

public class Professor {
	private String nome;
	private String disciplina;

	public Professor(String nome, String disciplina) {
		this.nome = nome;
		this.disciplina = disciplina;
	}

	public boolean aprova(Aluno aluno) {

		return false;
	}

	public void ensina(ArrayList<Aluno> alunos) {
		for (int i = 0; i < alunos.size(); i++) {
			alunos.get(i).fazProva();
		}
	}

	public void calculaNotaFinal(Aluno aluno) {
		double resultadoFinal = 0;
		for (int i = 0; i <= aluno.getNotas().size() - 1; i++) {
			resultadoFinal += aluno.getNotas().get(i);
		}
		resultadoFinal /= aluno.getNotas().size();
		aluno.setNotaFinal(resultadoFinal);
	}

	public String getNome() {
		return nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

}
