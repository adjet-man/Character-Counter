# Overview
The Character Counter program is a simple Java console application designed to count the number of non-whitespace characters in a given text file. Users are prompted to enter the path to the text file, and the program outputs the total count of characters excluding spaces, tabs, and newline characters.

# How It Works
- User Input
The program starts by prompting the user to input the path to a text file. This is achieved using a Scanner object to read the user's input from the console.
- File Validation
A File object is created using the provided file path. The program then checks if the file exists using the exists() method. If the file does not exist, it prints an error message and exits.
- Reading the File
The program uses a BufferedReader in conjunction with a FileReader to read the content of the file efficiently. It iterates through each character in the file one at a time.
- Character Counting
For each character read, the program checks if it is a non-whitespace character by using the Character.isWhitespace method. If the character is not a whitespace, the character count is incremented.
- Result Output
After reaching the end of the file (indicated by read() returning -1), the program closes the BufferedReader and outputs the total count of non-whitespace characters found in the file.
# Exception Handling
The program includes basic exception handling to catch and report errors encountered while reading the file, such as IOException. It prints a user-friendly error message if an exception occurs.
# Usage
To use the Character Counter program, compile and run the program using a Java compiler and runtime environment. When prompted, enter the full path to the text file you wish to analyze. The program will then display the count of non-whitespace characters found in the file.
