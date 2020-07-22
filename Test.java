对于字符串x和y, 如果擦除x中的某些字母(有可能全擦掉或者都不擦)能够得到y,我们就称y是x的子序列。例如."ncd"是"nowcoder"的子序列,而"xt"不是。
现在对于给定的一个字符串s,请计算出字典序最大的s的子序列。

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            StringBuilder sb=new StringBuilder();
            int i=str.length()-1;
            int j=i;
            while(i>=0&&j>=0){
                char c1=str.charAt(i);
                char c2=str.charAt(j);
                if(c1>=c2){
                    sb.append(c1);
                    j=i;
                }
                i--;
            }
            System.out.println(sb.reverse());
        }
    }
}