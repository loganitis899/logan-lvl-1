
public class TeaParty {
	
	
	
		
	
	
public String welcome(String lastName, boolean isWoman, boolean isKnighted){
	
if(isWoman&&!isKnighted){
		return "Hello Ms. " + lastName;
	}else if(!isWoman&&!isKnighted){
			return "Hello Mr. " + lastName;
		} else {
				return "Hello Sir " + lastName;
		}
	}
}


    
       
    


