package checkspeed;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
public class CheckSpeed {  
    static void shuffleArray(String[] array){
        Random rnd = new Random();
        for(int i=array.length-1; i>0;i--){
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner ask = new Scanner(System.in);
        Random rand = new Random();
        int index;
        
        String[] words = {"the","quick","brown","fox","jumps","over","the","lazy","dog"};
        
        System.out.println("Testing your Typing Speed");
        System.out.println("*************************");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Test begins in:");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\t3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\t2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\t1");
        TimeUnit.SECONDS.sleep(1);
        
        shuffleArray(words);
        
        for (String word : words) {
            System.out.print(word + " ");
        }
        double start = LocalTime.now().toNanoOfDay();
        System.out.println("");
        
        String typed = ask.nextLine();
        
        double end = LocalTime.now().toNanoOfDay();
        double timetaken = end - start;
        timetaken = timetaken/1000000000.0;
        
        int Chars = typed.length();
        int wpm = (int)((((double)Chars/5)/timetaken)*60);
        
        System.out.println("Your Typing Speed is "+ wpm + "WPM");
    }

}