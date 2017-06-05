import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Engineer on 6/5/2017.
 */
public class DynamicArray {
    public static void Solution(String [] args){

        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int bigq=in.nextInt();
        in.nextLine();
        int lastAnswer=0;
        List<List<Integer>>seqList=new ArrayList<>(n);//initiate size of the bigger list to n, for
        //n sequences
        /*
        don't know how to create a list of lists, if I create a 2 dimensional array, I will have trouble
        appending things to different sized arrays
         */
        for (int i=0;i<bigq;i++){
            int q=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            in.nextLine();
            int index=((x^lastAnswer)%n);
            List seq=seqList.get(index);
            if(q==1){
                seq.add(y);
            }
            else{
                lastAnswer=(y%seq.size());
                System.out.print(System.lineSeparator());
                System.out.print(lastAnswer);
            }
        }
    }
}
