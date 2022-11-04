package in.rcard.swe.imdb.social;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CreateNewCommentController {

  private final CreateNewCommentUseCase useCase;

  @Autowired
  public CreateNewCommentController(CreateNewCommentUseCase useCase) {
    this.useCase = useCase;
  }

  @PostMapping
  public Optional<Comment> createComment(@Valid @RequestBody NewComment newComment) {

    return useCase.createComment(newComment.toComment());
  }

  /**
   * We are using {@code javax.validation} to validate the input data and implement the application
   * logic. Note that it's better to have a dedicated type to represent the input data other than
   * the business type. We call the controller input type as <em>Data Transfer Object</em> (DTO).
   */
  public record NewComment(@NotBlank String text, @NotBlank String author) {
    private Comment toComment() {
      return new Comment(null, text, author, List.of());
    }
  }
}
