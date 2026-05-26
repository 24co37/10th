import java.io.FileWriter;
import java.util.Scanner;
public class Main{
public static void main(String args[]) throws Exception{
Scanner s=new Scanner(System.in);
int qid=s.nextInt();
s.nextLine();
String message=s.nextLine();
FileWriter fw=new FileWriter("message.txt");
fw.write(message);
fw.close();
System.out.println("Message Written to File");
}
}
