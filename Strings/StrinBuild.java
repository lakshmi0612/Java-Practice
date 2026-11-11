package Strings;

public class StrinBuild {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(17);
        System.out.println(builder);
        System.out.println(builder.reverse());
        builder.insert(0,'z');
        System.out.println(builder);


    }

}
