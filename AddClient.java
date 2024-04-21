import java.rmi.*;
import java.util.*;
public class AddClient {
public static void main(String args[]) { 
    Scanner s = new Scanner(System.in);
try {
// Get reference to the remote object
String addServerURL = "rmi://localhost/AddServer"; 
AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);
System.out.println("Enter The first number is: "); 
double d1 = s.nextDouble();
System.out.println("Enter The second number is: " );
double d2 = s.nextDouble();
// Invoke remote method to add numbers
System.out.println("The sum is: " + addServerIntf.add(d1, d2));
} 
catch (Exception e) { System.out.println("Exception: "+ e);
}}}
