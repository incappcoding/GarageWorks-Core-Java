package gui;
public class Validation {
    public static void digitOnly(java.awt.event.KeyEvent evt){
        // only digit allowed
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }
    public static void alphabetOnly(java.awt.event.KeyEvent evt){
        // only digit allowed
        char c=evt.getKeyChar();
        if(!Character.isAlphabetic(c) && c!=' '){
            evt.consume();
        }
    }
}
