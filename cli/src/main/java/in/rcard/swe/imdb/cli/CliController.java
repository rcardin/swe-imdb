package in.rcard.swe.imdb.cli;

public class CliController implements Observer {
  
  private Cli cli;
  private final Comments comments;
  
  public CliController(Cli cli, Comments comments) {
    this.cli = cli;
    this.comments = comments;
  }
  
  @Override
  public void update() {
  
  }
}
