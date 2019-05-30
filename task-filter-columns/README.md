Coding Challange

Imagine that you have a table available to you as a Spark dataframe. Each entry is a phone number. Your task is to return the columns where all the values in these columns are correctly formatted. The correct formats are: (xxx)-xxx-xxxx, xxx-xxx-xxxx, xxx-xxxxxxx and xxxxxxxxxx and nothing else. You can assume that your task is to validate the format and not the content (that means 000-000-0000 is a valid entry even though it's not a real phone number).

The purpose of this challenge is to demonstrate your coding skills and understanding of Spark. Please focus on clean code and passing the tests. You only need to test with a table that only has a small number of columns and rows. An example is provided below. Add more rows and columns if you want and name your columns however you'd like. But please don't spend too much time creating test data. A table with < 10 columns and < 10 rows should be more than sufficient.

#### Describe your solution

TODO

### Example

#### Input

|C1		        | C2		    | C3		    | C4    	    | C5		    |
| --------------| --------------| --------------| --------------| --------------|
|(123)-456-7890 | 123-456-7890  |(123)-456-789  |               |(123)-456-7890 |
|(123)-456-7890 | 123-4567890   |(123)-456-7890 |(123)-456-7890 | null          |
|(123)-456-7890 | 1234567890    |(123)-456-7890 |(123)-456-7890 | null          |

#### Output

|C1		        | C2		    |
| --------------| --------------| 
|(123)-456-7890 | 123-456-7890  |
|(123)-456-7890 | 123-4567890   |
|(123)-456-7890 | 1234567890    |
