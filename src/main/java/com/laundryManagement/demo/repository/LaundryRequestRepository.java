package com.laundryManagement.demo.repository;

import com.laundryManagement.demo.model.LaundryRequests;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class LaundryRequestRepository implements JpaRepository<LaundryRequests, Long> {
    @Override
    public List<LaundryRequests> findAll() {
        return null;
    }

    @Override
    public List<LaundryRequests> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LaundryRequests> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<LaundryRequests> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(LaundryRequests entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends LaundryRequests> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends LaundryRequests> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LaundryRequests> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LaundryRequests> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends LaundryRequests> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends LaundryRequests> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<LaundryRequests> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public LaundryRequests getOne(Long aLong) {
        return null;
    }

    @Override
    public LaundryRequests getById(Long aLong) {
        return null;
    }

    @Override
    public LaundryRequests getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends LaundryRequests> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LaundryRequests> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends LaundryRequests> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends LaundryRequests> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LaundryRequests> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LaundryRequests> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends LaundryRequests, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
