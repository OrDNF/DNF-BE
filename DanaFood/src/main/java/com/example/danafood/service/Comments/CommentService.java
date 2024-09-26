package com.example.danafood.service.Comments;

import com.example.danafood.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements ICommentService {
    @Autowired
    private ICommentRepo iCommentRepo;
}
