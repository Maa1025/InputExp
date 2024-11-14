/*import java.util.Scanner;

public class InputExp {

    public static void main(String[] args) {

        String name;
        int age;
        String ID;
       Scanner no = new Scanner(System.in);
        
        // Reads a single line from the console
        // and stores into name variable
        System.out.print("Enter Your Name: ");
        name = no.nextLine();  
        
        // Reads an integer from the console
        // and stores into age variable
        System.out.print("Enter Your Age: ");
        age = no.nextInt();  
        
        // Consume the remaining newline
        no.nextLine();
        
        System.out.print("Enter Your StudentID: ");
        ID = no.nextLine();
        no.close();
        
        // Prints name, age, and ID to the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("StudentID: " + ID);
    }
}*/

/*import java.io.*;

public class InputExp{
    
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
        
        int mark;
        
        System.out.print("Enter Mark: ");
        mark = Integer.parseInt(stdin.readLine());
    }
}*/
/*import javax.swing.JOptionPane;
public class InputExp{
    public static void main (String[] args){
        String firstNumber;
        String secondNumber;
        int num1, num2,sum;
        
        firstNumber = JOptionPane.showInputDialog("Enter first integer");
        
        secondNumber = JOptionPane.showInputDialog("Enter second integer");
        
        num1 = Integer.parseInt(firstNumber);
        num2 = Integer.parseInt(secondNumber);
        sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The sum is "+sum, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}*/

