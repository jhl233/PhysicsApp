
package backend;

/**
 *
 * @author Alex + Aiden
 */
public class AnswerParser {

    public AnswerParser() {
    }
    
    public void questionType(String questionType, String realAnswer, String answers) {
        switch (questionType) {
            case "MC":
                checkMultipleChoice(realAnswer, answers);
                break;
            case "SA":
                checkMultipleChoice(realAnswer, answers);
                break;
            case "FB":
                checkMultipleChoice(realAnswer, answers);
            default:
                System.out.println("Error =<^.^>=");
                break;
        }
    }
    
    public boolean checkMultipleChoice(String realAnswer, String answers) {
        boolean answerIsCorrect = answers.equals(realAnswer);
        if (answerIsCorrect)
            System.out.println("Correct! Yay! <>< (<––– Fish)");
        else
            System.out.println("WRONG! TRY AGAIN STUPID! D:<");
        return answerIsCorrect;
    }
    
    public boolean checkShortAnswer() {
        return false; //SEND TO GUY BRO
        
    }
}