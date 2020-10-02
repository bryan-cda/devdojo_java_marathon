package checked;

public class CheckedException extends Object{
    public String address = "Rua Campo Largo, 15";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class OtherClass {
protected String address = "X";
}

/**
 * Extends Exception
 * Checked
 */
class TestException{
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * @apiNote will return CloneNotSupportedException
         * CheckedExceptionClass don't implements Cloneable
         */
        CheckedException check = new CheckedException();
        OtherClass other = (OtherClass) check.clone();
    }
}