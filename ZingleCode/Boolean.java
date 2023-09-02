package ZingleCode;
public class Boolean {
    public static void main(String[] args) {
        boolean isUsernameCorrect = false;
        boolean isPasswordCorrect = true;
        System.out.println(isPasswordCorrect && isUsernameCorrect); //มีตัวใดตัวนึงเป็นเท็จ ค่าที่ได้ก็จะเป็นเท็จ
        System.out.println(isPasswordCorrect || isUsernameCorrect); //มีตัวใดตัวนึงเป็นจริง ค่าที่ได้ก็จะเป็นจริง
        System.out.println(isPasswordCorrect != isUsernameCorrect); //สลับค่ากัน
    }
}
