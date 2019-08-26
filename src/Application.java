public class Application {

    public static void main(String... args){

        CALCoder coder = new CALCoder();
        coder.addCodeCheckerListener(new IndentChecker());
        coder.addCodeCheckerListener(new VariableNotatoinChecker());

        coder.writeCode("gcodeSumma:=1;");
        coder.writeCode("gcodeSumma := 1;");
        coder.writeCode("amount := 1;");

    }

}
