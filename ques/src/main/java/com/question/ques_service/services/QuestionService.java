package com.question.ques_service.services;

import com.question.ques_service.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);
    List<Question> get();
    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
