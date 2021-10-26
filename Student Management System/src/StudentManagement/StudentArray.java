package StudentManagement;

import java.util.*;

/**
 * StudentManagement
 * Created by lmduc
 * Date 23/10/2021 - 17:07
 * Description: ...
 */
public class StudentArray {
    private static ArrayList<Student> listStudent;

    /**
     * Default Constructor
     */
    public StudentArray() {
        listStudent = new ArrayList<Student>();
    }

    /**
     * Copy Constructor
     * @param students
     */
    public StudentArray(StudentArray students) {
        for(int i = 0; i < students.listStudent.size(); i++) {
            (listStudent.get(i)).setId((students.listStudent.get(i)).getId());
            (listStudent.get(i)).setName((students.listStudent.get(i)).getName());
            (listStudent.get(i)).setGpa((students.listStudent.get(i)).getGpa());
            (listStudent.get(i)).setImage((students.listStudent.get(i)).getImage());
            (listStudent.get(i)).setAddress((students.listStudent.get(i)).getAddress());
            (listStudent.get(i)).setNotes((students.listStudent.get(i)).getNotes());
        }
    }
    /**
     * Check if listStudent is Empty or not
     * @return True if listStudent is empty
     */
    public boolean isEmptyList() {
        return (listStudent.size() == 0);
    }

    /**
     * Check if Student's ID is unique or not
     * @param id
     * @return True if ID is already existed
     */
    public static boolean CheckUniqueID(final int id) {
        for (Student student : listStudent) {
            if (student.getId() == id)
                return true;
        }
        return false;
    }

