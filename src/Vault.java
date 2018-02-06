
public class Vault {
	private int code;
 public Vault(int code) {
this.code=code;
 }
 
	
	public static void main(String[] args) {
		Vault chest = new Vault(1234);
		Vault cheest = new Vault(1000000000);
		Bond bond = new Bond();
		System.out.println(bond.findCode(cheest));
		
	}
	public boolean tryCode(int guess) {
		if(guess==code) {
			return true;
		} else {
			return false;
		}
	}
	
	}

