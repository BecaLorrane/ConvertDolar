package entities;

public class Dolar {
	public double cotacaoDolar;
	public double reais;

	public double conversao() {
		return ((cotacaoDolar * 6 / 100) * reais) + cotacaoDolar * reais;
	}
}
