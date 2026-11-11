package Strings;

public class Performances {
    public static void main(String[] args) {
        String series ="";
        for(int i=0;i<26;i++){
            char ch= (char)('a'+i);
            //char ch= (char)("a"+i); //Error string cant be converted into char this way
            System.out.println(ch);
            series=series+ch;
        }
        System.out.println(series);
//note if one of the datatype is string ans will be string
    }
}
