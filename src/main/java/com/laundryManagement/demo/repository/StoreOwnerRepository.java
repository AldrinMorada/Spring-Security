package com.laundryManagement.demo.repository;
import com.laundryManagement.demo.model.StoreOwner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StoreOwnerRepository implements JpaRepository<StoreOwner, Long> {

    @Override
    public List<StoreOwner> findAll() {
        return null;
    }

    @Override
    public List<StoreOwner> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<StoreOwner> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<StoreOwner> findAllById(Iterable<Long> longs) {
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
    public void delete(StoreOwner entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends StoreOwner> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends StoreOwner> S save(S entity) {
        return null;
    }

    @Override
    public <S extends StoreOwner> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<StoreOwner> findById(Long aLong) {
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
    public <S extends StoreOwner> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends StoreOwner> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<StoreOwner> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public StoreOwner getOne(Long aLong) {
        return null;
    }

    @Override
    public StoreOwner getById(Long aLong) {
        return null;
    }

    @Override
    public StoreOwner getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends StoreOwner> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends StoreOwner> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends StoreOwner> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends StoreOwner> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends StoreOwner> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends StoreOwner> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends StoreOwner, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
