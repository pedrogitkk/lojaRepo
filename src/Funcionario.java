public class Funcionario {
	   
	float id;
	String nome;
	float salario;

	   
	    public Funcionario(float id, String nome, float salario) {
	        this.id = id;
	        this.nome = nome;
	        this.salario = salario;
	    }
	


	public float getId() {
	    return id;
	}
	
	
	public void setId(float id) {
	    this.id = id;
	}
	
	
	public String getNome() {
	    return nome;
	}
	
	
	public void setNome(String nome) {
	    this.nome = nome;
	}
	
	
	public float getSalario() {
	    return salario;
	}
	
	
	public void setSalario(float salario) {
	    this.salario = salario;
	}
	
	public void exibirInfo(){
		System.out.printLn("ID: " + id);
		System.out.printLn("ID: " + nome);
		System.out.printLn("ID: " + salario);
	}
}