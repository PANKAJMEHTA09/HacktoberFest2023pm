import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ch[] = new char[st.length()];
        for(int i=0;i<ch.length;i++){
            ch[i] = st.charAt(i);
        }
        togglearray(ch);
        for(int i = 0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }

    public static void togglearray(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char) (ch[i] + 32);
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }

    }

}
