package padraosingleton;

public class Tokens {

	static private Tokens instance = null;

	private Tokens() {
	}

	static Tokens getInstance() {

		if (instance == null) {

			instance = new Tokens();
		}

		return instance;
	}
}
