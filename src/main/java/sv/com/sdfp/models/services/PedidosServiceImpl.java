package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.IPedidosDao;
import sv.com.sdfp.models.entities.Pedidos;
@Service
public class PedidosServiceImpl implements IPedidosService {
	@Autowired
	private IPedidosDao pedidosDao;
	@Override
	@Transactional(readOnly=true)
	public List<Pedidos> findAll() {
		// TODO Auto-generated method stub
		return (List<Pedidos>) pedidosDao.findAll();
	}

	@Override
	@Transactional
	public void save(Pedidos pedidos) {
		// TODO Auto-generated method stub
		pedidosDao.save(pedidos);
	}

	@Override
	@Transactional
	public Pedidos findOne(Long Id_Pedido) {
		// TODO Auto-generated method stub
		return pedidosDao.findById(Id_Pedido).orElse(null);
	}

	@Override
	public void delete(Long Id_Pedido) {
		// TODO Auto-generated method stub
		pedidosDao.deleteById(Id_Pedido);
	}

}
