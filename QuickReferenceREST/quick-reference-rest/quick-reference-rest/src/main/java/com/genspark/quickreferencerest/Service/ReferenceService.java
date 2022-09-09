package com.genspark.quickreferencerest.Service;

import com.genspark.quickreferencerest.Entity.Reference;

import java.util.List;

public interface ReferenceService {

    List<Reference> getAllReferences();
    Reference getReferenceById(int referenceId);
    Reference addReference(Reference reference);
    Reference updateReference(Reference reference);
    String deleteReferenceById(int referenceId);

}
