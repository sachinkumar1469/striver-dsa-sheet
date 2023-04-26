import java.util.ArrayList;
import java.util.List;

public class Q_28_PascalTriangle {
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    ls.add(1);
                }else{
                    ls.add(list.get(list.size()-1).get(j-1)+list.get(list.size()-1).get(j));
                }
            }
            list.add(ls);
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for(List<Integer> ls:list){
            System.out.println(ls.toString());
        }
    }
}
