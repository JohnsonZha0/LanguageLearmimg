public class Pyramid_Of_Numbers{
    private static int Number = 5;
    public static void main(String[] args) {
        char[][] chars = new char[Number][Number * 2 - 1];
        for (int i = 0; i < Number; i++) {
            for (int j = 0; j < Number; j++) {
                if (i + j > Number - 2) {
                    chars[i][j] = (char) ((i + j + 2 - Number +48)*2-1-48);3
                } else
                    chars[i][j] = ' ';
            }
        }
        for(int i=0;i<Number;i++){
            for(int j=Number;j<2*Number-1;j++){
                chars[i][j]=chars[i][2*Number-2-j];
            }
        }
        for(int i=0;i<Number;i++){
            for(int j=0;j<2*Number-1;j++){
                System.out.print(chars[i][j]+"\t");
            }
            System.out.println();
        }
    }
}