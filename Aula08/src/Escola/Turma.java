package Escola;

import java.util.ArrayList;

public class Turma {
	private Professor professor;
	private ArrayList<Aluno> alunos;
	private int encontros;

	public Turma(Professor professor, int encontros) {
		this.professor = professor;
		this.encontros = encontros;
		this.alunos = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void matriculaAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void mostraDetalhesTurma() {
		System.out.println("Professor: " + this.professor.getNome() + " , Disciplina: " + this.professor.getDisciplina());
		System.out.println("Relacao de alunos matriculados:");
		for (int i = 0; i < alunos.size(); i++) {
			
			if (i == (alunos.size() - 1)) {
				System.out.print(alunos.get(i).getNome() + ".\n");
			} else {
				System.out.print(alunos.get(i).getNome() + ", ");
			}

		}
		System.out.println("-----------------------------------------------------------------------------------");
	}

	public void iniciaPeriodoLetivo() {
		System.out.println("Inicio do Curso\n");
		for (int numEncontros = 1; numEncontros <= encontros; numEncontros++) {
			System.out.println("Encontro " + numEncontros);
			professor.ensina(alunos);
			System.out.println("Avaliacao do Encontro " + numEncontros + " realizada!\n");
		}
	}

	public void encerraPeriodoLetivo() {
		System.out.println("Professor calculando notas finais...\n");
		for (int i = 0; i < alunos.size(); i++) {
			professor.calculaNotaFinal(alunos.get(i));
		}

	}

	public void apresentaResultados() {

		System.out.println("Publicacao de Resultados do periodo letivo!");

		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).isAlunoAprovado()) {
				System.out.println(alunos.get(i).getNome() + "; " + String.format("%.1f", alunos.get(i).getNotaFinal())
						+ "; " + " (Aprovado)");
			} else {
				System.out.println(alunos.get(i).getNome() + "; " + String.format("%.1f", alunos.get(i).getNotaFinal())
						+ "; " + " (Reprovado)");
			}

		}
	}
}
