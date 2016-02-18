import java.util.ArrayList;

public class Category {
  private static ArrayList<Category> instances = new ArrayList<Category>();
  private ArrayList<Task> mTasks;
  private String mName;
  private int mId;

  public Category(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mTasks = new ArrayList<Task>();
  }

  public String getName() {
    return mName;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Category> all() {
    return instances;
  }

  public ArrayList<Task> getTasks() {
    return mTasks;
  }

  public void addTask(Task task) {
    mTasks.add(task);
  }

  public static void clear() {
    instances.clear();
  }

  public static Category find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
