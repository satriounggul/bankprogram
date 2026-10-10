# PPBOD_04_SatrioUnggulPrayogo_L0125114

## Assignment 4: Access Modifiers in Java (Banking System)

This repository contains the submission for Assignment 4 (Pengumpulan Tugas 4) for the PPBOD course. The project demonstrates the implementation and practical usage of **Access Modifiers** (Public, Private, Protected, and Default) in Java through a simple banking system simulation.

### 📋 Assignment Requirements Met
*   Implemented custom packages using Top-Level Domains (TLD).
*   Demonstrated encapsulation using `private` attributes and `public` getters/setters.
*   Demonstrated inheritance and package access using `protected`.
*   Demonstrated default (package-private) access.
*   Tested access restrictions from different packages.

### 📁 Project Structure

The project follows a specific package structure as required by the assignment:

```text
src/
└── com/
    └── satriounggul/                   <-- Base Package (using TLD format)
        ├── Rekening.java               <-- Base class (private attributes, constructors, setters/getters)
        ├── PetugasBank.java            <-- Helper class to demonstrate 'default' access modifier
        ├── prioritas/
            └── RekeningPrioritas.java  <-- Subclass demonstrating 'protected' access
        └── app/
            └── Main.java               <-- Entry point (Demonstrates access from different packages)