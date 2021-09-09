package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;

	@Override
	public Medicamento InsertaActualizaMedicamento(Medicamento obj) {

		return repository.save(obj);
	}

	@Override
	public List<Medicamento> listaMedicamento() {

		return repository.findAll();
	}

	@Override
	public Optional<Medicamento> listaMedixId(int idMedicamento) {
		// TODO Auto-generated method stub
		return repository.findById(idMedicamento);
	}

	@Override
	public List<Medicamento> buscaxNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombre(nombre);
	}

	@Override
	public Optional<Medicamento> listaMedixStock(int stock) {
		// TODO Auto-generated method stub
		return repository.findByStock(stock);
	}

}
