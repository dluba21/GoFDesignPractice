package patterns.structuralPatterns.facade;

public class VideoDAOImpl implements VideoDAO {
    @Override
    public void save(String filename) {
        System.out.println("Video '" + filename + "' saved to database of remote cloud service");
    }
}
