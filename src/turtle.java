
public class turtle {
	private String name;
	private int age;
	private int funLevel;
	private static int population;
 public turtle(String name, int age, int funLevel){
	 this.name=name;
	 this.age=age;
	 this.funLevel=funLevel;
	 population++;
	 
 }
 void setAge(int age){
	 this.age=age;
 }
 void setName(String name){
	 this.name=name;
 }
 int getAge(){
	 return this.age;
 }
 String getName(){
	 return this.name;
 }
 static int getPop(){
	 return population;
 }
}
