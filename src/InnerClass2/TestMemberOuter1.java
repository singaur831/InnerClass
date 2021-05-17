package InnerClass2;

class TestMemberOuter1{  
	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);} //Data will be reflected here in the meanwhile. 
	 }  
	 public static void main(String args[]){  
	  TestMemberOuter1 obj=new TestMemberOuter1();  
	  TestMemberOuter1.Inner in=obj.new Inner();  //check out the data 
	  in.msg();  
	 }  
	}  
