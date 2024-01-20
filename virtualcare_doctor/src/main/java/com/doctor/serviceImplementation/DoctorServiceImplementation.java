package com.doctor.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.doctor.bean.DoctorBean;
import com.doctor.entity.DoctorEntity;
import com.doctor.repository.DoctorRepository;
import com.doctor.service.DoctorService;
@Service
public class DoctorServiceImplementation implements DoctorService{
	@Autowired
   DoctorRepository doctorRepository;
	DoctorEntity doctorEntity=new DoctorEntity();
	public void save(DoctorBean doctorBean) {
		doctorEntity.setDoctor_id(doctorBean.getDoctor_id());
		doctorEntity.setBranch_code(doctorBean.getBranch_code());
		doctorEntity.setDoctor_age(doctorBean.getDoctor_age());
		doctorEntity.setDoctor_gender(doctorBean.getDoctor_gender());
		doctorEntity.setDoctor_name(doctorBean.getDoctor_name());
		doctorEntity.setDoctor_password(doctorBean.getDoctor_password());
		doctorEntity.setDoctor_phone(doctorBean.getDoctor_phone());
		doctorEntity.setDoctor_specialization(doctorBean.getDoctor_specialization());
		doctorEntity.setState_code(doctorBean.getState_code());
		doctorEntity.setStatus(doctorBean.getStatus());
		doctorRepository.save(doctorEntity);
		System.out.println("inserted");
	}
	@Override
	public void delete(Long doctor_id) {
		doctorRepository.delete(doctorEntity);
	}
	
	
}
