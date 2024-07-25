### Modelagem e Diagramação de um Componente iPhone

```mermaid
classDiagram
    interface ReprodutorMusical {
        + tocar()
        + pausar()
        +selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        + ligar(String numero) 
        + atender()
        + iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
