import java.util.*;

public class utah_anagram {

    public static void main(String[] args) {
        
        Hashtable<String, String> solutionHT = new Hashtable<String, String>();
        Hashtable<String, String> rejectHT = new Hashtable<String, String>();
       try{
            Scanner sc = new Scanner(System.in);
            String strNum = sc.nextLine();
            String[]arrStr = strNum.split(" ");
            int n = Integer.parseInt(arrStr[0]);
           // int k = Integer.parseInt(arrStr[1]);
            for(int i=0; i<n; i++){
                String  str = sc.nextLine();
                char lowChar[] =str.toCharArray();
                Arrays.sort(lowChar);
                String newStr = new String(lowChar);
  
            if (solutionHT.containsKey(newStr)) {
              solutionHT.remove(newStr, newStr);
              rejectHT.put(newStr, newStr);
            }
            if (!(rejectHT.containsKey(newStr))) {
             solutionHT.put(newStr, newStr);
            }   
     
        }
         sc.close();
        System.out.println(solutionHT.size());
       }
       catch (Exception e){
      e.printStackTrace();
    }
        
    }
}
