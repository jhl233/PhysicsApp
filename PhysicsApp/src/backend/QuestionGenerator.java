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
    
    private static HashMap<String, String> questions;
    
    private static String questionNumber;
    
    public QuestionGenerator(HashMap<String,String>questions)
    {
        QuestionGenerator.questions=questions;
        
        
    }
    
    
    
    public static String getTypeOfQuestion(){
        return questions.get(questionNumber).substring(2,4);
    } 
    
    public static String getQuestion(){
        return questions.get(questionNumber).substring(2,(questions.get(questionNumber)).length());
    }
    
    public static void setQuestionNumber(){
        questionNumber = "Q" + (int) (Math.random() * questions.size());
    }
    
    public static String getQuestionNumber(){
        return questionNumber;
    }
    
    public static String setDifficulty(){
        return questions.get(questionNumber).substring(0,(questions.get(questionNumber)).length());
    }
    
    public static int getDifficulty(){
        String difficulty = setDifficulty();
        if(null != difficulty)switch (difficulty) {
            case "1":
                return 1;
// 1 = easy
            case "2":
                return 2;
// 2 = medium
            default:
                return 3;
// 3 = hard
        }
        return 0;
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