import javax.swing.plaf.synth.SynthOptionPaneUI;

public class classroom {
   
        public static boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            int rem=0;
            int curr=x;
            int rev=0;
            while(x!=0){
                rem=x%10;
                rev=rev*10+rem;
                x=x/10;
            }
            return  rev==curr;

        }
        public static void main(String[] args) {
            int x=-121;
           int   y=23;
           int sum = x+y;
        //    SynthOptionPaneUI
           System.out.println(sum);
          System.out.println(  isPalindrome(x));
        }
       
    }
    

