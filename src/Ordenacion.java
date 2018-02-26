import java.util.Arrays;


public class Ordenacion {
    
    public static int[] ordenarDescendente (int num1, int num2, int num3){
        int[] ordenados = new int[3];

        if (num1 >= num2 && num1 >= num3) {
            ordenados[0] = num1;
            if (num2 >= num3) {
                ordenados[1] = num2;
                ordenados[2] = num3;
            } else {
                ordenados[1] = num3;
                ordenados[2] = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            ordenados[0] = num2;
            if (num1 >= num3) {
                ordenados[1] = num1;
                ordenados[2] = num3;
            } else {
                ordenados[1] = num3;
                ordenados[2] = num1;
            }
        } else {
            ordenados[0] = num3;
            if (num2 >= num1) {
                ordenados[1] = num2;
                ordenados[2] = num1;
            } else {
                ordenados[1] = num1;
                ordenados[2] = num2;
            }
        } 
        return ordenados;       
    }
    
}
