### Modelagem e Diagramação de um Componente iPhone


```mermaid
classDiagram
    interface ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        + ligar(String contato)
        + atender()
        + iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        + exibirPagina(url: String)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class iPhone {
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
```