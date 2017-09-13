# JUnit Testing
Now it's time to demonstrate your ability to use objects in the Java
programming language with TDD.

This repository contains a project for Eclipse that lets you demonstrate your proficiency
with test-driven development. It uses the JUnit 4 testing library for unit testing, a
very popular TDD library for Java.

Your goal is to work out how to fix the one broken test and then implement the
next two requested features by writing a test first, then implementing the method. You'll
use Git to demonstrate you have written your tests before you have written your implementations.

Please read all instructions before starting. Important grading criteria follow!

### Getting Started

1. Visit <https://github.com/bhogancvtc/TDDWithJUnit>
2. fork the repository there to your own account.
3. **Ensure you've installed Git to your computer**
4. Clone your fork of my project to your computer.


## What To Do

The `src/Car.java` class contains a simple class representing a car, and
a few methods are already implemented. You'll use test-driven development
to add some new features to the class.

The `src/CarTest.java` file contains unit tests for the existing functionality
of the `Car` object, but you'll need to add more as you add features.

### Importing into Eclipse
In Eclipse, you'll import the project.

1. From the **File** menu, choose **Import...***.
2. Under **General**, choose **Existing Projects Into Workspace**
3. Select the Root Directory by browsing your file system and selecting the **folder you cloned from Github**
4. The project appears and is checked.
5. **Do not select** the option to **copy files to the workspace.** You want
   Eclipse to leave the files in their original location. This way you can
   easily find them and do your commits. **You should use the command line
   tools for committing your code, not Eclipse's integration.**.
6. Select **Finish** to import the project.

Once the project's loaded, right-click on the `CarTest.java` file and choose `Run as JUnit Test`. Every time you make a change to either the test or the `Car.java` file, be sure to re-run the test.

### Specifications

1. The `toString()` method on the `Car` class isn't properly implemented yet. Implement the
   `toString()` method of `Car` by using the existing unit test as a guide.
   Return a string that matches the expectation of the test.

2. Implement the `decelerate()` method of Car by writing a unit test first. Ensure
that when you call the `decelerate()` method and pass an `amount` as its argument,
     that the `speed` property decreases by that amount. Remember that you should
     **accelerate the car first**. The car will not be moving unless you make it move.
     **Do not handle decelerating below 0 yet.**

3. Write another test that ensures that you can't decelerate more than 0. Then
modify the implementation of the `decelerate()` method so that new test passes.


### Development Workflow

As you develop, follow this approach:

1. Create a branch to fix the main test
2. Fix the broken test by writing the proper implementation.
3. **Commit**
4. Merge the branch back into master.
5. Create a new branch for the new feature.
6. Write the unit test for the first new feature
7. **Commit the new test case.**
8. Implement the passing test.
9. **Commit.**
10. Merge branch back to master.
11. Repeat steps 5-10 for the other feature.

### Remember The Rules of TDD:

1. Do not write any code unless it's to make a failing test pass.
2. Do not write any more of a unit test than is sufficient to fail, and not compiling is failing.
3. Do not write more code in the `Car` class than you need to make the current unit test pass.

I will use your Git commits to assess that you have written tests first.


### Refactoring?
Once you've made the tests pass, consider any refactoring that can be done to improve the code.

### Pushing to Github
Once you're satisfied with your code, push your master branch to Github and then use Github to send me a pull request of your repository for review.

This assessment is worth 40 points.

## Your performance will be successful when:

1. You clone this repository and perform the work specified in your own repository.
1. You submit a pull request on Github
2. Your pull request contains modified versions of the class and the unit test
3. The test cases pass.
4. You have implemented new methods to make the tests pass.
5. Your code is free from errors
6. Your code is well formed, correct, and efficient.
7. Your Git commit history in your project shows that you developed the tests first. **That means you will have multiple commits.** You must use Git to demonstrate to me that tests were written before code was implemented.
    * Make sure you follow the rules of TDD:
        1. Do not write any code unless it's to make a failing test pass.
        2. Do not write any more of a unit test than is  sufficient to fail, and not compiling is failing.
        3. Do not write more code than you need to make the current unit test pass.
