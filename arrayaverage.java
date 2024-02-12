public class arrayaverage {
    public static void main(String[] args) {
        //calculate avg marks frp, am array using for each loop
       float [] marks ={39.5f,45.8f,67.6f,45.5f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the value of avg marks is" +sum/ marks.length);   
            
        }
    }

