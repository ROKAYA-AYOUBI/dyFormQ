package com.quiz.qstbe;


import com.quiz.qstbe.model.Question;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
//@RequestMapping(path="/Question", produces="application/question")
@CrossOrigin(origins = "http://localhost:4200/")
public class RestJsonResponse {

    @GetMapping("/question")
    public ArrayList<Question> get() {

        ArrayList<Question> arr = new ArrayList<>();


        Question Question1 = new Question();
        Question1.setId("1");
        Question1.setLabel("Comment vous vous appelez?");
        Question1.setType("input");
        Question1.setValue("");

        arr.add(Question1);


        Question Question2 = new Question();
        Question2.setId("2");
        Question2.setLabel("Vous faites quoi dans la vie?");
        Question2.setType("input");
        Question2.setValue("");
        arr.add(Question2);


        Question Question3 = new Question();
        Question3.setId("3");
        Question3.setLabel("C'est quoi votre loisirs?");
        Question3.setType("input");
        Question3.setValue("");

        arr.add(Question3);
        return arr;
    }

}

