package udemy;

public class PessoaApp {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(1,"Teste");
		Pessoa pessoa1 = new Pessoa(2,"Ana");
		Pessoa pessoa2 = new Pessoa(3,"Gui");
		Pessoa pessoa3 = new Pessoa(4,"Gu");
		
		System.out.println("O codigo do objeto é: " + pessoa2.getCodigo());
		System.out.println("O nome do objeto é: " + pessoa2.getNome());
		
		System.out.println("O codigo do objeto é: " + pessoa1.getCodigo());
		System.out.println("O nome do objeto é: " + pessoa1.getNome());
		
		System.out.println("O codigo do objeto é: " + pessoa3.getCodigo());
		System.out.println("O nome do objeto é: " + pessoa3.getNome());
		
		System.out.println("O codigo do objeto é: " + pessoa.getCodigo());
		System.out.println("O nome do objeto é: " + pessoa.getNome());
		
	}
}