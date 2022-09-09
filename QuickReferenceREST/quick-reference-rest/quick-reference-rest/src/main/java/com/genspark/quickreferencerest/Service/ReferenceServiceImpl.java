package com.genspark.quickreferencerest.Service;

import com.genspark.quickreferencerest.Dao.ReferenceDao;
import com.genspark.quickreferencerest.Entity.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReferenceServiceImpl implements ReferenceService {

    @Autowired
    private ReferenceDao referenceDao;

    @Override
    public List<Reference> getAllReferences() {
        return this.referenceDao.findAll();
    }

    @Override
    public Reference getReferenceById(int referenceId) {
        Optional<Reference> e = this.referenceDao.findById(referenceId);
        Reference reference = null;

        if (e.isPresent()) {
            reference = e.get();
        } else {
            throw new RuntimeException(" Reference not found for :: " + referenceId);
        }

        return reference;
    }

    @Override
    public Reference addReference(Reference reference) {
        return referenceDao.save(reference);
    }

    @Override
    public Reference updateReference(Reference reference) {
        return referenceDao.save(reference);
    }

    @Override
    public String deleteReferenceById(int referenceId) {
        this.referenceDao.deleteById(referenceId);
        return "Reference deleted successfully";
    }

}
