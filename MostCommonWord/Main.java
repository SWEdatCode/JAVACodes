//MostCommonWord in Java//
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Main {

public String mostCommonWord(String para, String[] banned){
  HashSet<String> set = new HashSet<>(Arrays.asList(banned));
  HashMap<String, Integer> map = new HashMap<>();
  String[] words = para.toLowerCase().split("[^a-zA-Z]+");

  for(String p : words){
    if("".equals(p)){
      continue;
    }
    if(!set.contains(p)) {
      if(map.containsKey(p)) {
        map.put(p, map.get(p) + 1);
      } else {
        map.put(p, 1);
      }
    }
    
  }
        int max= 0;
        String ans="";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
          if(entry.getValue() > max){
            max = entry.getValue();
            ans = entry.getKey();
          }
        }
                
        return ans;
        }
  public static void main(String args[])
    {
    String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = {"hit"};
    Main main = new Main();
    String mostCommonWord = main.mostCommonWord(para,banned);
    System.out.println(mostCommonWord);
    }  

}
