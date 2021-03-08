package ProjetoVacina;

public abstract class Pessoas {
	private  String primeiroNome;
	private  String meioNome;
	private  String ultimoNome;
	private  String zonaCidade;
	private  String dataNasc;
	private  int anoNasc;
	private  int idade;


	// construtores para os dados mais relevantes
	public  Pessoas ( String  pNome , String  mNome , String  uNome , String  zCidade , String  dNasc , int  aNasc , int  idade ) {

		setPrimeiroNome (pNome);
		setMeioNome (mNome);
		setUltimoNome (uNome);
		setZonaCidade (zCidade);
		setDataNasc (dNasc);
		setAnoNasc (aNasc);
		setIdade (idade);

	}
		
	
	public  PESSOAS () {
		
	}
	
	// m�todo para cadastrar a pessoa
	public  void  cadastrarPessoa ();

	
	public  String  getPrimeiroNome () {
		return primeiroNome;
	}

	public  void  setPrimeiroNome ( String  primeiroNome ) {
		this. primeiroNome = primeiroNome;
	}

	public  String  getMeioNome () {
		return meioNome;
	}

	public  void  setMeioNome ( String  meioNome ) {
		this . meioNome = meioNome;
	}

	public  String  getUltimoNome () {
		return ultimoNome;
	}

	public  void  setUltimoNome ( String  ultimoNome ) {
		this. ultimoNome = ultimoNome;
	}

	public  String  getZonaCidade () {
		return zonaCidade;
	}

	public  void  setZonaCidade ( String  zonaCidade ) {
		this . zonaCidade = zonaCidade;
	}

	public  String  getDataNasc () {
		return dataNasc;
	}

	public  void  setDataNasc ( String  dataNasc ) {
		this . dataNasc = dataNasc;
	}

	public  int  getAnoNasc () {
		return anoNasc;
	}

	public  void  setAnoNasc ( int  anoNasc ) {
		this. anoNasc = anoNasc;
	}

	public  int  getIdade () {
		return idade;
	}

	public  void  setIdade ( int  idade ) {
		this. idade = idade;
	}


	public Vacina() {
			
			this.infoLaboratorio();
			this.segundaDose();
			this.prioridades();
	
		}
	
		public void printVacina() {
	
		}
	
		public void infoLaboratorio() { // Tipos de Laboratorio e vacinas
	
			System.out.println("\n----- Vacinas Dispon�veis -----\n-AstraZeneca/Oxford - Funda��o Oswaldo Cruz (Fiocruz)"
					+ "\n-Coronavac/Sinovac - Funda��o Butantan");
	
		}
	
		public void prioridades() { // Mostrar a idade para restricao
	
			System.out.println(
					"\n----- Grupos Priorit�rios -----\n-Pessoas com 60 anos ou mais residentes em institui��es de longa perman�ncia"
							+ "\n-Pessoas com 18 anos ou mais com defici�ncia\n-Popula��o ind�gena vivendo em terras ind�genas\n-Quilombolas"
							+ "\n-Idosos com 77anos ou mais\n-Profissionais de sa�de com 55 anos ou mais\n-Pessoas em situa��o de rua com 60 anos ou mais"
							+ "\n-Profissonais Sepultadores, Velorista, Cremadores e Condutores de Ve�culos \ndos cemit�rio p�blico e privados do munic�pio de S�o Paulo"
							+ "\n-Trabalhadores dos servi�os p�blico: CDI, SEAS, Centros de Acolhida Adulto e POP RUA.\n\n\n\n\n\n\n\n\n\n\n\n");
	
		}
	
		public void segundaDose() { // Mostrar as Segundas Doses
	
			System.out.println("\n----- Dados da segunda dose -----\n-Coranavac:"
					+ "\n\nO intervalo entre a primeira e a segunda deve ser de 14 a 28 dias \npara aplica��o da segunda dose."
					+ "\n\n-AstraZeneca: \nA segunda dose deve ser admistrada 12 semanas ap�s a primeira.");
	
		}

}
