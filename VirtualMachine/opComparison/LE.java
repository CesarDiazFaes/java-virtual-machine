package tp.pr5.mv.opComparison;

import tp.pr5.mv.instruction.Instruction;
import tp.pr5.mv.operationTypes.Comparison;

public class LE extends Comparison{
	
	protected boolean calculate(int a, int b) {
		return b <= a;
	}
	
	public Instruction parse(String line) {
		String[] words = line.split(" ");
				
		if (words.length == 1){
			if (words[0].equalsIgnoreCase("LE"))
				return new LE();
		}
		
		return null;
	}

	public String toString() {
		return "LE";
	}
}
