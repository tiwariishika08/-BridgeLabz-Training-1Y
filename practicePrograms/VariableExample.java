Class VariableExample// class keyword with class name 
{
int id=10; // ------Instance variable 
String name ="Ishika" // ------Instance variable 
int rollno;
static age=19; // static variable 
void display() // Method 
{ 
string status ="Active"; // local variable 
System.out.println("Status: "+status); // printing statement 
}
public static void main (string args[]) // main method
{ 
VariableExample var= new VariableEamples();
var.display(); // non static method so we have to create object 
var.rollno=36; // instance variable access using object 
System.out.println(age);
}