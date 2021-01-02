function typeChange(id, type) {
    var updateReq = new XMLHttpRequest();
    var todoReq = new XMLHttpRequest();

    var Params = '?id=' + id + '&'+'type=' + type;
    updateReq.open("POST", "http://localhost:8080/todolist_war_exploded/todotype" + Params);//parameter를 붙여서 보낼수있음.
    updateReq.send();

    // todoReq.open("GET", "http://localhost:8080/todolist_war_exploded/todolist.jsp");
    // todoReq.send();

    updateReq.addEventListener("load", function () {
        console.log(updateReq.responseText);
    })

}
