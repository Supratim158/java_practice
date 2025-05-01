package com.supratim;//package com.supratim;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class BorderLayoutExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("GridLayout");
//        frame.setLayout(new GridLayout(2, 3));  // 2 rows, 3 columns
//
//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//        frame.add(new JButton("6"));
//
//        frame.setSize(400, 200);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}

//import javax.swing.*;
//        import java.awt.*;
//
//public class BorderLayoutExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("BorderLayout");
//        frame.setLayout(new BorderLayout());
//
//        frame.add(new JButton("North"), BorderLayout.NORTH);
//        frame.add(new JButton("South"), BorderLayout.SOUTH);
//        frame.add(new JButton("East"), BorderLayout.EAST);
//        frame.add(new JButton("West"), BorderLayout.WEST);
//        frame.add(new JButton("Center"), BorderLayout.CENTER);
//
//        frame.setSize(400, 300);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class User {
    String userId;
    String name;
    String type; // student or faculty

    User(String userId, String name, String type) {
        this.userId = userId;
        this.name = name;
        this.type = type;
    }
}

class Resource {
    String resourceId;
    String title;
    boolean available;

    Resource(String resourceId, String title) {
        this.resourceId = resourceId;
        this.title = title;
        this.available = true;
    }
}

class LoanRecord {
    String userId;
    LocalDate checkoutDate;
    LocalDate dueDate;

    LoanRecord(String userId, LocalDate checkoutDate, LocalDate dueDate) {
        this.userId = userId;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
    }
}

public class xm1 {
    static final int LOAN_PERIOD_DAYS = 14;
    static final int FINE_PER_DAY = 1;

    static Map<String, User> users = new HashMap<>();
    static Map<String, Resource> resources = new HashMap<>();
    static Map<String, LoanRecord> loanRecords = new HashMap<>();

    public static void main(String[] args) {
        // Sample data
        users.put("S101", new User("S101", "Alice", "student"));
        users.put("F201", new User("F201", "Dr. Smith", "faculty"));

        resources.put("B001", new Resource("B001", "Data Structures"));
        resources.put("J002", new Resource("J002", "AI Journal"));
        resources.put("A003", new Resource("A003", "Python Tutorial Video"));

        checkoutResource("S101", "B001");
        checkoutResource("F201", "J002");

        // Simulate returning a book after 16 days
        returnResource("B001", LocalDate.now().plusDays(16));
    }

    static void checkoutResource(String userId, String resourceId) {
        if (!users.containsKey(userId)) {
            System.out.println("User not found.");
            return;
        }
        if (!resources.containsKey(resourceId)) {
            System.out.println("Resource not found.");
            return;
        }

        Resource res = resources.get(resourceId);
        if (!res.available) {
            System.out.println("Resource is already checked out.");
            return;
        }

        LocalDate today = LocalDate.now();
        LocalDate dueDate = today.plusDays(LOAN_PERIOD_DAYS);
        loanRecords.put(resourceId, new LoanRecord(userId, today, dueDate));
        res.available = false;

        System.out.println(res.title + " checked out by " + users.get(userId).name + ". Due on " + dueDate);
    }

    static void returnResource(String resourceId, LocalDate returnDate) {
        if (!loanRecords.containsKey(resourceId)) {
            System.out.println("No record of this resource being checked out.");
            return;
        }

        LoanRecord record = loanRecords.get(resourceId);
        long overdueDays = ChronoUnit.DAYS.between(record.dueDate, returnDate);
        long fine = Math.max(0, overdueDays * FINE_PER_DAY);

        resources.get(resourceId).available = true;
        loanRecords.remove(resourceId);

        System.out.println("Returned by " + users.get(record.userId).name);
        if (fine > 0) {
            System.out.println("Overdue by " + overdueDays + " days. Fine: ₹" + fine);
        } else {
            System.out.println("Returned on time. No fine.");
        }
    }
}
