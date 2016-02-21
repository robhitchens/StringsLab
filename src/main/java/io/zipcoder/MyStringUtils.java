package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/21/16.
 */
public class MyStringUtils {

    public static String stringCombiner(String[] strings){
        StringBuilder strbuild = new StringBuilder();
        for(int i= 0; i< strings.length; i++){
            strbuild.append(strings[i]);
            if(i!=strings.length-1){
                strbuild.append(",");
            }
        }
        return strbuild.toString();
    }
    public static String stringCombiner(char[] characters){
        StringBuilder strbuild = new StringBuilder();
        for(int i= 0; i< characters.length; i++){
            strbuild.append(characters[i]);
            if(i!=characters.length-1){
                strbuild.append(",");
            }
        }
        return strbuild.toString();
    }

    public static String[] stringSeparator(String str){
        String[] result = str.split("\n");
        return result;
    }
    public static String reverseCapital(String str){
        char[] chrs = str.toCharArray();
        for(int i = 0; i<chrs.length;i++){
            if(Character.isUpperCase(chrs[i])) {
                chrs[i] =Character.toLowerCase(chrs[i]);
            }else if(Character.isLowerCase(chrs[i])) {
                chrs[i] = Character.toUpperCase(chrs[i]);
            }
        }
        return String.valueOf(chrs);
    }
    

}
