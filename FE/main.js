var log = document.querySelector(".log");
var lists = document.querySelectorAll("ul > li");

for(var i=0,len=lists.length; i < len; i++) {
    lists[i].addEventListener("click", function (evt) {
        log.innerHTML = "IMG URL IS " + evt.currentTarget.firstElementChild.src;
        console.log(evt.currentTarget);
    });
}
