package in.rcard.swe.imdb.cli;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CliController implements Observer {
  
  private final Cli cli;
  private final Comments comments;
  
  private final ObjectMapper objectMapper;
  
  public CliController(Cli cli, Comments comments, ObjectMapper objectMapper) {
    this.cli = cli;
    this.comments = comments;
    this.objectMapper = objectMapper;
  }
  
  @Override
  public void update() {
    final String commentAsJson = cli.getCommentAsJson();
    try {
      final Comment comment = objectMapper.readValue(commentAsJson, Comment.class);
      comments.addComment(comment);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
