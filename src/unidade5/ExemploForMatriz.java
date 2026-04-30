package unidade5;

public class ExemploForMatriz {
    public static void main(String[] args) {
        for(int x=0; x<=2; x++){
            if(x==0){
                System.out.print(" _ _ _");
                System.out.println("");
            }
            for(int y=0; y<=2; y++){
                if(y==0){
                System.out.print("|");
            }
                System.out.print("_");
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
