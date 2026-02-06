[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/6tlCTWq0)
# 🧾 Mystery Receipt Generator (Java CLI Project)

## Overview

In this project, you will build a **command-line Java application** that generates a **randomized receipt** based on user input and randomly generated values.

Each time the program runs, the receipt should be **slightly different**.

This project is designed to help you practice **core Java fundamentals** while thinking critically about **program structure**, **logic**, and **object responsibility**.

---

## Learning Goals

By completing this project, you will demonstrate your ability to:

* Use variables and methods correctly
* Collect user input using `Scanner`
* Generate random values using the `Random` class
* Perform calculations using the `Math` class
* Manipulate and validate text using the `String` class
* Use conditionals (`if / else`) to control program flow
* Organize logic across **multiple classes**

---

## Rules & Constraints

You must follow these rules:

* Your project must include **at least 2 Java classes**

  * One class **must** contain the `main` method
  * At least one additional class must be created by you
* Keep all classes **simple and focused**
* Use **only Java concepts you have learned so far**

### You may use:

* Variables
* Methods
* `Scanner`
* `Random`
* `Math`
* `String`
* Conditionals (`if / else`)
* Basic object creation (`new ClassName()`)
---

### Clone the Repository

1. Go to the GitHub repository for this assignment
2. Click the **Code** button
3. Copy the **HTTPS** link

Open your terminal and run:

```bash
git clone <PASTE_REPO_URL_HERE>
```

Then move into the project folder:

```bash
cd mystery-receipt-generator
```

---

### Create Your Own Branch

You must work on **your own branch**, not `main`.

Create a new branch using your name:

```bash
git checkout -b yourname-receipt
```

Example:

```bash
git checkout -b alex-receipt
```

To confirm you’re on the correct branch:

```bash
git branch
```

The branch with the `*` is your active branch.

---

###  Submission Instructions

Your submission must include:

* Your completed code on **your branch**
* At least **3 meaningful commits**
* A completed README with:

  * How It Works
  * Sample Output
  * Java Concepts Used

 **Do not merge into `main` unless instructed.**

---

### Commit Quality Expectations

Your commits should:

* Represent real progress
* Have clear messages
* Be spaced throughout your work (not one giant commit)

Examples of good commit messages:

* `Set up project structure`
* `Add receipt calculations`
* `Implement discount logic`
* `Format receipt output`

---

### Why This Matters

This workflow mirrors how developers work on real teams:

* You don’t code directly on `main`
* You work in branches
* You commit progress clearly

This is **portfolio behavior**, not just an assignment.


---

## Program Requirements

### User Input (Scanner)

Your program must ask the user for:

* Their **name**
* Their **budget** (double)
* A **coupon code** (String)

Be careful when mixing numeric and text input.


### Randomized Data (`Random`)

Your program must generate random values for:

* A **visit ID** (example range: 1000–9999)
* **Three item prices** (you decide realistic ranges)
* A **tax rate**, fee, or discount trigger

Each program run should produce different results.

---

### Calculations (`Math`)

Your program must:

* Calculate a **subtotal**
* Calculate **tax**
* Apply **discounts or fees**
* Calculate a **final total**
* Round all monetary values to **two decimal places**

You must also use **at least one additional Math method** besides rounding.

Examples:

* `Math.abs`
* `Math.max`
* `Math.min`
* `Math.ceil`
* `Math.floor`
* `Math.pow`

---

### String Logic (`String`)

You must use **at least three different String methods**.

Your program should:

* Validate coupon codes **case-insensitively**
* Build a **receipt code** using part of the user’s name
* Format text output (uppercase, trimming spaces, etc.)

Examples of allowed methods:

* `equalsIgnoreCase`
* `substring`
* `charAt`
* `length`
* `toUpperCase`
* `trim`

---

### Methods (Required)

You must create **at least five methods** (not counting `main`).

Rules:

* At least **two methods must return a value**
* At least **one method must accept a String**
* At least **one method must accept a Random**
* Each method should have **one clear responsibility**

Ask yourself:

> “If I had to explain this method to someone else, could I describe its job in one sentence?”

---

### Receipt Output

Your program must print a **clear, readable receipt** that includes:

* Store name (your choice)
* Visit ID and receipt code
* Item prices
* Subtotal, tax, discounts, and total
* Budget remaining **or** how much the user is short

Formatting matters — your output should be easy to read.

---

## Creativity Requirement 

Choose **at least TWO** of the following **OR invent your own**:

* A “lucky visit” bonus based on the visit ID
* A random “mystery fee” or “mystery discount”
* A VIP coupon that only works randomly
* A receipt tagline generator (random message)
* A receipt “rating” (1–5 stars) that affects pricing
* Budget-based warning messages

You will be graded on **thoughtfulness and logic**, not complexity.

---

## Submission Requirements

###  Code

* Multiple `.java` files
* Program runs without crashing
* Meets all project requirements
---

## Grading Overview

You will be evaluated on:

* Proper use of Scanner
* Meaningful use of Random
* Correct Math calculations and rounding
* Effective use of String methods
* Clean method design
* Logical class organization
* Output readability
* Creativity and effort

---



