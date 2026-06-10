const dados = {
    campo: {
        titulo: "🌾 O Campo",
        texto: "O campo é responsável pela produção de alimentos, matérias-primas e recursos essenciais para a sociedade."
    },
    cidade: {
        titulo: "🏙 A Cidade",
        texto: "A cidade concentra serviços, tecnologia, educação e inovação que contribuem para o desenvolvimento rural."
    }
};

function abrirModal(tipo) {
    document.getElementById("modal").style.display = "block";
    document.getElementById("titulo").innerText = dados[tipo].titulo;
    document.getElementById("texto").innerText = dados[tipo].texto;
}

function fecharModal() {
    document.getElementById("modal").style.display = "none";
}

// Animação scroll reveal
const reveals = document.querySelectorAll(".reveal");
window.addEventListener("scroll", () => {
    reveals.forEach(el => {
        if (el.getBoundingClientRect().top < 700) {
            el.classList.add("ativo");
        }
    });
});
