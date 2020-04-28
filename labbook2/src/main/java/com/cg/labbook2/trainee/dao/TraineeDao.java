package com.cg.labbook2.trainee.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.labbook2.trainee.entity.Trainee;

@Transactional
@Repository
public interface TraineeDao extends JpaRepository<Trainee, Integer> {


}
