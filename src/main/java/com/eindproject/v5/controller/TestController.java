package com.eindproject.v5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public static String sayHello() {
        return "Hello again";
    }

    @GetMapping("/lena")
    public static String sayLena() {
        return "Hi Lena, ready?";
    }

    @GetMapping("/info")
    public static String getInfo() {
        return "This is where the info will be";
    }

    private static String[] questions = {
            "Q1",
            "Q2"
    };

    private static String[] answers = {
            "A1",
            "A2"
    };

    @GetMapping("/questions") //collection
    public String getQuestions() {
        return "Frequently asked questions";
    }

//    @GetMapping("/questions/1") //item
//    public String getQuestion() {
////        return "Question 1";
//        return questions[0];
//    }

//    @GetMapping("/questions/1/answer") //document
//    public String getAnswer() {
////        return "Answer to question 1";
//        return answers[0];
//    }

    @GetMapping("/questions/{nr}")
    public String getQuestionByNr(@PathVariable int nr) {
        return questions[nr - 1];
    }

    @GetMapping("/questions/{nr}/answer")
    public String getAnswerByNr(@PathVariable int nr) {
        return answers[nr];
    }

    @PostMapping("/questions")
    public void addQuestion() {
        //add question
    }
}
