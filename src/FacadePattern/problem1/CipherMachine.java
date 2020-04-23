package FacadePattern.problem1;

public class CipherMachine {
    public String encrypt(String plainText){
        System.out.println("加密文件中......");
        String s ="",str;
        for(int i = 0; i < plainText.length(); i++){
            str = String.valueOf(plainText.charAt(i) % 7);
            s += str;
        }
        System.out.println("加密后的源文件是:"+s);
        return s;
    }
}
