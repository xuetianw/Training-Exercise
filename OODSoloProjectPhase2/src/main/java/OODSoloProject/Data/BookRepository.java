package OODSoloProject.Data;

import OODSoloProject.Model.Book;

public interface BookRepository extends Persistable<Book>, Removeable<Book>, Searchable<Book>{

}