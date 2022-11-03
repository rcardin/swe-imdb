package in.rcard.swe.imdb.social;

import java.util.Optional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CreateNewCommentController {
  
  private final CreateNewCommentUseCase useCase;
  
  public CreateNewCommentController(CreateNewCommentUseCase useCase) {
    this.useCase = useCase;
  }
  
  @PostMapping
  public Optional<Comment> createComment(@RequestBody Comment newComment) {
    
    if (!StringUtils.hasText(newComment.getText())) {
      throw new IllegalArgumentException("The text of a comment cannot be empty");
    }
    
    return useCase.createComment(newComment);
  }
}
