public class CLAQn4 {
    public static int fact(int n){
        int f = 0;
        if(n >= 0){
            f = 1;
            for(int i = 1; i <= n ; i++){
                f *= i;
            }
        }
        return f;

    }

    public static void main(String[] args) {
        if(args.length == 1){
            int n = Integer.parseInt(args[0]);
            System.out.println(fact(n));

        }
        else if(args.length == 2){
            int n = (Integer.parseInt(args[0]) - Integer.parseInt(args[1]) >= 0 ? Integer.parseInt(args[0])-Integer.parseInt(args[1]) : Integer.parseInt(args[1])-Integer.parseInt(args[0]) );
            System.out.println(fact(n));

        }
        else if(args.length > 2) System.out.println("Invalid Entry");

        else System.out.println(" No Command Line Args");
    }
}
