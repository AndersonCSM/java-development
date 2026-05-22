# Java Development Repository

**A comprehensive collection of Java projects, lessons, exercises, and assessments for learning Object-Oriented Programming and data structures.**

---

## Table of Contents

- [About](#about)
- [Repository Structure](#repository-structure)
- [Quick Navigation](#quick-navigation)
- [Getting Started](#getting-started)
- [Projects](#projects)
- [Programming Object-Oriented](#programming-object-oriented)
- [Technologies & Tools](#technologies--tools)

---

## About

This repository contains educational materials for Java programming, including:

- **Foundational Projects**: Basic applications demonstrating core Java concepts
- **Lessons**: Structured educational materials covering OOP concepts
- **Exercises**: Practical coding exercises to reinforce learning
- **Assessments**: Evaluation projects to test comprehensive understanding

The materials progress from fundamental concepts to advanced patterns, with each lesson building upon previous knowledge.

**Languages**: English (repository structure) | Portuguese (code comments & documentation)

---

## Repository Structure

```
java_development/
├── 📁 projects/                          # Foundational projects
│   ├── EmpresaFicticia/                  # Fictional company OOP example
│   └── NumerosAleatorios/                # Random numbers application
│
├── 📁 programming-object-oriented/       # Main educational content
│   ├── 📁 lessons/                       # Structured lessons
│   │   ├── lesson-01-basics/             # Basic concepts (conversion, tuples, equality)
│   │   ├── lesson-02-arrays-collections/ # Arrays and collections
│   │   ├── lesson-03-inheritance/        # Inheritance and polymorphism
│   │   ├── lesson-04-advanced/           # Advanced topics
│   │   └── lesson-review/                # Review and consolidation
│   │
│   ├── 📁 exercises/                     # Practical exercises
│   │   ├── list-exercises-01/            # List 1 exercises
│   │   ├── list-exercises-02/            # List 2 exercises
│   │   ├── list-exercises-03/            # List 3 exercises
│   │   ├── list-exercises-04/            # List 4 exercises (vectors, lists, matrices)
│   │   ├── list-exercises-05/            # List 5 exercises (inheritance)
│   │   ├── list-exercises-06/            # List 6 exercises (OOP patterns)
│   │   ├── list-exercises-07/            # List 7 exercises
│   │   └── list-exercises-08/            # List 8 exercises
│   │
│   ├── 📁 assessments/                   # Evaluation projects
│   │   └── assessment-01/                # First assessment
│
└── README.md                             # This file
```

---

## Quick Navigation

### For Learning Progressively
1. Start with **lessons** in order: `lesson-01-basics` → `lesson-02-arrays-collections` → etc.
2. After each lesson, practice with corresponding **exercises**
3. Complete **assessments** to evaluate your understanding

### By Topic

| Topic | Resource | Path |
|-------|----------|------|
| **Basic Concepts** | lesson-01-basics | `programming-object-oriented/lessons/lesson-01-basics/` |
| **Arrays & Collections** | lesson-02-arrays-collections | `programming-object-oriented/lessons/lesson-02-arrays-collections/` |
| **Inheritance & Polymorphism** | lesson-03-inheritance | `programming-object-oriented/lessons/lesson-03-inheritance/` |
| **Advanced Topics** | lesson-04-advanced | `programming-object-oriented/lessons/lesson-04-advanced/` |
| **Practical Exercises** | list-exercises | `programming-object-oriented/exercises/` |
| **Assessments** | assessments | `programming-object-oriented/assessments/` |

---

## Getting Started

### Prerequisites
- **Java 8+** installed
- **IntelliJ IDEA** (recommended) or any Java IDE
- Git (for cloning the repository)

### Running a Project

1. **Open in IntelliJ IDEA**
   ```bash
   # Clone the repository
   git clone https://github.com/anderson/java_development.git
   
   # Open in IntelliJ
   # File → Open → Select the project folder
   ```

2. **Run a lesson or exercise**
   - Each project folder contains an `.iml` file for IntelliJ configuration
   - Locate the `Main.java` class in the package
   - Right-click → Run

3. **Command line (if not using IDE)**
   ```bash
   cd programming-object-oriented/lessons/lesson-01-basics/
   javac src/conversao/*.java
   java -cp src conversao.DemoConversao
   ```

---

## Projects

### Foundational Projects

Located in `projects/`

| Project | Description | Concepts |
|---------|-------------|----------|
| **EmpresaFicticia** | Fictional company management system | Classes, inheritance, polymorphism |
| **NumerosAleatorios** | Random number generator | Methods, randomization |

---

## Programming Object-Oriented

### Lessons (`programming-object-oriented/lessons/`)

Each lesson is a complete IntelliJ project with multiple packages (examples).

#### Lesson 01: Basics
- **Path**: `lesson-01-basics/`
- **Packages**: conversao, data, igualdade, tupla
- **Topics**: Unit conversion, Date class, equality, tuples
- **Estimated Duration**: 2-3 hours

#### Lesson 02: Arrays & Collections  
- **Path**: `lesson-02-arrays-collections/`
- **Topics**: Arrays, ArrayLists, GameOfCheckers, Pascal's Triangle, Media calculations
- **Estimated Duration**: 3-4 hours

#### Lesson 03: Inheritance & Polymorphism
- **Path**: `lesson-03-inheritance/`
- **Topics**: Class hierarchy, inheritance, method overriding, company example, academic records
- **Estimated Duration**: 3-4 hours

#### Lesson 04: Advanced Topics
- **Path**: `lesson-04-advanced/`
- **Topics**: Search algorithms, color handling
- **Estimated Duration**: 2-3 hours

#### Lesson Review
- **Path**: `lesson-review/`
- **Topics**: Arrays/ArrayLists, generic collections, exceptions, polymorphism, class reuse
- **Estimated Duration**: 4-5 hours

### Exercises (`programming-object-oriented/exercises/`)

8 lists of progressive exercises to reinforce concepts from lessons.

| List | Focus | Path |
|------|-------|---------|
| **01** | Fundamentals  | `list-exercises-01/` |
| **02** | Control flow  | `list-exercises-02/` |
| **03** | Methods & Arrays  | `list-exercises-03/` |
| **04** | Vectors & Matrices  | `list-exercises-04/` |
| **05** | Inheritance & Delegation  | `list-exercises-05/` |
| **06** | OOP Patterns   | `list-exercises-06/` |
| **07** | Integration    | `list-exercises-07/` |
| **08** | Consolidation  | `list-exercises-08/` |

### Assessments (`programming-object-oriented/assessments/`)

| Assessment | Purpose | Path |
|-----------|---------|------|
| **Assessment 01** | First comprehensive evaluation | `assessment-01/` |

---

## Technologies & Tools

### Languages & Frameworks
- **Java** (8+)
- Standard Java libraries

### Development Tools
- **IntelliJ IDEA** (recommended IDE)
- **Git** (version control)
- **Java Compiler** (javac)
- **JVM** (Java Virtual Machine)

### Project Structure
- Each lesson/exercise is an IntelliJ project (`.iml` file)
- Code organized in packages under `src/`
- Compiled classes in `out/` (gitignored)


## Code Organization

### Package Naming Convention
- Packages use descriptive names in both English and Portuguese
- Examples: `conversao`, `data`, `agenda`, `empresa`

### File Naming Convention
- Classes: PascalCase (`Main.java`, `Funcionario.java`)
- Packages: lowercase with hyphens when multiple words

### Structure Example
```
lesson-01-basics/
├── lesson-01-basics.iml
├── .gitignore
├── src/
│   ├── conversao/
│   │   ├── ConversaoUnidades.java
│   │   └── DemoConversao.java
│   ├── data/
│   │   ├── Data.java
│   │   └── demoData.java
│   └── ...
└── out/  (compiled classes - gitignored)
```

---

## License

This project is licensed under the terms specified in the [LICENSE](LICENSE) file.

---

**Last Updated**: May 2026  
**Repository Version**: 1.0 (Restructured)