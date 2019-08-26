import java.util.ArrayList;

public class CALCoder {

    private ArrayList<CALCodeChecker> checkers = new ArrayList<>();

    public void addCodeCheckerListener(CALCodeChecker checker){
        checkers.add(checker);
    }

    public void writeCode(String code){
        System.out.println("Checking code: " + code);
        for(CALCodeChecker checker: checkers)
            checker.checkCode(code);
    }


}
