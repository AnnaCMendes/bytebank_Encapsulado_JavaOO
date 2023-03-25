class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public static int getTotal() {
		return Conta.total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

	public Conta( int agencia, int numero) { 
		Conta.total ++;
        //System.out.println("o total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta" + this.numero);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if(novoNumero <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.numero = novoNumero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	// atributos

	// método deposita
	// método saca
	// método tranfere
	// método pegaSaldo

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;

		}
		return false;
	}

}
