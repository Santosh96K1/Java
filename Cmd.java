public class Cmd
{
public static void main(String args[])
{
 int count =0;
for(int i=0;i<args.length;i++)
{
System.out.println(i+":"+args[i]);
if(args[i].equals("Santosh"))
{
System.out.println("it is present");
count++;

}

}
System.out.println(count++);

}
}