    /**
     * Create new Student with unique ID
     * @return new Student
     */
    public static Student createStudent() {
        Student newStudent = new Student();
        String tmp = "";
        Scanner scan = new Scanner(System.in);

        // Set ID
        while (true) {
            System.out.print("Student ID         : ");
            tmp = scan.nextLine();
            if (CheckUserInput.isInteger(tmp)) {
                int id = Integer.parseInt(tmp);
                if (CheckUniqueID(id) == true) {
                    System.out.println("(!) This ID already existed");
                } else {
                    newStudent.setId(id);
                    break;
                }
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        // Set name
        while (true) {
            System.out.print("Student name       : ");
            tmp = scan.nextLine();
            if (tmp.length() != 0) {
                newStudent.setName(tmp);
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        // Set gpa
        while (true) {
            System.out.print("Student gpa      : ");
            tmp = scan.nextLine();
            if (CheckUserInput.isFloat(tmp)) {
                newStudent.setGpa(Float.parseFloat(tmp));
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        // Set image
        while (true) {
            System.out.print("Student image      : ");
            tmp = scan.nextLine();
            if (tmp.length() != 0) {
                newStudent.setImage(tmp);
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        // Set address
        while (true) {
            System.out.print("Student address    : ");
            tmp = scan.nextLine();
            if (tmp.length() != 0) {
                newStudent.setAddress(tmp);
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        // Set notes
        while (true) {
            System.out.print("Student notes: ");
            tmp = scan.nextLine();
            if (tmp.length() != 0) {
                newStudent.setNotes(tmp);
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        return newStudent;
    }

    /**
     * Add new Student
     */
    public void addStudent() {
        Student newStudent = createStudent();
        listStudent.add(newStudent);
        System.out.println("Add student successful");
    }

    /**
     * Update Student information
     */
    public void UpdateStudentInfo() {
        String tmp = "";
        int studentID = 0;
        Scanner scan = new Scanner(System.in);

        //Check user input
        while (true) {
            System.out.print("(?) Input student ID to update: ");
            tmp = scan.nextLine();

            if (CheckUserInput.isInteger(tmp)) {
                studentID = Integer.parseInt(tmp);
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        //Update Student info process
        if (CheckUniqueID(studentID) == true) {
            for(int i = 0; i < listStudent.size(); i++) {
                if((listStudent.get(i)).getId() == studentID) {
                    System.out.println("Update Student["+i+"] information:");

                    //Update ID
                    while (true) {
                        System.out.print("Update Student ID         : ");
                        tmp = scan.nextLine();
                        if (CheckUserInput.isInteger(tmp)) {
                            int id = Integer.parseInt(tmp);
                            if (StudentArray.CheckUniqueID(id) == true) {
                                System.out.println("(!) This ID already existed");
                            } else {
                                (listStudent.get(i)).setId(id);
                                break;
                            }
                        } else {
                            System.out.println("(!) Invalid input data");
                        }
                    }

                    // Update name
                    while (true) {
                        System.out.print("Update Student name       : ");
                        tmp = scan.nextLine();
                        if (tmp.length() != 0) {
                            (listStudent.get(i)).setName(tmp);
                            break;
                        } else {
                            System.out.println("(!) Invalid input data");
                        }
                    }

                    // Update gpa
                    while (true) {
                        System.out.print("Update Student gpa      : ");
                        tmp = scan.nextLine();
                        if (CheckUserInput.isFloat(tmp)) {
                            (listStudent.get(i)).setGpa(Float.parseFloat(tmp));
                            break;
                        } else {
                            System.out.println("(!) Invalid input data");
                        }
                    }

                    // Update image
                    while (true) {
                        System.out.print("Update Student image      : ");
                        tmp = scan.nextLine();
                        if (tmp.length() != 0) {
                            (listStudent.get(i)).setImage(tmp);
                            break;
                        } else {
                            System.out.println("(!) Invalid input data");
                        }
                    }

                    // Update address
                    while (true) {
                        System.out.print("Update Student address    : ");
                        tmp = scan.nextLine();
                        if (tmp.length() != 0) {
                            (listStudent.get(i)).setAddress(tmp);
                            break;
                        } else {
                            System.out.println("(!) Invalid input data");
                        }
                    }

                    // Update notes
                    while (true) {
                        System.out.print("Update Student notes      : ");
                        tmp = scan.nextLine();
                        if (tmp.length() != 0) {
                            (listStudent.get(i)).setNotes(tmp);
                            break;
                        } else {
                            System.out.println("(!) Invalid input data");
                        }
                    }
                    break;
                }
            }
        } else {
            System.out.println("(i) Student ID does not exist");
        }
    }

    /**
     * Delete a Student
     */
    public void deleteStudent() {
        String tmp = "";
        int studentID = 0;
        Scanner scan = new Scanner(System.in);

        //Check user input
        while (true) {
            System.out.print("(?) Input Student ID to delete: ");
            tmp = scan.nextLine();

            if (CheckUserInput.isInteger(tmp)) {
                studentID = Integer.parseInt(tmp);
                break;
            }else {
                System.out.println("(!) Invalid input data");
            }
        }

        //Delete Student process
        if (CheckUniqueID(studentID) == true) {
            for(int i = 0; i < listStudent.size(); i++) {
                if((listStudent.get(i)).getId() == studentID)
                    listStudent.remove(i);

            }
            System.out.println("(i) Delete successful");
        } else {
            System.out.println("(i) Student ID does not exist");
        }
    }

    /**
     * Sort Student list ascending by ID
     * @param listStudent
     */
    public static void sortIdAscending(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student st1, final Student st2) {
                return Integer.compare(st1.getId(), st2.getId());
            }
        });
    }

    /**
     * Sort Student list ascending by gpa
     * @param listStudent
     */
    public static void sortGpaAscending(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student st1, final Student st2) {
                return Float.compare(st1.getGpa(), st2.getGpa());
            }
        });
    }

    /**
     * Sort Student list ascending by ID or GPA
     */
    public void sortStudentList() {
        System.out.println("#1. View Student list (Sort ascending by student ID).");
        System.out.println("#2. View Student list (Sort ascending by student gpa).");
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String tmp = "";

        //Check user input
        while (true) {
            System.out.print("Your choice : ");
            tmp = scan.nextLine();
            if (CheckUserInput.isInteger(tmp)) {
                choice = Integer.parseInt(tmp);
                break;
            }else {
                System.out.println("(!) Invalid input data");
            }
        }

        //Sort Student list process
        switch (choice) {
            case 1: {
                sortIdAscending(listStudent);
                break;
            }
            case 2: {
                sortGpaAscending(listStudent);
                break;
            }
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    /**
     * Show (print) Student list on console
     */
    public void showStudentList() {
        sortStudentList();
        if(listStudent.isEmpty())
            System.out.println("(!) Student list is currenly empty");

        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("Student No." + (i + 1));
            System.out.println(listStudent.get(i).toString());
        }
    }

    /**
     * Export Student list to text file (csv)
     */
    public void exportStudentList() {
        String file_path = "";
        Scanner scan = new Scanner(System.in);

        //Check user input
        while (true) {
            System.out.print("(?) Enter the file path: ");
            file_path = scan.nextLine();
            if (file_path.length() != 0) {
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        if (FileProccess.writeFile(listStudent, file_path)) {
            System.out.println("(i) Export successful");
        } else {
            System.out.println("(i) Export failed");
        }
    }

    /**
     * Import Student list from text file (csv)
     */
    public void importStudentList() {
        String file_path = "";
        Scanner scan = new Scanner(System.in);

        //Check user input
        while (true) {
            System.out.print("(?) Enter the file path: ");
            file_path = scan.nextLine();
            if (file_path.length() != 0) {
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        listStudent.clear();
        listStudent = FileProccess.readFile(file_path);

        if (listStudent.size() == 0) {
            System.out.println("(!) ERROR. Student list is currently empty");
        } else {
            System.out.println("(i) Import successful");
        }
    }

    /**
     * Save Student list to file(s)
     */
    public void SaveStudentList() {
        String file_path = "";
        Scanner scan = new Scanner(System.in);

        //Check user input
        while (true) {
            System.out.print("(?) Enter the file path: ");
            file_path = scan.nextLine();
            if (file_path.length() != 0) {
                break;
            } else {
                System.out.println("(!) Invalid input data");
            }
        }

        if (FileProccess.SaveFile(listStudent, file_path)) {
            System.out.println("(i) Save successful");
        } else {
            System.out.println("(i) Save failed");
        }
    }

    /**
     * Save Student list to database (file .csv)
     */
    public void SaveDB(String file_path) {
        FileProccess.writeFile(listStudent, file_path);
    }

    /**
     * Reaload Student list from database (file .csv)
     */
    public void ReloadFromDB(String file_path) {
        try {
        listStudent = FileProccess.readFile(file_path);
        } catch (Exception e) {
            System.out.println("(!) ERROR. Database is currently empty");
        }
    }
}
