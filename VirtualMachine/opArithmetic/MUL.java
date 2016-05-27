package tp.pr5.mv.opArithmetic;

import tp.pr5.mv.instruction.Instruction;
import tp.pr5.mv.operationTypes.Arithmetic;

public class MUL extends Arithmetic{
	
	protected int calculate(int a, int b) {
		return a * b;
	}
	
	public Instruction parse(String line) {
		String[] words = line.split(" ");
				
		if (words.length == 1){
			if (words[0].equalsIgnoreCase("MUL"))
				return new MUL();
		}
		
		return null;
	}
	
	public String toString(){
		return "MUL";
	}
}
