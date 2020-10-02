
public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int h, int m, int s) {
		hora = h;
		minuto = m;
		segundo = s;
	}
	
	private String formataNumero(int num) {
		if (num < 10) {
			return "0"+num;
		}
		else {
			return String.valueOf(num);
		}
	}
	
	public String exibirHoraUniversal() {
		return (formataNumero(hora)+":"+formataNumero(minuto)+":"+formataNumero(segundo));
	}
	public String exibirHoraPadrao() {
		if (hora >= 1 && hora <= 11) {
			return (formataNumero(hora)+":"+formataNumero(minuto)+":"+formataNumero(segundo)+" AM");
		}
		else if (hora >= 13 && hora <= 23) {
			hora = hora - 12;
			return (formataNumero(hora)+":"+formataNumero(minuto)+":"+formataNumero(segundo)+" PM");
		}
		else if (hora == 0) {
			hora = 12;
			return (formataNumero(hora)+":"+formataNumero(minuto)+":"+formataNumero(segundo)+" AM");
		}
		else {
			return (hora+":"+minuto+":"+segundo+" PM");
		}
	}
}
