var log = document.querySelector(".log");
var ul = document.querySelector("ul");
var img = document.querySelector("img");

img.addEventListener("click", function () {
    console.log("img tag clicked!");
})

ul.addEventListener("click", function(evt) {
    // IMG, UL
    console.log(evt.target.tagName, evt.currentTarget.tagName);

    if(evt.target.tagName === "IMG") {
        log.innerHTML = "IMG URL은, " + evt.target.src;
    } else if (evt.target.tagName === "LI") {
        log.innerHTML = "IMG URL은, " + evt.target.firstElementChild.src;
    }
    //이미지 태그에 발생해야 될 이벤트를 위쪽 부모에 위임 => 이벤트 델리게이션
})