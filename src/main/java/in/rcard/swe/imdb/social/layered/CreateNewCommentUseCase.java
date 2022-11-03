package in.rcard.swe.imdb.social.layered;

import java.util.Optional;

public interface CreateNewCommentUseCase {
  Optional<Comment> createComment(Comment comment);
}
