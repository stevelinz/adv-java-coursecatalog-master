package lab1;

import javax.swing.*;

/**
 * IntroToProgrammingCourse extends Course
 * no prereqs required
 *
 * @author Steve Linz
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course{
    public IntroToProgrammingCourse(String courseName, String courseNumber, int credits) {
        super(courseName, courseNumber,credits);
    }

    @Override
    public String toString() {
        return super.toString() + "IntroToProgrammingCourse{}";
    }
}
