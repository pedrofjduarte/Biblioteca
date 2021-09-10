import model.Editora;
import model.Livro;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LivroTest {

    private Livro livro;
    private Editora editora;

    @BeforeAll
    public void antesTodosTestes(){
        livro = new Livro();
        editora = new Editora();
    }

    @BeforeEach
    public void antesCadaTeste(){
        livro.setCodigo(0001);
        livro.setDescLivro("Livro de contos");
        livro.setIsbn("57457");

        editora.setCodEditora(12345);
        editora.setRazaoSocial("Editora América");
        editora.setContato("editora@email.com");
        editora.setTelefone("1234567");

        livro.setEditora(editora);
    }

    @Test
    @Order(1)
    @Tag("Livro")
    @DisplayName("Verificar código do Livro")
    public void testarCodigoLivro(){
        assertEquals(0001, livro.getCodigo());
    }

    @Test
    @Order(2)
    @Tag("Livro")
    @DisplayName("Verificar descrição do Livro")
    public void testarDescricaoLivro(){
        assertEquals("Livro de contos", livro.getDescLivro());
    }

    @Test
    @Order(3)
    @Tag("Livro")
    @DisplayName("Verificar ISBN do Livro")
    public void testarISBNLivro(){
        assertEquals("57457", livro.getIsbn());
    }

    @Test
    @Order(4)
    @Tag("Livro")
    @DisplayName("Verificar dados da Editora do Livro")
    public void testarDadosEditoraLivro(){
        assertAll("dadosEditora",
                ()->assertEquals(12345, editora.getCodEditora()),
                ()->assertEquals("Editora América", editora.getRazaoSocial()),
                ()->assertEquals("editora@email.com", editora.getContato()),
                ()->assertEquals("1234567", editora.getTelefone())
        );
    }

    @AfterEach
    public void depoisCadaTeste(){
        livro.setCodigo(0000000000);
        livro.setDescLivro("XXXXXXXXXX");
        livro.setIsbn("XXXXXXXXXXXX");

        editora.setCodEditora(00000000);
        editora.setRazaoSocial("XXXXXXXXXX");
        editora.setContato("XXXXXXXXXXXXX");
        editora.setTelefone("XXXXXXXXXXXXX");

        livro.setEditora(editora);
    }

    @AfterAll
    public void deposTodosTestes(){
        livro = null;
        editora = null;
    }
}
