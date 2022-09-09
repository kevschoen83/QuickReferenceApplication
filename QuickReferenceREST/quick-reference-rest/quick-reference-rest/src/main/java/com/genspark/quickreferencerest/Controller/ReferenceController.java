package com.genspark.quickreferencerest.Controller;

import com.genspark.quickreferencerest.Entity.Reference;
import com.genspark.quickreferencerest.Service.ReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @GetMapping("/home")
    public String home() {
        return "<html><h1>Welcome to my quick reference application!</h1></html>";
    }

    @GetMapping("/references")
    public List<Reference> getReferences() {
        return this.referenceService.getAllReferences();
    }

    @GetMapping("/references/{referenceId}")
    public Reference getReference(@PathVariable String referenceId) {
        return this.referenceService.getReferenceById(Integer.parseInt(referenceId));
    }

    @PostMapping("/references")
    public Reference addReference(@RequestBody Reference reference) {
        return this.referenceService.addReference(reference);
    }

    @PutMapping("/references")
    public Reference updateReference(@RequestBody Reference reference) {
        return this.referenceService.updateReference(reference);
    }

    @DeleteMapping("/references/{referenceId}")
    public String deleteReference(@PathVariable String referenceId) {
        return this.referenceService.deleteReferenceById(Integer.parseInt(referenceId));
    }

}

/*  **List<Reference> getAllReferences();
    **Reference getReferenceById(int referenceId);
    **Reference addReference(Reference reference);
    **Reference updateReference(Reference reference);
    **String deleteReferenceById(int referenceId);*/
