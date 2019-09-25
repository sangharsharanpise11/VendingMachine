import java.util.Scanner;

public class VendingMachineApplication {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter The Amount: ");
//        int amount = scanner.nextInt();

        Note note=new Note();
        VendingMachineImpl vendingMachine = new VendingMachineImpl(5600,note.getNotes());

        int totalNotes[]=vendingMachine.countNotes(5600);
        int noOfNotes=0;
        for(int i=0;i<totalNotes.length;i++)
        {
            if(totalNotes[i]>0)
            {
                System.out.println(totalNotes[i]+" notes of "+note.getNotes()[i]);
                noOfNotes = noOfNotes + totalNotes[i];
            }
        }
    }
}