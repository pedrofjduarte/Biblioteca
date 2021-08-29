import model.Editora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EditoraTest {

    @Test
    @DisplayName(value = "Verificar se o nome da Editora está correto.")
    public void testarRazaoSocial(){
        Editora editora = new Editora();
        editora.setRazaoSocial("Editora Americana");
        assertEquals("Editora Americana", editora.getRazaoSocial());
    }

    @Test
    @DisplayName(value = "Verificar se o objeto está Nulo.")
    public void testarEditoraNula(){
        Editora editora = new Editora();
        editora = null;
        assertNull(editora);
    }

    @Test
    @DisplayName(value = "Verificar se o objeto não está Nulo.")
    public void testarEditoraNaoNula(){
        Editora editora = new Editora();
        assertNotNull(editora);
    }

    @Test
    @DisplayName(value = "Verifica se a Editora está com código falso")
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
    public void testarNomeEditoraDiferente(){

        Editora editora = new Editora();
        editora.setRazaoSocial("Editora Nova");

        assertNotEquals("Editora Nova América", editora.getRazaoSocial());
    }

    @Test
    @DisplayName(value = "Verificar se o Objeto esperado é diferente do atual")
    public void testarReferenciaParaObjetosDiferentes(){
        Editora editoraA = new Editora();
        Editora editoraB = new Editora();

        assertNotSame(editoraA, editoraB);
    }

    @Test
    @DisplayName(value = "Verificar se o Objeto esperado é o mesmo do atual")
    public void testarReferenciaParaObjetosIguais(){
        Editora editoraA = new Editora();
        Editora editoraB = new Editora();

        assertSame(editoraA, editoraA);
    }

    @Test
    @DisplayName(value = "Verificar o tempo de execução")
    public void testarTempoExecucao() throws InterruptedException {
        assertTimeout(Duration.ofMillis(20), ()-> Thread.sleep(2));
    }

    @Test
    @DisplayName(value = "Verificar se a execução completou após o tempo estimado")
    public void testarExecucaoAposTempoEstimado() throws InterruptedException {
        assertTimeoutPreemptively(Duration.ofMillis(20), ()-> Thread.sleep(21));
    }

    @Test
    @DisplayName(value = "Verificar igualdade entre listas de nomes de Editoras")
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

    // assertIterableEquals
    // assertAll, assertThrows
}
