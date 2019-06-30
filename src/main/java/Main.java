import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public Set<Integer> toSet(Integer[] nums){
       return Arrays.stream(nums).map(t->t*2).filter(t->t>0).collect(Collectors.toSet());

    }

    public List<Integer> toList(Integer[] nums){
        return Arrays.stream(nums).map(t->t*2).filter(t->t>0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] nums = {0,1,-1,-2,3,4,-1,-6,4,2,6,1,2,5};
        Main main = new Main();
        Set<Integer> numSet = main.toSet(nums);
        System.out.println(numSet);
        List<Integer> numList = main.toList(nums);
        System.out.println(numList);

    }
}
