package com.cjc.imp.cpp.serviceimpl;

import java.util.*;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karwenagar implements Cjc {
    Scanner sc = new Scanner(System.in);
    List<Course> clist = new ArrayList<>();
    List<Faculty> flist = new ArrayList<>();
    List<Batch> blist = new ArrayList<>();
    List<Student> slist = new ArrayList<>();

    @Override
    public void addCourse() {
        Course c = new Course();
        System.out.println("Enter the Course ID:");
        c.setCid(sc.nextInt());
        System.out.println("Enter Name of the Course:");
        c.setCname(sc.next());
        clist.add(c);
        System.out.println("Course added successfully.");
    }

    @Override
    public void viewCourse() {
        
        for (Course c : clist) {
            System.out.println("Cid: " + c.getCid() + " Name: " + c.getCname());
        }
    }

    @Override
    public void addFaculty() {
         

        Faculty f = new Faculty();
        System.out.println("Enter the Faculty ID:");
        f.setFid(sc.nextInt());
        System.out.println("Enter the Faculty Name:");
        f.setFname(sc.next());
        System.out.println("Assign a Course to the Faculty:");
        viewCourse();
        System.out.println("Enter the Course ID:");
        int cid = sc.nextInt();

        for (Course c : clist) {
            if (c.getCid() == cid) {
                f.setCourse(c);
                flist.add(f);
                System.out.println("Faculty added successfully.");
                return;
            }
        }
    }

    @Override
    public void viewFaculty() {
         
        for (Faculty f : flist) {
            System.out.println("Fid: " + f.getFid() + " Name: " + f.getFname());
            System.out.println("Course: " + f.getCourse().getCid() + " " + f.getCourse().getCname());
        }
    }

    @Override
    public void addBatch() {
       

        Batch b = new Batch();
        System.out.println("Enter Batch ID:");
        b.setBid(sc.nextInt());
        System.out.println("Enter Batch Name:");
        b.setBname(sc.next());
        System.out.println("Assign a Faculty to the Batch:");
        viewFaculty();
        System.out.println("Enter the Faculty ID:");
        int fid = sc.nextInt();

        for (Faculty f : flist) {
            if (f.getFid() == fid) {
                b.setFaculty(f);
                blist.add(b);
                System.out.println("Batch added successfully.");
                return;
            }
        }
        System.out.println("Faculty ID not found. Batch not added.");
    }

    @Override
    public void viewBatch() {
         
        for (Batch b : blist) {
            System.out.println("Bid: " + b.getBid() + " Name: " + b.getBname());
            System.out.println("Faculty: " + b.getFaculty().getFid() + " " + b.getFaculty().getFname());
        }
    }

    @Override
    public void addStudent() {
        
        Student s = new Student();
        System.out.println("Enter Student ID:");
        s.setSid(sc.nextInt());
        System.out.println("Enter Student Name:");
        s.setSname(sc.next());
        System.out.println("Assign a Batch to the Student:");
        viewBatch();
        System.out.println("Enter Batch ID:");
        int bid = sc.nextInt();

        for (Batch b : blist) {
            if (b.getBid() == bid) {
                s.setBatch(b);
                slist.add(s);
                System.out.println("Student added successfully.");
                return;
            }
        }
        
    }

    @Override
    public void viewStudent() {
         
        for (Student stu : slist) {
            System.out.println("Sid: " + stu.getSid() + " Name: " + stu.getSname());
            System.out.println("Course: " + stu.getBatch().getFaculty().getCourse().getCid() + " Name: " + stu.getBatch().getFaculty().getCourse().getCname());
            System.out.println("Batch: " + stu.getBatch().getBid() + " Name: " + stu.getBatch().getBname());
            System.out.println("Faculty: " + stu.getBatch().getFaculty().getFid() + " Name: " + stu.getBatch().getFaculty().getFname());
        }
    }
}
