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
    
    private HashMap<String, String> questions;
    
    private String questionNumber;
    
    public QuestionGenerator(HashMap<String,String>questions)
    {
        this.questions=questions;
        
        
    }
    
    public String getTypeOfQuestion(){
        return questions.get(questionNumber).substring(0,2);
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
}
