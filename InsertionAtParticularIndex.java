package Array_Codes_in_java;
public class InsertionAtParticularIndex {
    public static void main(String[] args) {
        int intArray[]={1,2,3,4};
        int position=2;
        int newValue=8;
        int[] newArray= new int[intArray.length+1];
        for(int i=0; i<position; i++){
            newArray[i]= intArray[i];
        }
        newArray[position]=newValue;
        for(int i=position;i<intArray.length;i++){
            newArray[i+1]=intArray[i];
        }
        for(int num: newArray){
            System.out.println(num+"");
        }
    }
}
