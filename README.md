### Multiply items in a matrix

Write a function / method called `multiplyMatrix()` that takes a 2D array of integers
(any 2D array is allowed, including not square and jagged 2D arrays) as a parameter
and returns with the new 2D array.

The function should:

- multiply each odd (1,3,5,7,9,...) number by 2 in each odd indexed row
- multiply each even (0,2,4,6,8,10,...) number by 2 in each even indexed row
- use the same indexing which we use in most programming language (starting with 0)
  and remember that 0 is also an even number.

Write at least 2 different unit tests, one that tests normal operation and one edge case.

#### Example 1

Input

```text
[
  [1, 3, 6, 2],
  [7, 5, 6, 1],
  [3, 3, 1, 5],
  [9, 0, 5, 3]
]
```

Return value

```text
[
  [1,  3,  12, 4],
  [14, 10, 6,  2],
  [3,  3,  1,  5],
  [18, 0,  10, 6]
]
```

#### Example 2

Input

```text
[
  [2, 3],
  [5, 0, 4, 0],
  [6],
  [5, 2]
]
```

Return value

```text
[
  [4,  3],
  [10, 0, 4, 0],
  [12],
  [10, 2]
]
```

### Candy shop

You are going to create a Candy shop where we sell hard candies and lollipops.

#### Candy

- It has a `price` and an `amountOfSugar`.
  - The `price` can be decimal
 
- 2 kinds of candy exist: `Lollipop` or `HardCandy`.

##### Lollipop

- The `price` is $2.0 and it is made from 60 grams of sugar.
- The default values should be set in the constructor of the class

##### HardCandy

- The `price` is $4.0 and it is made from 80 grams of sugar.
- The default values should be set in the constructor of the class

#### Candy shop

- It has `sugar`, `income`, and an `inventory` (list of candies).
  - The `income` can be decimal

- It takes an `amountOfSugar` parameter in gram when creating an instance.
  - `income` is zero and `inventory` is an empty array by default

- It has a `storeCandy()` method which takes any `Candy` as a parameter

  - the `sugar` can't go below 0 » throw an error / exception if it happens with a message: "Insufficient sugar"
  - otherwise store the candy in the `inventory` and
  - reduce the `sugar` amount by the amount needed to create the candies

- It has a `raisePrice()` method which takes an `amount` as a parameter

  - raise the prices of all the candies in the `inventory` with the `amount`

- It has a `sell()` method which takes an `amountOfCandiesToBeSold` as parameter

  - the `income` will be increased by the `price` of the candies that were sold,
  - sold candies will be deleted from the `inventory`
  - can't sell more candies than there are in the `inventory`
  - start the selling from the beginning of the `inventory`
  - if the `amountOfCandiesToBeSold` is greater than the inventory size then sell all the candies from the inventory

- It has a `buySugar()` method which takes an `amount` as parameter

  - the `amount` parameter's unit is KiloGram
  - price of 1000 grams sugar is $2
  - the `income` can't go below 0 » throw an error / exception if it happens with a message: "Insufficient income"
  - otherwise it raises the Candy Shop's amount of sugar
    and reduces the `income` by the price of the sugar purchased
    - note that the sugar in the candy shop is stored in grams.

- Create a method `toString()` representing the Candy Shop which overrides the inherited method

  - Display only whole numbers
  - return a string in this format:
    - `Inventory: 0 hard candies, 1 lollipops; Income: $100; Sugar: 400 grams`