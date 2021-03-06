package ru.sber.photodata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.sber.photodata.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Modifying
    @Transactional
    @Query("delete from User u where u.id=:id")
    int delete(@Param("id") long id);

    List<User> findAllByOrderByNameAsc();
}
