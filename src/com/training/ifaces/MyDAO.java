package com.training.ifaces;
import java.util.*;

import com.training.entity.Doctor;
public interface MyDAO<T> {

	public Object add(T t);
	public T find(Object obj);
	public List<T> findAll();

	public boolean delete(Object obj);
	Object add(Doctor t);
	boolean update(Object obj);
	boolean delete(Doctor obj);
}
