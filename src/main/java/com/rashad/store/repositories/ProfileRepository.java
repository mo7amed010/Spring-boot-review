package com.rashad.store.repositories;

import com.rashad.store.dtos.UserSummary;
import com.rashad.store.entities.Profile;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}