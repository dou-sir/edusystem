package jit.dyy.edusystem.repository.admin;

import jit.dyy.edusystem.bean.Auser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminRepository {
    public List<Auser> login(Auser auser);
}
