package unidade5;

public class exemploWhile {
    public static void main(String[] args) {
        boolean hojeEhQuarta = true;
        while(hojeEhQuarta){
            System.out.println("Hello Wolrd!");
            hojeEhQuarta = false;


            int x=1;
            while(x<10){
                System.out.println("Valor de x:" + x);
                x++;
            }

                   int a, b, q;
                    a = 1;
                    q = 4;
                    b = 0;
                    for (int contador = a; contador < q; contador++) {
                            a = a * (-q);
                            b = b + contador - 1;
                    }
                    q = (-q - 1) * (-1);
                    System.out.println(a);
                    System.out.println(q);
                    System.out.println(b);;
        }
    }  


}
