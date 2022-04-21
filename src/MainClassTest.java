import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();
        if (a == 14) {
            System.out.println("True");
        } else {
            System.out.println("Value is not 14");

        }

    }

}
