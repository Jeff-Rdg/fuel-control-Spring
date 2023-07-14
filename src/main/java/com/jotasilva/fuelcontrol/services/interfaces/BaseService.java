package com.jotasilva.fuelcontrol.services.interfaces;

import java.util.List;
import java.util.UUID;

public interface BaseService<T, D> {
    List<T> findAll();
    T findById(UUID id);
    T create(D entityDTO);
    void delete(UUID id);
    T update(UUID id, T entity);
}
