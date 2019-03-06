package com.qfedu.mapper;
import com.qfedu.domain.UserInfo;
import org.springframework.stereotype.Repository;
@Repository
public interface OperationDao {
    public UserInfo selectOperationsByUsername(String username) throws Exception;
}
