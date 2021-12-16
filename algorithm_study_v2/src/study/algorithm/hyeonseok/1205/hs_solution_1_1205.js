// 1. 하나의 값을 입력받을 때
// const fs = require('fs');
// const input = fs.readFileSync("/dev/stdin").toString().trim();
// 2. 공백으로 구분된 한 줄의 값들을 입력받을 때
// const fs = require('fs');
// const input = fs.readFileSync("/dev/stdin").toString().trim().split(" ");
// 3. 여러 줄의 값들을 입력받을 때
// const fs = require('fs');
// const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
// 4. 첫 번째 줄에 자연수 n을 입력받고, 그 다음줄에 공백으로 구분된 n개의 값들을 입력받을 때
// const fs = require('fs');
// const [n, ...arr] = fs.readFileSync("/dev/stdin").toString().trim().split(/\s/);
// 5. 첫 번째 줄에 자연수 n을 입력받고, 그 다음줄부터 n개의 줄에 걸쳐 한 줄에 하나의 값을 입력받을 때
// const fs = require('fs');
// const [n, ...arr] = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

// 문제 1 : https://www.acmicpc.net/problem/11004

const fs = require('fs');
const example = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const example = `5 2
4 1 2 3 5`
  .toString()
  .trim()
  .split('\n');

const solution_1 = (example) => {
  // console.log("example > ",example);
  // console.log(example[0].split(" "));
  // const arrLength = example[0].split(" ")[0];
  const nth = example[0].split(' ')[1];
  // console.log("nth > ",nth);
  const numArr = example[1].split(' ');
  // console.log("numArr > ",numArr);

  console.log(numArr.sort((a, b) => a - b)[nth - 1]);
};

solution_1(example);

// console.log(example);
