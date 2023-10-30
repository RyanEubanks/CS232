package Classwork.Labs.Lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BadPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String[] nums = new String[2];
        HashMap<String, Character> map = new HashMap<>();

        String Line = in.nextLine();
        nums = Line.split(" ");
        
        int numRhymeLines = Integer.parseInt(nums[0]);
        int totalLines = Integer.parseInt(nums[1]) + 1;
        
        int counter = 65;
        boolean need = true;
        while(numRhymeLines > 0) {
            String line = in.nextLine();
            if(need == true) {
                in.nextLine();
                need = false;
            }

            for(String word : line.split(" ")) {
                map.put(word, (char)counter);
                
            }
            counter++;
            numRhymeLines--;
        }
        String letter = "Y";
        while(totalLines - 1 > 0) {
            list.clear();
            String poemLine = in.nextLine();
            boolean foundRhymeWord = false;
            for(String word : poemLine.split(" ")) {
                list.add(word);
                
            }
            for(int i = 0; i < list.size(); i++) {
                if(map.containsKey(list.get(i))) {
                    System.out.print(map.get(list.get(i))); 
                    foundRhymeWord = true;
                }
                
            }
            if(!foundRhymeWord) {
                System.out.print("X");
            }
            
            totalLines--;
        }

    }
}
