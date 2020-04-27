package firstclass;

public class VowelsOnly {
    public static void main(String[] args) {
        String myStr = "Java is fun";
        for (int index = 0 ; index < myStr.length() ; index++ ) { //myStr = 11
            if (myStr.charAt(index)=='a'|| myStr.charAt(index)=='e'||myStr.charAt(index)=='o' || myStr.charAt(index)=='i' || myStr.charAt(index)== 'u'){
                System.out.println(myStr.charAt(index));
            }

        }

    }
}
