import java.util.Scanner; 

public class PreenchimentoDeVetor {

    public static void main(String[] args) { 
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

        for(int i = 0 ; i < 1000;) {
            for(int j = 0;j < t ;j++) {
                if(2 <= t && t <= 50 && i < 1000) {
                System.out.println("N[" + i + "] = "+ j);
                i++;
                }
            }
        }
    }
}