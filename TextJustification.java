
import java.util.Scanner;

public class TextJustification {
     static int MAX_WIDTH;
     public static String[] fullJustify(String[] words, int maxWidth){
        String result[]=new String[15];
        int k=0;
        int n=words.length;
        MAX_WIDTH=maxWidth;
        for(int i=0;i<n;){

            int letterCount=words[i].length();
            int spaceSlots=0;
            int j=i+1;
           /* +1 is added to ensure space for at least one gap before the next word. 
            Without this, words like ["understand","understand"] with maxWidth = 20 
            would incorrectly fit, even though "understand understand" needs 21 chars.*/
            while (j < n && letterCount + spaceSlots + words[j].length()+1 <= maxWidth) {
                letterCount += words[j].length();
                spaceSlots++;
                j++;
            }

            int remainingSlots = maxWidth-letterCount;
            int eachWordSpace  =  spaceSlots == 0 ? 0 : remainingSlots / spaceSlots;
            int extraSpace    = spaceSlots == 0 ? 0 : remainingSlots % spaceSlots;

            if(j == n) { 
                eachWordSpace = 1;
                extraSpace    = 0;
            }

            result[k++]=getFinalWord(i,j,eachWordSpace,extraSpace,words);
            i=j;
        }
        return result;
    }
    private static String  getFinalWord(int i, int j, int eachWordSpace, int extraSpace, String[] words) {
        StringBuilder s = new StringBuilder();

        for(int k = i; k < j; k++) {
            s.append(words[k]);

            if(k == j-1)
                continue;

            for(int space = 0; space < eachWordSpace; space++)
                s.append(" ");

            if(extraSpace > 0) {
                s.append(" ");
                extraSpace--;
            }
        }
        /*Add spaces at the end so the line length becomes maxWidth.
        Example: word = "do", maxWidth = 20
         Result: "do                  " */ 
        while(s.length() < MAX_WIDTH) {
            s.append(" ");
        }
        
        return s.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many words: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String words[] = new String[n];

        // Input words
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " word: ");
            words[i] = sc.nextLine();
        }
         System.out.println("Enter maxWidth: ");
         int maxWidth = sc.nextInt();
         System.out.println("MaxWidth:-> "+maxWidth);
         String ans[]=fullJustify( words,  maxWidth);
         System.out.println("\nJustified Output:");
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != null)
                System.out.println("|" + ans[i] + "|");
        }
    }
}
