# Coding Challenge

### Introduction

Imagine that you have a table available to you as a Spark dataframe. Each entry is a phone number. Your task is to return the columns where all the values in these columns are correctly formatted. The correct formats are: (xxx)-xxx-xxxx, xxx-xxx-xxxx, xxx-xxxxxxx and xxxxxxxxxx and nothing else. You can assume that your task is to validate the format and not the content (that means 000-000-0000 is a valid entry even though it's not a real phone number).

The purpose of this challenge is to demonstrate your coding skills and understanding of Spark. Please focus on clean code and passing the tests. You only need to test with a table that only has a small number of columns and rows. An example is provided below. Add more rows and columns if you want and name your columns however you'd like. But please don't spend too much time creating test data. A table with < 10 columns and < 10 rows should be more than sufficient.

Important hints:
1. Submitting a working solution that passes one test case is not enough. We require a solution that will scale well with big data. Please explain why your approach is efficient in the section below.
2. Please review important Spark concepts such as RDD vs dataframes, transformations and actions, and shuffle operations when you try to optimize your solution. Generally speaking, scanning the data too many times/lots of shuffling should be avoided.
3. Any programming language is welcome but using Scala is a big plus. If you use Scala, please take Scala best practices into consideration.

### Describe your solution

TODO

### Example

#### Input

| Column 1		| Column 2		| Column 3      | Column 4  	| Column 5      |
| --------------| --------------| --------------| --------------| --------------|
|(123)-456-7890 | 123-456-7890  |(123)-456-789  |               |(123)-456-7890 |
|(123)-456-7890 | 123-4567890   |(123)-456-7890 |(123)-456-7890 | null          |
|(123)-456-7890 | 1234567890    |(123)-456-7890 |(123)-456-7890 | null          |

#### Output

| Column 1		| Column 2		|
| --------------| --------------| 
|(123)-456-7890 | 123-456-7890  |
|(123)-456-7890 | 123-4567890   |
|(123)-456-7890 | 1234567890    |
