package Stack;

public class DynamicStackImplementation extends ImplementationStack{

    public DynamicStackImplementation(){
        super(); // Calls the constructor in the parent class that does not take any arguments
    }

    public DynamicStackImplementation(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        //takes care of the array being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous items in new data
            for(int i = 0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);

    }
}
