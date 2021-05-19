package com.jack.huncho.Trivia.repository;

import com.jack.huncho.Trivia.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Long> {
}
