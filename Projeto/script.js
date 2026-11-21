
document.getElementById("formulario").addEventListener("submit", function(event) {

    event.preventDefault();

    let nome = document.getElementById("fnome").value;
    let email = document.getElementById("femail").value;
    let assunto = document.getElementById("ftexto").value;

    if (nome === "" || email === "" || assunto === "") {
        alert("Favor, preencher todos os campos");
        return;
    }
    let telefone = "5581993844985";

    let mensagem = `Olá! Meu nome é ${nome}.
                    Meu email é ${email}.
                    Assunto: ${assunto}`;

    let url = `https://wa.me/${telefone}?text=${encodeURIComponent(mensagem)}`;

    window.open(url, "_blank");

});