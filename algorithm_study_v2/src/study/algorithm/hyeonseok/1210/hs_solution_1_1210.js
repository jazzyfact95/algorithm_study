const doCommand = (array, command) => {
  const i = command[0] - 1;
  const j = command[1];
  const k = command[2] - 1;

  let result = 0;

  if (i === j) {
    result = array[i];
  } else {
    result = array.slice(i, j).sort((a, b) => a - b)[k];
  }
  return result;
};

function solution(array, commands) {
  const resultArr = [];

  commands.forEach((command) => {
    resultArr.push(doCommand(array, command));
  });

  return resultArr;
}
