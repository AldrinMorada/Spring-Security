package com.laundryManagement.demo.repository;

import com.laundryManagement.demo.model.MachineStatus;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MachineStatusRepository implements JpaRepository<MachineStatus, Long> {
    @Override
    public List<MachineStatus> findAll() {
        return null;
    }

    @Override
    public List<MachineStatus> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<MachineStatus> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<MachineStatus> findAllById(Iterable<Long> longs) {
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
    public void delete(MachineStatus entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends MachineStatus> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends MachineStatus> S save(S entity) {
        return null;
    }

    @Override
    public <S extends MachineStatus> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<MachineStatus> findById(Long aLong) {
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
    public <S extends MachineStatus> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends MachineStatus> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<MachineStatus> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public MachineStatus getOne(Long aLong) {
        return null;
    }

    @Override
    public MachineStatus getById(Long aLong) {
        return null;
    }

    @Override
    public MachineStatus getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends MachineStatus> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends MachineStatus> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends MachineStatus> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends MachineStatus> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MachineStatus> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MachineStatus> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends MachineStatus, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
