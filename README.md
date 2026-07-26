# 📝 Logger System - Singleton Design Pattern

A simple Java project demonstrating the **Singleton Design Pattern** by implementing a centralized logging system. The logger uses **Double-Checked Locking** with `volatile` to provide thread-safe lazy initialization while minimizing synchronization overhead.

---

## 📖 Overview

This project implements a single Logger instance that is shared across the entire application.

Instead of creating multiple logger objects, every class retrieves the same instance using:

```java
Logger logger = Logger.getInstance();
```

The logger supports the following log levels:

- ℹ️ INFO
- ⚠️ WARNING
- ❌ ERROR

---

## 🏗️ Project Structure

```
src
└── com
    ├── Main.java
    │
    ├── logger
    │     └── Logger.java
    │
    └── enums
          └── LogLevel.java
```

---

## 🚀 How It Works

```
            Main
             │
             ▼
      Logger.getInstance()
             │
             ▼
      Logger (Singleton)
```

The `Main` class requests the Logger instance using `getInstance()`. Since Logger follows the Singleton pattern, only one instance is created and shared throughout the application.

---

## 🎯 Singleton Design Pattern

Instead of creating multiple logger objects:

```java
Logger logger = new Logger(); // ❌ Not Allowed
```

The application retrieves the single shared instance:

```java
Logger logger = Logger.getInstance();
```

This ensures only one Logger object exists during the application's lifetime.

---

## 🔒 Thread Safety

The Logger uses **Double-Checked Locking** to ensure thread-safe lazy initialization.

```java
public static Logger getInstance() {

    if (instance == null) {

        synchronized (Logger.class) {

            if (instance == null) {
                instance = new Logger();
            }
        }
    }

    return instance;
}
```

The `volatile` keyword prevents instruction reordering and guarantees safe publication of the Logger instance.

---

## 💡 Why Double-Checked Locking?

- Creates the Logger only when it is first requested.
- Prevents multiple threads from creating multiple instances.
- Synchronizes only during the first initialization.
- Improves performance by avoiding unnecessary synchronization after initialization.

---

## 💻 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Singleton Design Pattern
- Double-Checked Locking
- Multithreading Concepts

---

## 📷 Sample Output

```
[INFO] Application Started
[WARNING] Low Memory
[ERROR] Database Connection Failed
```

---

## 📈 Future Enhancements

- Add timestamps to log messages.
- Store logs in a file.
- Support multiple log destinations (Console/File).
- Add configurable log levels.
- Implement asynchronous logging.

---

## 🎓 Concepts Covered

- Singleton Design Pattern
- Lazy Initialization
- Thread Safety
- Double-Checked Locking
- `volatile` Keyword
- `synchronized`
- Java Enums

---

## 👨‍💻 Author

**Naman Bangari**

Learning Low-Level Design (LLD) in Java by implementing design patterns through practical projects.