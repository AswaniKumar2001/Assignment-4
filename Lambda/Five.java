package Lambda;

import java.util.*;

public class Five {
    public void sortList(){
        List<String> strings=new ArrayList<>();
        System.out.println("Enter the length of the string");
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        for(int i=0;i<len;i++){
            strings.add(scanner.next());
        }
        strings.sort((str1, str2) -> str1.compareTo(str2));

        System.out.println("Sorted List: " + strings);
    }
    public static void main(String[] args){
        Five Five=new Five();
        Five.sortList();
    }
}
