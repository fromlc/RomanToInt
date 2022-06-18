## Roman Numeral to Integer

Given a roman numeral, convert it to an integer.
From https://leetcode.com/problems/roman-to-integer/

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

Symbol values are: 
`I = 1`, `V = 5`, `X = 10`, `L = 50`, `C = 100`, `D = 500`, `M = 1000`.

### Examples
- `2 is written as II` in Roman numeral, just two ones added together.
- `12 is written as XII`, which is simply X + II.
- `27 is written as XXVII`, which is XX + V + II.
- `1974 is written as MCMLXXIV`, which is M + CM + L + XX + IV.

### Special Rules
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. 

There are six instances where subtraction is used:

- `IV =` 5 - 1 = `4`.
- `IX =` 10 - 1 = `9`. 
- `XL =` 50 - 10 = `40`. 
- `XC =` 100 - 10 = `90`. 
- `CD =` 500 - 10 = `400`.
- `CM =` 1000 - 100 = `900`.