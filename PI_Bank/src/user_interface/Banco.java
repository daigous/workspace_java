package user_interface;

import model.Conta;
import model.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		Conta c = new Conta("Professor Isidro", "123.456.789-00", 1234);
		ContaEspecial e = new ContaEspecial("Nicolas", "987.654.321-00",9876,200);
		c.creditar(100);
		e.creditar(100);
		
		System.out.println(c.getNomeTitular()+"/"+c.getCpf()+"/"+c.getNumeroConta()+" R$ "+c.getSaldo());
		System.out.println(e.getNomeTitular()+"/"+e.getCpf()+"/"+e.getNumeroConta()+" R$ "+c.getSaldo()+" Limite R$ "+e.getLimite());
		
		System.out.println("");
		
		System.out.println("Manipulando conta normal:");
		if (c.debitar(145)) {
			System.out.println("Saque efetuado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(c.getNomeTitular()+"/"+c.getCpf()+"/"+c.getNumeroConta()+" R$ "+c.getSaldo());
		
		System.out.println("");
		
		System.out.println("Manipulando conta Especial:");
		if (e.debitar(145)) {
			System.out.println("Saque efetuado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(e.getNomeTitular()+"/"+e.getCpf()+"/"+e.getNumeroConta()+" R$ "+e.getSaldo());
	}

}
