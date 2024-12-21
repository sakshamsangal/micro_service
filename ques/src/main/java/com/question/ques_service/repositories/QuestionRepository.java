package com.question.ques_service.repositories;

import com.question.ques_service.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    List<Question> findByQuizId(Long quizId);
}
