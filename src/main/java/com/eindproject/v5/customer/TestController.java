//package com.eindproject.v5.customer;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class TestController {
//
//    @GetMapping("/lena")
//    public static String sayLena() {
//        return "Hi Lena, ready?";
//    }
//
//    @GetMapping("/info")
//    public static String getInfo() {
//        return "This is where the info will be";
//    }
//
//    @GetMapping("/")
//    public String sayName(@RequestParam(required = false) String name) {
//        if(name == null) {
//            return "Hello!";
//        } else {
//            return "Hello " + name;
//        }
//    }
//
//    private static String[] questions = {
//            "Q1",
//            "Q2"
//    };
//
//    private static String[] answers = {
//            "A1",
//            "A2"
//    };
//
//    @GetMapping("/questions") //collection
//    public String getQuestions() {
//        return "Frequently asked questions";
//    }
//
//    @GetMapping("/questions/{nr}")
//    public String getQuestionByNr(@PathVariable int nr) {
//        return questions[nr - 1];
//    }
//
//    @GetMapping("/questions/{nr}/answer")
//    public String getAnswerByNr(@PathVariable int nr) {
//        return answers[nr - 1];
//    }
//
//    @PostMapping("/questions")
//    public void addQuestion() {
//        //add question
//    }
//}
