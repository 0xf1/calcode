public class IndentChecker implements CALCodeChecker {
    @Override
    public void checkCode(String code) {
        if (code.contains(":=1;"))
            System.out.println("Indent error");
        else
            System.out.println("Indent check pass");
    }
}
