function solution(new_id) {
    var answer = '';
    
    answer = new_id.toLowerCase(); //소문자 치환
    answer = answer.replace(/[^\w\d\-\_\.]/g, '')               
                       .replace(/\.{2,}/g, '.')                     
                       .replace(/^\.|\.$/g, '');      
   
    for (var i = answer.length - 1; i >= 0; i--) {
        if (answer[i] === '.' && answer[i - 1] === '.') {
            answer = answer.replace(answer[i], '');
        }
    }
    
    if(answer.substr(0,1) == "."){
        answer = answer.substr(1);
    };
    
    if(answer.substr(answer.substr-1,1) == ".") {
         answer = answer.substr(answer.substr-1);
    }
    if(answer == "") {
        answer = "a";
    }
    if(answer.length >= 15) {
        answer = answer.substring(0,15);
    }
    if(answer.charAt(answer.length-1) == ".") {
         answer = answer.slice(0,-1);
    }
   
    if (answer.length < 3) {
        for (var i = answer.length; i < 3; i++) {
            answer += answer[answer.length - 1];
        }
    }
    return answer;
}