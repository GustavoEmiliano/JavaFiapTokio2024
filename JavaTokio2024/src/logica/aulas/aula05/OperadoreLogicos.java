package logica.aulas.aula05;

public class OperadoreLogicos {

	public static void main(String[] args) {
		
		// LÓGICA E (&&)
		// EMAIL	SENHA	LOGIN
		// true		true	true
		// true		false	false
		// false	true	false
		// false	false	false
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		// LÓGICA OU (!!)
		// SOL NO DOM	JOGO BR		CHURRASCO
		// true			true		true
		// true			false		true
		// false		true		true
		// false		false		false
		
		boolean logicaOU = true || true;
		System.out.println(logicaOU);
		
		// OPERADOR DE NEGAÇÃO
		
		boolean negacao = !true;
		System.out.println(negacao);
		

	}

}
