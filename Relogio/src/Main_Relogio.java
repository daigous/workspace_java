
public class Main_Relogio {
	public static void main(String[] args) {
		
		Relogio time;
		
		time = new Relogio();
		
		time.setTime(14, 14, 58);
		System.out.println("Hora Universal:");
		System.out.println(time.exibirHoraUniversal());
		System.out.println("Hora Padrão:");
		System.out.println(time.exibirHoraPadrao());
		System.out.println("-------------------------");
		time.setTime(2, 14, 58);
		System.out.println("Hora Universal:");
		System.out.println(time.exibirHoraUniversal());
		System.out.println("Hora Padrão:");
		System.out.println(time.exibirHoraPadrao());
		System.out.println("-------------------------");
		time.setTime(12, 14, 58);
		System.out.println("Hora Universal:");
		System.out.println(time.exibirHoraUniversal());
		System.out.println("Hora Padrão:");
		System.out.println(time.exibirHoraPadrao());
		System.out.println("-------------------------");
		time.setTime(0, 14, 58);
		System.out.println("Hora Universal:");
		System.out.println(time.exibirHoraUniversal());
		System.out.println("Hora Padrão:");
		System.out.println(time.exibirHoraPadrao());
		System.out.println("-------------------------");
	}
}
