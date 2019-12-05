public class PessoaModel {
	private static String nome;
	private static String cpf ;
	private static String curso;
	private static int matricula;
	
	
	//Constructor
	public PessoaModel(String nome, String cpf, String curso, int matricula) {
		PessoaModel.nome = nome;
		PessoaModel.cpf = cpf;
		PessoaModel.curso = curso;
		PessoaModel.matricula = matricula;
	}
	public PessoaModel() {
		// Para setar os dados do objeto "aluno" do tipo PessoaModel
		}
	//Getters & Setters
	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		PessoaModel.nome = nome;
	}
	public static String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		PessoaModel.cpf = cpf;
	}
	public static String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		PessoaModel.curso = curso;
	}
	public static int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		PessoaModel.matricula = matricula;
	}

	
	
}
