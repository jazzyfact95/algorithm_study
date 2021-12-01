// 3번 문제 https://www.acmicpc.net/problem/11399

const fs = require("fs");
const input_text = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

// const input_text = `5
// 3 1 4 3 2`
//   .toString()
//   .trim()
//   .split("\n");

const solution_3 = (input) => {
  const N_waitingCount = input[0].split(" ")[0];
  //   console.log("N_waitingCount > ", N_waitingCount);
  const waitingArr = input[1].split(" ");
  //   console.log("waitingArr > ", waitingArr);

  let before = 0;

  let result = 0;
  for (let idx_1 = 0; idx_1 < N_waitingCount; idx_1++) {
    result += before + parseInt(waitingArr[idx_1], 10);
    before += parseInt(waitingArr[idx_1], 10);
  }

  console.log(result);
};

solution_3(input_text);
