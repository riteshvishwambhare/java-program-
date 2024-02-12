public class array1 {
    public static void main(String[] args) {
        // find out whether a given integer is present in an array or not.
        int [] marks = {20,30,40,50,60};
        int num = 30;
        boolean isInArray = false;
        for (int element:marks) {
            if(num==element)
            {
                isInArray = true;
                break;
            }
        }
            if(isInArray){
                System.out.println("the value present in array");
            }
            else{
                System.out.println("the value do not present in array");
            }
        
    }
}
