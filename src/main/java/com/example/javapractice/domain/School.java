import java.util.HashMap;
import java.util.Map;

class School {
  private String name;
  private Map<String, ClassRoom> classes;리

  public Map<String, ClassRoom> getClasses() {
    return this.classes;
  }

  public String getName() {
    return this.name;
  }

  public School(String name) {
    this.name = name;
    this.classes = new HashMap<>();
  }

  public void getAllClass() {
    System.out.println(this.classes.keySet());
  }

  public void putClassRoom(String className, ClassRoom classroom) {
    this.classes.put(className, classroom);
  }
}