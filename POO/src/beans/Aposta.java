package beans;

public class Aposta {
	private String time;
	private String nomeTime1;
	private String nomeTime2;
	private int placar1;
	private int placar2;
	private Jogo jogo;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public String getNomeTime1() {
		return nomeTime1;
	}

	public void setNomeTime1(String nomeTime1) {
		this.nomeTime1 = nomeTime1;
	}

	public String getNomeTime2() {
		return nomeTime2;
	}

	public void setNomeTime2(String nomeTime2) {
		this.nomeTime2 = nomeTime2;
	}

	public int getPlacar1() {
		return placar1;
	}

	public void setPlacar1(int placar1) {
		this.placar1 = placar1;
	}

	public int getPlacar2() {
		return placar2;
	}

	public void setPlacar2(int placar2) {
		this.placar2 = placar2;
	}

}
