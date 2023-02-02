package uic.documento.feature.document;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    @Autowired
    DocumentRepository documentRepository;

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Document findById(long id) {
        return documentRepository.findById(id).orElse(new Document());
    }

    public List<Document> findByName(String term) {
        return documentRepository.findByNameLikeIgnoreCase(term + "%");
    }

    public Document save(Document document) {
        return documentRepository.save(document);
    }

    public Document update(Document document) {
        return documentRepository.save(document);
    }

    public void deleteById(long id) {
        documentRepository.deleteById(id);
    }

}
