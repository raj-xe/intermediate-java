package day4;

public class Rev {
    static String reverse(String str) {
//        Step 3:
        if(str.length() <= 1){
            return str;
        }

//        Step 1:
        char last = str.charAt(str.length() - 1);
        String rev_of_rest_of_the_string = reverse(str.substring(0,str.length()-1));

//        Step 2:
        return last + rev_of_rest_of_the_string;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
