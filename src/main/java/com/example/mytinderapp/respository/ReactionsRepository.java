package com.example.newtinderproject.respository;

import com.example.newtinderproject.model.Reactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionsRepository extends JpaRepository<Reactions, Long> {
}
