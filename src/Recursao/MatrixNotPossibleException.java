package Recursao;

public class MatrixNotPossibleException extends Exception{
	
	@Override
	public String getMessage() {
		return "Matriz nao e quadrada";
	}
}
