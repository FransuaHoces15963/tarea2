package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public Medicamento InsertaActualizaMedicamento(Medicamento obj);
	
	public List<Medicamento> listaMedicamento();
	public Optional<Medicamento> listaMedixId(int idMedicamento);
	public List<Medicamento> buscaxNombre(String nombre);
	
	public Optional<Medicamento> listaMedixStock(int stock);
	
	
}
