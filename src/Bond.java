
public class Bond {

 public int findCode(Vault vaultname) {
	 for(int i=0; i<1000001; i++) {
		if(vaultname.tryCode(i)) {
			
			
			return i;
		
		}
	 } return -1;
 }
}


