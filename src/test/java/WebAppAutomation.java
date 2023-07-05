import java.security.CodeSigner;

public class WebAppAutomation {
    static Methodlar mt= new Methodlar();
    static Constants cs=new Constants();

    public static void main(String[] args) {
        mt.gotoURL(cs.URL);
        mt.click_byXpath();
    }
}
