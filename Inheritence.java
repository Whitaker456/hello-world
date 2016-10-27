/* Example of extending sub classes
    from a base class */

class Person {

  String name;
  int age;
  String address;

  //Default Constructer
  /*
  public Person(){

  }*/
  //Overloading
  public Person(String Name, int Age){
    name = Name;
    age = Age;
  }

  public static void main(String[] args) {
      /*
      This code will not work with our custom Constructer

      Person bob = new Person(); //Missing required arguments
      bob.name = "Bob";
      bob.age = 20;
      */
      Person terry = new Person("Terry", 16);

      Teacher richardi = new Teacher("Richardi", 32, 2, "CTC");
      Student bill = new Student("Bill","address", 15, 3.5f, 2018);
      Student zach = new Student("Zach", "12 Diamond Street", 17, 3.2f, 2017);
      Teacher lamneck = new Teacher("Lamneck", 35, 7, "Math");
      Student tyler = new Student("Tyler", "address", 15, 2.7f, 2019);

      System.out.println("");
      System.out.println("                                            High School Transcipt");
      System.out.println("Student Information");
      System.out.println("Full Name: " + zach.name);
      System.out.println("Address: " + zach.address);
      System.out.println("Conway, NH 03813");
      System.out.println("Phone Number: 333-333-3333");
      System.out.println("Date of Birth: 12/01/1998");
      System.out.println("Parent/Guardian: Sheri Whitaker");
      System.out.println("");
      System.out.println("                                            Academic Record");
      System.out.println("--------------------------------------------------|--------------------------------------------------------------|");
      System.out.println("School Year: 2016-2017   Grade Level 12th         |School Year 2014-2014 Grade Level 10th                        |");
      System.out.println("                                                  |                                                              |");
      System.out.println("--------------------------------------------------|--------------------------------------------------------------|");
      System.out.println("                                                  |                                                              |");
      System.out.println("Course Title            Credit Earned|Final Grade |Course Title                         Credit Earned|Final Grade|");
      System.out.println("English                        1.0      A         |English                                     1.0      B        |");
      System.out.println("Math                           1.0      B         |Geometry                                    1.0      B        |");
      System.out.println("Science                        1.0      B         |Biology                                     1.0      C        |");
      System.out.println("American History               1.0      A         |Modern World                                1.0      A        |");
      System.out.println("Art                             .5      B         |German II CP                                1.0      A        |");
      System.out.println("Gym                             .5      A         |Gym                                         .5       A        |");
      System.out.println("Programming II                 2.0      A         |                                                              |");
      System.out.println("                                                  |                                                              |");
      System.out.println("--------------------------------------------------|--------------------------------------------------------------|");
      System.out.println("School Year 2015-2016    Grade Level 11th         |School Year 2013-2014 Grade Level 9th                         |");
      System.out.println("                                                  |                                                              |");
      System.out.println("--------------------------------------------------|--------------------------------------------------------------|");
      System.out.println("                                                  |                                                              |");
      System.out.println("Course Title            Credit Earned|Final Grade |Course Title                         Credit Earned|Final Grade|");
      System.out.println("English                        1.0      A         |Freshman English                            1.0      B        |");
      System.out.println("Math                           1.0      A         |Alejbra 1                                   1.0      B        |");
      System.out.println("Science                        1.0      B         |Physical Science                            1.0      B        |");
      System.out.println("Modern World                   1.0      B         |Health                                      .5       A        |");
      System.out.println("Programming I                  1.0      A         |Gym                                         .5       A        |");
      System.out.println("Gym                            1.0      A         |Art                                         .5       A        |");
      System.out.println("__________________________________________________|______________________________________________________________|");
      System.out.println("GPA = 3.3");

      System.out.println("");
      //System.out.println(bill.name +" is " + bill.age + " years old and has a GPA of " + bill.gpa + ".");
      //System.out.println(zach.name +" is " + zach.age + " years old and has a GPA of " + zach.gpa + ".");
      //System.out.println(lamneck.name +" is " + lamneck.age + " years old, he has been teaching for " + lamneck.yearsTeaching + " years " + "and he teaches " + lamneck.department + ".");
      //System.out.println(tyler.name +" is " + tyler.age + " years old and has a GPA of " + tyler.gpa + ".");
  }

}
//Inheriting name, age, address variables from Person
class Teacher extends Person {
  String department;
  int yearsTeaching;

  public Teacher(String Name, int Age){
    super(Name, Age);
  }
  public Teacher(String Name, int Age, int YearsTeaching, String Department){
    //Super MUST BE THE FIRST LINE or you will see a compiler error
    super(Name, Age);
    yearsTeaching = YearsTeaching;
    department = Department;

  }

}

class Student extends Person {
  float gpa;
  int yearOfGrad;
  String address;

  public Student(String Name, String Address, int Age, float Gpa, int YearofGrad){
    super(Name, Age);
    address = Address;
    gpa = Gpa;
    yearOfGrad = YearofGrad;
  }
}
