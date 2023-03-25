
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println("Número da Conta Corrente: " + conta.getNumero());
		
		Cliente anna = new Cliente();
		//conta.titular = anna;
		anna.setNome("Anna Carolina de Oliveira Vale Mendes");
		anna.setCpf("134.606.227-76");
		anna.setProfissao("Analista e Desenvolvedora de Sistemas");
		conta.setTitular(anna);
		System.out.println("Nome: " + conta.getTitular().getNome());
		System.out.println("CPF: " + conta.getTitular().getCpf());
		System.out.println("Profissão: " + conta.getTitular().getProfissao());

	}

}
