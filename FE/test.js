var oReq = new XMLHttpRequest();
oReq.addEventListener("load", function() {
    console.log(this.responseText);
});

oReq.open("GET", "./json.txt");
oReq.send;

var target = document.querySelector(".outside");
var btn = document.querySelector("button");

btn.addEventListener("click", function () {
    var pre = parseInt(target.style.left);
    target.style.left = pre + 200 + "px";

})