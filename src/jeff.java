
public class jeff {
String jeffAngerName;
String jeffAngerLevel;
public jeff(String anger,String level){
	jeffAngerLevel=level;
	jeffAngerName=anger;
}
void action(){
	int intAnger=Integer.parseInt(jeffAngerLevel);
	if(intAnger>=5){
	System.out.println(jeffAngerName+" says im mad dude");
	}else{
		System.out.println(jeffAngerName+" says im glad dude");
	}
}

	

}
