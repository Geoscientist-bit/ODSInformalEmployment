function listar(){
    var xhttp = new XMLHttpRequest();
    xhttp.open('GET', 'http://localhost:8080/informalEmployment/', true);

    xhttp.onreadystatechange = function (){
        if(xhttp.readyState === XMLHttpRequest.DONE){
            var status = xhttp.status;
            if (status === 0 || (status >= 200 && status < 400)){
                var json = JSON.parse(xhttp.responseText);
                createTable(json);
                console.log("probando")
            }else{
                console.log("Error");
            }
        }
    };
    xhttp.send();
}

function createTable(json){
    var tableBody = document.getElementById("table_body");

    var child = tableBody.childElementCount;
    for (let row = 1; row < child; row++){
        //tableBody.deleteRow(child-row);
    }

    //populate table
    json.forEach((row) => {
        var tr = document.createElement("tr");
        Object.values(row).forEach((cell) => {

            var td = document.createElement("td");
            td.textContent = cell;
            tr.appendChild(td);
        });
        tableBody.appendChild(tr);
    });

}