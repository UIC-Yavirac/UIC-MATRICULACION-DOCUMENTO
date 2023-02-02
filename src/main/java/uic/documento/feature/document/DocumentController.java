package uic.documento.feature.document;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/documento")
@CrossOrigin({ "*" })
public class DocumentController {
    @Autowired
    DocumentService documentService;

    // Get
    @GetMapping("/{id}")
    public Document findById(@PathVariable Long id) {
        return documentService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Document> findAll() {
        return documentService.findAll();
    }

    @GetMapping("/findByName/{term}")
    public List<Document> findByName(@PathVariable String term) {
        return documentService.findByName(term);
    }

    // Post

    @PostMapping("/save")
    public Document saveDocument(@RequestBody Document document) {
        return documentService.save(document);
    }

    // Update

    @PutMapping("/update")
    public Document updatPerson(@RequestBody Document document) {
        return documentService.save(document);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDocument(@PathVariable Long id) {
        documentService.deleteById(id);
    }

}
