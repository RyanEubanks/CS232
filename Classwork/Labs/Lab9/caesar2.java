package Classwork.Labs.Lab9;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

public class caesar2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int numLines = in.read();
        String words;
        
        while(numLines > 0) {
            
            if(list.contains("the")) {
                int encryptShift = in.read();
                String line = sc.readLine();
                for(String word : line.split(" ")) {
                    list.add(word);
                    //list.add(" ");
                }

                for(int i = 0; i < list.size(); i++) {
                String shiftedWords = "";
                char letter;
                for(int k = 0; k < list.get(i).length(); k++) {
                    if(Character.isWhitespace(list.get(i).charAt(k))) {
                        list.add(i," ");
                        i++;
                    }
                    if((int)list.get(i).charAt(k) - encryptShift < 97) {
                        letter = (char) (list.get(i).charAt(k) - (encryptShift - 26));
                    }
                    else {
                        letter = (char) (list.get(i).charAt(k) - encryptShift);
                    }
                    shiftedWords += letter;
                    letter = 0;
                }
                list.set(i, shiftedWords);

                }
                for(String word : list) {
                    System.out.print(word + " ");
                    
                }
                System.out.println();

            }
            else {
                int decryptShift = in.read();
                String line = sc.readLine();
                for(String word : line.split(" ")) {
                    list.add(word);
                }

                for(int i = 0; i < list.size(); i++) {
                    String shiftedWords = "";
                    char letter;
                    for(int k = 0; k < list.get(i).length(); k++) {
                        if(Character.isWhitespace(list.get(i).charAt(k))) {
                            list.add(" ");
                            i++;
                        }
                        if((int)list.get(i).charAt(k) + decryptShift > 122) {
                            letter = (char) (list.get(i).charAt(k) + (decryptShift - 26));
                        }
                        else {
                            letter = (char) (list.get(i).charAt(k) + decryptShift);
                        }
                        shiftedWords += letter;
                        letter = 0;
                    }
                    list.set(i, shiftedWords);
                }
                for(String word : list) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            numLines--;
            list.clear();
        }
        in.close();
        sc.close();
        
        
    }
}
