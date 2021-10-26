package StudentManagement;

import java.util.Scanner;

/**
 * StudentManagement
 * Created by lmduc
 * Date 23/10/2021 - 17:41
 * Description: ...
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        int reload = 0;
        Boolean exit = false;
        String tmp = "";

            System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM!");
            System.out.println("(?) Do you want to reload previous student list from database?");
            System.out.println("#1. Yes");
            System.out.println("#2. No. I want to create a new student list!");

            // Check user input
            while (true) {
                System.out.print("(?) Your choice: ");
                tmp = scan.nextLine();
                if (CheckUserInput.isInteger(tmp)) {
                    reload = Integer.parseInt(tmp);
                    break;
                } else {
                    System.out.println("(!) Invalid choice");
                }
            }

            switch (reload) {
                case 1: {
                    StudentArray stu = new StudentArray();
                    stu.ReloadFromDB("database.csv");
                    System.out.println("Reload successful!");
                    while (true) {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSTUDENT MANAGEMENT SYSTEM");
                        System.out.println("#1. Add student");
                        System.out.println("#2. Update student information");
                        System.out.println("#3. Delete a student");
                        System.out.println("#4. View student list (Sort by ID, Gpa)");
                        System.out.println("#5. Save student list into file(s)");
                        System.out.println("#6. Import student list from text file (csv)");
                        System.out.println("#7. Export student list to text file (csv)");
                        System.out.println("#8. Exit");

                        // Check user input
                        while (true) {
                            System.out.print("(?) Your choice: ");
                            tmp = scan.nextLine();
                            if (CheckUserInput.isInteger(tmp)) {
                                choice = Integer.parseInt(tmp);
                                break;
                            } else {
                                System.out.println("(!) Invalid scanner data");
                            }
                        }

                        // solve
                        switch (choice) {
                            case 1: {
                                stu.addStudent();
                                break;
                            }
                            case 2: {
                                stu.UpdateStudentInfo();
                                break;
                            }
                            case 3: {
                                stu.deleteStudent();
                                break;
                            }
                            case 4: {
                                stu.showStudentList();
                                break;
                            }
                            case 5: {
                                stu.SaveStudentList();
                                break;
                            }
                            case 6: {
                                stu.importStudentList();
                                break;
                            }
                            case 7: {
                                stu.exportStudentList();
                                break;
                            }
                            case 8: {
                                exit = true;
                                break;
                            }
                            default: {
                                System.out.println("Invalid choice");
                                break;
                            }
                        }

                        if (exit) {
                            stu.SaveDB("database.csv");
                            break;
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("Press enter to continue");

                        // pause console
                        while (tmp != null) {
                            if (tmp.isEmpty()) {
                                break;
                            } else if (scan.hasNextLine()) {
                                tmp = scan.nextLine();
                            } else {
                                tmp = null;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    StudentArray stu = new StudentArray();
                    while (true) {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSTUDENT MANAGEMENT SYSTEM");
                        System.out.println("#1. Add student");
                        System.out.println("#2. Update student information");
                        System.out.println("#3. Delete a student");
                        System.out.println("#4. View student list (Sort by ID, Gpa)");
                        System.out.println("#5. Save student list into file(s)");
                        System.out.println("#6. Import student list from text file (csv)");
                        System.out.println("#7. Export student list to text file (csv)");
                        System.out.println("#8. Exit");

                        // Check user input
                        while (true) {
                            System.out.print("(?) Your choice: ");
                            tmp = scan.nextLine();
                            if (CheckUserInput.isInteger(tmp)) {
                                choice = Integer.parseInt(tmp);
                                break;
                            } else {
                                System.out.println("(!) Invalid choice");
                            }
                        }

                        // solve
                        switch (choice) {
                            case 1: {
                                stu.addStudent();
                                break;
                            }
                            case 2: {
                                stu.UpdateStudentInfo();
                                break;
                            }
                            case 3: {
                                stu.deleteStudent();
                                break;
                            }
                            case 4: {
                                stu.showStudentList();
                                break;
                            }
                            case 5: {
                                stu.SaveStudentList();
                                break;
                            }
                            case 6: {
                                stu.importStudentList();
                                break;
                            }
                            case 7: {
                                stu.exportStudentList();
                                break;
                            }
                            case 8: {
                                exit = true;
                                break;
                            }
                            default: {
                                System.out.println("Invalid choice");
                                break;
                            }
                        }

                        if (exit) {
                            stu.SaveDB("database.csv");
                            break;
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("Press enter to continue");

                        // pause console
                        while (tmp != null) {
                            if (tmp.isEmpty()) {
                                break;
                            } else if (scan.hasNextLine()) {
                                tmp = scan.nextLine();
                            } else {
                                tmp = null;
                            }
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        System.out.println("-------------------------------------------------");
        System.out.println("---End program---");

    }
}

