package StudentManagement;

import java.util.Scanner;

/**
 * StudentManagement
 * Created by lmduc
 * Date 23/10/2021 - 10:05
 * Description: ...
 */
public class Student {
    private int id;
    private  String name;
    private  float gpa;
    private String image;
    private String address;
    private String notes;

    /**
     * Default Constructor
     */
    public Student() {
        super();
    }

    /**
     * Constructor with parameters
     * @param id
     * @param name
     * @param gpa
     * @param image
     * @param address
     * @param notes
     */
    public Student(final int id, final String name,
                   final float gpa, final String image,
                   final String address, final String notes) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.image = image;
        this.address = address;
        this.notes = notes;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(final float gpa) {
        this.gpa = gpa;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("     Student ID         :");
        sb.append(id);
        sb.append("\n");
        sb.append("     Student Name       :");
        sb.append(name);
        sb.append("\n");
        sb.append("     Student GPA        :");
        sb.append(gpa);
        sb.append("\n");
        sb.append("     Student Image      :");
        sb.append(image);
        sb.append("\n");
        sb.append("     Student Address    :");
        sb.append(address);
        sb.append("\n");
        sb.append("     Student Notes      :");
        sb.append(notes);
        sb.append("\n");

        return sb.toString();
    }

    public String toStringSaveFile() {
        String result = id + "," + name + "," + gpa + "," + image + "," + address + "," + notes;
        return result;
    }

}
