public class VendingMachineImpl implements VendingMachine{

    int amount;
    int notes[];

    public VendingMachineImpl() { }

    public VendingMachineImpl(int amount,int notes[]) {
        this.amount = amount;
        this.notes=notes;
    }

    @Override
    public int[] countNotes(int amount) {
        int countNotes[]=new int[9];
        for(int i=0;i<notes.length;i++){
            if(amount>=notes[i])
            {
                countNotes[i]=amount/notes[i];
                amount=amount%notes[i];
                countNotes(amount);
            }
        }
        return countNotes;
    }
}