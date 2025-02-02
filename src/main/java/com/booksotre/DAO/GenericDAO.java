package com.booksotre.DAO;

import java.util.LinkedHashMap;
import java.util.List;

import com.booksotre.mapper.IRowMapper;

public interface GenericDAO<T> {
    <T> List<T> query(String query, IRowMapper<T> rowMapper, Object... prm);

    int insert(String query, Object... prm);

    void insertList(String query, List<Object> list);

    void update(String query, Object... prm);

    void delete(String query, Object... prm);

    Integer count(String query, Object... prm);

    Double countDouble(String query, Object... prm);

    LinkedHashMap<String, Integer> countByDate(String query, Object... prm);

    <U> List<U> countByDateList(String query, Object... prm);
}
