package org.offline.caffe.repository;

import org.offline.caffe.entity.TestEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestRepository implements PanacheRepository<TestEntity> {
}
