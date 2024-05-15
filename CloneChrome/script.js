const Calculator={
    Add: function (a, b){
        return (a + b);
    },
    Sub: function(a, b){
        return (a - b);
    },
    Divide: function (a, b){
        return (a / b);
    },
    Multiple: function (a, b){
        return (a * b);
    },
    Power: function(a, b){
        return (a ** b);
    },
    Abs: function(a){
        return (a < 0 ? -a : a);
    }
}

function eventHandler()
{
    console.log("hello");
}

let title = document.querySelector("h1");
// title.onclick = () => {console.log("hello");}
// title.onclick = null;
title.addEventListener("click", ()=> { console.log("hello"); })


const generateRandStr = (len) => {
    // 결과 문자열
    let resultStr = "";

    // len 만큼 랜덤한 알파벳 생성 후 문자열에 추가
    for (let i = 0; i < len; i++) {
        // ex. 'a' + 3 === 'd'인가?
        resultStr += 'a' + Math.floor(Math.random() * 26);
    }

    return resultStr;
};