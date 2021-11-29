// 문제 2 : https://www.acmicpc.net/problem/2798


// const fs = require('fs');
// const example = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const input = `10 500
93 181 245 214 315 36 185 138 216 295`.toString().trim().split("\n");

const N_cardNumber = input[0].split(" ")[0];
const M_cardAmount = input[0].split(" ")[0];
const countM = input[1].split(" ")[0];

const solution_1 = (input)=> {
    // console.log("example > ",example);
    // console.log(example[0].split(" "));
    // const arrLength = example[0].split(" ")[0];
    const nth = example[0].split(" ")[1];
    // console.log("nth > ",nth);
    const numArr = example[1].split(" ");
    // console.log("numArr > ",numArr);



    console.log(
        numArr.sort((a,b)=>a-b)[nth ===1 ? 1 : nth-1]);
}

solution_1(example);

