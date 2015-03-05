
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
                checkShortAnswer();
                break;
            case "FB":
                checkMultipleChoice(realAnswer, answers);
            default:
                System.out.println("Error =<^.^>=");
                break;
        }
    }
    
    public boolean checkMultipleChoice(String realAnswer, String answers) {
        boolean answerIsCorrect;
        if (answers.equals(realAnswer)) {
            System.out.println("Correct! Yay! <>< (<––– Fish)");
            answerIsCorrect = true;
        }
        else {
            System.out.println("WRONG! TRY AGAIN STUPID! D:<");
            answerIsCorrect = false;
// GET USERS ANSWER BRO
            
        }
        return answerIsCorrect;
    }
    
    public boolean checkShortAnswer() {
        return false; //SEND TO GUY BRO
        
    }
}