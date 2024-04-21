import java.util.Scanner;

class Tring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        // Decides the number of nodes forming the ring
        

        for (int i = 0; i < n; i++)
            System.out.print(" " + i);
        System.out.println(" " + 0);
        int ch=0;
        int sender=0,receiver=0;
            do{
                System.out.print("Enter sender: ");
                sender = sc.nextInt();
                System.out.print("Enter receiver: ");
                receiver = sc.nextInt();
                System.out.print("Enter Data To Send : ");
                int data = sc.nextInt();

                System.out.print("Token Passing :");
                 //current token not equal to sender, increment i by 1 and j by j+1%n
                int token = 0;
                for (int i = token;i<sender;i++){
                    System.out.print("  "+ i +"->");
                }
                System.out.println(" "+sender);
                System.out.println("Sender "+sender+" Sending data : "+data);
                for (int i = token; i!= receiver; i= (i+1)%n )
                {
                    System.out.println("Data "+ data +" Forwarded by "+i);
                }
                System.out.println("Receiver "+receiver+" Receiving The data : "+data+"\n");
                token= sender;
                System.out.println("Do you want to send data again ? enter 1 for yes  and  0  for  no : ");
                ch = sc.nextInt(); 

               
            } while (ch==1);
       
    }

}