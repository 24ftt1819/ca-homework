public class P8_1 {
    public static void main(String[] args) {
        char [] letter = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0, j = 25; i <= 25; i++, j--){
            System.out.print(letter[i] + " ");
            System.out.print(letter[j] + " ");
        }
    }
}
