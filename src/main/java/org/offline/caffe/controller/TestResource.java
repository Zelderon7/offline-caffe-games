package org.offline.caffe.resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import org.offline.caffe.entity.TestEntity;
import org.offline.caffe.repository.TestRepository;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResource {

    @Inject
    TestRepository repo;

    @GET
    public List<TestEntity> getAll() {
        return repo.listAll();
    }

    @POST
    @Transactional
    public TestEntity create(TestEntity entity) {
        repo.persist(entity);
        return entity;
    }
}
