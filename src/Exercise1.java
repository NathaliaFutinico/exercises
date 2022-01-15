import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        int choose = Month(12);
        System.out.println("El mes tiene "+choose+" días");
    }
    public static int Month(int month){
        int x;
        List<Integer> months31 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        List<Integer> months30 = new ArrayList<>(Arrays.asList(4,6,9,11));
        if(months31.contains(month)){
            x=31;
        }else if(months30.contains(month)){
            x=30;
        }else if(month==2){
            x=28;
        }else{
            x=0;
        }
        return  x;
    }
}
