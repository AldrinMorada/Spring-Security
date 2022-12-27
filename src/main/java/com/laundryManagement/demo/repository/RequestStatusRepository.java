package com.laundryManagement.demo.repository;

import com.laundryManagement.demo.model.Admin;
import com.laundryManagement.demo.model.RequestStatus;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class RequestStatusRepository implements JpaRepository<RequestStatus, Long> {
    @Override
    public List<RequestStatus> findAll() {
        return null;
    }

    @Override
    public List<RequestStatus> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<RequestStatus> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<RequestStatus> findAllById(Iterable<Long> longs) {
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
    public void delete(RequestStatus entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends RequestStatus> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends RequestStatus> S save(S entity) {
        return null;
    }

    @Override
    public <S extends RequestStatus> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<RequestStatus> findById(Long aLong) {
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
    public <S extends RequestStatus> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends RequestStatus> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<RequestStatus> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public RequestStatus getOne(Long aLong) {
        return null;
    }

    @Override
    public RequestStatus getById(Long aLong) {
        return null;
    }

    @Override
    public RequestStatus getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends RequestStatus> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends RequestStatus> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends RequestStatus> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends RequestStatus> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends RequestStatus> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends RequestStatus> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends RequestStatus, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
