const readline = require('readline');
//인터페이스 객체 생성하기
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const solution = (str) => {
    let ans = '';
    for (let i = 0; i < str.length; i++) {
        const ch = str.charCodeAt(i);
        if (ch >= 'A'.charCodeAt(0) && ch <= 'Z'.charCodeAt(0) ) {
            ans += String.fromCharCode('a'.charCodeAt(0) + ch - 'A'.charCodeAt(0));
        } else {
            ans += String.fromCharCode('A'.charCodeAt(0) + ch - 'a'.charCodeAt(0));
        }
        // const ch = str.charAt(i)
        // ans += (ch === ch.toUpperCase() ? ch.toLowerCase() : ch.toUpperCase());
    }
    console.log(ans);
};
//입출력 처리하는 코드
rl.on('line', function (line) {
    //입력 처리하는 코드
    solution(line);
    rl.close();
}).on('close', function () {
    //입력을 받은 뒤 실행할 코드
    process.exit();//종료문
});