package com.doctor.service;

import com.doctor.bean.DoctorBean;

public interface DoctorService {
	public void save(DoctorBean doctorBean);
	public void delete(Long doctor_id);
	
}
