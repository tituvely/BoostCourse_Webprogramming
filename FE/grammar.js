const myFriend = { key : "value", key2 : "value" };
// console.log(myFriend);

var obj = {"name":"codesquad" , age :22, data: [1,2,3,4,5]};

for(value in obj) {
    // console.log(obj[value]);
}

var obj = { "name" : "codesquad" , age : 22, data : [1,2,3,4,5] };

// console.log(Object.keys(obj));

Object.keys(obj).forEach(function(key) {
    // console.log(obj[key]);
});



const data = {
    "debug": "on",
    "window": {
        "title": "Sample Konfabulator Widget",
        "name": "main_window",
        "width": 500,
        "height": 500
    },
    "image": {
        "src": "Images/Sun.png",
        "name": "sun1",
        "hOffset": 250,
        "vOffset": 250,
        "alignment": "center"
    },
    "text": {
        "data": "Click Here",
        "size": 36,
        "style": "bold",
        "name": "text1",
        "hOffset": 250,
        "vOffset": 100,
        "alignment": "center",
        "onMouseUp": "sun1.opacity = (sun1.opacity / 100) * 90;"
    }
}

// var result=[];
//
// Object.keys(data).forEach(function(v,i,o){
//     for(key in data[v]){
//         if(typeof data[v][key]=="number"){
//             result.push(key);
//         }
//     }
// })
// console.log(result);

var result = [];

function findNum(d){
    for ( key in d ){
        var value = d[key];
        if( typeof value === "object") findNum(value);
        else if ( typeof value === "number") result.push(key);
    }
}

findNum(data);

console.log(" result : " + result);

const data2 = [{
    "id": 1,
    "name": "Yong",
    "phone": "010-0000-0000",
    "type": "sk",
    "childnode": [{
        "id": 11,
        "name": "echo",
        "phone": "010-0000-1111",
        "type": "kt",
        "childnode": [{
            "id": 115,
            "name": "hary",
            "phone": "211-1111-0000",
            "type": "sk",
            "childnode": [{
                "id": 1159,
                "name": "pobi",
                "phone": "010-444-000",
                "type": "kt",
                "childnode": [{
                    "id": 11592,
                    "name": "cherry",
                    "phone": "111-222-0000",
                    "type": "lg",
                    "childnode": []
                },
                    {
                        "id": 11595,
                        "name": "solvin",
                        "phone": "010-000-3333",
                        "type": "sk",
                        "childnode": []
                    }
                ]
            }]
        },
            {
                "id": 116,
                "name": "kim",
                "phone": "444-111-0200",
                "type": "kt",
                "childnode": [{
                    "id": 1168,
                    "name": "hani",
                    "phone": "010-222-0000",
                    "type": "sk",
                    "childnode": [{
                        "id": 11689,
                        "name": "ho",
                        "phone": "010-000-0000",
                        "type": "kt",
                        "childnode": [{
                            "id": 116890,
                            "name": "wonsuk",
                            "phone": "010-000-0000",
                            "type": "kt",
                            "childnode": []
                        },
                            {
                                "id": 1168901,
                                "name": "chulsu",
                                "phone": "010-0000-0000",
                                "type": "sk",
                                "childnode": []
                            }
                        ]
                    }]
                }]
            },
            {
                "id": 117,
                "name": "hong",
                "phone": "010-0000-0000",
                "type": "lg",
                "childnode": []
            }
        ]
    }]
}]

var result2 = [];

function findSk(data){

    data.forEach(function(v){
        if( v.type === "sk" ) result2.push(v.name);

        if ( v.childnode.length > 0 ) findSk(v.childnode);
    })
}

findSk(data2);

console.log(result2);