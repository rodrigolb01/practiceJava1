public class Employee {
  private String name;
  private Integer age;

  public Employee(String _name, Integer _age) {
    this.name = _name;
    this.age = _age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String toString() {
    return ("Name: " + this.name + "\nAge: " + this.age);
  }
}
