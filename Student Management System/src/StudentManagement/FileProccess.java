package StudentManagement;

import java.io.*;
import java.util.ArrayList;


/**
 * StudentManagement
 * Created by lmduc
 * Date 24/10/2021 - 15:57
 * Description: ...
 */
public class FileProccess {
    private static final String CSV_FILE_HEADER = "ID,Name,Gpa,Image,Address,Notes";

    /**
     * Read file text (csv)
     * @param file_path 
     * @return Student list read from file
     */
    public static ArrayList<Student> readFile(final String file_path) {
        Student tmp = new Student();
        ArrayList<Student> listStudent = new ArrayList<Student>();

        try {
            FileInputStream fileInputStream = new FileInputStream(file_path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // read .csv file header
            bufferedReader.readLine();
            String line = bufferedReader.readLine();

            while (line != null) {
                // split data
                String[] arr = line.split(",");
                if (arr.length == 6) {
                    tmp = new Student();

                    tmp.setId(Integer.parseInt(arr[0]));
                    tmp.setName(arr[1]);
                    tmp.setGpa(Float.parseFloat(arr[2]));
                    tmp.setImage(arr[3]);
                    tmp.setAddress(arr[4]);
                    tmp.setNotes(arr[5]);

                    listStudent.add(tmp);
                }

                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("#####ERROR#####");
            listStudent.clear();
        }

        return listStudent;
    }

    /**
     * Write student list to text file (csv)
     * @param list Student list
     * @param file_path
     * @return True if write file successful
     */
    public static boolean writeFile(final ArrayList<Student> list, final String file_path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file_path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(
                    outputStreamWriter);

            // write file header
            bufferedWriter.write(CSV_FILE_HEADER);
            bufferedWriter.newLine();

            for (Student student : list) {
                String data = student.toStringSaveFile();
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        } catch (Exception e) {
            System.out.println("#####ERROR#####");
        }
        return false;
    }

    /**
     * Save Student list to file(s)
     * @param list Student list
     * @param file_path
     * @return True if save successful
     */
    public static boolean SaveFile(final ArrayList<Student> list, final String file_path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file_path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(
                    outputStreamWriter);

            for (int i = 0; i < list.size(); i++) {
                String data = (list.get(i)).toString();
                bufferedWriter.write("Student No." + (i + 1));
                bufferedWriter.newLine();
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        } catch (Exception e) {
            System.out.println("#####ERROR#####");
        }
        return false;
    }

}


