package leilao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.service.FinalizarLeilaoService;

public class FinalizarLeilaoServiceTest {

	private FinalizarLeilaoService service;
	@Mock
	private LeilaoDao leilaoDao;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.service = new FinalizarLeilaoService(leilaoDao);
	}
	
	@Test
	public void hello() {
		LeilaoDao mock = Mockito.mock(LeilaoDao.class);
		List<Leilao> todos = mock.buscarTodos();
		Assert.assertTrue(todos.isEmpty());
	}
	
	@Test
	public void deveriaFinalizarUmLeilao() {
		
	}
	
}
