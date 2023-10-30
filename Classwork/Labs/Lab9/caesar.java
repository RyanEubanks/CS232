package Classwork.Labs.Lab9;
import java.util.*;
public class caesar  {
    public static void main(String[] args) throws NoSuchElementException {
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        int numLines = in.nextInt();

        while(numLines > 0) {
            list.clear();
            int shift = in.nextInt();
            String line = sc.nextLine();
            for(String word : line.split(" ")) {
                    list.add(word);
                    //list.add(" ");
            }
        
            
            if(list.contains("the")) {
                /*int encryptShift = in.nextInt();
                String line = in.nextLine();
                for(String word : line.split(" ")) {
                    list.add(word);
                    //list.add(" ");
                }*/

                for(int i = 0; i < list.size(); i++) {
                String shiftedWords = "";
                char letter;
                for(int k = 0; k < list.get(i).length(); k++) {
                    /*if(Character.isWhitespace(list.get(i).charAt(k))) {
                        list.add(i," ");
                        i++;
                    }*/
                    if((int)list.get(i).charAt(k) - shift < 97) {
                        letter = (char) (list.get(i).charAt(k) - (shift - 26));
                    }
                    else {
                        letter = (char) (list.get(i).charAt(k) - shift);
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
                list.clear();

            } else {
                //int decryptShift = in.nextInt();
                //String line2 = sc.nextLine();
                /*for(String word : line.split(" ")) {
                    list.add(word);
                }*/

                for(int i = 0; i < list.size(); i++) {
                    String shiftedWords = "";
                    char letter;
                    for(int k = 0; k < list.get(i).length(); k++) {
                        /*if(Character.isWhitespace(list.get(i).charAt(k))) {
                            list.add(" ");
                            i++;
                        }*/
                        if((int)list.get(i).charAt(k) + shift > 122) {
                            letter = (char) (list.get(i).charAt(k) + (shift - 26));
                        }
                        else {
                            letter = (char) (list.get(i).charAt(k) + shift);
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
                list.clear();
            }
            numLines--;
            list.clear();
        }
        in.close();
        sc.close();
        
        
    }
}
//qbspbz jhlzhy olsk aol vmmpjl vm wvuapmle theptbz wypvy av iljvtpun kpjahavy