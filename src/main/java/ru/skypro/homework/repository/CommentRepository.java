package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.entity.Comment;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findCommentsByAd_Pk(Integer pk);

    Optional<Comment> findCommentByAd_PkAndPk(Integer adId, Integer id);

    void deleteCommentByAd_PkAndPk(Integer adId, Integer id);
}
