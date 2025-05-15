public class Casting {
    public static void main(String[] args) {
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroDePaginas = 96;
        double preco = 39.99;
        char categoria = 'N';

        String categoriaDescricao;
        if (categoria == 'F'){
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-Ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria invalida";
        }
        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + numeroDePaginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");
    }
    }



