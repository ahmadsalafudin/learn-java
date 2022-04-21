import util.Cook;

public class App {
    public static void main(String[] args) {
        //   public, private, default, dan protected
        // dengan access modifier public, dapat diakses
        OtherClass.methodPublic();
        
        // dengan access modifier private, tidak dapat diakses
        //OtherClass.methodPrivate();
        
        // karena ada dalam package yang sama, maka dapat diakses
        OtherClass.methodDefault();
        
        // karena ada dalam package yang sama, maka dapat diakses
        OtherClass.methodProtected();
        
        
        Cook.dagingPublic();
        // Cook.dagingPrivate(); tidak bisa
        // Cook.dagingDefault(); tidak bisa
        // Cook.dagingProtected(); tidak bisa
        
            }
        
        }
        
