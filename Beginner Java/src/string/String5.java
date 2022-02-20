
package string;

public class String5 {
    public static void main(String[] args) {
        String s1 = "Anisul";
        StringBuffer in = new StringBuffer(s1);
        System.out.println(in);
        in.append("Islam");
        in.append(25);
        System.out.println(in);
        in.delete(0,5);
        System.out.println();
        in.setLength(5);
        System.out.println(in);
        
    }
}
