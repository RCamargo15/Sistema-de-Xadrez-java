package boardgame;

//classe para tratamento de erros
public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
		super(msg);
	}

	
}
