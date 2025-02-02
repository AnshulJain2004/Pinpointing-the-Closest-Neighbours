# Pinpointing the Closest Neighbours

This repository contains a simple Java program that identifies the pair of adjacent elements in an array with the smallest absolute difference. The program then returns the index of the first element in that pair.

## How It Works

1. **User Input**  
   - The user specifies the size of an integer array.  
   - The user then enters the elements of the array.

2. **Finding the Closest Neighbours**  
   - The code iterates through consecutive pairs in the array.  
   - For each pair, it computes the absolute difference.  
   - It keeps track of the minimum distance and the index where this occurs.

3. **Output**  
   - Finally, the program prints the index of the first number in the pair with the smallest distance.

## Repository Structure

1. **`ClosestNeighbour.java`**  
   - A class that contains the core logic for finding the minimum distance among adjacent pairs in the array.  
   - The `findClosestNeighbor()` method returns the index of the first element whose distance to its immediate neighbor is the smallest.

2. **`PinpointingTheClosestNeighbours.java`**  
   - The main entry point of the application.  
   - Handles user input (array size and elements).  
   - Instantiates `ClosestNeighbour`, calls `findClosestNeighbor()`, and prints the result.

## Usage

1. **Compile**  
   ```bash
   javac ClosestNeighbour.java PinpointingTheClosestNeighbours.java
   ```
2. **Run**  
   ```bash
   java PinpointingTheClosestNeighbours
   ```
3. **Enter the required input**  
   - First, enter the size of the array.  
   - Then enter the elements of the array.

## Example

- Suppose we enter the following input:
  ```
  Enter the size of the array: 5
  Enter the elements of the array:
  10
  15
  14
  2
  3
  ```
- The smallest absolute difference among adjacent elements is between `14` and `15` (difference = 1).  
- The program will output:
  ```
  The index of the first number with the smallest distance to its neighbor is: 1
  ```

## Contributing

If you have suggestions or improvements, feel free to fork this repository and submit a pull request. All feedback is welcome!

## License

This project is open-sourced under the [MIT License](LICENSE). You are free to use, modify, and distribute it as you wish.
