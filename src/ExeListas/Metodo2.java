package ExeListas;

public class Metodo2 {
	
	public boolean checkBrackets(Stack s1) throws UnderflowException{
		if(s1.isEmpty())
			throw new UnderflowException();
		
		int esquerda = 0;
		int direita = 0;
		
		/*for(int i = s1.numElements(); i >= 0; i--){
			if(s1.top().equals('('))
				esquerda++;
			if(s1.top().equals(')'))
					direita++;
			s1.pop();
		}*/
		return checkBrackets(s1, esquerda, direita);
	}
	private boolean checkBrackets(Stack s1, int esquerda, int direita){
		if(s1.numElements() >= 0){
			if(s1.top().equals('(')){
				esquerda++;
				s1.pop();
				return checkBrackets(s1, esquerda, direita);
			}
				
			if(s1.top().equals(')')){
				direita++;
				s1.pop();
				return checkBrackets(s1, esquerda, direita);
			}
			s1.pop();
			return checkBrackets(s1, esquerda, direita);
		}
		
		if(esquerda % direita == 0)
			return true;
			else
				return false;
	}
}
