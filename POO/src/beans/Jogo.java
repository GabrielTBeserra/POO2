package beans;

import java.util.Date;
import java.util.Map;

public class Jogo {
	private Map<String, Integer> time1;
	private Map<String, Integer> time2;
	private Date horario;

	public Map<String, Integer> getTime1() {
		return time1;
	}

	public void setTime1(Map<String, Integer> time1) {
		this.time1 = time1;
	}

	public Map<String, Integer> getTime2() {
		return time2;
	}

	public void setTime2(Map<String, Integer> time2) {
		this.time2 = time2;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

}
