package View;

import java.util.Arrays;
import Controler.teste;

public class Principal {
    public static void main(String[] args) {
        teste t = new teste();
        int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
        t.sort(vetor, 0, vetor.length - 1);
        System.out.println(Arrays.toString(vetor));            
    }
}
