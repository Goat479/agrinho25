```javascript
const cartas = {

    campo: {
        titulo: "🌾 O Campo",
        texto: "O campo é responsável pela produção dos alimentos que chegam diariamente às mesas dos brasileiros. Além disso, fornece matérias-primas para diversas indústrias e contribui significativamente para a economia nacional."
    },

    cidade: {
        titulo: "🏙️ A Cidade",
        texto: "A cidade concentra serviços, universidades, centros de pesquisa, hospitais e empresas que desenvolvem tecnologias utilizadas em diversos setores, inclusive na agricultura."
    },

    conexao: {
        titulo: "🤝 Campo e Cidade",
        texto: "Campo e cidade dependem um do outro. Enquanto o campo produz alimentos e matérias-primas, a cidade fornece tecnologia, conhecimento, infraestrutura e mercado consumidor. Essa parceria é essencial para o desenvolvimento sustentável."
    }

};

function abrirCarta(tipo){

    document.getElementById("tituloCarta").innerHTML =
        cartas[tipo].titulo;

    document.getElementById("textoCarta").innerHTML =
        cartas[tipo].texto;

    document.getElementById("modal").style.display =
        "block";
}

function fecharCarta(){

    document.getElementById("modal").style.display =
        "none";
}

window.onclick = function(event){

    const modal =
        document.getElementById("modal");

    if(event.target === modal){

        modal.style.display =
            "none";
    }
}
```
