public class SoNguyenTo {
    public static void main(String[] args) {
        int number =2;
        while (number<100) {
            if (Prime(number)) {
                System.out.println(number);
            }
            number=number+1;
        }

    }

    private static  boolean Prime(int number) {
        if (number<2){
            return false;
        }else {
            for (int i =2 ; i <Math.sqrt(number);i++){
                if (number%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
