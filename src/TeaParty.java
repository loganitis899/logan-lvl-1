
public class TeaParty {
	TeaParty jane = new TeaParty();
	TeaParty george = new TeaParty();
	TeaParty isaac = new TeaParty();
	
	public static void main(String[] args) {
		TeaParty run = new TeaParty();
		run.run();
		
	
	}
public String welcome(String lastName, boolean isWoman, boolean isKnighted){
	
if(isWoman==true){
		return "hello Mrs. " + lastName;
	} else{
		if(isKnighted==true){
			return "hello Sir. " + lastName;
		}else{
			return "hello Mr. " + lastName;
		}
	}

}
public void run(){
	jane.welcome("Austen", true, false);
	george.welcome("Orwell", false, false);
	isaac.welcome("Newton", false, true);
	}
}
    
       
    


