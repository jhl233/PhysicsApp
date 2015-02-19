
package backend;
import java.util.HashMap;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dharvey2016
 */
public class AnswerParser {
    
    private final HashMap<String, String> answers;
    
    
    public AnswerParser(HashMap<String, String> answers) {
        this.answers=answers;
    }
    
    public void questionType(int questionNumber, String questionType) {
        switch (questionType) {
            case "MC":
                checkMultipleChoice(questionNumber);
                break;
            case "SA":
                checkShortAnswer(questionNumber);
                break;
            default:
                System.out.println("Error =<^.^>=");
                break;
        }
    }
    
    public String getAnswer(int questionNumber) {
        return answers.get("A" + questionNumber); 
    }
    
    public boolean checkMultipleChoice(int questionNumber) {
        String answer = getAnswer(questionNumber);
        boolean answerIsCorrect = false;
        if (answer.equals("A")) {
// GET USERS ANSWER BRO                
         
        }
        return false;
       
                
    
    }
    
    public boolean checkShortAnswer(int questionNumber) {
        return false;
        
    }
}
