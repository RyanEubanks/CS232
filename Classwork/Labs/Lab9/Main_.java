package Classwork.Labs.Lab9;
import java.util.*;
public class Main_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int numLines = in.nextInt();
        int shift = in.nextInt();
        
        while(numLines > 0) {
            String line = sc.nextLine();
            char[] arr = line.toCharArray();
            String[] newArr = new String[arr.length];

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == ' ') {
                    newArr[i] = " ";
                    i++;
                }

                if(arr[i] > 'z') {
                    char newValue = (char) (((int)arr[i] - 26) + shift);
                    newArr[i] = "" + newValue;
                }
                else {
                    char newValue2 = (char) (((int)arr[i] + shift - 26));
                    newArr[i] = "" + newValue2;
                }

                System.out.print(newArr[i]);
            }

        }

    }
}

//qbspbz jhlzhy olsk aol vmmpjl vm wvuapmle theptbz wypvy av iljvtpun kpjahavy