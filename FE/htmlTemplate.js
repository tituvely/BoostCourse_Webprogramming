//서버에서 가져온 데이터
var data = [
    {title : "hello",content : "lorem dkfief",price : 2000},
    {title : "hello",content : "lorem dkfief",price : 2000}
];

//html 에 script에서 가져온 html template.
var html = document.querySelector("#template-list-item").innerHTML;

var resultHTML = "";

for(var i=0; i<data.length; i++) {
    resultHTML += html.replace("{title}", data[i].title)
        .replace("{content}", data[i].content)
        .replace("{price}", data[i].price);
}

document.querySelector(".content").innerHTML = resultHTML;

