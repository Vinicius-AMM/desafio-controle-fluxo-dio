import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        sc.close();
    }

    static void contar(int parametroUM, int parametroDois)throws ParametrosInvalidosException{
        if (parametroUM > parametroDois){
            throw new ParametrosInvalidosException();
        } else{
            int contagem = parametroDois - parametroUM;
            for (int i=0; i < contagem; i++){
                System.out.println(i + 1);
            }
        }
    }
}