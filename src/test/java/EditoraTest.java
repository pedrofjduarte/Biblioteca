import model.Editora;
import model.Livro;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class EditoraTest {

    @Test
    @DisplayName(value = "Verificar se o nome da Editora está correto.")
    @Tag("edit")
    public void testarRazaoSocial(){
        Editora editora = new Editora();
        editora.setRazaoSocial("Editora Americana");
        assertEquals("Editora Americana", editora.getRazaoSocial());
    }

    @Test
    @DisplayName(value = "Verificar se o objeto está Nulo.")
    @Tag("edit")
    public void testarEditoraNula(){
        Editora editora = new Editora();
        editora = null;
        assertNull(editora);
    }

    @Test
    @DisplayName(value = "Verificar se o objeto não está Nulo.")
    @Tag("edit")
    public void testarEditoraNaoNula(){
        Editora editora = new Editora();
        assertNotNull(editora);
    }

    @Test
    @DisplayName(value = "Verifica se a Editora está com código falso")
    @Tag("edit")
    public void testarEditoraComCodigoFalso(){
        boolean codigoEditora;

        Editora editora = new Editora();
        editora.setCodEditora(10);

        if (editora.getCodEditora() != 02){
            codigoEditora = false;
        }else{
            codigoEditora = true;
        }
        assertFalse(codigoEditora);
    }

    @Test
    @DisplayName(value = "Verifica se a Editora está com código verdadeiro")
    @Tag("edit")
    public void testarEditoraComCodigoVerdadeiro(){
        boolean codigoEditora;

        Editora editora = new Editora();
        editora.setCodEditora(02);

        if (editora.getCodEditora() != 02){
            codigoEditora = false;
        }else{
            codigoEditora = true;
        }
        assertTrue(codigoEditora);
    }

    @Test
    @DisplayName(value = "Verificar se o array de nomes de editoras estão iguais.")
    @Tag("edit")
    public void testarArrayNomesEditorasIguais(){
        String [] nomes = new String[2];
        String [] razs = new String[2];

        razs[0] = "Editora Tocantins";
        razs[1] = "Editora Nova";

        Editora editora1 = new Editora();
        editora1.setRazaoSocial("Editora Tocantins");

        Editora editora2 = new Editora();
        editora2.setRazaoSocial("Editora Nova");

        nomes[0] = editora1.getRazaoSocial();
        nomes[1] = editora2.getRazaoSocial();

        assertArrayEquals(razs, nomes);
    }

    @Test
    @DisplayName(value = "Verificar se o nome da Editora está diferente")
    @Tag("edit")
    public void testarNomeEditoraDiferente(){

        Editora editora = new Editora();
        editora.setRazaoSocial("Editora Nova");

        assertNotEquals("Editora Nova América", editora.getRazaoSocial());
    }

    @Test
    @DisplayName(value = "Verificar se o Objeto esperado é diferente do atual")
    @Tag("edit")
    public void testarReferenciaParaObjetosDiferentes(){
        Editora editoraA = new Editora();
        Editora editoraB = new Editora();

        assertNotSame(editoraA, editoraB);
    }

    @Test
    @DisplayName(value = "Verificar se o Objeto esperado é o mesmo do atual")
    @Tag("edit")
    public void testarReferenciaParaObjetosIguais(){
        Editora editoraA = new Editora();
        Editora editoraB = new Editora();

        assertSame(editoraA, editoraA);
    }

    @Test
    @DisplayName(value = "Verificar o tempo de execução")
    @Tag("edit")
    public void testarTempoExecucao() throws InterruptedException {
        assertTimeout(Duration.ofMillis(20), ()-> Thread.sleep(2));
    }

    @Test
    @DisplayName(value = "Verificar se a execução completou após o tempo estimado")
    @Order(1)
    @Tag("edit")
    public void testarExecucaoAposTempoEstimado() throws InterruptedException {
        assertTimeoutPreemptively(Duration.ofMillis(20), ()-> Thread.sleep(21));
    }

    @Test
    @DisplayName(value = "Verificar igualdade entre listas de nomes de Editoras")
    @RepeatedTest(1)
    @Tag("edit")
    public void testarIgualdadeEntreListaDeStrings(){
        List<String> listaNomeEditorasA = new ArrayList<String>();
        List<String> listaNomeEditorasB = new ArrayList<String>();

        Editora editoraA = new Editora();
        editoraA.setRazaoSocial("Editora A");

        Editora editoraB = new Editora();
        editoraB.setRazaoSocial("Editora B");

        Editora editoraC = new Editora();
        editoraC.setRazaoSocial("Editora C");

        listaNomeEditorasA.add(editoraA.getRazaoSocial());
        listaNomeEditorasA.add(editoraB.getRazaoSocial());
        listaNomeEditorasA.add(editoraC.getRazaoSocial());

        listaNomeEditorasB.add(editoraA.getRazaoSocial());
        listaNomeEditorasB.add(editoraB.getRazaoSocial());
        listaNomeEditorasB.add(editoraC.getRazaoSocial());

        assertLinesMatch(listaNomeEditorasA, listaNomeEditorasB);
    }

    @Test
    @DisplayName("Teste sem implementação")
    @Disabled
    @Tag("edit")
    public void testeNaoImplementado(){

    }

    @Test
    @DisplayName("Verificações com várias Asserções")
    @Tag("edit")
    public void variasAssercoes(){

        Editora edi1 = new Editora();
        Editora edi2 = new Editora();

        edi1.setRazaoSocial("Editora Americana");
        edi2.setRazaoSocial("Editora Érica");

        assertAll("razaoSocial",
                ()-> assertEquals("Editora Americana", edi1.getRazaoSocial()),
                ()-> assertEquals("Editora Érica", edi2.getRazaoSocial())
        );

    }

    @Test
    @Tag("edit")
    @DisplayName("Falha no testes - Não completado")
    public void falha(){
        fail("Teste falhou - Não completo");


    }

    @Test
    @Tag("edit")
    @DisplayName("Verificar que todos os objetos do tipo Iterable passados como parâmetro sejam iguais")
    public void testarIgualdade(){
        /*
        Para ser igual, ambos os iteráveis devem retornar elementos iguais na mesma ordem e não é necessário
        que os dois iteráveis sejam do mesmo tipo para serem iguais.
        */

        Editora edt1 = new Editora();
        Editora edt2 = new Editora();

        edt1.setRazaoSocial("A");
        edt2.setRazaoSocial("B");

        Livro lvr1 = new Livro();
        Livro lvr2 = new Livro();

        lvr1.setDescLivro("A");
        lvr2.setDescLivro("B");

        Iterable<String> editoras = new ArrayList<String>(asList(edt1.getRazaoSocial(), edt2.getRazaoSocial()));
        Iterable<String> livros = new ArrayList<String>(asList(lvr1.getDescLivro(), lvr2.getDescLivro()));

        assertIterableEquals(editoras, livros);
    }

    @Test
    @Tag("edit")
    @DisplayName("Verificar o lançamento de exceção")
    public void testarLancamentoExcecao(){
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{throw new IllegalArgumentException("Exception message");}
        );

    }
}
