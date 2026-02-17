class ConstructorDemo
{
	int id;
	String name ;
	int age ;
	//default constructor
	public ConstructorDemo()
	{
	System.out.println("constructor program");	
	}
	public ConstructorDemo(int id , String name , int age)
	{
	this.id = id;
	this.name = name;
	this.age = age ;
	}
	
	public static void main (String args[])
	{
		ConstructorDemo cd = new ConstructorDemo(1,"ishika",17);
			System.out.println(cd);	
	}
}