public class Vendedor extends Funcionario {

	float comissao;
	
	

	public Vendedor(float id, String nome, float salario, float comissao) {
		super(id, nome, salario);
		this.comissao = comissao;
	}
	
	



	public float getComissao() {
		return comissao;
	}





	public void setComissao(float comissao) {
		this.comissao = comissao;
	}





	public void exibirInfo(){
		
	}
}
