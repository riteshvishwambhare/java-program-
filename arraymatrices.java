public class arraymatrices {
    public static void main(String[] args) {
        //to add to matrices of size 2*3
        int [][] mat1={{3,4,5},{6,7,8}};
        int [][] mat2={{2,3,4},{5,6,7}};
        int [][] result = {{0,0,0},{0,0,0}};
        for(int i=0; i<mat1.length;i++){
            for(int j=0; j<mat1[i].length;j++){
                System.out.format("setting value of i%d and j%d \n" ,i,j);
                result [i][j]= mat1[i][j]+mat2[i][j];
             }
            }
             for(int i=0; i<mat1.length;i++){
                for(int j=0; j<mat1[i].length;j++){
                    System.out.print(result [i][j] +" ");
                    result [i][j]= mat1[i][j] + mat2[i][j];
             System.out.println("");
                }
            }
        }
    }
