/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.HashMap;
/**
 *
 * @author dharvey2016
 */
public class QuestionGenerator {
    
    private final HashMap<String, String> questions;
    
    private String questionNumber;
    
    public QuestionGenerator(HashMap<String,String>questions)
    {
        this.questions=questions;
        
        
    }
    
    
    
    public String getTypeOfQuestion(){
        return questions.get(questionNumber).substring(2,4);
    } 
    
    public String getQuestion(){
        return questions.get(questionNumber).substring(2,(questions.get(questionNumber)).length());
    }
    
    public void setQuestionNumber(){
        questionNumber = "Q" + (int) (Math.random() * questions.size());
    }
    
    public String getQuestionNumber(){
        return questionNumber;
    }
    
    public String setDifficulty(){
        return questions.get(questionNumber).substring(0,(questions.get(questionNumber)).length());
    }
    
    public String getDifficulty(){
        String difficulty = setDifficulty();
        if(null != difficulty)switch (difficulty) {
            case "1":
                return "Easy";
            case "2":
                return "Medium";
            default:
                return "Hard";
        }
        return null;
    }
    
//    private String placeNumbers(){
//        String original = getQuestion();
//        double randomDouble = Math.random()* 5;
//        int randomNum = Math.floorDiv(randomDouble, 1);
//        for(int i = 0;i <= original.length();i++){
//            if(original.substring(i) == "#"){
//                String replaced = original.replace("#",String.valueOf(randomNum));
//            }
//        }
//        return replaced;
//    }
}