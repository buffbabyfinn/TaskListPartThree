import java.util.ArrayList;
import java.time.LocalDateTime;

public class Task {
  private static ArrayList<Task> instances = new ArrayList<Task>();

  private String mDescription;
  private LocalDateTime mCreatedAt;
  private boolean mCompleted;
  private int mId;

  public Task(String description) {
    mDescription = description;
    mCreatedAt = LocalDateTime.now();
    mCompleted = false;
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription(){
    return mDescription;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public int getId() {
    return mId;
  }
  public void completeTask() {
    mCompleted = true;
  }

  public static ArrayList<Task> all() {
    return instances;
  }

  public static Task find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e){
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}
