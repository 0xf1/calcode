public class VariableNotatoinChecker implements CALCodeChecker {

    @Override
    public void checkCode(String code) {
        if (code.startsWith("gcode"))
            System.out.println("GCODE detected!");
        else
            System.out.println("Variable naming ok");
    }
}
