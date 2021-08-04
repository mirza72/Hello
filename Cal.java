import java.util.Scanner;
class Cal
{
public static void main(String args[])
{
String yn;
do
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
float no1=s.nextInt();
System.out.println("enter another number");
float no2=s.nextInt();
System.out.println("Select Symbol(+,-,*,/)");
String sym=s.next();
float res;
switch(sym)
{
case "+": res=no1+no2;
System.out.println("Addition is : "+res);
break;
case "-": res=no1-no2;
System.out.println("Substraction is:"+res);
break;
case "*": res=no1*no2;
System.out.println("Multiplication is:"+res);
break;
case "/": res=no1/no2;
System.out.println("Division is:"+res);
break;
default :
System.out.println("invalid Symbol");
break;
}
System.out.println("Do u want to continue(press y for Yes and n for No)");
yn=s.next();
}while(yn.equals("y") || yn.equals("Y"));
}
}