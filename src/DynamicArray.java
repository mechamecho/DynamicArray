import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class DynamicArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int bigq=in.nextInt();
        int lastAnswer=0;
        ArrayList<Integer>[] seqList = new ArrayList[n];

        for (int i=0;i<n;i++){
            seqList[i]=new ArrayList<Integer>();

        }



        for (int i=0;i<bigq;i++){
            int q=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();

            int index=((x^lastAnswer)%n);
            ArrayList<Integer> seq=seqList[index];

            if(q==1){

                seq.add(y);
            }
            else{
                lastAnswer=(seq.get(y%(seq.size())));
                System.out.print(System.lineSeparator()+lastAnswer);

            }


        }
    }
}