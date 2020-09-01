package itx.examples.r2dbc.services;

import itx.examples.r2dbc.dto.UserData;

import java.util.Collection;
import java.util.Optional;

public interface DataService {

    Optional<UserData> findById(String id) throws DataServiceException;

    UserData save(String email, String password) throws DataServiceException;

    Collection<UserData> findAll() throws DataServiceException;

    void deleteById(String id) throws DataServiceException;

    void update(UserData userData) throws DataServiceException;

}
