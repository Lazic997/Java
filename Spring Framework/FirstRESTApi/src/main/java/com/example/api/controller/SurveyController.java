package com.example.api.controller;

import java.util.List;

import com.example.api.model.Question;
import com.example.api.service.SurveyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //oznacavam da je ova klasa moj Rest Controller
public class SurveyController {
    
    @Autowired //koristim inpendency injenction metodu, Spring ce napraviti AutoWire s beanom SurveyService
    private SurveyService service;


    //koristnim @PathVariable zato sto u putanju za koju saljem HTTP request moram poslati i dinamicki dio
    //putanje(kao sto su {surveyId} ili {questionID} (dinamicki znaci promjenjivi, univerzalni)) kako bih dobio
    //pravilni i trazeni request

    //path: /surveys/{surveyId}/questions GET HTTP
    @GetMapping("/surveys/{surveyId}/questions")
    public List<Question> retrieveQuestionsforSurvey(@PathVariable String surveyId){ //ovo je naziv metode za ovu klasu Controllera
        return service.retrieveQuestions(surveyId); //misli se na pozivanje metode iz SurveyService klase
    }

    //path: /surveys/{surveyId}/questions/{questionId} GET HTTP
    @GetMapping("/surveys/{surveyId}/questions/{questionId}")
    public Question retrieveQuestionforSurvey(@PathVariable String surveyId, @PathVariable String questionId){ //ovo je naziv metode za ovu klasu Controllera
        return service.retrieveQuestion(surveyId, questionId); //misli se na pozivanje metode iz SurveyService klase
    }
}
