package exercise03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Service {
    public ArrayList<Student> service(){
        ArrayList<Student> list = new ArrayList<>();
        int op;
        do{
            list.add(createStudent());
            op = JOptionPane.showConfirmDialog(null,"Do you enter another student?");
        } while(op == 0);
        return list;
    }
    public Student createStudent(){
        Integer[] notes = new Integer[3];
        Student student = new Student();
        String name = JOptionPane.showInputDialog(null, "Enter student's name.");
        name = name.toUpperCase();
        student.setName(name);
        for (int i = 0; i < 3; i++) {
            int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter note number " + (i + 1) + ":"));
            notes[i] = aux;
        }
        student.setNotes(notes);
        return student;
    }
    public Student selectStudent(){
        Student aux = new Student();
        String name = JOptionPane.showInputDialog(null, "Enter a name to search.");
        name = name.toUpperCase();
        aux.setName(name);
        return aux;
    }
    public Student compare(ArrayList<Student> list, Student student){
        boolean flag = true;
        Iterator<Student> i = list.iterator();
         do {
            if (i.next().equals(student)) {
                student = i.next();
                flag = !flag;
            }
        } while(i.hasNext());
        if(flag) {
            JOptionPane.showMessageDialog(null, "The student doesn't exist. Try again.");
        }
        return student;
    }
    public double finalNote(Student student){
        double finalNote;
        Integer[] notes = student.getNotes();
        finalNote = (notes[0] + notes[1] + notes[2]);
        finalNote = finalNote/3;
        return finalNote;
    }
    public void print(double finalNote, Student student){
        JOptionPane.showMessageDialog(null,"The final note of the student "+
                                        student.getName()+" is: "+finalNote);
    }
}
