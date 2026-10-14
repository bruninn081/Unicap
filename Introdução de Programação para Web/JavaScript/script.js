nome = "Hello World, Batman"

alert(nome)

var vezes = 0;

function contar() {
    vezes = vezes + 1;
    alert("O botão foi clicado " + vezes + " Vezes");
}

function mudartexto() {
    var x = document.getElementById("idparagrafo")
    x.innerHTML = "Foi clicado " + nome
}