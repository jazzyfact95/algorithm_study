// // 한 줄 입력

// let fs = require('fs');
// let input = fs.readFileSync('../1205TEXT/hs_solution_1_1205.txt').toString().split("\n");

// let number = Number(input);

// for( let i = 1; i <= num; i++){
//     console.log(i);
// }

// 여러줄 입력 

let fs = require('fs');
let input = fs.readFileSync('../1205TEXT/hs_solution_1_1205.txt').toString().toString.split('\n');

let count = input[0];
let numbers= [];

for(let i = 1; i < input.length; i++){
    if(input[i] !== ''){
        number.push(input[i].split(''));
    }
}

for(let i=0 ; i<numbers.length;i++){
    let num1 =Number(numbers[i][0]);
    let num2 = Number(number[i][1]);

    console.log(num1 + num2);
}

