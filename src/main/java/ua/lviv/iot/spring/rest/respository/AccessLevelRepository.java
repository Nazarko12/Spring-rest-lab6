package ua.lviv.iot.spring.rest.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.rest.domain.implementation.AccessLevel;

;

@Repository
public interface AccessLevelRepository extends JpaRepository<AccessLevel, Integer> {
}
