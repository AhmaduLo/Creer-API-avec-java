package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Inscrit;

public interface InscritRepository extends JpaRepository<Inscrit, Long> {

}
