# Bubble Sort Example

## Overview
The `Bubble Sort Example` is a simple Java application that demonstrates the bubble sort algorithm. Bubble sort is a straightforward sorting technique that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until no swaps are needed, indicating that the list is sorted.

## Features
- Implements the bubble sort algorithm to sort an array of integers.
- Includes functionality to print the sorted array.
- Efficient handling of already sorted arrays through an early exit mechanism.

## How It Works
1. **Input**: The program starts with an unsorted array of integers.
2. **Sorting**: It performs the bubble sort algorithm, swapping adjacent elements as needed.
3. **Output**: The program prints the sorted array to the console.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.

### Running the Application
1. **Clone the Repository** (if applicable):
   ```bash
   git clone https://github.com/yourusername/bubble-sort-example.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd bubble-sort-example
   ```
3. **Compile the Java File**:
   ```bash
   javac BubbleSortExample/BubbleSortExample.java
   ```
4. **Run the Application**:
   ```bash
   java BubbleSortExample.BubbleSortExample
   ```

### Example Output
When you run the application, it will output the sorted array:
```
Sorted array:
5 11 12 22 25 34 55 64 90 
```

## Code Explanation

### bubbleSort Method
- Takes an array of integers as input.
- Uses two nested loops to compare adjacent elements.
- Swaps elements if they are in the wrong order.
- Utilizes a flag (`swapped`) to optimize performance by exiting early if the array is already sorted.

### printArray Method
- Iterates through the array and prints each element.
