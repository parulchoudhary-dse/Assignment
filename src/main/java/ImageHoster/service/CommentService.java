package ImageHoster.service;


import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void uploadComment(Comment comment) {
        commentRepository.addComment(comment);
    }

    public List<Comment> getAllComments(Image image) {
        return commentRepository.getAllComments(image);
    }
}
