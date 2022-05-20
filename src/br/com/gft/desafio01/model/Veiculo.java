package br.com.gft.desafio01.model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;

	public Veiculo() {

	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + ", km=" + km
				+ ", isLigado=" + isLigado + ", litrosCombustivel=" + litrosCombustivel + ", velocidade=" + velocidade
				+ ", preco=" + preco + "]";
	}

	public void acelerar() {
		if (isLigado == true) {
			velocidade += 20;
			System.out.println("Acelerando..." + getVelocidade() + " Km/h");
		} else {
			System.out.println("Veiculo desligado");
		}

	}

	public void abastecer(int combustivel) {
		if (litrosCombustivel < 60) {
			int x = 60 - litrosCombustivel;
			if (combustivel <= x) {
				litrosCombustivel += combustivel;
				System.out.println("Adicionado + " + combustivel + " de combustivel...");
			} else {
				litrosCombustivel += x;
				System.out.println("Adicionado + " + x + " tanque cheio!");
			}

		} else {
			System.out.println("Tanque cheio!");
		}

	}

	public void frear() {
		velocidade -= 20;
		if (velocidade < 0)
			velocidade = 0;
		System.out.println("freando..");
	}

	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("Pintado de: " + getCor());
	}

	public void ligar() {
		if (isLigado == false) {
			isLigado = true;
			System.out.println("Ligando...");
		} else {
			System.out.println("O veiculo ja esta ligado!");
		}

	}

	public void desligar() {
		if(isLigado == true && velocidade <=0) {
			isLigado = false;
			System.out.println("Desligando...");
			velocidade = 0;
		}else if (velocidade > 0){
			System.out.println("Veiculo em movimento...");
		}else {
			System.out.println("Veiculo ja esta desligado...");
		}

	}

}
