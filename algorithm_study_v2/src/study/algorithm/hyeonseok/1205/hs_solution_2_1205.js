// 문제 2 : https://www.acmicpc.net/problem/2798

const fs = require("fs");
const input_text = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

// const input_text = `10 500
// 93 181 245 214 315 36 185 138 216 295`
//   .toString()
//   .trim()
//   .split("\n");

//   완전탐색

const solution_2 = (input) => {
  const N_cardCount = input[0].split(" ")[0];
  const M_amountLimit = input[0].split(" ")[1];
  const cardArr = input[1].split(" ");

  let result = null;

  for (let idx_1 = 0; idx_1 < N_cardCount - 2; idx_1++) {
    for (let idx_2 = idx_1 + 1; idx_2 < N_cardCount - 1; idx_2++) {
      for (let idx_3 = idx_2 + 1; idx_3 < N_cardCount; idx_3++) {
        const temp = cardArr[idx_1] + cardArr[idx_2] + cardArr[idx_3];
        if (result < temp && temp <= M_amountLimit) {
          result = temp;
        }
      }
    }
  }
  return console.log(result);
};

solution_2(input_text);
