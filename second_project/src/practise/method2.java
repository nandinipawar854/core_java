package practise;

public class method2 {

	public static void main(String[] args) {
		 
		java_uss first=new java_uss();
		first.name="nandini";
		first.age=21;
		first.gender='f';
		first.laptop="asus";
		
	     java_uss second=new java_uss();
	     second.name="ashu";
	     second.age=21;
	     second.gender='f';
	     second.laptop="asus";
	     
	     System.out.println("teacher:"+first.teacher);
	     System.out.println("name:"+first.name);
	     System.out.println("age:"+first.age);
	     System.out.println("gender:"+first.gender);
	      System.out.println("laptop:"+first.laptop);
	      
	      
	      first.teacher="mahi";
	      System.out.println("teacher:"+second.teacher);
	      System.out.println("name:"+ second.name);
	      System.out.println("age:"+second.age);
	      System.out.println("gender:"+second.gender);
	      System.out.println("laptop:"+second.laptop);
	      
	       first.study();
	       first.sleep();
	       first.travel();
	     

	}

}
 class java_uss
 {
	 static String teacher="mahesh";
	  String name ;
	  int age;
	  char gender;
	  String laptop;
	  
 
  
 public void study() { 
	 System.out.println("i am studying...");
	 
 }
  public void sleep() {
	  System.out.println(" i am sleeping...");
  }
  public void travel() {
	  System.out.println(" i am traveling...");
  }
 
		  
	 
 }
 
 