package com.mouks.rosie.cheztoi.repository;

import java.util.Set;

/**
 * Created by Rosie on 2016/05/31.
 */
public interface Repository<E, ID> {
    E findById(ID id);
    E save (E entity);
    E update(E entity);
    E delete (E entity);
    Set<E> findAll();
    int deleteAll();
}
