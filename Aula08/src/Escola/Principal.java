package Escola;

public class Principal {

	public static void main(String[] args) {

		//instanciando o professor
		Professor professor = new Professor("Tiberio", "Matematica");
		//instanciando 9 alunos
		Aluno aluno1 = new Aluno("Rafael", 1234, "Rua 24 Outubro, 104");
		Aluno aluno2 = new Aluno("Tiago", 2345, "Rua 7 de Setembro, 94");
		Aluno aluno3 = new Aluno("Fernanda", 3456, "Rua das Laranjeiras, 224");
		Aluno aluno4 = new Aluno("Guilherme", 4567, "Rua das Costureiras, 1204");
		Aluno aluno5 = new Aluno("Cassia", 5678, "Rua 15 de Novembro, 1144");
		Aluno aluno6 = new Aluno("Gilberto", 6789, "Rua Porto Alegre, 2294");
		Aluno aluno7 = new Aluno("Adriane", 7890, "Rua Brasilia, 5200");
		Aluno aluno8 = new Aluno("Francisco", 8901, "Rua Sao Paulo, 1000");
		Aluno aluno9 = new Aluno("Bernardo", 9012, "Rua das Orquideas, 5670");
		//instanciando uma turma de 8 encontros
		Turma turma = new Turma(professor, 8); // 8 encontros
		//matriculando os alunos na turma
		turma.matriculaAluno(aluno1);
		turma.matriculaAluno(aluno2);
		turma.matriculaAluno(aluno3);
		turma.matriculaAluno(aluno4);
		turma.matriculaAluno(aluno5);
		turma.matriculaAluno(aluno6);
		turma.matriculaAluno(aluno7);
		turma.matriculaAluno(aluno8);
		turma.matriculaAluno(aluno9);

		turma.mostraDetalhesTurma();

		turma.iniciaPeriodoLetivo();

		turma.encerraPeriodoLetivo();

		turma.apresentaResultados();

	}

}
