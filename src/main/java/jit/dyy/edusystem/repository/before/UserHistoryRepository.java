package jit.dyy.edusystem.repository.before;

import jit.dyy.edusystem.bean.History;

import java.util.List;

public interface UserHistoryRepository {
    public int insertHistory(History history);
    public List<History> showHistory(int user_id);
    public int selectHistory(int user_id,int course_id);
    public int updateHistory(History history);
}
