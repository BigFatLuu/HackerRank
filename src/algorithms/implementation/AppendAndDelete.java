package algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int operations = 0;
        int l = s.length();
        if(s.length()+t.length()<=k){
            System.out.print("Yes");
            return;
        }
        if (s.length() > t.length()){
            operations+= s.length()-t.length();
            l= t.length();
        }else if(s.length() < t.length()){
            operations+= t.length()-s.length();
        }
        for (int i=0; i < l ; i++){
            if (s.charAt(i)!= t.charAt(i)){
                operations +=(l-(i))*2;
                break;
            }
        }
        if(operations > k){
            System.out.print ("No");
        }else if ((k-operations)%2!=0){
            System.out.print ("No");
        }else{
            System.out.println ("Yes");
        }
    }
}
