package entities;

public class Studant {
	public String name;
	public double note = 0;
	public String situation;
	
	public void verifySituation(double n) {
		note += n;
		
	}
	
	public String position() {
		if(note >= 60) {
			return situation = "FINAL GRADE= "+note+ "\nPASS";
		}else {
			return situation ="FINAL GRADE= "+note+ "\nFAILED! \nMISSING "+(60 - note)+" POINTS";
			
		}
		
	}

}
