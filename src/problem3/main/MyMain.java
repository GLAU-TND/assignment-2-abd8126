/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Amit",05));
        queue.enqueue(new Student("Anubhav",10));
        queue.enqueue(new Student("Hrithik",17));
        queue.enqueue(new Student("Neeti",25));
        queue.enqueue(new Student("Pratibha",33));
        queue.enqueue(new Student("Rohit",39));
        queue.enqueue(new Student("Vibhaw",50));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}

