package util;

/**
 * Cook
 */
public class Cook {

    public static void dagingPublic(){
        System.out.println("Alghibrany: Memasak: public");
    }

    private static void dagingPrivate(){
        System.out.println("Alghibrany: Memasak: private");
    }

    static void dagingDefault(){
        System.out.println("Alghibrany: Memasak: default");
    }

    protected static void dagingProtected(){
        System.out.println("Alghibrany: Memasak: protected");
    }
}